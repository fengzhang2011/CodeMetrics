/**
 * For more information see the head comment within the 'java.g' grammar file
 * that defines the input for this tree grammar.
 *
 * BSD license
 * 
 * Copyright (c) 2007-2011 by HABELITZ Software Developments
 *
 * All rights reserved.
 * 
 * http://www.habelitz.com
 *
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY HABELITZ SOFTWARE DEVELOPMENTS ('HSD') ``AS IS'' 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL 'HSD' BE LIABLE FOR ANY DIRECT, INDIRECT, 
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING 
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
tree grammar JavaTreeParser;

options {
    backtrack = true; 
    memoize = true;
    tokenVocab = Java;
    ASTLabelType = CommonTree;
}


@treeparser::header {
// Should be replaced for individual needs.
//package com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated;
}

@treeparser::members {
    
private boolean mMessageCollectionEnabled = false;
private List<String> mMessages;

private String currentVariableType = null;

private CodeMetrics metric = CodeMetrics.instance();

/**
 * Switches error message collection on or of.
 * <p>
 * The standard destination for parser error messages is <code>
 * System.err</code>. However, if <code>true</code> gets passed to this method 
 * this default behaviour will be switched off and all error messages will be 
 * collected instead of writing them to an output stream.
 * <p>
 * The default value is <code>false</code>.
 *
 * @param pNewState  <code>true</code> if error messages should be collected.
 */
public void enableErrorMessageCollection(boolean pNewState) {

    mMessageCollectionEnabled = pNewState;
    if (mMessages == null && mMessageCollectionEnabled) {
        mMessages = new ArrayList<String>();
    }
}

/**
 * Collects an error message or passes the error message to <code>
 * super.emitErrorMessage(...)</code>.
 * <p>
 * The actual behaviour depends on whether collecting error messages has been 
 * enabled or not.
 *
 * @param pMessage  The error message.
 */
@Override
public void emitErrorMessage(String pMessage) {

    if (mMessageCollectionEnabled) {
        mMessages.add(pMessage);
    } else {
        super.emitErrorMessage(pMessage);
    }
}

/**
 * Returns collected error messages.
 * <p>
 * This method returns a copy of the internal list of error messages and clears
 * the internal list.
 * <p>
 * Note that calling this method eqauls to a <code>getMessages(null)</code>
 * call.
 *
 * @see #getMessages(List)
 *
 * @return  A list holding collected error messages or <code>null</code> if
 *          collecting error messages is disabled. Of course, the returned list 
 *		    may be empty if no error message has been emited.
 */
public List<String> getMessages() {

	return getMessages(null);
}

/**
 * Returns collected error messages.
 *
 * @param pUserList  If this argument is not <code>null</code> the error
 *                   messages will be added to this list and it's this list that
 *                   will be returned. Otherwise a copy of the internal list of 
 *                   error messages will be created and returned. The internal
 *                   list will be cleared just before the method returns.
 *
 * @return  A list holding collected error messages. If collecting error 
 *          messages is disabled <code>null</code> will be returned, even if the 
 *			argument <code>pUserList</code> is not <code>null</code>.
 */
public List<String> getMessages(List<String> pUserList) {

	if (!mMessageCollectionEnabled) {
	    return null;
	}
	List<String> result = pUserList;
	if (result == null) {
		result = new ArrayList<String>();
	}
	result.addAll(mMessages);
    mMessages.clear();
    
    return result;
}

/**
 * Tells if there is any collected error messages.
 *
 * @return  <code>true</code> if there is at least one collected error message.
 */
public boolean hasErrors() {

    return mMessages != null && mMessages.size() > 0;
}

public void setSourceFile(String sourceFileName) {
    metric.setSourceFile(sourceFileName);
}

} // @treeparser::members

// Starting point for parsing a Java file.
javaSource
    :   ^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclaration*)
        { metric.finish(); }
    ;

packageDeclaration
    :   ^(PACKAGE qualifiedIdentifier)  
    ;
    
importDeclaration
    :   ^(IMPORT STATIC? qualifiedIdentifier DOTSTAR?)
    ;
    
typeDeclaration
    :   ^(CLASS modifierList IDENT genericTypeParameterList? extendsClause? implementsClause? classTopLevelScope)
        { metric.addClassDeclaration($IDENT.toString()); }
    |   ^(INTERFACE modifierList IDENT genericTypeParameterList? extendsClause? interfaceTopLevelScope)
        { metric.addInterfaceDeclaration($IDENT.toString()); }
    |   ^(ENUM modifierList IDENT implementsClause? enumTopLevelScope)
    |   ^(AT modifierList IDENT annotationTopLevelScope)
    ;

extendsClause // actually 'type' for classes and 'type+' for interfaces, but this has 
              // been resolved by the parser grammar.
    :   ^(EXTENDS_CLAUSE type+)
    ;   
    
implementsClause
    :   ^(IMPLEMENTS_CLAUSE type+)
    ;
        
genericTypeParameterList
    :   ^(GENERIC_TYPE_PARAM_LIST genericTypeParameter+)
    ;

genericTypeParameter
    :   ^(IDENT bound?)
    ;
        
bound
    :   ^(EXTENDS_BOUND_LIST type+)
    ;

enumTopLevelScope
    :   ^(ENUM_TOP_LEVEL_SCOPE enumConstant* classTopLevelScope?)
    ;
    
enumConstant
    :   ^(IDENT annotationList arguments? classTopLevelScope?)
    ;
    
    
classTopLevelScope
    :   ^(CLASS_TOP_LEVEL_SCOPE classScopeDeclarations*)
    ;
    
classScopeDeclarations
    :   ^(CLASS_INSTANCE_INITIALIZER block)
    |   ^(CLASS_STATIC_INITIALIZER block)
    |   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause? block?)
        { metric.addFunctionDeclaration($IDENT.toString()); }
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause? block?)
        { metric.addFunctionDeclaration($IDENT.toString()); }
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
//        { System.out.println("class field"); }
    |   ^(CONSTRUCTOR_DECL modifierList genericTypeParameterList? formalParameterList throwsClause? block)
        { metric.addFunctionDeclaration("constructor"); }
    |   typeDeclaration
    ;
    
interfaceTopLevelScope
    :   ^(INTERFACE_TOP_LEVEL_SCOPE interfaceScopeDeclarations*)
    ;
    
interfaceScopeDeclarations
    :   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause?)
        { metric.addFunctionDeclaration($IDENT.toString()); }
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause?)
                         // Interface constant declarations have been switched to variable
                         // declarations by 'java.g'; the parser has already checked that
                         // there's an obligatory initializer.
        { metric.addFunctionDeclaration($IDENT.toString()); }
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
    |   typeDeclaration
    ;

variableDeclaratorList
    :   ^(VAR_DECLARATOR_LIST variableDeclarator+)
    ;

variableDeclarator
    :   ^(VAR_DECLARATOR variableDeclaratorId variableInitializer?)
    ;
    
variableDeclaratorId
    :   ^(IDENT arrayDeclaratorList?)
        {
            metric.addClassAttribute(currentVariableType, $IDENT.toString());
//            System.out.println("VAR_IDENT="+$IDENT);
        }
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayDeclarator
    :   LBRACK RBRACK
    ;

arrayDeclaratorList
    :   ^(ARRAY_DECLARATOR_LIST ARRAY_DECLARATOR*)  
    ;
    
arrayInitializer
    :   ^(ARRAY_INITIALIZER variableInitializer*)
    ;

throwsClause
    :   ^(THROWS_CLAUSE qualifiedIdentifier+)
    ;

modifierList
    :   ^(MODIFIER_LIST modifier*)
    ;

modifier
    :   PUBLIC
    |   PROTECTED
    |   PRIVATE
    |   STATIC
    |   ABSTRACT
    |   NATIVE
    |   SYNCHRONIZED
    |   TRANSIENT
    |   VOLATILE
    |   STRICTFP
    |   localModifier
    ;

localModifierList
    :   ^(LOCAL_MODIFIER_LIST localModifier*)
    ;

localModifier
    :   FINAL
    |   annotation
    ;

type
    :   ^(TYPE (primitiveType | qualifiedTypeIdent) arrayDeclaratorList?)
    ;

qualifiedTypeIdent
    :   ^(QUALIFIED_TYPE_IDENT typeIdent+) 
    ;

typeIdent
    :   ^(IDENT genericTypeArgumentList?)
        {
            currentVariableType = $IDENT.toString();
//          System.out.println("type="+$IDENT);
        }
    ;

primitiveType
    :   BOOLEAN
        {
            currentVariableType = "boolean";
//          System.out.println("type="+currentVariableType);
        }
    |   CHAR
        {
            currentVariableType = "char";
//          System.out.println("type="+currentVariableType);
        }
    |   BYTE
        {
            currentVariableType = "byte";
//          System.out.println("type="+currentVariableType);
        }
    |   SHORT
        {
            currentVariableType = "short";
//          System.out.println("type="+currentVariableType);
        }
    |   INT
        {
            currentVariableType = "int";
//          System.out.println("type="+currentVariableType);
        }
    |   LONG
        {
            currentVariableType = "long";
//          System.out.println("type="+currentVariableType);
        }
    |   FLOAT
        {
            currentVariableType = "float";
//          System.out.println("type="+currentVariableType);
        }
    |   DOUBLE
        {
            currentVariableType = "double";
//          System.out.println("type="+currentVariableType);
        }
    ;

genericTypeArgumentList
    :   ^(GENERIC_TYPE_ARG_LIST genericTypeArgument+)
    ;
    
genericTypeArgument
    :   type
    |   ^(QUESTION genericWildcardBoundType?)
    ;

genericWildcardBoundType                                                                                                                      
    :   ^(EXTENDS type)
    |   ^(SUPER type)
    ;

formalParameterList
    :   ^(FORMAL_PARAM_LIST formalParameterStandardDecl* formalParameterVarargDecl?) 
    ;
    
formalParameterStandardDecl
    :   ^(FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId)
    ;
    
formalParameterVarargDecl
    :   ^(FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId)
    ;
    
qualifiedIdentifier
    :   IDENT
    |   ^(DOT qualifiedIdentifier IDENT)
    ;
    
// ANNOTATIONS

annotationList
    :   ^(ANNOTATION_LIST annotation*)
    ;

annotation
    :   ^(AT qualifiedIdentifier annotationInit?)
    ;
    
annotationInit
    :   ^(ANNOTATION_INIT_BLOCK annotationInitializers?)
    ;

annotationInitializers
    :   ^(ANNOTATION_INIT_KEY_LIST annotationInitializer+)
    |   ^(ANNOTATION_INIT_DEFAULT_KEY annotationElementValue)
    ;
    
annotationInitializer
    :   ^(IDENT annotationElementValue)
    ;
    
annotationElementValue
    :   ^(ANNOTATION_INIT_ARRAY_ELEMENT annotationElementValue*)
    |   annotation
    |   expression
    ;
    
annotationTopLevelScope
    :   ^(ANNOTATION_TOP_LEVEL_SCOPE annotationScopeDeclarations*)
    ;
    
annotationScopeDeclarations
    :   ^(ANNOTATION_METHOD_DECL modifierList type IDENT annotationDefaultValue?)
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
    |   typeDeclaration
    ;
    
annotationDefaultValue
    :   ^(DEFAULT annotationElementValue)
    ;

// STATEMENTS / BLOCKS

block
    :   ^(BLOCK_SCOPE blockStatement*)
    ;
    
blockStatement
    :   localVariableDeclaration
    |   typeDeclaration
    |   statement
    ;
    
localVariableDeclaration
    :   ^(VAR_DECLARATION localModifierList type variableDeclaratorList)
        { metric.classDeclarationFinished(); }
    ;
    
        
statement
    :   block
    |   ^(ASSERT expression expression?)
    |   ^(IF parenthesizedExpression statement statement?)
        { metric.increaseCyclomatic(); }
    |   ^(FOR forInit forCondition forUpdater statement)
        { metric.increaseCyclomatic(); }
    |   ^(FOR_EACH localModifierList type IDENT expression statement) 
        { metric.increaseCyclomatic(); }
    |   ^(WHILE parenthesizedExpression statement)
        { metric.increaseCyclomatic(); }
    |   ^(DO statement parenthesizedExpression)
        { metric.increaseCyclomatic(); }
    |   ^(TRY block catches? block?)  // The second optional block is the optional finally block.
    |   ^(SWITCH parenthesizedExpression switchBlockLabels)
    |   ^(SYNCHRONIZED parenthesizedExpression block)
    |   ^(RETURN expression?)
    |   ^(THROW expression)
    |   ^(BREAK IDENT?)
    |   ^(CONTINUE IDENT?)
    |   ^(LABELED_STATEMENT IDENT statement)
    |   expression
    |   SEMI // Empty statement.
    ;
        
catches
    :   ^(CATCH_CLAUSE_LIST catchClause+)
    ;
    
catchClause
    :   ^(CATCH formalParameterStandardDecl block)
        { metric.increaseCyclomatic(); }
    ;

switchBlockLabels
    :   ^(SWITCH_BLOCK_LABEL_LIST switchCaseLabel* switchDefaultLabel? switchCaseLabel*)
    ;
        
switchCaseLabel
    :   ^(CASE expression blockStatement*)
        { metric.increaseCyclomatic(); }
    ;
    
switchDefaultLabel
    :   ^(DEFAULT blockStatement*)
    ;
    
forInit
    :   ^(FOR_INIT (localVariableDeclaration | expression*)?)
    ;
    
forCondition
    :   ^(FOR_CONDITION expression?)
    ;
    
forUpdater
    :   ^(FOR_UPDATE expression*)
    ;
    
// EXPRESSIONS

parenthesizedExpression
    :   ^(PARENTESIZED_EXPR expression)
    ;
    
expression
    :   ^(EXPR expr)
    ;

expr
    :   ^(ASSIGN expr expr)
    |   ^(PLUS_ASSIGN expr expr)
    |   ^(MINUS_ASSIGN expr expr)
    |   ^(STAR_ASSIGN expr expr)
    |   ^(DIV_ASSIGN expr expr)
    |   ^(AND_ASSIGN expr expr)
    |   ^(OR_ASSIGN expr expr)
    |   ^(XOR_ASSIGN expr expr)
    |   ^(MOD_ASSIGN expr expr)
    |   ^(BIT_SHIFT_RIGHT_ASSIGN expr expr)
    |   ^(SHIFT_RIGHT_ASSIGN expr expr)
    |   ^(SHIFT_LEFT_ASSIGN expr expr)
    |   ^(QUESTION expr expr expr)
        { metric.increaseCyclomatic(); }
    |   ^(LOGICAL_OR expr expr)
        { metric.increaseCyclomatic(); }
    |   ^(LOGICAL_AND expr expr)
        { metric.increaseCyclomatic(); }
    |   ^(OR expr expr)
    |   ^(XOR expr expr)
    |   ^(AND expr expr)
    |   ^(EQUAL expr expr)
    |   ^(NOT_EQUAL expr expr)
    |   ^(INSTANCEOF expr type)
    |   ^(LESS_OR_EQUAL expr expr)
    |   ^(GREATER_OR_EQUAL expr expr)
    |   ^(BIT_SHIFT_RIGHT expr expr)
    |   ^(SHIFT_RIGHT expr expr)
    |   ^(GREATER_THAN expr expr)
    |   ^(SHIFT_LEFT expr expr)
    |   ^(LESS_THAN expr expr)
    |   ^(PLUS expr expr)
    |   ^(MINUS expr expr)
    |   ^(STAR expr expr)
    |   ^(DIV expr expr)
    |   ^(MOD expr expr)
    |   ^(UNARY_PLUS expr)
    |   ^(UNARY_MINUS expr)
    |   ^(PRE_INC expr)
    |   ^(PRE_DEC expr)
    |   ^(POST_INC expr)
    |   ^(POST_DEC expr)
    |   ^(NOT expr)
    |   ^(LOGICAL_NOT expr)
    |   ^(CAST_EXPR type expr)
    |   primaryExpression
    ;
    
primaryExpression
    :   ^(  DOT
            (   primaryExpression
                (   IDENT
                |   THIS
                |   SUPER
                |   innerNewExpression
                |   CLASS
                )
            |   primitiveType CLASS
            |   VOID CLASS
            )
        )
    |   parenthesizedExpression
    |   IDENT
    |   ^(METHOD_CALL primaryExpression genericTypeArgumentList? arguments)
    |   explicitConstructorCall
    |   ^(ARRAY_ELEMENT_ACCESS primaryExpression expression)
    |   literal
    |   newExpression
    |   THIS
    |   arrayTypeDeclarator
    |   SUPER
    ;
    
explicitConstructorCall
    :   ^(THIS_CONSTRUCTOR_CALL genericTypeArgumentList? arguments)
    |   ^(SUPER_CONSTRUCTOR_CALL primaryExpression? genericTypeArgumentList? arguments)
    ;

arrayTypeDeclarator
    :   ^(ARRAY_DECLARATOR (arrayTypeDeclarator | qualifiedIdentifier | primitiveType))
    ;

newExpression
    :   ^(  STATIC_ARRAY_CREATOR
            (   primitiveType newArrayConstruction
            |   genericTypeArgumentList? qualifiedTypeIdent newArrayConstruction
            )
        )
    |   ^(CLASS_CONSTRUCTOR_CALL genericTypeArgumentList? qualifiedTypeIdent arguments classTopLevelScope?)
    ;

innerNewExpression // something like 'InnerType innerType = outer.new InnerType();'
    :   ^(CLASS_CONSTRUCTOR_CALL genericTypeArgumentList? IDENT arguments classTopLevelScope?)
    ;
    
newArrayConstruction
    :   arrayDeclaratorList arrayInitializer
    |   expression+ arrayDeclaratorList?
    ;

arguments
    :   ^(ARGUMENT_LIST expression*)
    ;

literal 
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
    |   FLOATING_POINT_LITERAL
    |   CHARACTER_LITERAL
    |   STRING_LITERAL
    |   TRUE
    |   FALSE
    |   NULL
    ;
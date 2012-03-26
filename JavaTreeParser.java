// $ANTLR 3.4 JavaTreeParser.g 2012-03-07 00:52:17

// Should be replaced for individual needs.
//package com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaTreeParser extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AND", "AND_ASSIGN", "ANNOTATION_INIT_ARRAY_ELEMENT", "ANNOTATION_INIT_BLOCK", "ANNOTATION_INIT_DEFAULT_KEY", "ANNOTATION_INIT_KEY_LIST", "ANNOTATION_LIST", "ANNOTATION_METHOD_DECL", "ANNOTATION_SCOPE", "ANNOTATION_TOP_LEVEL_SCOPE", "ARGUMENT_LIST", "ARRAY_DECLARATOR", "ARRAY_DECLARATOR_LIST", "ARRAY_ELEMENT_ACCESS", "ARRAY_INITIALIZER", "ASSERT", "ASSIGN", "AT", "BIT_SHIFT_RIGHT", "BIT_SHIFT_RIGHT_ASSIGN", "BLOCK_COMMENT", "BLOCK_SCOPE", "BOOLEAN", "BREAK", "BYTE", "CASE", "CAST_EXPR", "CATCH", "CATCH_CLAUSE_LIST", "CHAR", "CHARACTER_LITERAL", "CLASS", "CLASS_CONSTRUCTOR_CALL", "CLASS_INSTANCE_INITIALIZER", "CLASS_STATIC_INITIALIZER", "CLASS_TOP_LEVEL_SCOPE", "COLON", "COMMA", "CONSTRUCTOR_DECL", "CONTINUE", "DEC", "DECIMAL_FP_LITERAL", "DECIMAL_LITERAL", "DEFAULT", "DIV", "DIV_ASSIGN", "DO", "DOT", "DOTSTAR", "DOUBLE", "ELLIPSIS", "ELSE", "ENUM", "ENUM_TOP_LEVEL_SCOPE", "EQUAL", "ESCAPE_SEQUENCE", "EXPONENT", "EXPR", "EXTENDS", "EXTENDS_BOUND_LIST", "EXTENDS_CLAUSE", "FALSE", "FINAL", "FINALLY", "FLOAT", "FLOATING_POINT_LITERAL", "FLOAT_TYPE_SUFFIX", "FOR", "FORMAL_PARAM_LIST", "FORMAL_PARAM_STD_DECL", "FORMAL_PARAM_VARARG_DECL", "FOR_CONDITION", "FOR_EACH", "FOR_INIT", "FOR_UPDATE", "FUNCTION_METHOD_DECL", "GENERIC_TYPE_ARG_LIST", "GENERIC_TYPE_PARAM_LIST", "GREATER_OR_EQUAL", "GREATER_THAN", "HEXADECIMAL_FP_LITERAL", "HEX_DIGIT", "HEX_LITERAL", "HEX_PREFIX", "IDENT", "IF", "IMPLEMENTS", "IMPLEMENTS_CLAUSE", "IMPORT", "INC", "INSTANCEOF", "INT", "INTEGER_TYPE_SUFFIX", "INTERFACE", "INTERFACE_TOP_LEVEL_SCOPE", "JAVADOC_COMMENT", "JAVA_ID_PART", "JAVA_ID_START", "JAVA_SOURCE", "LABELED_STATEMENT", "LBRACK", "LCURLY", "LESS_OR_EQUAL", "LESS_THAN", "LINE_COMMENT", "LOCAL_MODIFIER_LIST", "LOGICAL_AND", "LOGICAL_NOT", "LOGICAL_OR", "LONG", "LPAREN", "METHOD_CALL", "MINUS", "MINUS_ASSIGN", "MOD", "MODIFIER_LIST", "MOD_ASSIGN", "NATIVE", "NEW", "NL", "NOT", "NOT_EQUAL", "NULL", "OCTAL_ESCAPE", "OCTAL_LITERAL", "OR", "OR_ASSIGN", "PACKAGE", "PARENTESIZED_EXPR", "PLUS", "PLUS_ASSIGN", "POST_DEC", "POST_INC", "PRE_DEC", "PRE_INC", "PRIVATE", "PROTECTED", "PUBLIC", "QUALIFIED_TYPE_IDENT", "QUESTION", "RBRACK", "RCURLY", "RETURN", "RPAREN", "SEMI", "SHIFT_LEFT", "SHIFT_LEFT_ASSIGN", "SHIFT_RIGHT", "SHIFT_RIGHT_ASSIGN", "SHORT", "SIGNED_INTEGER", "STAR", "STAR_ASSIGN", "STATIC", "STATIC_ARRAY_CREATOR", "STRICTFP", "STRING_LITERAL", "SUPER", "SUPER_CONSTRUCTOR_CALL", "SWITCH", "SWITCH_BLOCK_LABEL_LIST", "SYNCHRONIZED", "THIS", "THIS_CONSTRUCTOR_CALL", "THROW", "THROWS", "THROWS_CLAUSE", "TRANSIENT", "TRUE", "TRY", "TYPE", "UNARY_MINUS", "UNARY_PLUS", "UNICODE_ESCAPE", "VAR_DECLARATION", "VAR_DECLARATOR", "VAR_DECLARATOR_LIST", "VOID", "VOID_METHOD_DECL", "VOLATILE", "WHILE", "WS", "XOR", "XOR_ASSIGN"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AND=5;
    public static final int AND_ASSIGN=6;
    public static final int ANNOTATION_INIT_ARRAY_ELEMENT=7;
    public static final int ANNOTATION_INIT_BLOCK=8;
    public static final int ANNOTATION_INIT_DEFAULT_KEY=9;
    public static final int ANNOTATION_INIT_KEY_LIST=10;
    public static final int ANNOTATION_LIST=11;
    public static final int ANNOTATION_METHOD_DECL=12;
    public static final int ANNOTATION_SCOPE=13;
    public static final int ANNOTATION_TOP_LEVEL_SCOPE=14;
    public static final int ARGUMENT_LIST=15;
    public static final int ARRAY_DECLARATOR=16;
    public static final int ARRAY_DECLARATOR_LIST=17;
    public static final int ARRAY_ELEMENT_ACCESS=18;
    public static final int ARRAY_INITIALIZER=19;
    public static final int ASSERT=20;
    public static final int ASSIGN=21;
    public static final int AT=22;
    public static final int BIT_SHIFT_RIGHT=23;
    public static final int BIT_SHIFT_RIGHT_ASSIGN=24;
    public static final int BLOCK_COMMENT=25;
    public static final int BLOCK_SCOPE=26;
    public static final int BOOLEAN=27;
    public static final int BREAK=28;
    public static final int BYTE=29;
    public static final int CASE=30;
    public static final int CAST_EXPR=31;
    public static final int CATCH=32;
    public static final int CATCH_CLAUSE_LIST=33;
    public static final int CHAR=34;
    public static final int CHARACTER_LITERAL=35;
    public static final int CLASS=36;
    public static final int CLASS_CONSTRUCTOR_CALL=37;
    public static final int CLASS_INSTANCE_INITIALIZER=38;
    public static final int CLASS_STATIC_INITIALIZER=39;
    public static final int CLASS_TOP_LEVEL_SCOPE=40;
    public static final int COLON=41;
    public static final int COMMA=42;
    public static final int CONSTRUCTOR_DECL=43;
    public static final int CONTINUE=44;
    public static final int DEC=45;
    public static final int DECIMAL_FP_LITERAL=46;
    public static final int DECIMAL_LITERAL=47;
    public static final int DEFAULT=48;
    public static final int DIV=49;
    public static final int DIV_ASSIGN=50;
    public static final int DO=51;
    public static final int DOT=52;
    public static final int DOTSTAR=53;
    public static final int DOUBLE=54;
    public static final int ELLIPSIS=55;
    public static final int ELSE=56;
    public static final int ENUM=57;
    public static final int ENUM_TOP_LEVEL_SCOPE=58;
    public static final int EQUAL=59;
    public static final int ESCAPE_SEQUENCE=60;
    public static final int EXPONENT=61;
    public static final int EXPR=62;
    public static final int EXTENDS=63;
    public static final int EXTENDS_BOUND_LIST=64;
    public static final int EXTENDS_CLAUSE=65;
    public static final int FALSE=66;
    public static final int FINAL=67;
    public static final int FINALLY=68;
    public static final int FLOAT=69;
    public static final int FLOATING_POINT_LITERAL=70;
    public static final int FLOAT_TYPE_SUFFIX=71;
    public static final int FOR=72;
    public static final int FORMAL_PARAM_LIST=73;
    public static final int FORMAL_PARAM_STD_DECL=74;
    public static final int FORMAL_PARAM_VARARG_DECL=75;
    public static final int FOR_CONDITION=76;
    public static final int FOR_EACH=77;
    public static final int FOR_INIT=78;
    public static final int FOR_UPDATE=79;
    public static final int FUNCTION_METHOD_DECL=80;
    public static final int GENERIC_TYPE_ARG_LIST=81;
    public static final int GENERIC_TYPE_PARAM_LIST=82;
    public static final int GREATER_OR_EQUAL=83;
    public static final int GREATER_THAN=84;
    public static final int HEXADECIMAL_FP_LITERAL=85;
    public static final int HEX_DIGIT=86;
    public static final int HEX_LITERAL=87;
    public static final int HEX_PREFIX=88;
    public static final int IDENT=89;
    public static final int IF=90;
    public static final int IMPLEMENTS=91;
    public static final int IMPLEMENTS_CLAUSE=92;
    public static final int IMPORT=93;
    public static final int INC=94;
    public static final int INSTANCEOF=95;
    public static final int INT=96;
    public static final int INTEGER_TYPE_SUFFIX=97;
    public static final int INTERFACE=98;
    public static final int INTERFACE_TOP_LEVEL_SCOPE=99;
    public static final int JAVADOC_COMMENT=100;
    public static final int JAVA_ID_PART=101;
    public static final int JAVA_ID_START=102;
    public static final int JAVA_SOURCE=103;
    public static final int LABELED_STATEMENT=104;
    public static final int LBRACK=105;
    public static final int LCURLY=106;
    public static final int LESS_OR_EQUAL=107;
    public static final int LESS_THAN=108;
    public static final int LINE_COMMENT=109;
    public static final int LOCAL_MODIFIER_LIST=110;
    public static final int LOGICAL_AND=111;
    public static final int LOGICAL_NOT=112;
    public static final int LOGICAL_OR=113;
    public static final int LONG=114;
    public static final int LPAREN=115;
    public static final int METHOD_CALL=116;
    public static final int MINUS=117;
    public static final int MINUS_ASSIGN=118;
    public static final int MOD=119;
    public static final int MODIFIER_LIST=120;
    public static final int MOD_ASSIGN=121;
    public static final int NATIVE=122;
    public static final int NEW=123;
    public static final int NL=124;
    public static final int NOT=125;
    public static final int NOT_EQUAL=126;
    public static final int NULL=127;
    public static final int OCTAL_ESCAPE=128;
    public static final int OCTAL_LITERAL=129;
    public static final int OR=130;
    public static final int OR_ASSIGN=131;
    public static final int PACKAGE=132;
    public static final int PARENTESIZED_EXPR=133;
    public static final int PLUS=134;
    public static final int PLUS_ASSIGN=135;
    public static final int POST_DEC=136;
    public static final int POST_INC=137;
    public static final int PRE_DEC=138;
    public static final int PRE_INC=139;
    public static final int PRIVATE=140;
    public static final int PROTECTED=141;
    public static final int PUBLIC=142;
    public static final int QUALIFIED_TYPE_IDENT=143;
    public static final int QUESTION=144;
    public static final int RBRACK=145;
    public static final int RCURLY=146;
    public static final int RETURN=147;
    public static final int RPAREN=148;
    public static final int SEMI=149;
    public static final int SHIFT_LEFT=150;
    public static final int SHIFT_LEFT_ASSIGN=151;
    public static final int SHIFT_RIGHT=152;
    public static final int SHIFT_RIGHT_ASSIGN=153;
    public static final int SHORT=154;
    public static final int SIGNED_INTEGER=155;
    public static final int STAR=156;
    public static final int STAR_ASSIGN=157;
    public static final int STATIC=158;
    public static final int STATIC_ARRAY_CREATOR=159;
    public static final int STRICTFP=160;
    public static final int STRING_LITERAL=161;
    public static final int SUPER=162;
    public static final int SUPER_CONSTRUCTOR_CALL=163;
    public static final int SWITCH=164;
    public static final int SWITCH_BLOCK_LABEL_LIST=165;
    public static final int SYNCHRONIZED=166;
    public static final int THIS=167;
    public static final int THIS_CONSTRUCTOR_CALL=168;
    public static final int THROW=169;
    public static final int THROWS=170;
    public static final int THROWS_CLAUSE=171;
    public static final int TRANSIENT=172;
    public static final int TRUE=173;
    public static final int TRY=174;
    public static final int TYPE=175;
    public static final int UNARY_MINUS=176;
    public static final int UNARY_PLUS=177;
    public static final int UNICODE_ESCAPE=178;
    public static final int VAR_DECLARATION=179;
    public static final int VAR_DECLARATOR=180;
    public static final int VAR_DECLARATOR_LIST=181;
    public static final int VOID=182;
    public static final int VOID_METHOD_DECL=183;
    public static final int VOLATILE=184;
    public static final int WHILE=185;
    public static final int WS=186;
    public static final int XOR=187;
    public static final int XOR_ASSIGN=188;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public JavaTreeParser(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaTreeParser(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[289+1];
         

    }

    public String[] getTokenNames() { return JavaTreeParser.tokenNames; }
    public String getGrammarFileName() { return "JavaTreeParser.g"; }


        
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




    // $ANTLR start "javaSource"
    // JavaTreeParser.g:166:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) ;
    public final void javaSource() throws RecognitionException {
        int javaSource_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // JavaTreeParser.g:167:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) )
            // JavaTreeParser.g:167:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource92); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_annotationList_in_javaSource94);
            annotationList();

            state._fsp--;
            if (state.failed) return ;

            // JavaTreeParser.g:167:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // JavaTreeParser.g:167:38: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource96);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // JavaTreeParser.g:167:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // JavaTreeParser.g:167:58: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource99);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // JavaTreeParser.g:167:77: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // JavaTreeParser.g:167:77: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource102);
            	    typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { metric.finish(); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, javaSource_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "javaSource"



    // $ANTLR start "packageDeclaration"
    // JavaTreeParser.g:171:1: packageDeclaration : ^( PACKAGE qualifiedIdentifier ) ;
    public final void packageDeclaration() throws RecognitionException {
        int packageDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // JavaTreeParser.g:172:5: ( ^( PACKAGE qualifiedIdentifier ) )
            // JavaTreeParser.g:172:9: ^( PACKAGE qualifiedIdentifier )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration134); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration136);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "packageDeclaration"



    // $ANTLR start "importDeclaration"
    // JavaTreeParser.g:175:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final void importDeclaration() throws RecognitionException {
        int importDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // JavaTreeParser.g:176:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // JavaTreeParser.g:176:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration163); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:176:18: ( STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // JavaTreeParser.g:176:18: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_importDeclaration165); if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration168);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return ;

            // JavaTreeParser.g:176:46: ( DOTSTAR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOTSTAR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // JavaTreeParser.g:176:46: DOTSTAR
                    {
                    match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration170); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "importDeclaration"



    // $ANTLR start "typeDeclaration"
    // JavaTreeParser.g:179:1: typeDeclaration : ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final void typeDeclaration() throws RecognitionException {
        int typeDeclaration_StartIndex = input.index();

        CommonTree IDENT1=null;
        CommonTree IDENT2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // JavaTreeParser.g:180:5: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt12=1;
                }
                break;
            case INTERFACE:
                {
                alt12=2;
                }
                break;
            case ENUM:
                {
                alt12=3;
                }
                break;
            case AT:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // JavaTreeParser.g:180:9: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_typeDeclaration196); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration198);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration200); if (state.failed) return ;

                    // JavaTreeParser.g:180:36: ( genericTypeParameterList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // JavaTreeParser.g:180:36: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration202);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // JavaTreeParser.g:180:62: ( extendsClause )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_CLAUSE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // JavaTreeParser.g:180:62: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration205);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // JavaTreeParser.g:180:77: ( implementsClause )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_CLAUSE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // JavaTreeParser.g:180:77: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration208);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_classTopLevelScope_in_typeDeclaration211);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.addClassDeclaration(IDENT1.toString()); }

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:182:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration233); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration235);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration237); if (state.failed) return ;

                    // JavaTreeParser.g:182:40: ( genericTypeParameterList )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // JavaTreeParser.g:182:40: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration239);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // JavaTreeParser.g:182:66: ( extendsClause )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EXTENDS_CLAUSE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // JavaTreeParser.g:182:66: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration242);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration245);
                    interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.addInterfaceDeclaration(IDENT2.toString()); }

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:184:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration267); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration269);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration271); if (state.failed) return ;

                    // JavaTreeParser.g:184:35: ( implementsClause )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==IMPLEMENTS_CLAUSE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // JavaTreeParser.g:184:35: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration273);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration276);
                    enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // JavaTreeParser.g:185:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    match(input,AT,FOLLOW_AT_in_typeDeclaration288); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration290);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration292); if (state.failed) return ;

                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration294);
                    annotationTopLevelScope();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, typeDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeDeclaration"



    // $ANTLR start "extendsClause"
    // JavaTreeParser.g:188:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
    public final void extendsClause() throws RecognitionException {
        int extendsClause_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // JavaTreeParser.g:190:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
            // JavaTreeParser.g:190:9: ^( EXTENDS_CLAUSE ( type )+ )
            {
            match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause331); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:190:26: ( type )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TYPE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // JavaTreeParser.g:190:26: type
            	    {
            	    pushFollow(FOLLOW_type_in_extendsClause333);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, extendsClause_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "extendsClause"



    // $ANTLR start "implementsClause"
    // JavaTreeParser.g:193:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
    public final void implementsClause() throws RecognitionException {
        int implementsClause_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }

            // JavaTreeParser.g:194:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
            // JavaTreeParser.g:194:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
            {
            match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause362); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:194:29: ( type )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==TYPE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // JavaTreeParser.g:194:29: type
            	    {
            	    pushFollow(FOLLOW_type_in_implementsClause364);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, implementsClause_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "implementsClause"



    // $ANTLR start "genericTypeParameterList"
    // JavaTreeParser.g:197:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
    public final void genericTypeParameterList() throws RecognitionException {
        int genericTypeParameterList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }

            // JavaTreeParser.g:198:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
            // JavaTreeParser.g:198:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
            {
            match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList394); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:198:35: ( genericTypeParameter )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==IDENT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // JavaTreeParser.g:198:35: genericTypeParameter
            	    {
            	    pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList396);
            	    genericTypeParameter();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, genericTypeParameterList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "genericTypeParameterList"



    // $ANTLR start "genericTypeParameter"
    // JavaTreeParser.g:201:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
    public final void genericTypeParameter() throws RecognitionException {
        int genericTypeParameter_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // JavaTreeParser.g:202:5: ( ^( IDENT ( bound )? ) )
            // JavaTreeParser.g:202:9: ^( IDENT ( bound )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter418); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:202:17: ( bound )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==EXTENDS_BOUND_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // JavaTreeParser.g:202:17: bound
                        {
                        pushFollow(FOLLOW_bound_in_genericTypeParameter420);
                        bound();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, genericTypeParameter_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "genericTypeParameter"



    // $ANTLR start "bound"
    // JavaTreeParser.g:205:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
    public final void bound() throws RecognitionException {
        int bound_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // JavaTreeParser.g:206:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
            // JavaTreeParser.g:206:9: ^( EXTENDS_BOUND_LIST ( type )+ )
            {
            match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound450); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:206:30: ( type )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==TYPE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // JavaTreeParser.g:206:30: type
            	    {
            	    pushFollow(FOLLOW_type_in_bound452);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, bound_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "bound"



    // $ANTLR start "enumTopLevelScope"
    // JavaTreeParser.g:209:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )* ( classTopLevelScope )? ) ;
    public final void enumTopLevelScope() throws RecognitionException {
        int enumTopLevelScope_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // JavaTreeParser.g:210:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )* ( classTopLevelScope )? ) )
            // JavaTreeParser.g:210:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )* ( classTopLevelScope )? )
            {
            match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope474); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:210:32: ( enumConstant )*
                loop18:
                do {
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==IDENT) ) {
                        alt18=1;
                    }


                    switch (alt18) {
                	case 1 :
                	    // JavaTreeParser.g:210:32: enumConstant
                	    {
                	    pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope476);
                	    enumConstant();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop18;
                    }
                } while (true);


                // JavaTreeParser.g:210:46: ( classTopLevelScope )?
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==CLASS_TOP_LEVEL_SCOPE) ) {
                    alt19=1;
                }
                switch (alt19) {
                    case 1 :
                        // JavaTreeParser.g:210:46: classTopLevelScope
                        {
                        pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope479);
                        classTopLevelScope();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, enumTopLevelScope_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumTopLevelScope"



    // $ANTLR start "enumConstant"
    // JavaTreeParser.g:213:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
    public final void enumConstant() throws RecognitionException {
        int enumConstant_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // JavaTreeParser.g:214:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
            // JavaTreeParser.g:214:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_enumConstant505); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_annotationList_in_enumConstant507);
            annotationList();

            state._fsp--;
            if (state.failed) return ;

            // JavaTreeParser.g:214:32: ( arguments )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ARGUMENT_LIST) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // JavaTreeParser.g:214:32: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant509);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // JavaTreeParser.g:214:43: ( classTopLevelScope )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // JavaTreeParser.g:214:43: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumConstant512);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, enumConstant_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumConstant"



    // $ANTLR start "classTopLevelScope"
    // JavaTreeParser.g:218:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) ;
    public final void classTopLevelScope() throws RecognitionException {
        int classTopLevelScope_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // JavaTreeParser.g:219:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) )
            // JavaTreeParser.g:219:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* )
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope543); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:219:33: ( classScopeDeclarations )*
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AT||LA22_0==CLASS||(LA22_0 >= CLASS_INSTANCE_INITIALIZER && LA22_0 <= CLASS_STATIC_INITIALIZER)||LA22_0==CONSTRUCTOR_DECL||LA22_0==ENUM||LA22_0==FUNCTION_METHOD_DECL||LA22_0==INTERFACE||LA22_0==VAR_DECLARATION||LA22_0==VOID_METHOD_DECL) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                	case 1 :
                	    // JavaTreeParser.g:219:33: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope545);
                	    classScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop22;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, classTopLevelScope_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "classTopLevelScope"



    // $ANTLR start "classScopeDeclarations"
    // JavaTreeParser.g:222:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration );
    public final void classScopeDeclarations() throws RecognitionException {
        int classScopeDeclarations_StartIndex = input.index();

        CommonTree IDENT3=null;
        CommonTree IDENT4=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // JavaTreeParser.g:223:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration )
            int alt32=7;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt32=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt32=2;
                }
                break;
            case FUNCTION_METHOD_DECL:
                {
                alt32=3;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt32=4;
                }
                break;
            case VAR_DECLARATION:
                {
                alt32=5;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt32=6;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt32=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // JavaTreeParser.g:223:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations571); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations573);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:224:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations585); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations587);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:225:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations599); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations601);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:225:45: ( genericTypeParameterList )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // JavaTreeParser.g:225:45: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations603);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_type_in_classScopeDeclarations606);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations608); if (state.failed) return ;

                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations610);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:225:102: ( arrayDeclaratorList )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ARRAY_DECLARATOR_LIST) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // JavaTreeParser.g:225:102: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_classScopeDeclarations612);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // JavaTreeParser.g:225:123: ( throwsClause )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==THROWS_CLAUSE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // JavaTreeParser.g:225:123: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations615);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // JavaTreeParser.g:225:137: ( block )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BLOCK_SCOPE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // JavaTreeParser.g:225:137: block
                            {
                            pushFollow(FOLLOW_block_in_classScopeDeclarations618);
                            block();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.addFunctionDeclaration(IDENT3.toString()); }

                    }
                    break;
                case 4 :
                    // JavaTreeParser.g:227:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations641); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations643);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:227:41: ( genericTypeParameterList )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // JavaTreeParser.g:227:41: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations645);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations648); if (state.failed) return ;

                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations650);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:227:93: ( throwsClause )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==THROWS_CLAUSE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // JavaTreeParser.g:227:93: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations652);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // JavaTreeParser.g:227:107: ( block )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==BLOCK_SCOPE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // JavaTreeParser.g:227:107: block
                            {
                            pushFollow(FOLLOW_block_in_classScopeDeclarations655);
                            block();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.addFunctionDeclaration(IDENT4.toString()); }

                    }
                    break;
                case 5 :
                    // JavaTreeParser.g:229:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classScopeDeclarations678); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations680);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_type_in_classScopeDeclarations682);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_variableDeclaratorList_in_classScopeDeclarations684);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // JavaTreeParser.g:231:9: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations697); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations699);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:231:41: ( genericTypeParameterList )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // JavaTreeParser.g:231:41: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations701);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations704);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:231:87: ( throwsClause )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==THROWS_CLAUSE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // JavaTreeParser.g:231:87: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations706);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_classScopeDeclarations709);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.addFunctionDeclaration("constructor"); }

                    }
                    break;
                case 7 :
                    // JavaTreeParser.g:233:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations730);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, classScopeDeclarations_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "classScopeDeclarations"



    // $ANTLR start "interfaceTopLevelScope"
    // JavaTreeParser.g:236:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
    public final void interfaceTopLevelScope() throws RecognitionException {
        int interfaceTopLevelScope_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // JavaTreeParser.g:237:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
            // JavaTreeParser.g:237:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
            {
            match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope754); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:237:37: ( interfaceScopeDeclarations )*
                loop33:
                do {
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==AT||LA33_0==CLASS||LA33_0==ENUM||LA33_0==FUNCTION_METHOD_DECL||LA33_0==INTERFACE||LA33_0==VAR_DECLARATION||LA33_0==VOID_METHOD_DECL) ) {
                        alt33=1;
                    }


                    switch (alt33) {
                	case 1 :
                	    // JavaTreeParser.g:237:37: interfaceScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope756);
                	    interfaceScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop33;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, interfaceTopLevelScope_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "interfaceTopLevelScope"



    // $ANTLR start "interfaceScopeDeclarations"
    // JavaTreeParser.g:240:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final void interfaceScopeDeclarations() throws RecognitionException {
        int interfaceScopeDeclarations_StartIndex = input.index();

        CommonTree IDENT5=null;
        CommonTree IDENT6=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // JavaTreeParser.g:241:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt39=4;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt39=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt39=2;
                }
                break;
            case VAR_DECLARATION:
                {
                alt39=3;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // JavaTreeParser.g:241:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations782); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations784);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:241:45: ( genericTypeParameterList )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // JavaTreeParser.g:241:45: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations786);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations789);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    IDENT5=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations791); if (state.failed) return ;

                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations793);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:241:102: ( arrayDeclaratorList )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARRAY_DECLARATOR_LIST) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // JavaTreeParser.g:241:102: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations795);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // JavaTreeParser.g:241:123: ( throwsClause )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THROWS_CLAUSE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // JavaTreeParser.g:241:123: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations798);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.addFunctionDeclaration(IDENT5.toString()); }

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:243:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations821); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations823);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:243:41: ( genericTypeParameterList )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // JavaTreeParser.g:243:41: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations825);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations828); if (state.failed) return ;

                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations830);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:243:93: ( throwsClause )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THROWS_CLAUSE) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // JavaTreeParser.g:243:93: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations832);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.addFunctionDeclaration(IDENT6.toString()); }

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:248:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations933); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations935);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations937);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations939);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // JavaTreeParser.g:249:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations950);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, interfaceScopeDeclarations_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "interfaceScopeDeclarations"



    // $ANTLR start "variableDeclaratorList"
    // JavaTreeParser.g:252:1: variableDeclaratorList : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
    public final void variableDeclaratorList() throws RecognitionException {
        int variableDeclaratorList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // JavaTreeParser.g:253:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
            // JavaTreeParser.g:253:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
            {
            match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList970); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:253:31: ( variableDeclarator )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==VAR_DECLARATOR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // JavaTreeParser.g:253:31: variableDeclarator
            	    {
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList972);
            	    variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, variableDeclaratorList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "variableDeclaratorList"



    // $ANTLR start "variableDeclarator"
    // JavaTreeParser.g:256:1: variableDeclarator : ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) ;
    public final void variableDeclarator() throws RecognitionException {
        int variableDeclarator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // JavaTreeParser.g:257:5: ( ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) )
            // JavaTreeParser.g:257:9: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator994); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator996);
            variableDeclaratorId();

            state._fsp--;
            if (state.failed) return ;

            // JavaTreeParser.g:257:47: ( variableInitializer )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ARRAY_INITIALIZER||LA41_0==EXPR) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // JavaTreeParser.g:257:47: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator998);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, variableDeclarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "variableDeclarator"



    // $ANTLR start "variableDeclaratorId"
    // JavaTreeParser.g:260:1: variableDeclaratorId : ^( IDENT ( arrayDeclaratorList )? ) ;
    public final void variableDeclaratorId() throws RecognitionException {
        int variableDeclaratorId_StartIndex = input.index();

        CommonTree IDENT7=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // JavaTreeParser.g:261:5: ( ^( IDENT ( arrayDeclaratorList )? ) )
            // JavaTreeParser.g:261:9: ^( IDENT ( arrayDeclaratorList )? )
            {
            IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId1024); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:261:17: ( arrayDeclaratorList )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ARRAY_DECLARATOR_LIST) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // JavaTreeParser.g:261:17: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1026);
                        arrayDeclaratorList();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            if ( state.backtracking==0 ) {
                        metric.addClassAttribute(currentVariableType, IDENT7.toString());
            //            System.out.println("VAR_IDENT="+IDENT7);
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, variableDeclaratorId_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "variableDeclaratorId"



    // $ANTLR start "variableInitializer"
    // JavaTreeParser.g:268:1: variableInitializer : ( arrayInitializer | expression );
    public final void variableInitializer() throws RecognitionException {
        int variableInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // JavaTreeParser.g:269:5: ( arrayInitializer | expression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ARRAY_INITIALIZER) ) {
                alt43=1;
            }
            else if ( (LA43_0==EXPR) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // JavaTreeParser.g:269:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1057);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:270:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer1067);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, variableInitializer_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "variableInitializer"



    // $ANTLR start "arrayDeclarator"
    // JavaTreeParser.g:273:1: arrayDeclarator : LBRACK RBRACK ;
    public final void arrayDeclarator() throws RecognitionException {
        int arrayDeclarator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // JavaTreeParser.g:274:5: ( LBRACK RBRACK )
            // JavaTreeParser.g:274:9: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator1086); if (state.failed) return ;

            match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator1088); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, arrayDeclarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "arrayDeclarator"



    // $ANTLR start "arrayDeclaratorList"
    // JavaTreeParser.g:277:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final void arrayDeclaratorList() throws RecognitionException {
        int arrayDeclaratorList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // JavaTreeParser.g:278:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // JavaTreeParser.g:278:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1108); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:278:33: ( ARRAY_DECLARATOR )*
                loop44:
                do {
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ARRAY_DECLARATOR) ) {
                        alt44=1;
                    }


                    switch (alt44) {
                	case 1 :
                	    // JavaTreeParser.g:278:33: ARRAY_DECLARATOR
                	    {
                	    match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1110); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop44;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, arrayDeclaratorList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "arrayDeclaratorList"



    // $ANTLR start "arrayInitializer"
    // JavaTreeParser.g:281:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
    public final void arrayInitializer() throws RecognitionException {
        int arrayInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // JavaTreeParser.g:282:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
            // JavaTreeParser.g:282:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1138); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:282:29: ( variableInitializer )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ARRAY_INITIALIZER||LA45_0==EXPR) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // JavaTreeParser.g:282:29: variableInitializer
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1140);
                	    variableInitializer();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, arrayInitializer_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "arrayInitializer"



    // $ANTLR start "throwsClause"
    // JavaTreeParser.g:285:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
    public final void throwsClause() throws RecognitionException {
        int throwsClause_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // JavaTreeParser.g:286:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
            // JavaTreeParser.g:286:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
            {
            match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1162); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:286:25: ( qualifiedIdentifier )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==DOT||LA46_0==IDENT) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // JavaTreeParser.g:286:25: qualifiedIdentifier
            	    {
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1164);
            	    qualifiedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, throwsClause_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "throwsClause"



    // $ANTLR start "modifierList"
    // JavaTreeParser.g:289:1: modifierList : ^( MODIFIER_LIST ( modifier )* ) ;
    public final void modifierList() throws RecognitionException {
        int modifierList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // JavaTreeParser.g:290:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // JavaTreeParser.g:290:9: ^( MODIFIER_LIST ( modifier )* )
            {
            match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1186); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:290:25: ( modifier )*
                loop47:
                do {
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==ABSTRACT||LA47_0==AT||LA47_0==FINAL||LA47_0==NATIVE||(LA47_0 >= PRIVATE && LA47_0 <= PUBLIC)||LA47_0==STATIC||LA47_0==STRICTFP||LA47_0==SYNCHRONIZED||LA47_0==TRANSIENT||LA47_0==VOLATILE) ) {
                        alt47=1;
                    }


                    switch (alt47) {
                	case 1 :
                	    // JavaTreeParser.g:290:25: modifier
                	    {
                	    pushFollow(FOLLOW_modifier_in_modifierList1188);
                	    modifier();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop47;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, modifierList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "modifierList"



    // $ANTLR start "modifier"
    // JavaTreeParser.g:293:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final void modifier() throws RecognitionException {
        int modifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // JavaTreeParser.g:294:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
            int alt48=11;
            switch ( input.LA(1) ) {
            case PUBLIC:
                {
                alt48=1;
                }
                break;
            case PROTECTED:
                {
                alt48=2;
                }
                break;
            case PRIVATE:
                {
                alt48=3;
                }
                break;
            case STATIC:
                {
                alt48=4;
                }
                break;
            case ABSTRACT:
                {
                alt48=5;
                }
                break;
            case NATIVE:
                {
                alt48=6;
                }
                break;
            case SYNCHRONIZED:
                {
                alt48=7;
                }
                break;
            case TRANSIENT:
                {
                alt48=8;
                }
                break;
            case VOLATILE:
                {
                alt48=9;
                }
                break;
            case STRICTFP:
                {
                alt48=10;
                }
                break;
            case AT:
            case FINAL:
                {
                alt48=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // JavaTreeParser.g:294:9: PUBLIC
                    {
                    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1209); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:295:9: PROTECTED
                    {
                    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1219); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:296:9: PRIVATE
                    {
                    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1229); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // JavaTreeParser.g:297:9: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_modifier1239); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // JavaTreeParser.g:298:9: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1249); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // JavaTreeParser.g:299:9: NATIVE
                    {
                    match(input,NATIVE,FOLLOW_NATIVE_in_modifier1259); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // JavaTreeParser.g:300:9: SYNCHRONIZED
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1269); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // JavaTreeParser.g:301:9: TRANSIENT
                    {
                    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1279); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // JavaTreeParser.g:302:9: VOLATILE
                    {
                    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1289); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // JavaTreeParser.g:303:9: STRICTFP
                    {
                    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1299); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // JavaTreeParser.g:304:9: localModifier
                    {
                    pushFollow(FOLLOW_localModifier_in_modifier1309);
                    localModifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, modifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "modifier"



    // $ANTLR start "localModifierList"
    // JavaTreeParser.g:307:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
    public final void localModifierList() throws RecognitionException {
        int localModifierList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // JavaTreeParser.g:308:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
            // JavaTreeParser.g:308:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
            {
            match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1329); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:308:31: ( localModifier )*
                loop49:
                do {
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==AT||LA49_0==FINAL) ) {
                        alt49=1;
                    }


                    switch (alt49) {
                	case 1 :
                	    // JavaTreeParser.g:308:31: localModifier
                	    {
                	    pushFollow(FOLLOW_localModifier_in_localModifierList1331);
                	    localModifier();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop49;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, localModifierList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "localModifierList"



    // $ANTLR start "localModifier"
    // JavaTreeParser.g:311:1: localModifier : ( FINAL | annotation );
    public final void localModifier() throws RecognitionException {
        int localModifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // JavaTreeParser.g:312:5: ( FINAL | annotation )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==FINAL) ) {
                alt50=1;
            }
            else if ( (LA50_0==AT) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // JavaTreeParser.g:312:9: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_localModifier1352); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:313:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_localModifier1362);
                    annotation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, localModifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "localModifier"



    // $ANTLR start "type"
    // JavaTreeParser.g:316:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // JavaTreeParser.g:317:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
            // JavaTreeParser.g:317:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
            {
            match(input,TYPE,FOLLOW_TYPE_in_type1382); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:317:16: ( primitiveType | qualifiedTypeIdent )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==BOOLEAN||LA51_0==BYTE||LA51_0==CHAR||LA51_0==DOUBLE||LA51_0==FLOAT||LA51_0==INT||LA51_0==LONG||LA51_0==SHORT) ) {
                alt51=1;
            }
            else if ( (LA51_0==QUALIFIED_TYPE_IDENT) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // JavaTreeParser.g:317:17: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1385);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:317:33: qualifiedTypeIdent
                    {
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_type1389);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // JavaTreeParser.g:317:53: ( arrayDeclaratorList )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ARRAY_DECLARATOR_LIST) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // JavaTreeParser.g:317:53: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_type1392);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, type_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "type"



    // $ANTLR start "qualifiedTypeIdent"
    // JavaTreeParser.g:320:1: qualifiedTypeIdent : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
    public final void qualifiedTypeIdent() throws RecognitionException {
        int qualifiedTypeIdent_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // JavaTreeParser.g:321:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
            // JavaTreeParser.g:321:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
            {
            match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1414); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:321:32: ( typeIdent )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==IDENT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // JavaTreeParser.g:321:32: typeIdent
            	    {
            	    pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1416);
            	    typeIdent();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, qualifiedTypeIdent_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "qualifiedTypeIdent"



    // $ANTLR start "typeIdent"
    // JavaTreeParser.g:324:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) ;
    public final void typeIdent() throws RecognitionException {
        int typeIdent_StartIndex = input.index();

        CommonTree IDENT8=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

            // JavaTreeParser.g:325:5: ( ^( IDENT ( genericTypeArgumentList )? ) )
            // JavaTreeParser.g:325:9: ^( IDENT ( genericTypeArgumentList )? )
            {
            IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeIdent1439); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:325:17: ( genericTypeArgumentList )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==GENERIC_TYPE_ARG_LIST) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // JavaTreeParser.g:325:17: genericTypeArgumentList
                        {
                        pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1441);
                        genericTypeArgumentList();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            if ( state.backtracking==0 ) {
                        currentVariableType = IDENT8.toString();
            //          System.out.println("type="+IDENT8);
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, typeIdent_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeIdent"



    // $ANTLR start "primitiveType"
    // JavaTreeParser.g:332:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final void primitiveType() throws RecognitionException {
        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }

            // JavaTreeParser.g:333:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            int alt55=8;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt55=1;
                }
                break;
            case CHAR:
                {
                alt55=2;
                }
                break;
            case BYTE:
                {
                alt55=3;
                }
                break;
            case SHORT:
                {
                alt55=4;
                }
                break;
            case INT:
                {
                alt55=5;
                }
                break;
            case LONG:
                {
                alt55=6;
                }
                break;
            case FLOAT:
                {
                alt55=7;
                }
                break;
            case DOUBLE:
                {
                alt55=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // JavaTreeParser.g:333:9: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType1472); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                currentVariableType = "boolean";
                    //          System.out.println("type="+currentVariableType);
                            }

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:338:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType1492); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                currentVariableType = "char";
                    //          System.out.println("type="+currentVariableType);
                            }

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:343:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType1512); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                currentVariableType = "byte";
                    //          System.out.println("type="+currentVariableType);
                            }

                    }
                    break;
                case 4 :
                    // JavaTreeParser.g:348:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType1532); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                currentVariableType = "short";
                    //          System.out.println("type="+currentVariableType);
                            }

                    }
                    break;
                case 5 :
                    // JavaTreeParser.g:353:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType1552); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                currentVariableType = "int";
                    //          System.out.println("type="+currentVariableType);
                            }

                    }
                    break;
                case 6 :
                    // JavaTreeParser.g:358:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType1572); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                currentVariableType = "long";
                    //          System.out.println("type="+currentVariableType);
                            }

                    }
                    break;
                case 7 :
                    // JavaTreeParser.g:363:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType1592); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                currentVariableType = "float";
                    //          System.out.println("type="+currentVariableType);
                            }

                    }
                    break;
                case 8 :
                    // JavaTreeParser.g:368:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType1612); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                currentVariableType = "double";
                    //          System.out.println("type="+currentVariableType);
                            }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, primitiveType_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "primitiveType"



    // $ANTLR start "genericTypeArgumentList"
    // JavaTreeParser.g:375:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
    public final void genericTypeArgumentList() throws RecognitionException {
        int genericTypeArgumentList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }

            // JavaTreeParser.g:376:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
            // JavaTreeParser.g:376:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
            {
            match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1642); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:376:33: ( genericTypeArgument )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==QUESTION||LA56_0==TYPE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // JavaTreeParser.g:376:33: genericTypeArgument
            	    {
            	    pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList1644);
            	    genericTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, genericTypeArgumentList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "genericTypeArgumentList"



    // $ANTLR start "genericTypeArgument"
    // JavaTreeParser.g:379:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
    public final void genericTypeArgument() throws RecognitionException {
        int genericTypeArgument_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

            // JavaTreeParser.g:380:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==TYPE) ) {
                alt58=1;
            }
            else if ( (LA58_0==QUESTION) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // JavaTreeParser.g:380:9: type
                    {
                    pushFollow(FOLLOW_type_in_genericTypeArgument1669);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:381:9: ^( QUESTION ( genericWildcardBoundType )? )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument1680); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        // JavaTreeParser.g:381:20: ( genericWildcardBoundType )?
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==EXTENDS||LA57_0==SUPER) ) {
                            alt57=1;
                        }
                        switch (alt57) {
                            case 1 :
                                // JavaTreeParser.g:381:20: genericWildcardBoundType
                                {
                                pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument1682);
                                genericWildcardBoundType();

                                state._fsp--;
                                if (state.failed) return ;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return ;
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, genericTypeArgument_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "genericTypeArgument"



    // $ANTLR start "genericWildcardBoundType"
    // JavaTreeParser.g:384:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final void genericWildcardBoundType() throws RecognitionException {
        int genericWildcardBoundType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }

            // JavaTreeParser.g:385:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==EXTENDS) ) {
                alt59=1;
            }
            else if ( (LA59_0==SUPER) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // JavaTreeParser.g:385:9: ^( EXTENDS type )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType1822); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1824);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:386:9: ^( SUPER type )
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType1836); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1838);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, genericWildcardBoundType_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "genericWildcardBoundType"



    // $ANTLR start "formalParameterList"
    // JavaTreeParser.g:389:1: formalParameterList : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
    public final void formalParameterList() throws RecognitionException {
        int formalParameterList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }

            // JavaTreeParser.g:390:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
            // JavaTreeParser.g:390:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
            {
            match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1859); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:390:29: ( formalParameterStandardDecl )*
                loop60:
                do {
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==FORMAL_PARAM_STD_DECL) ) {
                        alt60=1;
                    }


                    switch (alt60) {
                	case 1 :
                	    // JavaTreeParser.g:390:29: formalParameterStandardDecl
                	    {
                	    pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList1861);
                	    formalParameterStandardDecl();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop60;
                    }
                } while (true);


                // JavaTreeParser.g:390:58: ( formalParameterVarargDecl )?
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==FORMAL_PARAM_VARARG_DECL) ) {
                    alt61=1;
                }
                switch (alt61) {
                    case 1 :
                        // JavaTreeParser.g:390:58: formalParameterVarargDecl
                        {
                        pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList1864);
                        formalParameterVarargDecl();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, formalParameterList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "formalParameterList"



    // $ANTLR start "formalParameterStandardDecl"
    // JavaTreeParser.g:393:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
    public final void formalParameterStandardDecl() throws RecognitionException {
        int formalParameterStandardDecl_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }

            // JavaTreeParser.g:394:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
            // JavaTreeParser.g:394:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1891); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl1893);
            localModifierList();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_formalParameterStandardDecl1895);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1897);
            variableDeclaratorId();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, formalParameterStandardDecl_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "formalParameterStandardDecl"



    // $ANTLR start "formalParameterVarargDecl"
    // JavaTreeParser.g:397:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final void formalParameterVarargDecl() throws RecognitionException {
        int formalParameterVarargDecl_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }

            // JavaTreeParser.g:398:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // JavaTreeParser.g:398:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1922); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl1924);
            localModifierList();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_formalParameterVarargDecl1926);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1928);
            variableDeclaratorId();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, formalParameterVarargDecl_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "formalParameterVarargDecl"



    // $ANTLR start "qualifiedIdentifier"
    // JavaTreeParser.g:401:1: qualifiedIdentifier : ( IDENT | ^( DOT qualifiedIdentifier IDENT ) );
    public final void qualifiedIdentifier() throws RecognitionException {
        int qualifiedIdentifier_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }

            // JavaTreeParser.g:402:5: ( IDENT | ^( DOT qualifiedIdentifier IDENT ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IDENT) ) {
                alt62=1;
            }
            else if ( (LA62_0==DOT) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // JavaTreeParser.g:402:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1952); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:403:9: ^( DOT qualifiedIdentifier IDENT )
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier1963); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1965);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1967); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, qualifiedIdentifier_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "qualifiedIdentifier"



    // $ANTLR start "annotationList"
    // JavaTreeParser.g:408:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
    public final void annotationList() throws RecognitionException {
        int annotationList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }

            // JavaTreeParser.g:409:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
            // JavaTreeParser.g:409:9: ^( ANNOTATION_LIST ( annotation )* )
            {
            match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList1994); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:409:27: ( annotation )*
                loop63:
                do {
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==AT) ) {
                        alt63=1;
                    }


                    switch (alt63) {
                	case 1 :
                	    // JavaTreeParser.g:409:27: annotation
                	    {
                	    pushFollow(FOLLOW_annotation_in_annotationList1996);
                	    annotation();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop63;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, annotationList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationList"



    // $ANTLR start "annotation"
    // JavaTreeParser.g:412:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
    public final void annotation() throws RecognitionException {
        int annotation_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }

            // JavaTreeParser.g:413:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
            // JavaTreeParser.g:413:9: ^( AT qualifiedIdentifier ( annotationInit )? )
            {
            match(input,AT,FOLLOW_AT_in_annotation2018); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_qualifiedIdentifier_in_annotation2020);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return ;

            // JavaTreeParser.g:413:34: ( annotationInit )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ANNOTATION_INIT_BLOCK) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // JavaTreeParser.g:413:34: annotationInit
                    {
                    pushFollow(FOLLOW_annotationInit_in_annotation2022);
                    annotationInit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, annotation_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotation"



    // $ANTLR start "annotationInit"
    // JavaTreeParser.g:416:1: annotationInit : ^( ANNOTATION_INIT_BLOCK ( annotationInitializers )? ) ;
    public final void annotationInit() throws RecognitionException {
        int annotationInit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }

            // JavaTreeParser.g:417:5: ( ^( ANNOTATION_INIT_BLOCK ( annotationInitializers )? ) )
            // JavaTreeParser.g:417:9: ^( ANNOTATION_INIT_BLOCK ( annotationInitializers )? )
            {
            match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit2048); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:417:33: ( annotationInitializers )?
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0 >= ANNOTATION_INIT_DEFAULT_KEY && LA65_0 <= ANNOTATION_INIT_KEY_LIST)) ) {
                    alt65=1;
                }
                switch (alt65) {
                    case 1 :
                        // JavaTreeParser.g:417:33: annotationInitializers
                        {
                        pushFollow(FOLLOW_annotationInitializers_in_annotationInit2050);
                        annotationInitializers();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, annotationInit_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationInit"



    // $ANTLR start "annotationInitializers"
    // JavaTreeParser.g:420:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
    public final void annotationInitializers() throws RecognitionException {
        int annotationInitializers_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }

            // JavaTreeParser.g:421:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==ANNOTATION_INIT_KEY_LIST) ) {
                alt67=1;
            }
            else if ( (LA67_0==ANNOTATION_INIT_DEFAULT_KEY) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }
            switch (alt67) {
                case 1 :
                    // JavaTreeParser.g:421:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
                    {
                    match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers2072); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // JavaTreeParser.g:421:36: ( annotationInitializer )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==IDENT) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // JavaTreeParser.g:421:36: annotationInitializer
                    	    {
                    	    pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers2074);
                    	    annotationInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt66 >= 1 ) break loop66;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:422:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
                    {
                    match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers2087); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers2089);
                    annotationElementValue();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, annotationInitializers_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationInitializers"



    // $ANTLR start "annotationInitializer"
    // JavaTreeParser.g:425:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
    public final void annotationInitializer() throws RecognitionException {
        int annotationInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }

            // JavaTreeParser.g:426:5: ( ^( IDENT annotationElementValue ) )
            // JavaTreeParser.g:426:9: ^( IDENT annotationElementValue )
            {
            match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer2114); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer2116);
            annotationElementValue();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, annotationInitializer_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationInitializer"



    // $ANTLR start "annotationElementValue"
    // JavaTreeParser.g:429:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
    public final void annotationElementValue() throws RecognitionException {
        int annotationElementValue_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }

            // JavaTreeParser.g:430:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
            int alt69=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_INIT_ARRAY_ELEMENT:
                {
                alt69=1;
                }
                break;
            case AT:
                {
                alt69=2;
                }
                break;
            case EXPR:
                {
                alt69=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // JavaTreeParser.g:430:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
                    {
                    match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2141); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        // JavaTreeParser.g:430:41: ( annotationElementValue )*
                        loop68:
                        do {
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA68_0==AT||LA68_0==EXPR) ) {
                                alt68=1;
                            }


                            switch (alt68) {
                        	case 1 :
                        	    // JavaTreeParser.g:430:41: annotationElementValue
                        	    {
                        	    pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue2143);
                        	    annotationElementValue();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }
                        	    break;

                        	default :
                        	    break loop68;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return ;
                    }


                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:431:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_annotationElementValue2155);
                    annotation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:432:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_annotationElementValue2165);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, annotationElementValue_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationElementValue"



    // $ANTLR start "annotationTopLevelScope"
    // JavaTreeParser.g:435:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
    public final void annotationTopLevelScope() throws RecognitionException {
        int annotationTopLevelScope_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }

            // JavaTreeParser.g:436:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
            // JavaTreeParser.g:436:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
            {
            match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2189); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:436:38: ( annotationScopeDeclarations )*
                loop70:
                do {
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==ANNOTATION_METHOD_DECL||LA70_0==AT||LA70_0==CLASS||LA70_0==ENUM||LA70_0==INTERFACE||LA70_0==VAR_DECLARATION) ) {
                        alt70=1;
                    }


                    switch (alt70) {
                	case 1 :
                	    // JavaTreeParser.g:436:38: annotationScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2191);
                	    annotationScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop70;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, annotationTopLevelScope_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationTopLevelScope"



    // $ANTLR start "annotationScopeDeclarations"
    // JavaTreeParser.g:439:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final void annotationScopeDeclarations() throws RecognitionException {
        int annotationScopeDeclarations_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }

            // JavaTreeParser.g:440:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt72=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_METHOD_DECL:
                {
                alt72=1;
                }
                break;
            case VAR_DECLARATION:
                {
                alt72=2;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // JavaTreeParser.g:440:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
                    {
                    match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2217); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2219);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2221);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations2223); if (state.failed) return ;

                    // JavaTreeParser.g:440:58: ( annotationDefaultValue )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==DEFAULT) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // JavaTreeParser.g:440:58: annotationDefaultValue
                            {
                            pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2225);
                            annotationDefaultValue();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:441:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2238); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2240);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2242);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2244);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:442:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2255);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, annotationScopeDeclarations_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationScopeDeclarations"



    // $ANTLR start "annotationDefaultValue"
    // JavaTreeParser.g:445:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
    public final void annotationDefaultValue() throws RecognitionException {
        int annotationDefaultValue_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }

            // JavaTreeParser.g:446:5: ( ^( DEFAULT annotationElementValue ) )
            // JavaTreeParser.g:446:9: ^( DEFAULT annotationElementValue )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2279); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2281);
            annotationElementValue();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, annotationDefaultValue_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationDefaultValue"



    // $ANTLR start "block"
    // JavaTreeParser.g:451:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final void block() throws RecognitionException {
        int block_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }

            // JavaTreeParser.g:452:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // JavaTreeParser.g:452:9: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block2304); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:452:23: ( blockStatement )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==ASSERT||LA73_0==AT||LA73_0==BLOCK_SCOPE||LA73_0==BREAK||LA73_0==CLASS||LA73_0==CONTINUE||LA73_0==DO||LA73_0==ENUM||LA73_0==EXPR||LA73_0==FOR||LA73_0==FOR_EACH||LA73_0==IF||LA73_0==INTERFACE||LA73_0==LABELED_STATEMENT||LA73_0==RETURN||LA73_0==SEMI||LA73_0==SWITCH||LA73_0==SYNCHRONIZED||LA73_0==THROW||LA73_0==TRY||LA73_0==VAR_DECLARATION||LA73_0==WHILE) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // JavaTreeParser.g:452:23: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block2306);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop73;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, block_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "blockStatement"
    // JavaTreeParser.g:455:1: blockStatement : ( localVariableDeclaration | typeDeclaration | statement );
    public final void blockStatement() throws RecognitionException {
        int blockStatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }

            // JavaTreeParser.g:456:5: ( localVariableDeclaration | typeDeclaration | statement )
            int alt74=3;
            switch ( input.LA(1) ) {
            case VAR_DECLARATION:
                {
                alt74=1;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt74=2;
                }
                break;
            case ASSERT:
            case BLOCK_SCOPE:
            case BREAK:
            case CONTINUE:
            case DO:
            case EXPR:
            case FOR:
            case FOR_EACH:
            case IF:
            case LABELED_STATEMENT:
            case RETURN:
            case SEMI:
            case SWITCH:
            case SYNCHRONIZED:
            case THROW:
            case TRY:
            case WHILE:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }

            switch (alt74) {
                case 1 :
                    // JavaTreeParser.g:456:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2331);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:457:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement2341);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:458:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement2351);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, blockStatement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "blockStatement"



    // $ANTLR start "localVariableDeclaration"
    // JavaTreeParser.g:461:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final void localVariableDeclaration() throws RecognitionException {
        int localVariableDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }

            // JavaTreeParser.g:462:5: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // JavaTreeParser.g:462:9: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2375); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration2377);
            localModifierList();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_localVariableDeclaration2379);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration2381);
            variableDeclaratorList();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { metric.classDeclarationFinished(); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, localVariableDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "localVariableDeclaration"



    // $ANTLR start "statement"
    // JavaTreeParser.g:467:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }

            // JavaTreeParser.g:468:5: ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI )
            int alt82=17;
            switch ( input.LA(1) ) {
            case BLOCK_SCOPE:
                {
                alt82=1;
                }
                break;
            case ASSERT:
                {
                alt82=2;
                }
                break;
            case IF:
                {
                alt82=3;
                }
                break;
            case FOR:
                {
                alt82=4;
                }
                break;
            case FOR_EACH:
                {
                alt82=5;
                }
                break;
            case WHILE:
                {
                alt82=6;
                }
                break;
            case DO:
                {
                alt82=7;
                }
                break;
            case TRY:
                {
                alt82=8;
                }
                break;
            case SWITCH:
                {
                alt82=9;
                }
                break;
            case SYNCHRONIZED:
                {
                alt82=10;
                }
                break;
            case RETURN:
                {
                alt82=11;
                }
                break;
            case THROW:
                {
                alt82=12;
                }
                break;
            case BREAK:
                {
                alt82=13;
                }
                break;
            case CONTINUE:
                {
                alt82=14;
                }
                break;
            case LABELED_STATEMENT:
                {
                alt82=15;
                }
                break;
            case EXPR:
                {
                alt82=16;
                }
                break;
            case SEMI:
                {
                alt82=17;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // JavaTreeParser.g:468:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement2424);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:469:9: ^( ASSERT expression ( expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement2435); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2437);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:469:29: ( expression )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==EXPR) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // JavaTreeParser.g:469:29: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2439);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:470:9: ^( IF parenthesizedExpression statement ( statement )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement2452); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2454);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement2456);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:470:48: ( statement )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==ASSERT||LA76_0==BLOCK_SCOPE||LA76_0==BREAK||LA76_0==CONTINUE||LA76_0==DO||LA76_0==EXPR||LA76_0==FOR||LA76_0==FOR_EACH||LA76_0==IF||LA76_0==LABELED_STATEMENT||LA76_0==RETURN||LA76_0==SEMI||LA76_0==SWITCH||LA76_0==SYNCHRONIZED||LA76_0==THROW||LA76_0==TRY||LA76_0==WHILE) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // JavaTreeParser.g:470:48: statement
                            {
                            pushFollow(FOLLOW_statement_in_statement2458);
                            statement();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

                    }
                    break;
                case 4 :
                    // JavaTreeParser.g:472:9: ^( FOR forInit forCondition forUpdater statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement2481); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_forInit_in_statement2483);
                    forInit();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_forCondition_in_statement2485);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_forUpdater_in_statement2487);
                    forUpdater();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement2489);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

                    }
                    break;
                case 5 :
                    // JavaTreeParser.g:474:9: ^( FOR_EACH localModifierList type IDENT expression statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement2511); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_localModifierList_in_statement2513);
                    localModifierList();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_type_in_statement2515);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,IDENT,FOLLOW_IDENT_in_statement2517); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_statement2519);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement2521);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

                    }
                    break;
                case 6 :
                    // JavaTreeParser.g:476:9: ^( WHILE parenthesizedExpression statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement2544); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2546);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement2548);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

                    }
                    break;
                case 7 :
                    // JavaTreeParser.g:478:9: ^( DO statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement2570); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement2572);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2574);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

                    }
                    break;
                case 8 :
                    // JavaTreeParser.g:480:9: ^( TRY block ( catches )? ( block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement2596); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_statement2598);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:480:21: ( catches )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==CATCH_CLAUSE_LIST) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // JavaTreeParser.g:480:21: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement2600);
                            catches();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // JavaTreeParser.g:480:30: ( block )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==BLOCK_SCOPE) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // JavaTreeParser.g:480:30: block
                            {
                            pushFollow(FOLLOW_block_in_statement2603);
                            block();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // JavaTreeParser.g:481:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement2618); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2620);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_switchBlockLabels_in_statement2622);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // JavaTreeParser.g:482:9: ^( SYNCHRONIZED parenthesizedExpression block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement2634); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2636);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_block_in_statement2638);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 11 :
                    // JavaTreeParser.g:483:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement2650); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        // JavaTreeParser.g:483:18: ( expression )?
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==EXPR) ) {
                            alt79=1;
                        }
                        switch (alt79) {
                            case 1 :
                                // JavaTreeParser.g:483:18: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement2652);
                                expression();

                                state._fsp--;
                                if (state.failed) return ;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return ;
                    }


                    }
                    break;
                case 12 :
                    // JavaTreeParser.g:484:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement2665); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement2667);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 13 :
                    // JavaTreeParser.g:485:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement2679); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        // JavaTreeParser.g:485:17: ( IDENT )?
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==IDENT) ) {
                            alt80=1;
                        }
                        switch (alt80) {
                            case 1 :
                                // JavaTreeParser.g:485:17: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2681); if (state.failed) return ;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return ;
                    }


                    }
                    break;
                case 14 :
                    // JavaTreeParser.g:486:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2694); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        // JavaTreeParser.g:486:20: ( IDENT )?
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==IDENT) ) {
                            alt81=1;
                        }
                        switch (alt81) {
                            case 1 :
                                // JavaTreeParser.g:486:20: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2696); if (state.failed) return ;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return ;
                    }


                    }
                    break;
                case 15 :
                    // JavaTreeParser.g:487:9: ^( LABELED_STATEMENT IDENT statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement2709); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2711); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement2713);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 16 :
                    // JavaTreeParser.g:488:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2724);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // JavaTreeParser.g:489:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement2734); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "catches"
    // JavaTreeParser.g:492:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
    public final void catches() throws RecognitionException {
        int catches_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }

            // JavaTreeParser.g:493:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
            // JavaTreeParser.g:493:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
            {
            match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches2763); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:493:29: ( catchClause )+
            int cnt83=0;
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==CATCH) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // JavaTreeParser.g:493:29: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches2765);
            	    catchClause();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt83 >= 1 ) break loop83;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(83, input);
                        throw eee;
                }
                cnt83++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, catches_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "catches"



    // $ANTLR start "catchClause"
    // JavaTreeParser.g:496:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
    public final void catchClause() throws RecognitionException {
        int catchClause_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }

            // JavaTreeParser.g:497:5: ( ^( CATCH formalParameterStandardDecl block ) )
            // JavaTreeParser.g:497:9: ^( CATCH formalParameterStandardDecl block )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause2791); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause2793);
            formalParameterStandardDecl();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_block_in_catchClause2795);
            block();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, catchClause_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "catchClause"



    // $ANTLR start "switchBlockLabels"
    // JavaTreeParser.g:501:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
    public final void switchBlockLabels() throws RecognitionException {
        int switchBlockLabels_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }

            // JavaTreeParser.g:502:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
            // JavaTreeParser.g:502:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
            {
            match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2826); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:502:35: ( switchCaseLabel )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==CASE) ) {
                        int LA84_2 = input.LA(2);

                        if ( (synpred126_JavaTreeParser()) ) {
                            alt84=1;
                        }


                    }


                    switch (alt84) {
                	case 1 :
                	    // JavaTreeParser.g:502:35: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2828);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop84;
                    }
                } while (true);


                // JavaTreeParser.g:502:52: ( switchDefaultLabel )?
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==DEFAULT) ) {
                    alt85=1;
                }
                switch (alt85) {
                    case 1 :
                        // JavaTreeParser.g:502:52: switchDefaultLabel
                        {
                        pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels2831);
                        switchDefaultLabel();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                // JavaTreeParser.g:502:72: ( switchCaseLabel )*
                loop86:
                do {
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==CASE) ) {
                        alt86=1;
                    }


                    switch (alt86) {
                	case 1 :
                	    // JavaTreeParser.g:502:72: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2834);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop86;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, switchBlockLabels_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "switchBlockLabels"



    // $ANTLR start "switchCaseLabel"
    // JavaTreeParser.g:505:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
    public final void switchCaseLabel() throws RecognitionException {
        int switchCaseLabel_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }

            // JavaTreeParser.g:506:5: ( ^( CASE expression ( blockStatement )* ) )
            // JavaTreeParser.g:506:9: ^( CASE expression ( blockStatement )* )
            {
            match(input,CASE,FOLLOW_CASE_in_switchCaseLabel2864); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_switchCaseLabel2866);
            expression();

            state._fsp--;
            if (state.failed) return ;

            // JavaTreeParser.g:506:27: ( blockStatement )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==ASSERT||LA87_0==AT||LA87_0==BLOCK_SCOPE||LA87_0==BREAK||LA87_0==CLASS||LA87_0==CONTINUE||LA87_0==DO||LA87_0==ENUM||LA87_0==EXPR||LA87_0==FOR||LA87_0==FOR_EACH||LA87_0==IF||LA87_0==INTERFACE||LA87_0==LABELED_STATEMENT||LA87_0==RETURN||LA87_0==SEMI||LA87_0==SWITCH||LA87_0==SYNCHRONIZED||LA87_0==THROW||LA87_0==TRY||LA87_0==VAR_DECLARATION||LA87_0==WHILE) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // JavaTreeParser.g:506:27: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchCaseLabel2868);
            	    blockStatement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, switchCaseLabel_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "switchCaseLabel"



    // $ANTLR start "switchDefaultLabel"
    // JavaTreeParser.g:510:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
    public final void switchDefaultLabel() throws RecognitionException {
        int switchDefaultLabel_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }

            // JavaTreeParser.g:511:5: ( ^( DEFAULT ( blockStatement )* ) )
            // JavaTreeParser.g:511:9: ^( DEFAULT ( blockStatement )* )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel2904); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:511:19: ( blockStatement )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==ASSERT||LA88_0==AT||LA88_0==BLOCK_SCOPE||LA88_0==BREAK||LA88_0==CLASS||LA88_0==CONTINUE||LA88_0==DO||LA88_0==ENUM||LA88_0==EXPR||LA88_0==FOR||LA88_0==FOR_EACH||LA88_0==IF||LA88_0==INTERFACE||LA88_0==LABELED_STATEMENT||LA88_0==RETURN||LA88_0==SEMI||LA88_0==SWITCH||LA88_0==SYNCHRONIZED||LA88_0==THROW||LA88_0==TRY||LA88_0==VAR_DECLARATION||LA88_0==WHILE) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // JavaTreeParser.g:511:19: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel2906);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop88;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, switchDefaultLabel_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "switchDefaultLabel"



    // $ANTLR start "forInit"
    // JavaTreeParser.g:514:1: forInit : ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) ;
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }

            // JavaTreeParser.g:515:5: ( ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) )
            // JavaTreeParser.g:515:9: ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? )
            {
            match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit2932); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:515:20: ( localVariableDeclaration | ( expression )* )?
                int alt90=3;
                switch ( input.LA(1) ) {
                    case VAR_DECLARATION:
                        {
                        alt90=1;
                        }
                        break;
                    case EXPR:
                        {
                        alt90=2;
                        }
                        break;
                    case UP:
                        {
                        int LA90_3 = input.LA(2);

                        if ( (synpred133_JavaTreeParser()) ) {
                            alt90=2;
                        }
                        }
                        break;
                }

                switch (alt90) {
                    case 1 :
                        // JavaTreeParser.g:515:21: localVariableDeclaration
                        {
                        pushFollow(FOLLOW_localVariableDeclaration_in_forInit2935);
                        localVariableDeclaration();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // JavaTreeParser.g:515:48: ( expression )*
                        {
                        // JavaTreeParser.g:515:48: ( expression )*
                        loop89:
                        do {
                            int alt89=2;
                            int LA89_0 = input.LA(1);

                            if ( (LA89_0==EXPR) ) {
                                alt89=1;
                            }


                            switch (alt89) {
                        	case 1 :
                        	    // JavaTreeParser.g:515:48: expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_forInit2939);
                        	    expression();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }
                        	    break;

                        	default :
                        	    break loop89;
                            }
                        } while (true);


                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, forInit_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "forInit"



    // $ANTLR start "forCondition"
    // JavaTreeParser.g:518:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
    public final void forCondition() throws RecognitionException {
        int forCondition_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }

            // JavaTreeParser.g:519:5: ( ^( FOR_CONDITION ( expression )? ) )
            // JavaTreeParser.g:519:9: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition2967); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:519:25: ( expression )?
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==EXPR) ) {
                    alt91=1;
                }
                switch (alt91) {
                    case 1 :
                        // JavaTreeParser.g:519:25: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCondition2969);
                        expression();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, forCondition_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "forCondition"



    // $ANTLR start "forUpdater"
    // JavaTreeParser.g:522:1: forUpdater : ^( FOR_UPDATE ( expression )* ) ;
    public final void forUpdater() throws RecognitionException {
        int forUpdater_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }

            // JavaTreeParser.g:523:5: ( ^( FOR_UPDATE ( expression )* ) )
            // JavaTreeParser.g:523:9: ^( FOR_UPDATE ( expression )* )
            {
            match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater2995); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:523:22: ( expression )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==EXPR) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // JavaTreeParser.g:523:22: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_forUpdater2997);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, forUpdater_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "forUpdater"



    // $ANTLR start "parenthesizedExpression"
    // JavaTreeParser.g:528:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
    public final void parenthesizedExpression() throws RecognitionException {
        int parenthesizedExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }

            // JavaTreeParser.g:529:5: ( ^( PARENTESIZED_EXPR expression ) )
            // JavaTreeParser.g:529:9: ^( PARENTESIZED_EXPR expression )
            {
            match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression3025); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_parenthesizedExpression3027);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, parenthesizedExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "parenthesizedExpression"



    // $ANTLR start "expression"
    // JavaTreeParser.g:532:1: expression : ^( EXPR expr ) ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }

            // JavaTreeParser.g:533:5: ( ^( EXPR expr ) )
            // JavaTreeParser.g:533:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression3052); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_expression3054);
            expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 61, expression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "expr"
    // JavaTreeParser.g:536:1: expr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );
    public final void expr() throws RecognitionException {
        int expr_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }

            // JavaTreeParser.g:537:5: ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression )
            int alt93=43;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt93=1;
                }
                break;
            case PLUS_ASSIGN:
                {
                alt93=2;
                }
                break;
            case MINUS_ASSIGN:
                {
                alt93=3;
                }
                break;
            case STAR_ASSIGN:
                {
                alt93=4;
                }
                break;
            case DIV_ASSIGN:
                {
                alt93=5;
                }
                break;
            case AND_ASSIGN:
                {
                alt93=6;
                }
                break;
            case OR_ASSIGN:
                {
                alt93=7;
                }
                break;
            case XOR_ASSIGN:
                {
                alt93=8;
                }
                break;
            case MOD_ASSIGN:
                {
                alt93=9;
                }
                break;
            case BIT_SHIFT_RIGHT_ASSIGN:
                {
                alt93=10;
                }
                break;
            case SHIFT_RIGHT_ASSIGN:
                {
                alt93=11;
                }
                break;
            case SHIFT_LEFT_ASSIGN:
                {
                alt93=12;
                }
                break;
            case QUESTION:
                {
                alt93=13;
                }
                break;
            case LOGICAL_OR:
                {
                alt93=14;
                }
                break;
            case LOGICAL_AND:
                {
                alt93=15;
                }
                break;
            case OR:
                {
                alt93=16;
                }
                break;
            case XOR:
                {
                alt93=17;
                }
                break;
            case AND:
                {
                alt93=18;
                }
                break;
            case EQUAL:
                {
                alt93=19;
                }
                break;
            case NOT_EQUAL:
                {
                alt93=20;
                }
                break;
            case INSTANCEOF:
                {
                alt93=21;
                }
                break;
            case LESS_OR_EQUAL:
                {
                alt93=22;
                }
                break;
            case GREATER_OR_EQUAL:
                {
                alt93=23;
                }
                break;
            case BIT_SHIFT_RIGHT:
                {
                alt93=24;
                }
                break;
            case SHIFT_RIGHT:
                {
                alt93=25;
                }
                break;
            case GREATER_THAN:
                {
                alt93=26;
                }
                break;
            case SHIFT_LEFT:
                {
                alt93=27;
                }
                break;
            case LESS_THAN:
                {
                alt93=28;
                }
                break;
            case PLUS:
                {
                alt93=29;
                }
                break;
            case MINUS:
                {
                alt93=30;
                }
                break;
            case STAR:
                {
                alt93=31;
                }
                break;
            case DIV:
                {
                alt93=32;
                }
                break;
            case MOD:
                {
                alt93=33;
                }
                break;
            case UNARY_PLUS:
                {
                alt93=34;
                }
                break;
            case UNARY_MINUS:
                {
                alt93=35;
                }
                break;
            case PRE_INC:
                {
                alt93=36;
                }
                break;
            case PRE_DEC:
                {
                alt93=37;
                }
                break;
            case POST_INC:
                {
                alt93=38;
                }
                break;
            case POST_DEC:
                {
                alt93=39;
                }
                break;
            case NOT:
                {
                alt93=40;
                }
                break;
            case LOGICAL_NOT:
                {
                alt93=41;
                }
                break;
            case CAST_EXPR:
                {
                alt93=42;
                }
                break;
            case ARRAY_DECLARATOR:
            case ARRAY_ELEMENT_ACCESS:
            case CHARACTER_LITERAL:
            case CLASS_CONSTRUCTOR_CALL:
            case DECIMAL_LITERAL:
            case DOT:
            case FALSE:
            case FLOATING_POINT_LITERAL:
            case HEX_LITERAL:
            case IDENT:
            case METHOD_CALL:
            case NULL:
            case OCTAL_LITERAL:
            case PARENTESIZED_EXPR:
            case STATIC_ARRAY_CREATOR:
            case STRING_LITERAL:
            case SUPER:
            case SUPER_CONSTRUCTOR_CALL:
            case THIS:
            case THIS_CONSTRUCTOR_CALL:
            case TRUE:
                {
                alt93=43;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }

            switch (alt93) {
                case 1 :
                    // JavaTreeParser.g:537:9: ^( ASSIGN expr expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr3075); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3077);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3079);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:538:9: ^( PLUS_ASSIGN expr expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr3091); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3093);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3095);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:539:9: ^( MINUS_ASSIGN expr expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr3107); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3109);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3111);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // JavaTreeParser.g:540:9: ^( STAR_ASSIGN expr expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr3123); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3125);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3127);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // JavaTreeParser.g:541:9: ^( DIV_ASSIGN expr expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr3139); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3141);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3143);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // JavaTreeParser.g:542:9: ^( AND_ASSIGN expr expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_expr3155); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3157);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3159);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // JavaTreeParser.g:543:9: ^( OR_ASSIGN expr expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_expr3171); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3173);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3175);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // JavaTreeParser.g:544:9: ^( XOR_ASSIGN expr expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_expr3187); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3189);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3191);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // JavaTreeParser.g:545:9: ^( MOD_ASSIGN expr expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr3203); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3205);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3207);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // JavaTreeParser.g:546:9: ^( BIT_SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr3219); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3221);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3223);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 11 :
                    // JavaTreeParser.g:547:9: ^( SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3235); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3237);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3239);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 12 :
                    // JavaTreeParser.g:548:9: ^( SHIFT_LEFT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3251); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3253);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3255);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 13 :
                    // JavaTreeParser.g:549:9: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr3267); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3269);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3271);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3273);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

                    }
                    break;
                case 14 :
                    // JavaTreeParser.g:551:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr3295); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3297);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3299);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

                    }
                    break;
                case 15 :
                    // JavaTreeParser.g:553:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr3321); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3323);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3325);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { metric.increaseCyclomatic(); }

                    }
                    break;
                case 16 :
                    // JavaTreeParser.g:555:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr3347); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3349);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3351);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 17 :
                    // JavaTreeParser.g:556:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr3363); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3365);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3367);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 18 :
                    // JavaTreeParser.g:557:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr3379); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3381);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3383);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 19 :
                    // JavaTreeParser.g:558:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr3395); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3397);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3399);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 20 :
                    // JavaTreeParser.g:559:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr3411); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3413);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3415);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 21 :
                    // JavaTreeParser.g:560:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr3427); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3429);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_type_in_expr3431);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 22 :
                    // JavaTreeParser.g:561:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr3443); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3445);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3447);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 23 :
                    // JavaTreeParser.g:562:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr3459); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3461);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3463);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 24 :
                    // JavaTreeParser.g:563:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr3475); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3477);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3479);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 25 :
                    // JavaTreeParser.g:564:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr3491); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3493);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3495);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 26 :
                    // JavaTreeParser.g:565:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr3507); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3509);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3511);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 27 :
                    // JavaTreeParser.g:566:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr3523); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3525);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3527);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 28 :
                    // JavaTreeParser.g:567:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr3539); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3541);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3543);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 29 :
                    // JavaTreeParser.g:568:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr3555); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3557);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3559);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 30 :
                    // JavaTreeParser.g:569:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr3571); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3573);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3575);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 31 :
                    // JavaTreeParser.g:570:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr3587); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3589);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3591);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 32 :
                    // JavaTreeParser.g:571:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr3603); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3605);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3607);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 33 :
                    // JavaTreeParser.g:572:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr3619); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3621);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3623);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 34 :
                    // JavaTreeParser.g:573:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr3635); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3637);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 35 :
                    // JavaTreeParser.g:574:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr3649); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3651);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 36 :
                    // JavaTreeParser.g:575:9: ^( PRE_INC expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_expr3663); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3665);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 37 :
                    // JavaTreeParser.g:576:9: ^( PRE_DEC expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr3677); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3679);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 38 :
                    // JavaTreeParser.g:577:9: ^( POST_INC expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_expr3691); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3693);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 39 :
                    // JavaTreeParser.g:578:9: ^( POST_DEC expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_expr3705); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3707);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 40 :
                    // JavaTreeParser.g:579:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr3719); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3721);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 41 :
                    // JavaTreeParser.g:580:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr3733); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr3735);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 42 :
                    // JavaTreeParser.g:581:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr3747); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_expr3749);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr3751);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 43 :
                    // JavaTreeParser.g:582:9: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr3762);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 62, expr_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "primaryExpression"
    // JavaTreeParser.g:585:1: primaryExpression : ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );
    public final void primaryExpression() throws RecognitionException {
        int primaryExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }

            // JavaTreeParser.g:586:5: ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER )
            int alt97=11;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt97=1;
                }
                break;
            case PARENTESIZED_EXPR:
                {
                alt97=2;
                }
                break;
            case IDENT:
                {
                alt97=3;
                }
                break;
            case METHOD_CALL:
                {
                alt97=4;
                }
                break;
            case SUPER_CONSTRUCTOR_CALL:
            case THIS_CONSTRUCTOR_CALL:
                {
                alt97=5;
                }
                break;
            case ARRAY_ELEMENT_ACCESS:
                {
                alt97=6;
                }
                break;
            case CHARACTER_LITERAL:
            case DECIMAL_LITERAL:
            case FALSE:
            case FLOATING_POINT_LITERAL:
            case HEX_LITERAL:
            case NULL:
            case OCTAL_LITERAL:
            case STRING_LITERAL:
            case TRUE:
                {
                alt97=7;
                }
                break;
            case CLASS_CONSTRUCTOR_CALL:
            case STATIC_ARRAY_CREATOR:
                {
                alt97=8;
                }
                break;
            case THIS:
                {
                alt97=9;
                }
                break;
            case ARRAY_DECLARATOR:
                {
                alt97=10;
                }
                break;
            case SUPER:
                {
                alt97=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;

            }

            switch (alt97) {
                case 1 :
                    // JavaTreeParser.g:586:9: ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3788); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // JavaTreeParser.g:587:13: ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
                    int alt95=3;
                    switch ( input.LA(1) ) {
                    case ARRAY_DECLARATOR:
                    case ARRAY_ELEMENT_ACCESS:
                    case CHARACTER_LITERAL:
                    case CLASS_CONSTRUCTOR_CALL:
                    case DECIMAL_LITERAL:
                    case DOT:
                    case FALSE:
                    case FLOATING_POINT_LITERAL:
                    case HEX_LITERAL:
                    case IDENT:
                    case METHOD_CALL:
                    case NULL:
                    case OCTAL_LITERAL:
                    case PARENTESIZED_EXPR:
                    case STATIC_ARRAY_CREATOR:
                    case STRING_LITERAL:
                    case SUPER:
                    case SUPER_CONSTRUCTOR_CALL:
                    case THIS:
                    case THIS_CONSTRUCTOR_CALL:
                    case TRUE:
                        {
                        alt95=1;
                        }
                        break;
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case SHORT:
                        {
                        alt95=2;
                        }
                        break;
                    case VOID:
                        {
                        alt95=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;

                    }

                    switch (alt95) {
                        case 1 :
                            // JavaTreeParser.g:587:17: primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression3806);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            // JavaTreeParser.g:588:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            int alt94=5;
                            switch ( input.LA(1) ) {
                            case IDENT:
                                {
                                alt94=1;
                                }
                                break;
                            case THIS:
                                {
                                alt94=2;
                                }
                                break;
                            case SUPER:
                                {
                                alt94=3;
                                }
                                break;
                            case CLASS_CONSTRUCTOR_CALL:
                                {
                                alt94=4;
                                }
                                break;
                            case CLASS:
                                {
                                alt94=5;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 94, 0, input);

                                throw nvae;

                            }

                            switch (alt94) {
                                case 1 :
                                    // JavaTreeParser.g:588:21: IDENT
                                    {
                                    match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3828); if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // JavaTreeParser.g:589:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3850); if (state.failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // JavaTreeParser.g:590:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3872); if (state.failed) return ;

                                    }
                                    break;
                                case 4 :
                                    // JavaTreeParser.g:591:21: innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression3894);
                                    innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;
                                case 5 :
                                    // JavaTreeParser.g:592:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3916); if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // JavaTreeParser.g:594:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression3952);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3954); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // JavaTreeParser.g:595:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression3972); if (state.failed) return ;

                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3974); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:598:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression4008);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:599:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4018); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // JavaTreeParser.g:600:9: ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression4029); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression4031);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:600:41: ( genericTypeArgumentList )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // JavaTreeParser.g:600:41: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression4033);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_arguments_in_primaryExpression4036);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // JavaTreeParser.g:601:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression4047);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // JavaTreeParser.g:602:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4058); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression4060);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_primaryExpression4062);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // JavaTreeParser.g:603:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression4073);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // JavaTreeParser.g:604:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression4083);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // JavaTreeParser.g:605:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression4093); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // JavaTreeParser.g:606:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression4103);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // JavaTreeParser.g:607:9: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression4113); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, primaryExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "explicitConstructorCall"
    // JavaTreeParser.g:610:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
    public final void explicitConstructorCall() throws RecognitionException {
        int explicitConstructorCall_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }

            // JavaTreeParser.g:611:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==THIS_CONSTRUCTOR_CALL) ) {
                alt101=1;
            }
            else if ( (LA101_0==SUPER_CONSTRUCTOR_CALL) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }
            switch (alt101) {
                case 1 :
                    // JavaTreeParser.g:611:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
                    {
                    match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4137); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // JavaTreeParser.g:611:33: ( genericTypeArgumentList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // JavaTreeParser.g:611:33: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4139);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4142);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:612:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
                    {
                    match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4154); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // JavaTreeParser.g:612:34: ( primaryExpression )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==ARRAY_DECLARATOR||LA99_0==ARRAY_ELEMENT_ACCESS||LA99_0==CHARACTER_LITERAL||LA99_0==CLASS_CONSTRUCTOR_CALL||LA99_0==DECIMAL_LITERAL||LA99_0==DOT||LA99_0==FALSE||LA99_0==FLOATING_POINT_LITERAL||LA99_0==HEX_LITERAL||LA99_0==IDENT||LA99_0==METHOD_CALL||LA99_0==NULL||LA99_0==OCTAL_LITERAL||LA99_0==PARENTESIZED_EXPR||LA99_0==STATIC_ARRAY_CREATOR||(LA99_0 >= STRING_LITERAL && LA99_0 <= SUPER_CONSTRUCTOR_CALL)||(LA99_0 >= THIS && LA99_0 <= THIS_CONSTRUCTOR_CALL)||LA99_0==TRUE) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // JavaTreeParser.g:612:34: primaryExpression
                            {
                            pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall4156);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    // JavaTreeParser.g:612:53: ( genericTypeArgumentList )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // JavaTreeParser.g:612:53: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4159);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4162);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, explicitConstructorCall_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "explicitConstructorCall"



    // $ANTLR start "arrayTypeDeclarator"
    // JavaTreeParser.g:615:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
    public final void arrayTypeDeclarator() throws RecognitionException {
        int arrayTypeDeclarator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }

            // JavaTreeParser.g:616:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
            // JavaTreeParser.g:616:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
            {
            match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4183); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:616:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
            int alt102=3;
            switch ( input.LA(1) ) {
            case ARRAY_DECLARATOR:
                {
                alt102=1;
                }
                break;
            case DOT:
            case IDENT:
                {
                alt102=2;
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                alt102=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }

            switch (alt102) {
                case 1 :
                    // JavaTreeParser.g:616:29: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4186);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:616:51: qualifiedIdentifier
                    {
                    pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4190);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:616:73: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator4194);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 65, arrayTypeDeclarator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "arrayTypeDeclarator"



    // $ANTLR start "newExpression"
    // JavaTreeParser.g:619:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
    public final void newExpression() throws RecognitionException {
        int newExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }

            // JavaTreeParser.g:620:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==STATIC_ARRAY_CREATOR) ) {
                alt107=1;
            }
            else if ( (LA107_0==CLASS_CONSTRUCTOR_CALL) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }
            switch (alt107) {
                case 1 :
                    // JavaTreeParser.g:620:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
                    {
                    match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4218); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // JavaTreeParser.g:621:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==BOOLEAN||LA104_0==BYTE||LA104_0==CHAR||LA104_0==DOUBLE||LA104_0==FLOAT||LA104_0==INT||LA104_0==LONG||LA104_0==SHORT) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==GENERIC_TYPE_ARG_LIST||LA104_0==QUALIFIED_TYPE_IDENT) ) {
                        alt104=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        throw nvae;

                    }
                    switch (alt104) {
                        case 1 :
                            // JavaTreeParser.g:621:17: primitiveType newArrayConstruction
                            {
                            pushFollow(FOLLOW_primitiveType_in_newExpression4236);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return ;

                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4238);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // JavaTreeParser.g:622:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
                            {
                            // JavaTreeParser.g:622:17: ( genericTypeArgumentList )?
                            int alt103=2;
                            int LA103_0 = input.LA(1);

                            if ( (LA103_0==GENERIC_TYPE_ARG_LIST) ) {
                                alt103=1;
                            }
                            switch (alt103) {
                                case 1 :
                                    // JavaTreeParser.g:622:17: genericTypeArgumentList
                                    {
                                    pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4256);
                                    genericTypeArgumentList();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4259);
                            qualifiedTypeIdent();

                            state._fsp--;
                            if (state.failed) return ;

                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4261);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:625:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
                    {
                    match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4296); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    // JavaTreeParser.g:625:34: ( genericTypeArgumentList )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // JavaTreeParser.g:625:34: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4298);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4301);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_arguments_in_newExpression4303);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    // JavaTreeParser.g:625:88: ( classTopLevelScope )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==CLASS_TOP_LEVEL_SCOPE) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // JavaTreeParser.g:625:88: classTopLevelScope
                            {
                            pushFollow(FOLLOW_classTopLevelScope_in_newExpression4305);
                            classTopLevelScope();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, newExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "newExpression"



    // $ANTLR start "innerNewExpression"
    // JavaTreeParser.g:628:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
    public final void innerNewExpression() throws RecognitionException {
        int innerNewExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }

            // JavaTreeParser.g:629:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
            // JavaTreeParser.g:629:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
            {
            match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4328); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // JavaTreeParser.g:629:34: ( genericTypeArgumentList )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==GENERIC_TYPE_ARG_LIST) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // JavaTreeParser.g:629:34: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression4330);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression4333); if (state.failed) return ;

            pushFollow(FOLLOW_arguments_in_innerNewExpression4335);
            arguments();

            state._fsp--;
            if (state.failed) return ;

            // JavaTreeParser.g:629:75: ( classTopLevelScope )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // JavaTreeParser.g:629:75: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression4337);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 67, innerNewExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "innerNewExpression"



    // $ANTLR start "newArrayConstruction"
    // JavaTreeParser.g:632:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
    public final void newArrayConstruction() throws RecognitionException {
        int newArrayConstruction_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }

            // JavaTreeParser.g:633:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==ARRAY_DECLARATOR_LIST) ) {
                alt112=1;
            }
            else if ( (LA112_0==EXPR) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }
            switch (alt112) {
                case 1 :
                    // JavaTreeParser.g:633:9: arrayDeclaratorList arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4362);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction4364);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:634:9: ( expression )+ ( arrayDeclaratorList )?
                    {
                    // JavaTreeParser.g:634:9: ( expression )+
                    int cnt110=0;
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==EXPR) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // JavaTreeParser.g:634:9: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_newArrayConstruction4374);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt110 >= 1 ) break loop110;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(110, input);
                                throw eee;
                        }
                        cnt110++;
                    } while (true);


                    // JavaTreeParser.g:634:21: ( arrayDeclaratorList )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==ARRAY_DECLARATOR_LIST) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // JavaTreeParser.g:634:21: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4377);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, newArrayConstruction_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "newArrayConstruction"



    // $ANTLR start "arguments"
    // JavaTreeParser.g:637:1: arguments : ^( ARGUMENT_LIST ( expression )* ) ;
    public final void arguments() throws RecognitionException {
        int arguments_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }

            // JavaTreeParser.g:638:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // JavaTreeParser.g:638:9: ^( ARGUMENT_LIST ( expression )* )
            {
            match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments4398); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // JavaTreeParser.g:638:25: ( expression )*
                loop113:
                do {
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==EXPR) ) {
                        alt113=1;
                    }


                    switch (alt113) {
                	case 1 :
                	    // JavaTreeParser.g:638:25: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments4400);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop113;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, arguments_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "arguments"



    // $ANTLR start "literal"
    // JavaTreeParser.g:641:1: literal : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }

            // JavaTreeParser.g:642:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
            // JavaTreeParser.g:
            {
            if ( input.LA(1)==CHARACTER_LITERAL||input.LA(1)==DECIMAL_LITERAL||input.LA(1)==FALSE||input.LA(1)==FLOATING_POINT_LITERAL||input.LA(1)==HEX_LITERAL||input.LA(1)==NULL||input.LA(1)==OCTAL_LITERAL||input.LA(1)==STRING_LITERAL||input.LA(1)==TRUE ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, literal_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "literal"

    // $ANTLR start synpred126_JavaTreeParser
    public final void synpred126_JavaTreeParser_fragment() throws RecognitionException {
        // JavaTreeParser.g:502:35: ( switchCaseLabel )
        // JavaTreeParser.g:502:35: switchCaseLabel
        {
        pushFollow(FOLLOW_switchCaseLabel_in_synpred126_JavaTreeParser2828);
        switchCaseLabel();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_JavaTreeParser

    // $ANTLR start synpred133_JavaTreeParser
    public final void synpred133_JavaTreeParser_fragment() throws RecognitionException {
        // JavaTreeParser.g:515:48: ( ( expression )* )
        // JavaTreeParser.g:515:48: ( expression )*
        {
        // JavaTreeParser.g:515:48: ( expression )*
        loop144:
        do {
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==EXPR) ) {
                alt144=1;
            }


            switch (alt144) {
        	case 1 :
        	    // JavaTreeParser.g:515:48: expression
        	    {
        	    pushFollow(FOLLOW_expression_in_synpred133_JavaTreeParser2939);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop144;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred133_JavaTreeParser

    // Delegated rules

    public final boolean synpred126_JavaTreeParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_JavaTreeParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_JavaTreeParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_JavaTreeParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource94 = new BitSet(new long[]{0x0200001000400008L,0x0000000420000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource96 = new BitSet(new long[]{0x0200001000400008L,0x0000000420000000L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource99 = new BitSet(new long[]{0x0200001000400008L,0x0000000420000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource102 = new BitSet(new long[]{0x0200001000400008L,0x0000000400000000L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration165 = new BitSet(new long[]{0x0010000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration168 = new BitSet(new long[]{0x0020000000000008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_typeDeclaration196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration198 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration200 = new BitSet(new long[]{0x0000010000000000L,0x0000000010040002L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration202 = new BitSet(new long[]{0x0000010000000000L,0x0000000010000002L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration205 = new BitSet(new long[]{0x0000010000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration208 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_typeDeclaration211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration235 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration237 = new BitSet(new long[]{0x0000000000000000L,0x0000000800040002L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration239 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000002L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration242 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration269 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration271 = new BitSet(new long[]{0x0400000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration273 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration290 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration292 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_extendsClause333 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_implementsClause364 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList396 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_genericTypeParameter418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_in_genericTypeParameter420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_bound452 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope476 = new BitSet(new long[]{0x0000010000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_enumConstant505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_enumConstant507 = new BitSet(new long[]{0x0000010000008008L});
    public static final BitSet FOLLOW_arguments_in_enumConstant509 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope545 = new BitSet(new long[]{0x020008D000400008L,0x0000000400010000L,0x0088000000000000L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations587 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000800000000000L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations606 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations610 = new BitSet(new long[]{0x0000000004020008L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_classScopeDeclarations612 = new BitSet(new long[]{0x0000000004000008L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations615 = new BitSet(new long[]{0x0000000004000008L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations643 = new BitSet(new long[]{0x0000000000000000L,0x0000000002040000L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations645 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations650 = new BitSet(new long[]{0x0000000004000008L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations652 = new BitSet(new long[]{0x0000000004000008L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classScopeDeclarations678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classScopeDeclarations684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040200L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations704 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations706 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope756 = new BitSet(new long[]{0x0200001000400008L,0x0000000400010000L,0x0088000000000000L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000800000000000L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations789 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations793 = new BitSet(new long[]{0x0000000000020008L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations795 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations823 = new BitSet(new long[]{0x0000000000000000L,0x0000000002040000L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations825 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations830 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList972 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator996 = new BitSet(new long[]{0x4000000000080008L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator998 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId1024 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator1086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1110 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1140 = new BitSet(new long[]{0x4000000000080008L});
    public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1164 = new BitSet(new long[]{0x0010000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList1188 = new BitSet(new long[]{0x0000000000400018L,0x0400000000000008L,0x0100104140007000L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifier_in_localModifierList1331 = new BitSet(new long[]{0x0000000000400008L,0x0000000000000008L});
    public static final BitSet FOLLOW_FINAL_in_localModifier1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type1382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type1385 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1389 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_type1392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1416 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_typeIdent1439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList1644 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000800000010000L});
    public static final BitSet FOLLOW_type_in_genericTypeArgument1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument1680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument1682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType1822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1824 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType1836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1838 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1859 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList1861 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000C00L});
    public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList1864 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl1893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl1924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier1963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1965 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList1994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_annotationList1996 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_AT_in_annotation2018 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation2020 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_annotationInit_in_annotation2022 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit2048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializers_in_annotationInit2050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers2072 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers2074 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers2087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers2089 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_annotationInitializer2114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer2116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue2143 = new BitSet(new long[]{0x4000000000400088L});
    public static final BitSet FOLLOW_annotation_in_annotationElementValue2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_annotationElementValue2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2191 = new BitSet(new long[]{0x0200001000401008L,0x0000000400000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2221 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations2223 = new BitSet(new long[]{0x0001000000000008L});
    public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block2304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block2306 = new BitSet(new long[]{0x4208101014500008L,0x0000010404002100L,0x0208425000280000L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration2377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration2381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement2435 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2437 = new BitSet(new long[]{0x4000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement2439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement2452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2454 = new BitSet(new long[]{0x4008100014100000L,0x0000010004002100L,0x0200425000280000L});
    public static final BitSet FOLLOW_statement_in_statement2456 = new BitSet(new long[]{0x4008100014100008L,0x0000010004002100L,0x0200425000280000L});
    public static final BitSet FOLLOW_statement_in_statement2458 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement2481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_forCondition_in_statement2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_forUpdater_in_statement2487 = new BitSet(new long[]{0x4008100014100000L,0x0000010004002100L,0x0200425000280000L});
    public static final BitSet FOLLOW_statement_in_statement2489 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement2511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement2513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_statement2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_statement2517 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2519 = new BitSet(new long[]{0x4008100014100000L,0x0000010004002100L,0x0200425000280000L});
    public static final BitSet FOLLOW_statement_in_statement2521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement2544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2546 = new BitSet(new long[]{0x4008100014100000L,0x0000010004002100L,0x0200425000280000L});
    public static final BitSet FOLLOW_statement_in_statement2548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement2570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2574 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement2596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2598 = new BitSet(new long[]{0x0000000204000008L});
    public static final BitSet FOLLOW_catches_in_statement2600 = new BitSet(new long[]{0x0000000004000008L});
    public static final BitSet FOLLOW_block_in_statement2603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement2618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement2622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement2634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2636 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_statement2638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement2650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement2665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2667 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement2679 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2681 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement2709 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2711 = new BitSet(new long[]{0x4008100014100000L,0x0000010004002100L,0x0200425000280000L});
    public static final BitSet FOLLOW_statement_in_statement2713 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches2763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catchClause_in_catches2765 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_CATCH_in_catchClause2791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause2793 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_block_in_catchClause2795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2828 = new BitSet(new long[]{0x0001000040000008L});
    public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels2831 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2834 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_CASE_in_switchCaseLabel2864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_switchCaseLabel2866 = new BitSet(new long[]{0x4208101014500008L,0x0000010404002100L,0x0208425000280000L});
    public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel2868 = new BitSet(new long[]{0x4208101014500008L,0x0000010404002100L,0x0208425000280000L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel2904 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel2906 = new BitSet(new long[]{0x4208101014500008L,0x0000010404002100L,0x0208425000280000L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit2932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit2935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_forInit2939 = new BitSet(new long[]{0x4000000000000008L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition2967 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition2969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater2995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdater2997 = new BitSet(new long[]{0x4000000000000008L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression3025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression3027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression3052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression3054 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr3075 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3077 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3079 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr3091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3093 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3095 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr3107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3109 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expr3123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3125 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expr3139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3141 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_expr3155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3157 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_expr3171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3173 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_expr3187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3189 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expr3203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3205 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr3219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3221 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3237 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3253 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3255 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_expr3267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3269 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3271 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr3295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3297 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr3321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3323 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr3347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3349 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr3363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3365 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr3379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3381 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr3395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3397 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr3411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3413 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr3427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_in_expr3431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr3443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3445 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr3459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3461 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr3475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3477 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr3491 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3493 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3495 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr3507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3509 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr3523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3525 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr3539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3541 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr3555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3557 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr3571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3573 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr3587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3589 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr3603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3605 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr3619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3621 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr3635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr3649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_expr3663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_expr3677 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_expr3691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_expr3705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr3719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3721 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr3733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr3747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr3749 = new BitSet(new long[]{0x0816802881A50060L,0xE2F3980082980044L,0x1803218EB3C10FEEL});
    public static final BitSet FOLLOW_expr_in_expr3751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3806 = new BitSet(new long[]{0x0000003000000000L,0x0000000002000000L,0x0000008400000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3850 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression3872 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression3894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression3952 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3954 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression3972 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3974 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression4029 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression4031 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression4033 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_arguments_in_primaryExpression4036 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression4060 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4062 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall4156 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4159 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator4194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_newExpression4236 = new BitSet(new long[]{0x4000000000020000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4259 = new BitSet(new long[]{0x4000000000020000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4301 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_arguments_in_newExpression4303 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_classTopLevelScope_in_newExpression4305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression4330 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IDENT_in_innerNewExpression4333 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_arguments_in_innerNewExpression4335 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression4337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4362 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_newArrayConstruction4374 = new BitSet(new long[]{0x4000000000020002L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments4398 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments4400 = new BitSet(new long[]{0x4000000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_synpred126_JavaTreeParser2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred133_JavaTreeParser2939 = new BitSet(new long[]{0x4000000000000002L});

}
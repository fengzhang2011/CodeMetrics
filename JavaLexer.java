// $ANTLR 3.4 Java.g 2012-03-07 00:52:13

//package com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaLexer extends Lexer {
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


    /** 
     *  If <code>true</code> whitespaces will be preserved within the hidden 
     *  channel, otherwise the appropriate tokens will be thrown away.
     *  <p>
     *  Note that new line characters will be handled explicitly and will therefore
     *  not be seen as whitespaces.
     *  <p>
     *  The default value of this flag is <code>false</code>.
     */
    public boolean mPreserveWhitespaces = false;

    /** 
     *  If <code>true</code> new line characters will be preserved within the hidden 
     *  channel, otherwise the appropriate tokens will be thrown away.
     *  <p>
     *  Note that for new line characters the token text of the token  <code>NL
     *  </code> will be set to <code>System.getProperty("line.separator")</code>
     *  unless this flag is set to <code>false</code>, off course.
     *  <p>
     *  The default value of this flag is <code>false</code>.
     */
    public boolean mPreserveNewlineCharacters = false;

    /** 
     *  If <code>true</code> javadoc comments will be preserved within the hidden 
     *  channel, otherwise the appropriate tokens will be thrown away.
     *  <p>
     *  The default value of this flag is <code>false</code>.
     */
    public boolean mPreserveJavaDocComments = false;

    /** 
     *  If <code>true</code> (non javadoc) block comments will be preserved within the 
     *  hidden channel, otherwise the appropriate tokens will be thrown away.
     *  <p>
     *  The default value of this flag is <code>false</code>.
     */
    public boolean mPreserveBlockComments = false;

    /** 
     *  If <code>true</code> single line comments will be preserved within the hidden 
     *  channel, otherwise the appropriate tokens will be thrown away.
     *  <p>
     *  The default value of this flag is <code>false</code>.
     */
    public boolean mPreserveLineComments = false;

    private static final String NEW_LINE = System.getProperty("line.separator");

    private boolean mMessageCollectionEnabled = false;
    private List<String> mMessages;

    private CodeMetrics metric = CodeMetrics.instance();

    /**
     * Switches error message collection on or of.
     * <p>
     * The standard destination for parser error messages is <code>
     * System.err</code>. However, if <code>true</code> gets passed to this method 
     * this default behavior will be switched off and all error messages will be 
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
     * The actual behavior depends on whether collecting error messages has been 
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
     * Note that calling this method equals to a <code>getMessages(null)</code>
     * call.
     *
     * @see #getMessages(List)
     *
     * @return  A list holding collected error messages or <code>null</code> if
     *          collecting error messages is disabled. Of course, the returned list 
     *		    may be empty if no error message has been emitted.
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



    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public JavaLexer() {} 
    public JavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Java.g"; }

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:160:10: ( 'abstract' )
            // Java.g:160:12: 'abstract'
            {
            match("abstract"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:161:5: ( '&' )
            // Java.g:161:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "AND_ASSIGN"
    public final void mAND_ASSIGN() throws RecognitionException {
        try {
            int _type = AND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:162:12: ( '&=' )
            // Java.g:162:14: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND_ASSIGN"

    // $ANTLR start "ASSERT"
    public final void mASSERT() throws RecognitionException {
        try {
            int _type = ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:163:8: ( 'assert' )
            // Java.g:163:10: 'assert'
            {
            match("assert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSERT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:164:8: ( '=' )
            // Java.g:164:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:165:4: ( '@' )
            // Java.g:165:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "BIT_SHIFT_RIGHT"
    public final void mBIT_SHIFT_RIGHT() throws RecognitionException {
        try {
            int _type = BIT_SHIFT_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:166:17: ( '>>>' )
            // Java.g:166:19: '>>>'
            {
            match(">>>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIT_SHIFT_RIGHT"

    // $ANTLR start "BIT_SHIFT_RIGHT_ASSIGN"
    public final void mBIT_SHIFT_RIGHT_ASSIGN() throws RecognitionException {
        try {
            int _type = BIT_SHIFT_RIGHT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:167:24: ( '>>>=' )
            // Java.g:167:26: '>>>='
            {
            match(">>>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIT_SHIFT_RIGHT_ASSIGN"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:168:9: ( 'boolean' )
            // Java.g:168:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:169:7: ( 'break' )
            // Java.g:169:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "BYTE"
    public final void mBYTE() throws RecognitionException {
        try {
            int _type = BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:170:6: ( 'byte' )
            // Java.g:170:8: 'byte'
            {
            match("byte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BYTE"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:171:6: ( 'case' )
            // Java.g:171:8: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:172:7: ( 'catch' )
            // Java.g:172:9: 'catch'
            {
            match("catch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:173:6: ( 'char' )
            // Java.g:173:8: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:174:7: ( 'class' )
            // Java.g:174:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:175:7: ( ':' )
            // Java.g:175:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:176:7: ( ',' )
            // Java.g:176:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:177:10: ( 'continue' )
            // Java.g:177:12: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:178:5: ( '--' )
            // Java.g:178:7: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:179:9: ( 'default' )
            // Java.g:179:11: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:180:5: ( '/' )
            // Java.g:180:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DIV_ASSIGN"
    public final void mDIV_ASSIGN() throws RecognitionException {
        try {
            int _type = DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:181:12: ( '/=' )
            // Java.g:181:14: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV_ASSIGN"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:182:4: ( 'do' )
            // Java.g:182:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:183:5: ( '.' )
            // Java.g:183:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "DOTSTAR"
    public final void mDOTSTAR() throws RecognitionException {
        try {
            int _type = DOTSTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:184:9: ( '.*' )
            // Java.g:184:11: '.*'
            {
            match(".*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOTSTAR"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:185:8: ( 'double' )
            // Java.g:185:10: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "ELLIPSIS"
    public final void mELLIPSIS() throws RecognitionException {
        try {
            int _type = ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:186:10: ( '...' )
            // Java.g:186:12: '...'
            {
            match("..."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELLIPSIS"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:187:6: ( 'else' )
            // Java.g:187:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:188:6: ( 'enum' )
            // Java.g:188:8: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:189:7: ( '==' )
            // Java.g:189:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:190:9: ( 'extends' )
            // Java.g:190:11: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:191:7: ( 'false' )
            // Java.g:191:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:192:7: ( 'final' )
            // Java.g:192:9: 'final'
            {
            match("final"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "FINALLY"
    public final void mFINALLY() throws RecognitionException {
        try {
            int _type = FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:193:9: ( 'finally' )
            // Java.g:193:11: 'finally'
            {
            match("finally"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FINALLY"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:194:7: ( 'float' )
            // Java.g:194:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:195:5: ( 'for' )
            // Java.g:195:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "GREATER_OR_EQUAL"
    public final void mGREATER_OR_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:196:18: ( '>=' )
            // Java.g:196:20: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_OR_EQUAL"

    // $ANTLR start "GREATER_THAN"
    public final void mGREATER_THAN() throws RecognitionException {
        try {
            int _type = GREATER_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:197:14: ( '>' )
            // Java.g:197:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_THAN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:198:4: ( 'if' )
            // Java.g:198:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPLEMENTS"
    public final void mIMPLEMENTS() throws RecognitionException {
        try {
            int _type = IMPLEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:199:12: ( 'implements' )
            // Java.g:199:14: 'implements'
            {
            match("implements"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPLEMENTS"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:200:8: ( 'import' )
            // Java.g:200:10: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:201:5: ( '++' )
            // Java.g:201:7: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "INSTANCEOF"
    public final void mINSTANCEOF() throws RecognitionException {
        try {
            int _type = INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:202:12: ( 'instanceof' )
            // Java.g:202:14: 'instanceof'
            {
            match("instanceof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSTANCEOF"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:203:5: ( 'int' )
            // Java.g:203:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:204:11: ( 'interface' )
            // Java.g:204:13: 'interface'
            {
            match("interface"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:205:8: ( '[' )
            // Java.g:205:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:206:8: ( '{' )
            // Java.g:206:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "LESS_OR_EQUAL"
    public final void mLESS_OR_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:207:15: ( '<=' )
            // Java.g:207:17: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_OR_EQUAL"

    // $ANTLR start "LESS_THAN"
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:208:11: ( '<' )
            // Java.g:208:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_THAN"

    // $ANTLR start "LOGICAL_AND"
    public final void mLOGICAL_AND() throws RecognitionException {
        try {
            int _type = LOGICAL_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:209:13: ( '&&' )
            // Java.g:209:15: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_AND"

    // $ANTLR start "LOGICAL_NOT"
    public final void mLOGICAL_NOT() throws RecognitionException {
        try {
            int _type = LOGICAL_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:210:13: ( '!' )
            // Java.g:210:15: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_NOT"

    // $ANTLR start "LOGICAL_OR"
    public final void mLOGICAL_OR() throws RecognitionException {
        try {
            int _type = LOGICAL_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:211:12: ( '||' )
            // Java.g:211:14: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGICAL_OR"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:212:6: ( 'long' )
            // Java.g:212:8: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:213:8: ( '(' )
            // Java.g:213:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:214:7: ( '-' )
            // Java.g:214:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MINUS_ASSIGN"
    public final void mMINUS_ASSIGN() throws RecognitionException {
        try {
            int _type = MINUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:215:14: ( '-=' )
            // Java.g:215:16: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS_ASSIGN"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:216:5: ( '%' )
            // Java.g:216:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "MOD_ASSIGN"
    public final void mMOD_ASSIGN() throws RecognitionException {
        try {
            int _type = MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:217:12: ( '%=' )
            // Java.g:217:14: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD_ASSIGN"

    // $ANTLR start "NATIVE"
    public final void mNATIVE() throws RecognitionException {
        try {
            int _type = NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:218:8: ( 'native' )
            // Java.g:218:10: 'native'
            {
            match("native"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NATIVE"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:219:5: ( 'new' )
            // Java.g:219:7: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:220:5: ( '~' )
            // Java.g:220:7: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:221:11: ( '!=' )
            // Java.g:221:13: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:222:6: ( 'null' )
            // Java.g:222:8: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:223:4: ( '|' )
            // Java.g:223:6: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "OR_ASSIGN"
    public final void mOR_ASSIGN() throws RecognitionException {
        try {
            int _type = OR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:224:11: ( '|=' )
            // Java.g:224:13: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR_ASSIGN"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:225:9: ( 'package' )
            // Java.g:225:11: 'package'
            {
            match("package"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:226:6: ( '+' )
            // Java.g:226:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PLUS_ASSIGN"
    public final void mPLUS_ASSIGN() throws RecognitionException {
        try {
            int _type = PLUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:227:13: ( '+=' )
            // Java.g:227:15: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS_ASSIGN"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:228:9: ( 'private' )
            // Java.g:228:11: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PROTECTED"
    public final void mPROTECTED() throws RecognitionException {
        try {
            int _type = PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:229:11: ( 'protected' )
            // Java.g:229:13: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTECTED"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:230:8: ( 'public' )
            // Java.g:230:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:231:10: ( '?' )
            // Java.g:231:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:232:8: ( ']' )
            // Java.g:232:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:233:8: ( '}' )
            // Java.g:233:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:234:8: ( 'return' )
            // Java.g:234:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:235:8: ( ')' )
            // Java.g:235:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:236:6: ( ';' )
            // Java.g:236:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "SHIFT_LEFT"
    public final void mSHIFT_LEFT() throws RecognitionException {
        try {
            int _type = SHIFT_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:237:12: ( '<<' )
            // Java.g:237:14: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_LEFT"

    // $ANTLR start "SHIFT_LEFT_ASSIGN"
    public final void mSHIFT_LEFT_ASSIGN() throws RecognitionException {
        try {
            int _type = SHIFT_LEFT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:238:19: ( '<<=' )
            // Java.g:238:21: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_LEFT_ASSIGN"

    // $ANTLR start "SHIFT_RIGHT"
    public final void mSHIFT_RIGHT() throws RecognitionException {
        try {
            int _type = SHIFT_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:239:13: ( '>>' )
            // Java.g:239:15: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_RIGHT"

    // $ANTLR start "SHIFT_RIGHT_ASSIGN"
    public final void mSHIFT_RIGHT_ASSIGN() throws RecognitionException {
        try {
            int _type = SHIFT_RIGHT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:240:20: ( '>>=' )
            // Java.g:240:22: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_RIGHT_ASSIGN"

    // $ANTLR start "SHORT"
    public final void mSHORT() throws RecognitionException {
        try {
            int _type = SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:241:7: ( 'short' )
            // Java.g:241:9: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHORT"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:242:6: ( '*' )
            // Java.g:242:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "STAR_ASSIGN"
    public final void mSTAR_ASSIGN() throws RecognitionException {
        try {
            int _type = STAR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:243:13: ( '*=' )
            // Java.g:243:15: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR_ASSIGN"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:244:8: ( 'static' )
            // Java.g:244:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "STRICTFP"
    public final void mSTRICTFP() throws RecognitionException {
        try {
            int _type = STRICTFP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:245:10: ( 'strictfp' )
            // Java.g:245:12: 'strictfp'
            {
            match("strictfp"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRICTFP"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:246:7: ( 'super' )
            // Java.g:246:9: 'super'
            {
            match("super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:247:8: ( 'switch' )
            // Java.g:247:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "SYNCHRONIZED"
    public final void mSYNCHRONIZED() throws RecognitionException {
        try {
            int _type = SYNCHRONIZED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:248:14: ( 'synchronized' )
            // Java.g:248:16: 'synchronized'
            {
            match("synchronized"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SYNCHRONIZED"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:249:6: ( 'this' )
            // Java.g:249:8: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:250:7: ( 'throw' )
            // Java.g:250:9: 'throw'
            {
            match("throw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "THROWS"
    public final void mTHROWS() throws RecognitionException {
        try {
            int _type = THROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:251:8: ( 'throws' )
            // Java.g:251:10: 'throws'
            {
            match("throws"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THROWS"

    // $ANTLR start "TRANSIENT"
    public final void mTRANSIENT() throws RecognitionException {
        try {
            int _type = TRANSIENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:252:11: ( 'transient' )
            // Java.g:252:13: 'transient'
            {
            match("transient"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANSIENT"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:253:6: ( 'true' )
            // Java.g:253:8: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:254:5: ( 'try' )
            // Java.g:254:7: 'try'
            {
            match("try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:255:6: ( 'void' )
            // Java.g:255:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "VOLATILE"
    public final void mVOLATILE() throws RecognitionException {
        try {
            int _type = VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:256:10: ( 'volatile' )
            // Java.g:256:12: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOLATILE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:257:7: ( 'while' )
            // Java.g:257:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:258:5: ( '^' )
            // Java.g:258:7: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "XOR_ASSIGN"
    public final void mXOR_ASSIGN() throws RecognitionException {
        try {
            int _type = XOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:259:12: ( '^=' )
            // Java.g:259:14: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XOR_ASSIGN"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            int _type = HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1427:13: ( HEX_PREFIX ( HEX_DIGIT )+ ( INTEGER_TYPE_SUFFIX )? )
            // Java.g:1427:15: HEX_PREFIX ( HEX_DIGIT )+ ( INTEGER_TYPE_SUFFIX )?
            {
            mHEX_PREFIX(); 


            // Java.g:1427:26: ( HEX_DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'F')||(LA1_0 >= 'a' && LA1_0 <= 'f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Java.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // Java.g:1427:37: ( INTEGER_TYPE_SUFFIX )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='L'||LA2_0=='l') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Java.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "HEX_PREFIX"
    public final void mHEX_PREFIX() throws RecognitionException {
        try {
            // Java.g:1431:12: ( '0' ( 'x' | 'X' ) )
            // Java.g:1431:14: '0' ( 'x' | 'X' )
            {
            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_PREFIX"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1432:17: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( INTEGER_TYPE_SUFFIX )? )
            // Java.g:1432:19: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( INTEGER_TYPE_SUFFIX )?
            {
            // Java.g:1432:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Java.g:1432:20: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // Java.g:1432:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 

                    // Java.g:1432:35: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            // Java.g:1432:46: ( INTEGER_TYPE_SUFFIX )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='L'||LA5_0=='l') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Java.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
        try {
            int _type = OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1434:15: ( '0' ( '0' .. '7' )+ ( INTEGER_TYPE_SUFFIX )? )
            // Java.g:1434:17: '0' ( '0' .. '7' )+ ( INTEGER_TYPE_SUFFIX )?
            {
            match('0'); 

            // Java.g:1434:21: ( '0' .. '7' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '7')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Java.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            // Java.g:1434:33: ( INTEGER_TYPE_SUFFIX )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='L'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Java.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // Java.g:1438:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Java.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "INTEGER_TYPE_SUFFIX"
    public final void mINTEGER_TYPE_SUFFIX() throws RecognitionException {
        try {
            // Java.g:1441:21: ( ( 'l' | 'L' ) )
            // Java.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER_TYPE_SUFFIX"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1443:5: ( DECIMAL_FP_LITERAL | HEXADECIMAL_FP_LITERAL )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='X'||LA8_1=='x') ) {
                    alt8=2;
                }
                else if ( (LA8_1=='.'||(LA8_1 >= '0' && LA8_1 <= '9')||(LA8_1 >= 'D' && LA8_1 <= 'F')||(LA8_1 >= 'd' && LA8_1 <= 'f')) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA8_0=='.'||(LA8_0 >= '1' && LA8_0 <= '9')) ) {
                alt8=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Java.g:1443:9: DECIMAL_FP_LITERAL
                    {
                    mDECIMAL_FP_LITERAL(); 


                    }
                    break;
                case 2 :
                    // Java.g:1444:9: HEXADECIMAL_FP_LITERAL
                    {
                    mHEXADECIMAL_FP_LITERAL(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "DECIMAL_FP_LITERAL"
    public final void mDECIMAL_FP_LITERAL() throws RecognitionException {
        try {
            // Java.g:1450:5: ( ( '0' .. '9' )+ ( DOT ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX ) | DOT ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='.') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // Java.g:1450:9: ( '0' .. '9' )+ ( DOT ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX )
                    {
                    // Java.g:1450:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    // Java.g:1451:9: ( DOT ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case '.':
                        {
                        alt14=1;
                        }
                        break;
                    case 'E':
                    case 'e':
                        {
                        alt14=2;
                        }
                        break;
                    case 'D':
                    case 'F':
                    case 'd':
                    case 'f':
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }

                    switch (alt14) {
                        case 1 :
                            // Java.g:1452:13: DOT ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )?
                            {
                            mDOT(); 


                            // Java.g:1452:17: ( '0' .. '9' )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // Java.g:
                            	    {
                            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                            	        input.consume();
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;
                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            // Java.g:1452:29: ( EXPONENT )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='E'||LA11_0=='e') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // Java.g:1452:29: EXPONENT
                                    {
                                    mEXPONENT(); 


                                    }
                                    break;

                            }


                            // Java.g:1452:39: ( FLOAT_TYPE_SUFFIX )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0=='D'||LA12_0=='F'||LA12_0=='d'||LA12_0=='f') ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // Java.g:
                                    {
                                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                        input.consume();
                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;
                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // Java.g:1453:13: EXPONENT ( FLOAT_TYPE_SUFFIX )?
                            {
                            mEXPONENT(); 


                            // Java.g:1453:22: ( FLOAT_TYPE_SUFFIX )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='D'||LA13_0=='F'||LA13_0=='d'||LA13_0=='f') ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // Java.g:
                                    {
                                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                        input.consume();
                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;
                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // Java.g:1454:13: FLOAT_TYPE_SUFFIX
                            {
                            mFLOAT_TYPE_SUFFIX(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Java.g:1456:9: DOT ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )?
                    {
                    mDOT(); 


                    // Java.g:1456:13: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    // Java.g:1456:25: ( EXPONENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Java.g:1456:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    // Java.g:1456:35: ( FLOAT_TYPE_SUFFIX )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Java.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_FP_LITERAL"

    // $ANTLR start "HEXADECIMAL_FP_LITERAL"
    public final void mHEXADECIMAL_FP_LITERAL() throws RecognitionException {
        try {
            // Java.g:1461:2: ( HEX_PREFIX ( ( HEX_DIGIT )+ ( DOT ( ( HEX_DIGIT )+ )? )? | DOT ( HEX_DIGIT )+ )? ( 'p' | 'P' ) SIGNED_INTEGER ( FLOAT_TYPE_SUFFIX )? )
            // Java.g:1461:4: HEX_PREFIX ( ( HEX_DIGIT )+ ( DOT ( ( HEX_DIGIT )+ )? )? | DOT ( HEX_DIGIT )+ )? ( 'p' | 'P' ) SIGNED_INTEGER ( FLOAT_TYPE_SUFFIX )?
            {
            mHEX_PREFIX(); 


            // Java.g:1462:3: ( ( HEX_DIGIT )+ ( DOT ( ( HEX_DIGIT )+ )? )? | DOT ( HEX_DIGIT )+ )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0 >= '0' && LA24_0 <= '9')||(LA24_0 >= 'A' && LA24_0 <= 'F')||(LA24_0 >= 'a' && LA24_0 <= 'f')) ) {
                alt24=1;
            }
            else if ( (LA24_0=='.') ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // Java.g:1471:4: ( HEX_DIGIT )+ ( DOT ( ( HEX_DIGIT )+ )? )?
                    {
                    // Java.g:1471:4: ( HEX_DIGIT )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'F')||(LA19_0 >= 'a' && LA19_0 <= 'f')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    // Java.g:1471:15: ( DOT ( ( HEX_DIGIT )+ )? )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='.') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Java.g:1471:16: DOT ( ( HEX_DIGIT )+ )?
                            {
                            mDOT(); 


                            // Java.g:1471:20: ( ( HEX_DIGIT )+ )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( ((LA21_0 >= '0' && LA21_0 <= '9')||(LA21_0 >= 'A' && LA21_0 <= 'F')||(LA21_0 >= 'a' && LA21_0 <= 'f')) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // Java.g:1471:21: ( HEX_DIGIT )+
                                    {
                                    // Java.g:1471:21: ( HEX_DIGIT )+
                                    int cnt20=0;
                                    loop20:
                                    do {
                                        int alt20=2;
                                        int LA20_0 = input.LA(1);

                                        if ( ((LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'F')||(LA20_0 >= 'a' && LA20_0 <= 'f')) ) {
                                            alt20=1;
                                        }


                                        switch (alt20) {
                                    	case 1 :
                                    	    // Java.g:
                                    	    {
                                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                                    	        input.consume();
                                    	    }
                                    	    else {
                                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                                    	        recover(mse);
                                    	        throw mse;
                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt20 >= 1 ) break loop20;
                                                EarlyExitException eee =
                                                    new EarlyExitException(20, input);
                                                throw eee;
                                        }
                                        cnt20++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Java.g:1472:5: DOT ( HEX_DIGIT )+
                    {
                    mDOT(); 


                    // Java.g:1472:9: ( HEX_DIGIT )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0 >= '0' && LA23_0 <= '9')||(LA23_0 >= 'A' && LA23_0 <= 'F')||(LA23_0 >= 'a' && LA23_0 <= 'f')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Java.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            mSIGNED_INTEGER(); 


            // Java.g:1474:28: ( FLOAT_TYPE_SUFFIX )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='d'||LA25_0=='f') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Java.g:
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEXADECIMAL_FP_LITERAL"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // Java.g:1478:10: ( ( 'e' | 'E' ) SIGNED_INTEGER )
            // Java.g:1478:12: ( 'e' | 'E' ) SIGNED_INTEGER
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            mSIGNED_INTEGER(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "SIGNED_INTEGER"
    public final void mSIGNED_INTEGER() throws RecognitionException {
        try {
            // Java.g:1481:16: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // Java.g:1481:18: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // Java.g:1481:18: ( '+' | '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='+'||LA26_0=='-') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Java.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // Java.g:1481:29: ( '0' .. '9' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0 >= '0' && LA27_0 <= '9')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Java.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIGNED_INTEGER"

    // $ANTLR start "FLOAT_TYPE_SUFFIX"
    public final void mFLOAT_TYPE_SUFFIX() throws RecognitionException {
        try {
            // Java.g:1484:19: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // Java.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_TYPE_SUFFIX"

    // $ANTLR start "CHARACTER_LITERAL"
    public final void mCHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1486:5: ( '\\'' ( ESCAPE_SEQUENCE |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // Java.g:1486:9: '\\'' ( ESCAPE_SEQUENCE |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // Java.g:1486:14: ( ESCAPE_SEQUENCE |~ ( '\\'' | '\\\\' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
                alt28=1;
            }
            else if ( ((LA28_0 >= '\u0000' && LA28_0 <= '&')||(LA28_0 >= '(' && LA28_0 <= '[')||(LA28_0 >= ']' && LA28_0 <= '\uFFFF')) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // Java.g:1486:16: ESCAPE_SEQUENCE
                    {
                    mESCAPE_SEQUENCE(); 


                    }
                    break;
                case 2 :
                    // Java.g:1486:34: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARACTER_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1490:5: ( '\"' ( ESCAPE_SEQUENCE |~ ( '\\\\' | '\"' ) )* '\"' )
            // Java.g:1490:8: '\"' ( ESCAPE_SEQUENCE |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // Java.g:1490:12: ( ESCAPE_SEQUENCE |~ ( '\\\\' | '\"' ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='\\') ) {
                    alt29=1;
                }
                else if ( ((LA29_0 >= '\u0000' && LA29_0 <= '!')||(LA29_0 >= '#' && LA29_0 <= '[')||(LA29_0 >= ']' && LA29_0 <= '\uFFFF')) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // Java.g:1490:14: ESCAPE_SEQUENCE
            	    {
            	    mESCAPE_SEQUENCE(); 


            	    }
            	    break;
            	case 2 :
            	    // Java.g:1490:32: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "ESCAPE_SEQUENCE"
    public final void mESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // Java.g:1496:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESCAPE | OCTAL_ESCAPE )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt30=1;
                    }
                    break;
                case 'u':
                    {
                    alt30=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt30=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // Java.g:1496:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Java.g:1497:9: UNICODE_ESCAPE
                    {
                    mUNICODE_ESCAPE(); 


                    }
                    break;
                case 3 :
                    // Java.g:1498:9: OCTAL_ESCAPE
                    {
                    mOCTAL_ESCAPE(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESCAPE_SEQUENCE"

    // $ANTLR start "OCTAL_ESCAPE"
    public final void mOCTAL_ESCAPE() throws RecognitionException {
        try {
            // Java.g:1503:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\\') ) {
                int LA31_1 = input.LA(2);

                if ( ((LA31_1 >= '0' && LA31_1 <= '3')) ) {
                    int LA31_2 = input.LA(3);

                    if ( ((LA31_2 >= '0' && LA31_2 <= '7')) ) {
                        int LA31_4 = input.LA(4);

                        if ( ((LA31_4 >= '0' && LA31_4 <= '7')) ) {
                            alt31=1;
                        }
                        else {
                            alt31=2;
                        }
                    }
                    else {
                        alt31=3;
                    }
                }
                else if ( ((LA31_1 >= '4' && LA31_1 <= '7')) ) {
                    int LA31_3 = input.LA(3);

                    if ( ((LA31_3 >= '0' && LA31_3 <= '7')) ) {
                        alt31=2;
                    }
                    else {
                        alt31=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // Java.g:1503:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Java.g:1504:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // Java.g:1505:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESCAPE"

    // $ANTLR start "UNICODE_ESCAPE"
    public final void mUNICODE_ESCAPE() throws RecognitionException {
        try {
            // Java.g:1510:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // Java.g:1510:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESCAPE"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1513:5: ( JAVA_ID_START ( JAVA_ID_PART )* )
            // Java.g:1513:9: JAVA_ID_START ( JAVA_ID_PART )*
            {
            mJAVA_ID_START(); 


            // Java.g:1513:23: ( JAVA_ID_PART )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='$'||(LA32_0 >= '0' && LA32_0 <= '9')||(LA32_0 >= 'A' && LA32_0 <= 'Z')||LA32_0=='_'||(LA32_0 >= 'a' && LA32_0 <= 'z')||(LA32_0 >= '\u00C0' && LA32_0 <= '\u00D6')||(LA32_0 >= '\u00D8' && LA32_0 <= '\u00F6')||(LA32_0 >= '\u00F8' && LA32_0 <= '\u1FFF')||(LA32_0 >= '\u3040' && LA32_0 <= '\u318F')||(LA32_0 >= '\u3300' && LA32_0 <= '\u337F')||(LA32_0 >= '\u3400' && LA32_0 <= '\u3D2D')||(LA32_0 >= '\u4E00' && LA32_0 <= '\u9FFF')||(LA32_0 >= '\uF900' && LA32_0 <= '\uFAFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Java.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "JAVA_ID_START"
    public final void mJAVA_ID_START() throws RecognitionException {
        try {
            // Java.g:1519:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // Java.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JAVA_ID_START"

    // $ANTLR start "JAVA_ID_PART"
    public final void mJAVA_ID_PART() throws RecognitionException {
        try {
            // Java.g:1536:5: ( JAVA_ID_START | '\\u0030' .. '\\u0039' )
            // Java.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JAVA_ID_PART"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1539:5: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Java.g:1539:8: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Java.g:1539:8: ( '\\r\\n' | '\\r' | '\\n' )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\r') ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1=='\n') ) {
                    alt33=1;
                }
                else {
                    alt33=2;
                }
            }
            else if ( (LA33_0=='\n') ) {
                alt33=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // Java.g:1539:9: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Java.g:1539:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Java.g:1539:21: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


               
                    if (!mPreserveNewlineCharacters) {
                        skip();
                    } else {
                        setText(NEW_LINE);
                        _channel = HIDDEN;
                    }

                    metric.addNewLine(getCharIndex());
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1552:5: ( ( ' ' | '\\t' | '\\u000C' ) )
            // Java.g:1552:8: ( ' ' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


               
                    if (!mPreserveWhitespaces) {
                        skip();
                    } else {
                        _channel = HIDDEN;
                    }
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "BLOCK_COMMENT"
    public final void mBLOCK_COMMENT() throws RecognitionException {
        try {
            int _type = BLOCK_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1563:5: ( ( '/*' ~ '*' ( options {greedy=false; } : . )* '*/' | '/**/' ) )
            // Java.g:1563:9: ( '/*' ~ '*' ( options {greedy=false; } : . )* '*/' | '/**/' )
            {
            // Java.g:1563:9: ( '/*' ~ '*' ( options {greedy=false; } : . )* '*/' | '/**/' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='/') ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1=='*') ) {
                    int LA35_2 = input.LA(3);

                    if ( ((LA35_2 >= '\u0000' && LA35_2 <= ')')||(LA35_2 >= '+' && LA35_2 <= '\uFFFF')) ) {
                        alt35=1;
                    }
                    else if ( (LA35_2=='*') ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // Java.g:1563:13: '/*' ~ '*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // Java.g:1563:23: ( options {greedy=false; } : . )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0=='*') ) {
                            int LA34_1 = input.LA(2);

                            if ( (LA34_1=='/') ) {
                                alt34=2;
                            }
                            else if ( ((LA34_1 >= '\u0000' && LA34_1 <= '.')||(LA34_1 >= '0' && LA34_1 <= '\uFFFF')) ) {
                                alt34=1;
                            }


                        }
                        else if ( ((LA34_0 >= '\u0000' && LA34_0 <= ')')||(LA34_0 >= '+' && LA34_0 <= '\uFFFF')) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // Java.g:1563:51: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    match("*/"); 



                    }
                    break;
                case 2 :
                    // Java.g:1564:13: '/**/'
                    {
                    match("/**/"); 



                    }
                    break;

            }


               
                    if (!mPreserveBlockComments) {
                        skip();
                    } else {
                        _channel = HIDDEN;
                    }
            //        System.out.println("BLOCK_COMMENT : "+getCharIndex()+" = "+getText());
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLOCK_COMMENT"

    // $ANTLR start "JAVADOC_COMMENT"
    public final void mJAVADOC_COMMENT() throws RecognitionException {
        try {
            int _type = JAVADOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1577:5: ( '/**' ~ '/' ( options {greedy=false; } : . )* '*/' )
            // Java.g:1577:9: '/**' ~ '/' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 



            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Java.g:1577:20: ( options {greedy=false; } : . )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='*') ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1=='/') ) {
                        alt36=2;
                    }
                    else if ( ((LA36_1 >= '\u0000' && LA36_1 <= '.')||(LA36_1 >= '0' && LA36_1 <= '\uFFFF')) ) {
                        alt36=1;
                    }


                }
                else if ( ((LA36_0 >= '\u0000' && LA36_0 <= ')')||(LA36_0 >= '+' && LA36_0 <= '\uFFFF')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Java.g:1577:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            match("*/"); 



               
                    if (!mPreserveJavaDocComments) {
                        skip();
                    } else {
                        _channel = HIDDEN;
                    }
            //        System.out.println("JAVADOC_COMMENT : "+getCharIndex()+" = "+getText());
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JAVADOC_COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Java.g:1589:5: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // Java.g:1589:7: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 



            // Java.g:1589:12: (~ ( '\\n' | '\\r' ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= '\u0000' && LA37_0 <= '\t')||(LA37_0 >= '\u000B' && LA37_0 <= '\f')||(LA37_0 >= '\u000E' && LA37_0 <= '\uFFFF')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Java.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


               
                    if (!mPreserveLineComments) {
                        skip();
                    } else {
                        _channel = HIDDEN;
                    }
            //        System.out.println("LINE_COMMENT : "+getCharIndex()+" = "+getText());
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // Java.g:1:8: ( ABSTRACT | AND | AND_ASSIGN | ASSERT | ASSIGN | AT | BIT_SHIFT_RIGHT | BIT_SHIFT_RIGHT_ASSIGN | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | COLON | COMMA | CONTINUE | DEC | DEFAULT | DIV | DIV_ASSIGN | DO | DOT | DOTSTAR | DOUBLE | ELLIPSIS | ELSE | ENUM | EQUAL | EXTENDS | FALSE | FINAL | FINALLY | FLOAT | FOR | GREATER_OR_EQUAL | GREATER_THAN | IF | IMPLEMENTS | IMPORT | INC | INSTANCEOF | INT | INTERFACE | LBRACK | LCURLY | LESS_OR_EQUAL | LESS_THAN | LOGICAL_AND | LOGICAL_NOT | LOGICAL_OR | LONG | LPAREN | MINUS | MINUS_ASSIGN | MOD | MOD_ASSIGN | NATIVE | NEW | NOT | NOT_EQUAL | NULL | OR | OR_ASSIGN | PACKAGE | PLUS | PLUS_ASSIGN | PRIVATE | PROTECTED | PUBLIC | QUESTION | RBRACK | RCURLY | RETURN | RPAREN | SEMI | SHIFT_LEFT | SHIFT_LEFT_ASSIGN | SHIFT_RIGHT | SHIFT_RIGHT_ASSIGN | SHORT | STAR | STAR_ASSIGN | STATIC | STRICTFP | SUPER | SWITCH | SYNCHRONIZED | THIS | THROW | THROWS | TRANSIENT | TRUE | TRY | VOID | VOLATILE | WHILE | XOR | XOR_ASSIGN | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | IDENT | NL | WS | BLOCK_COMMENT | JAVADOC_COMMENT | LINE_COMMENT )
        int alt38=112;
        alt38 = dfa38.predict(input);
        switch (alt38) {
            case 1 :
                // Java.g:1:10: ABSTRACT
                {
                mABSTRACT(); 


                }
                break;
            case 2 :
                // Java.g:1:19: AND
                {
                mAND(); 


                }
                break;
            case 3 :
                // Java.g:1:23: AND_ASSIGN
                {
                mAND_ASSIGN(); 


                }
                break;
            case 4 :
                // Java.g:1:34: ASSERT
                {
                mASSERT(); 


                }
                break;
            case 5 :
                // Java.g:1:41: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 6 :
                // Java.g:1:48: AT
                {
                mAT(); 


                }
                break;
            case 7 :
                // Java.g:1:51: BIT_SHIFT_RIGHT
                {
                mBIT_SHIFT_RIGHT(); 


                }
                break;
            case 8 :
                // Java.g:1:67: BIT_SHIFT_RIGHT_ASSIGN
                {
                mBIT_SHIFT_RIGHT_ASSIGN(); 


                }
                break;
            case 9 :
                // Java.g:1:90: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 10 :
                // Java.g:1:98: BREAK
                {
                mBREAK(); 


                }
                break;
            case 11 :
                // Java.g:1:104: BYTE
                {
                mBYTE(); 


                }
                break;
            case 12 :
                // Java.g:1:109: CASE
                {
                mCASE(); 


                }
                break;
            case 13 :
                // Java.g:1:114: CATCH
                {
                mCATCH(); 


                }
                break;
            case 14 :
                // Java.g:1:120: CHAR
                {
                mCHAR(); 


                }
                break;
            case 15 :
                // Java.g:1:125: CLASS
                {
                mCLASS(); 


                }
                break;
            case 16 :
                // Java.g:1:131: COLON
                {
                mCOLON(); 


                }
                break;
            case 17 :
                // Java.g:1:137: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 18 :
                // Java.g:1:143: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 19 :
                // Java.g:1:152: DEC
                {
                mDEC(); 


                }
                break;
            case 20 :
                // Java.g:1:156: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 21 :
                // Java.g:1:164: DIV
                {
                mDIV(); 


                }
                break;
            case 22 :
                // Java.g:1:168: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 


                }
                break;
            case 23 :
                // Java.g:1:179: DO
                {
                mDO(); 


                }
                break;
            case 24 :
                // Java.g:1:182: DOT
                {
                mDOT(); 


                }
                break;
            case 25 :
                // Java.g:1:186: DOTSTAR
                {
                mDOTSTAR(); 


                }
                break;
            case 26 :
                // Java.g:1:194: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 27 :
                // Java.g:1:201: ELLIPSIS
                {
                mELLIPSIS(); 


                }
                break;
            case 28 :
                // Java.g:1:210: ELSE
                {
                mELSE(); 


                }
                break;
            case 29 :
                // Java.g:1:215: ENUM
                {
                mENUM(); 


                }
                break;
            case 30 :
                // Java.g:1:220: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 31 :
                // Java.g:1:226: EXTENDS
                {
                mEXTENDS(); 


                }
                break;
            case 32 :
                // Java.g:1:234: FALSE
                {
                mFALSE(); 


                }
                break;
            case 33 :
                // Java.g:1:240: FINAL
                {
                mFINAL(); 


                }
                break;
            case 34 :
                // Java.g:1:246: FINALLY
                {
                mFINALLY(); 


                }
                break;
            case 35 :
                // Java.g:1:254: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 36 :
                // Java.g:1:260: FOR
                {
                mFOR(); 


                }
                break;
            case 37 :
                // Java.g:1:264: GREATER_OR_EQUAL
                {
                mGREATER_OR_EQUAL(); 


                }
                break;
            case 38 :
                // Java.g:1:281: GREATER_THAN
                {
                mGREATER_THAN(); 


                }
                break;
            case 39 :
                // Java.g:1:294: IF
                {
                mIF(); 


                }
                break;
            case 40 :
                // Java.g:1:297: IMPLEMENTS
                {
                mIMPLEMENTS(); 


                }
                break;
            case 41 :
                // Java.g:1:308: IMPORT
                {
                mIMPORT(); 


                }
                break;
            case 42 :
                // Java.g:1:315: INC
                {
                mINC(); 


                }
                break;
            case 43 :
                // Java.g:1:319: INSTANCEOF
                {
                mINSTANCEOF(); 


                }
                break;
            case 44 :
                // Java.g:1:330: INT
                {
                mINT(); 


                }
                break;
            case 45 :
                // Java.g:1:334: INTERFACE
                {
                mINTERFACE(); 


                }
                break;
            case 46 :
                // Java.g:1:344: LBRACK
                {
                mLBRACK(); 


                }
                break;
            case 47 :
                // Java.g:1:351: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 48 :
                // Java.g:1:358: LESS_OR_EQUAL
                {
                mLESS_OR_EQUAL(); 


                }
                break;
            case 49 :
                // Java.g:1:372: LESS_THAN
                {
                mLESS_THAN(); 


                }
                break;
            case 50 :
                // Java.g:1:382: LOGICAL_AND
                {
                mLOGICAL_AND(); 


                }
                break;
            case 51 :
                // Java.g:1:394: LOGICAL_NOT
                {
                mLOGICAL_NOT(); 


                }
                break;
            case 52 :
                // Java.g:1:406: LOGICAL_OR
                {
                mLOGICAL_OR(); 


                }
                break;
            case 53 :
                // Java.g:1:417: LONG
                {
                mLONG(); 


                }
                break;
            case 54 :
                // Java.g:1:422: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 55 :
                // Java.g:1:429: MINUS
                {
                mMINUS(); 


                }
                break;
            case 56 :
                // Java.g:1:435: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 


                }
                break;
            case 57 :
                // Java.g:1:448: MOD
                {
                mMOD(); 


                }
                break;
            case 58 :
                // Java.g:1:452: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 


                }
                break;
            case 59 :
                // Java.g:1:463: NATIVE
                {
                mNATIVE(); 


                }
                break;
            case 60 :
                // Java.g:1:470: NEW
                {
                mNEW(); 


                }
                break;
            case 61 :
                // Java.g:1:474: NOT
                {
                mNOT(); 


                }
                break;
            case 62 :
                // Java.g:1:478: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 63 :
                // Java.g:1:488: NULL
                {
                mNULL(); 


                }
                break;
            case 64 :
                // Java.g:1:493: OR
                {
                mOR(); 


                }
                break;
            case 65 :
                // Java.g:1:496: OR_ASSIGN
                {
                mOR_ASSIGN(); 


                }
                break;
            case 66 :
                // Java.g:1:506: PACKAGE
                {
                mPACKAGE(); 


                }
                break;
            case 67 :
                // Java.g:1:514: PLUS
                {
                mPLUS(); 


                }
                break;
            case 68 :
                // Java.g:1:519: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 


                }
                break;
            case 69 :
                // Java.g:1:531: PRIVATE
                {
                mPRIVATE(); 


                }
                break;
            case 70 :
                // Java.g:1:539: PROTECTED
                {
                mPROTECTED(); 


                }
                break;
            case 71 :
                // Java.g:1:549: PUBLIC
                {
                mPUBLIC(); 


                }
                break;
            case 72 :
                // Java.g:1:556: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 73 :
                // Java.g:1:565: RBRACK
                {
                mRBRACK(); 


                }
                break;
            case 74 :
                // Java.g:1:572: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 75 :
                // Java.g:1:579: RETURN
                {
                mRETURN(); 


                }
                break;
            case 76 :
                // Java.g:1:586: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 77 :
                // Java.g:1:593: SEMI
                {
                mSEMI(); 


                }
                break;
            case 78 :
                // Java.g:1:598: SHIFT_LEFT
                {
                mSHIFT_LEFT(); 


                }
                break;
            case 79 :
                // Java.g:1:609: SHIFT_LEFT_ASSIGN
                {
                mSHIFT_LEFT_ASSIGN(); 


                }
                break;
            case 80 :
                // Java.g:1:627: SHIFT_RIGHT
                {
                mSHIFT_RIGHT(); 


                }
                break;
            case 81 :
                // Java.g:1:639: SHIFT_RIGHT_ASSIGN
                {
                mSHIFT_RIGHT_ASSIGN(); 


                }
                break;
            case 82 :
                // Java.g:1:658: SHORT
                {
                mSHORT(); 


                }
                break;
            case 83 :
                // Java.g:1:664: STAR
                {
                mSTAR(); 


                }
                break;
            case 84 :
                // Java.g:1:669: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 


                }
                break;
            case 85 :
                // Java.g:1:681: STATIC
                {
                mSTATIC(); 


                }
                break;
            case 86 :
                // Java.g:1:688: STRICTFP
                {
                mSTRICTFP(); 


                }
                break;
            case 87 :
                // Java.g:1:697: SUPER
                {
                mSUPER(); 


                }
                break;
            case 88 :
                // Java.g:1:703: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 89 :
                // Java.g:1:710: SYNCHRONIZED
                {
                mSYNCHRONIZED(); 


                }
                break;
            case 90 :
                // Java.g:1:723: THIS
                {
                mTHIS(); 


                }
                break;
            case 91 :
                // Java.g:1:728: THROW
                {
                mTHROW(); 


                }
                break;
            case 92 :
                // Java.g:1:734: THROWS
                {
                mTHROWS(); 


                }
                break;
            case 93 :
                // Java.g:1:741: TRANSIENT
                {
                mTRANSIENT(); 


                }
                break;
            case 94 :
                // Java.g:1:751: TRUE
                {
                mTRUE(); 


                }
                break;
            case 95 :
                // Java.g:1:756: TRY
                {
                mTRY(); 


                }
                break;
            case 96 :
                // Java.g:1:760: VOID
                {
                mVOID(); 


                }
                break;
            case 97 :
                // Java.g:1:765: VOLATILE
                {
                mVOLATILE(); 


                }
                break;
            case 98 :
                // Java.g:1:774: WHILE
                {
                mWHILE(); 


                }
                break;
            case 99 :
                // Java.g:1:780: XOR
                {
                mXOR(); 


                }
                break;
            case 100 :
                // Java.g:1:784: XOR_ASSIGN
                {
                mXOR_ASSIGN(); 


                }
                break;
            case 101 :
                // Java.g:1:795: HEX_LITERAL
                {
                mHEX_LITERAL(); 


                }
                break;
            case 102 :
                // Java.g:1:807: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); 


                }
                break;
            case 103 :
                // Java.g:1:823: OCTAL_LITERAL
                {
                mOCTAL_LITERAL(); 


                }
                break;
            case 104 :
                // Java.g:1:837: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 


                }
                break;
            case 105 :
                // Java.g:1:860: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 


                }
                break;
            case 106 :
                // Java.g:1:878: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 107 :
                // Java.g:1:893: IDENT
                {
                mIDENT(); 


                }
                break;
            case 108 :
                // Java.g:1:899: NL
                {
                mNL(); 


                }
                break;
            case 109 :
                // Java.g:1:902: WS
                {
                mWS(); 


                }
                break;
            case 110 :
                // Java.g:1:905: BLOCK_COMMENT
                {
                mBLOCK_COMMENT(); 


                }
                break;
            case 111 :
                // Java.g:1:919: JAVADOC_COMMENT
                {
                mJAVADOC_COMMENT(); 


                }
                break;
            case 112 :
                // Java.g:1:935: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA38_eotS =
        "\1\uffff\1\55\1\64\1\66\1\uffff\1\71\2\55\2\uffff\1\103\1\55\1\111"+
        "\1\114\3\55\1\132\2\uffff\1\135\1\137\1\142\1\55\1\uffff\1\145\1"+
        "\55\1\uffff\1\55\3\uffff\1\55\2\uffff\1\55\1\163\3\55\1\171\2\173"+
        "\5\uffff\2\55\5\uffff\1\u0082\2\uffff\7\55\3\uffff\1\55\1\u008d"+
        "\10\uffff\7\55\1\u0097\2\55\4\uffff\1\u009c\6\uffff\1\55\2\uffff"+
        "\14\55\2\uffff\4\55\4\uffff\1\u00b5\1\173\2\55\1\u00b9\2\uffff\12"+
        "\55\3\uffff\6\55\1\u00cb\1\uffff\2\55\1\u00d0\2\uffff\2\55\1\u00d3"+
        "\20\55\1\u00e4\3\55\1\u00e8\1\uffff\2\55\2\uffff\2\55\1\u00ed\1"+
        "\u00ee\1\55\1\u00f0\4\55\1\uffff\1\u00f5\1\u00f6\4\55\1\uffff\4"+
        "\55\1\uffff\1\u00ff\1\55\1\uffff\1\u0101\13\55\1\u010d\2\55\1\u0110"+
        "\1\uffff\1\u0111\2\55\1\uffff\3\55\1\u0117\2\uffff\1\u0118\1\uffff"+
        "\1\u0119\3\55\2\uffff\1\55\1\u011e\1\u0120\1\u0121\4\55\1\uffff"+
        "\1\55\1\uffff\5\55\1\u012c\2\55\1\u012f\2\55\1\uffff\1\u0133\1\55"+
        "\2\uffff\1\55\1\u0136\1\55\1\u0138\1\55\3\uffff\2\55\1\u013c\1\55"+
        "\1\uffff\1\55\2\uffff\1\55\1\u0140\2\55\1\u0143\3\55\1\u0147\1\u0148"+
        "\1\uffff\1\u0149\1\55\1\uffff\1\u014b\1\55\1\u014d\1\uffff\2\55"+
        "\1\uffff\1\55\1\uffff\1\u0151\1\55\1\u0153\1\uffff\1\u0154\1\u0155"+
        "\1\55\1\uffff\2\55\1\uffff\1\u0159\1\u015a\1\55\3\uffff\1\55\1\uffff"+
        "\1\55\1\uffff\2\55\1\u0160\1\uffff\1\u0161\3\uffff\3\55\2\uffff"+
        "\1\55\1\u0166\2\55\1\u0169\2\uffff\2\55\1\u016c\1\u016d\1\uffff"+
        "\1\55\1\u016f\1\uffff\1\u0170\1\u0171\2\uffff\1\55\3\uffff\1\55"+
        "\1\u0174\1\uffff";
    static final String DFA38_eofS =
        "\u0175\uffff";
    static final String DFA38_minS =
        "\1\11\1\142\1\46\1\75\1\uffff\1\75\1\157\1\141\2\uffff\1\55\1\145"+
        "\2\52\1\154\1\141\1\146\1\53\2\uffff\1\74\2\75\1\157\1\uffff\1\75"+
        "\1\141\1\uffff\1\141\3\uffff\1\145\2\uffff\1\150\1\75\1\150\1\157"+
        "\1\150\1\75\2\56\5\uffff\2\163\5\uffff\1\75\2\uffff\1\157\1\145"+
        "\1\164\1\163\2\141\1\156\3\uffff\1\146\1\44\1\uffff\1\0\6\uffff"+
        "\1\163\1\165\1\164\1\154\1\156\1\157\1\162\1\44\1\160\1\163\4\uffff"+
        "\1\75\6\uffff\1\156\2\uffff\1\164\1\167\1\154\1\143\1\151\1\142"+
        "\1\164\1\157\1\141\1\160\1\151\1\156\2\uffff\1\151\1\141\2\151\2"+
        "\uffff\1\56\1\uffff\2\56\1\164\1\145\1\75\2\uffff\1\154\1\141\2"+
        "\145\1\143\1\162\1\163\1\164\1\141\1\142\2\uffff\1\0\1\145\1\155"+
        "\1\145\1\163\2\141\1\44\1\uffff\1\154\1\164\1\44\2\uffff\1\147\1"+
        "\151\1\44\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164\1\151"+
        "\1\145\1\164\1\143\1\163\1\157\1\156\1\145\1\44\1\144\1\141\1\154"+
        "\1\56\1\uffff\2\162\2\uffff\1\145\1\153\2\44\1\150\1\44\1\163\1"+
        "\151\1\165\1\154\1\uffff\2\44\1\156\1\145\1\154\1\164\1\uffff\1"+
        "\145\1\162\1\141\1\162\1\uffff\1\44\1\166\1\uffff\1\44\2\141\1\145"+
        "\1\151\1\162\1\164\1\151\1\143\1\162\1\143\1\150\1\44\1\167\1\163"+
        "\1\44\1\uffff\1\44\1\164\1\145\1\uffff\1\141\1\164\1\141\1\44\2"+
        "\uffff\1\44\1\uffff\1\44\1\156\1\154\1\145\2\uffff\1\144\3\44\1"+
        "\155\1\164\1\156\1\146\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1"+
        "\156\1\44\1\143\1\164\1\44\1\150\1\162\1\uffff\1\44\1\151\2\uffff"+
        "\1\151\1\44\1\143\1\44\1\156\3\uffff\1\165\1\164\1\44\1\163\1\uffff"+
        "\1\171\2\uffff\1\145\1\44\1\143\1\141\1\44\2\145\1\164\2\44\1\uffff"+
        "\1\44\1\146\1\uffff\1\44\1\157\1\44\1\uffff\1\145\1\154\1\uffff"+
        "\1\164\1\uffff\1\44\1\145\1\44\1\uffff\2\44\1\156\1\uffff\1\145"+
        "\1\143\1\uffff\2\44\1\145\3\uffff\1\160\1\uffff\1\156\1\uffff\1"+
        "\156\1\145\1\44\1\uffff\1\44\3\uffff\1\164\1\157\1\145\2\uffff\1"+
        "\144\1\44\1\151\1\164\1\44\2\uffff\1\163\1\146\2\44\1\uffff\1\172"+
        "\1\44\1\uffff\2\44\2\uffff\1\145\3\uffff\1\144\1\44\1\uffff";
    static final String DFA38_maxS =
        "\1\ufaff\1\163\2\75\1\uffff\1\76\1\171\1\157\2\uffff\1\75\1\157"+
        "\1\75\1\71\1\170\1\157\1\156\1\75\2\uffff\2\75\1\174\1\157\1\uffff"+
        "\1\75\1\165\1\uffff\1\165\3\uffff\1\145\2\uffff\1\171\1\75\1\162"+
        "\1\157\1\150\1\75\1\170\1\146\5\uffff\2\163\5\uffff\1\76\2\uffff"+
        "\1\157\1\145\2\164\2\141\1\156\3\uffff\1\146\1\ufaff\1\uffff\1\uffff"+
        "\6\uffff\1\163\1\165\1\164\1\154\1\156\1\157\1\162\1\ufaff\1\160"+
        "\1\164\4\uffff\1\75\6\uffff\1\156\2\uffff\1\164\1\167\1\154\1\143"+
        "\1\157\1\142\1\164\1\157\1\162\1\160\1\151\1\156\2\uffff\1\162\1"+
        "\171\1\154\1\151\2\uffff\1\160\1\uffff\2\146\1\164\1\145\1\75\2"+
        "\uffff\1\154\1\141\2\145\1\143\1\162\1\163\1\164\1\141\1\142\2\uffff"+
        "\1\uffff\1\145\1\155\1\145\1\163\2\141\1\ufaff\1\uffff\1\157\1\164"+
        "\1\ufaff\2\uffff\1\147\1\151\1\ufaff\1\154\1\153\1\166\1\164\1\154"+
        "\1\165\1\162\1\164\1\151\1\145\1\164\1\143\1\163\1\157\1\156\1\145"+
        "\1\ufaff\1\144\1\141\1\154\1\160\1\uffff\2\162\2\uffff\1\145\1\153"+
        "\2\ufaff\1\150\1\ufaff\1\163\1\151\1\165\1\154\1\uffff\2\ufaff\1"+
        "\156\1\145\1\154\1\164\1\uffff\1\145\1\162\1\141\1\162\1\uffff\1"+
        "\ufaff\1\166\1\uffff\1\ufaff\2\141\1\145\1\151\1\162\1\164\1\151"+
        "\1\143\1\162\1\143\1\150\1\ufaff\1\167\1\163\1\ufaff\1\uffff\1\ufaff"+
        "\1\164\1\145\1\uffff\1\141\1\164\1\141\1\ufaff\2\uffff\1\ufaff\1"+
        "\uffff\1\ufaff\1\156\1\154\1\145\2\uffff\1\144\3\ufaff\1\155\1\164"+
        "\1\156\1\146\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156\1\ufaff"+
        "\1\143\1\164\1\ufaff\1\150\1\162\1\uffff\1\ufaff\1\151\2\uffff\1"+
        "\151\1\ufaff\1\143\1\ufaff\1\156\3\uffff\1\165\1\164\1\ufaff\1\163"+
        "\1\uffff\1\171\2\uffff\1\145\1\ufaff\1\143\1\141\1\ufaff\2\145\1"+
        "\164\2\ufaff\1\uffff\1\ufaff\1\146\1\uffff\1\ufaff\1\157\1\ufaff"+
        "\1\uffff\1\145\1\154\1\uffff\1\164\1\uffff\1\ufaff\1\145\1\ufaff"+
        "\1\uffff\2\ufaff\1\156\1\uffff\1\145\1\143\1\uffff\2\ufaff\1\145"+
        "\3\uffff\1\160\1\uffff\1\156\1\uffff\1\156\1\145\1\ufaff\1\uffff"+
        "\1\ufaff\3\uffff\1\164\1\157\1\145\2\uffff\1\144\1\ufaff\1\151\1"+
        "\164\1\ufaff\2\uffff\1\163\1\146\2\ufaff\1\uffff\1\172\1\ufaff\1"+
        "\uffff\2\ufaff\2\uffff\1\145\3\uffff\1\144\1\ufaff\1\uffff";
    static final String DFA38_acceptS =
        "\4\uffff\1\6\3\uffff\1\20\1\21\10\uffff\1\56\1\57\4\uffff\1\66\2"+
        "\uffff\1\75\1\uffff\1\110\1\111\1\112\1\uffff\1\114\1\115\10\uffff"+
        "\1\151\1\152\1\153\1\154\1\155\2\uffff\1\3\1\62\1\2\1\36\1\5\1\uffff"+
        "\1\45\1\46\7\uffff\1\23\1\70\1\67\2\uffff\1\26\1\uffff\1\160\1\25"+
        "\1\31\1\33\1\30\1\150\12\uffff\1\52\1\104\1\103\1\60\1\uffff\1\61"+
        "\1\76\1\63\1\64\1\101\1\100\1\uffff\1\72\1\71\14\uffff\1\124\1\123"+
        "\4\uffff\1\144\1\143\1\uffff\1\146\5\uffff\1\121\1\120\12\uffff"+
        "\1\27\1\156\10\uffff\1\47\3\uffff\1\117\1\116\30\uffff\1\147\2\uffff"+
        "\1\10\1\7\12\uffff\1\157\6\uffff\1\44\4\uffff\1\54\2\uffff\1\74"+
        "\20\uffff\1\137\3\uffff\1\145\4\uffff\1\13\1\14\1\uffff\1\16\4\uffff"+
        "\1\34\1\35\10\uffff\1\65\1\uffff\1\77\13\uffff\1\132\2\uffff\1\136"+
        "\1\140\5\uffff\1\12\1\15\1\17\4\uffff\1\40\1\uffff\1\41\1\43\12"+
        "\uffff\1\122\2\uffff\1\127\3\uffff\1\133\2\uffff\1\142\1\uffff\1"+
        "\4\3\uffff\1\32\3\uffff\1\51\2\uffff\1\73\3\uffff\1\107\1\113\1"+
        "\125\1\uffff\1\130\1\uffff\1\134\3\uffff\1\11\1\uffff\1\24\1\37"+
        "\1\42\3\uffff\1\102\1\105\5\uffff\1\1\1\22\4\uffff\1\126\2\uffff"+
        "\1\141\2\uffff\1\55\1\106\1\uffff\1\135\1\50\1\53\2\uffff\1\131";
    static final String DFA38_specialS =
        "\107\uffff\1\0\107\uffff\1\1\u00e5\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\57\1\56\1\uffff\1\57\1\56\22\uffff\1\57\1\25\1\54\1\uffff"+
            "\1\55\1\31\1\2\1\53\1\30\1\41\1\44\1\21\1\11\1\12\1\15\1\14"+
            "\1\51\11\52\1\10\1\42\1\24\1\3\1\5\1\35\1\4\32\55\1\22\1\uffff"+
            "\1\36\1\50\1\55\1\uffff\1\1\1\6\1\7\1\13\1\16\1\17\2\55\1\20"+
            "\2\55\1\27\1\55\1\32\1\55\1\34\1\55\1\40\1\43\1\45\1\55\1\46"+
            "\1\47\3\55\1\23\1\26\1\37\1\33\101\uffff\27\55\1\uffff\37\55"+
            "\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff\u0080\55"+
            "\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
            "\55",
            "\1\60\20\uffff\1\61",
            "\1\63\26\uffff\1\62",
            "\1\65",
            "",
            "\1\70\1\67",
            "\1\72\2\uffff\1\73\6\uffff\1\74",
            "\1\75\6\uffff\1\76\3\uffff\1\77\2\uffff\1\100",
            "",
            "",
            "\1\101\17\uffff\1\102",
            "\1\104\11\uffff\1\105",
            "\1\107\4\uffff\1\110\15\uffff\1\106",
            "\1\112\3\uffff\1\113\1\uffff\12\115",
            "\1\116\1\uffff\1\117\11\uffff\1\120",
            "\1\121\7\uffff\1\122\2\uffff\1\123\2\uffff\1\124",
            "\1\125\6\uffff\1\126\1\127",
            "\1\130\21\uffff\1\131",
            "",
            "",
            "\1\134\1\133",
            "\1\136",
            "\1\141\76\uffff\1\140",
            "\1\143",
            "",
            "\1\144",
            "\1\146\3\uffff\1\147\17\uffff\1\150",
            "",
            "\1\151\20\uffff\1\152\2\uffff\1\153",
            "",
            "",
            "",
            "\1\154",
            "",
            "",
            "\1\155\13\uffff\1\156\1\157\1\uffff\1\160\1\uffff\1\161",
            "\1\162",
            "\1\164\11\uffff\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\115\1\uffff\10\174\2\115\12\uffff\3\115\21\uffff\1\172\13"+
            "\uffff\3\115\21\uffff\1\172",
            "\1\115\1\uffff\12\175\12\uffff\3\115\35\uffff\3\115",
            "",
            "",
            "",
            "",
            "",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "\1\u0081\1\u0080",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "",
            "\1\u008b",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\24"+
            "\55\1\u008c\5\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08"+
            "\55\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"+
            "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
            "",
            "\52\u008e\1\u008f\uffd5\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0098",
            "\1\u0099\1\u009a",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009d",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\5\uffff\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\20\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "\1\u00ac\10\uffff\1\u00ad",
            "\1\u00ae\23\uffff\1\u00af\3\uffff\1\u00b0",
            "\1\u00b1\2\uffff\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\1\115\1\uffff\12\u00b4\7\uffff\6\u00b4\11\uffff\1\115\20\uffff"+
            "\6\u00b4\11\uffff\1\115",
            "",
            "\1\115\1\uffff\10\174\2\115\12\uffff\3\115\35\uffff\3\115",
            "\1\115\1\uffff\12\175\12\uffff\3\115\35\uffff\3\115",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "\57\u00c4\1\u008e\uffd0\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "\1\u00cc\2\uffff\1\u00cd",
            "\1\u00ce",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\4\55"+
            "\1\u00cf\25\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55"+
            "\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"+
            "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
            "",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\115\1\uffff\12\u00b4\7\uffff\6\u00b4\11\uffff\1\115\20\uffff"+
            "\6\u00b4\11\uffff\1\115",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u00ef",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0100",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u010e",
            "\1\u010f",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0112",
            "\1\u0113",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "",
            "\1\u011d",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13"+
            "\55\1\u011f\16\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08"+
            "\55\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"+
            "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u012d",
            "\1\u012e",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0130",
            "\1\u0131",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22"+
            "\55\1\u0132\7\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08"+
            "\55\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e"+
            "\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
            "\1\u0134",
            "",
            "",
            "\1\u0135",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0137",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0139",
            "",
            "",
            "",
            "\1\u013a",
            "\1\u013b",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u013d",
            "",
            "\1\u013e",
            "",
            "",
            "\1\u013f",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0141",
            "\1\u0142",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u014a",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u014c",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "\1\u014e",
            "\1\u014f",
            "",
            "\1\u0150",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0152",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0156",
            "",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u015b",
            "",
            "",
            "",
            "\1\u015c",
            "",
            "\1\u015d",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "",
            "\1\u0165",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\u0167",
            "\1\u0168",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "\1\u016e",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            "",
            "",
            "\1\u0172",
            "",
            "",
            "",
            "\1\u0173",
            "\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32"+
            "\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff"+
            "\u0150\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff"+
            "\u5200\55\u5900\uffff\u0200\55",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ABSTRACT | AND | AND_ASSIGN | ASSERT | ASSIGN | AT | BIT_SHIFT_RIGHT | BIT_SHIFT_RIGHT_ASSIGN | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | COLON | COMMA | CONTINUE | DEC | DEFAULT | DIV | DIV_ASSIGN | DO | DOT | DOTSTAR | DOUBLE | ELLIPSIS | ELSE | ENUM | EQUAL | EXTENDS | FALSE | FINAL | FINALLY | FLOAT | FOR | GREATER_OR_EQUAL | GREATER_THAN | IF | IMPLEMENTS | IMPORT | INC | INSTANCEOF | INT | INTERFACE | LBRACK | LCURLY | LESS_OR_EQUAL | LESS_THAN | LOGICAL_AND | LOGICAL_NOT | LOGICAL_OR | LONG | LPAREN | MINUS | MINUS_ASSIGN | MOD | MOD_ASSIGN | NATIVE | NEW | NOT | NOT_EQUAL | NULL | OR | OR_ASSIGN | PACKAGE | PLUS | PLUS_ASSIGN | PRIVATE | PROTECTED | PUBLIC | QUESTION | RBRACK | RCURLY | RETURN | RPAREN | SEMI | SHIFT_LEFT | SHIFT_LEFT_ASSIGN | SHIFT_RIGHT | SHIFT_RIGHT_ASSIGN | SHORT | STAR | STAR_ASSIGN | STATIC | STRICTFP | SUPER | SWITCH | SYNCHRONIZED | THIS | THROW | THROWS | TRANSIENT | TRUE | TRY | VOID | VOLATILE | WHILE | XOR | XOR_ASSIGN | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | IDENT | NL | WS | BLOCK_COMMENT | JAVADOC_COMMENT | LINE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_71 = input.LA(1);

                        s = -1;
                        if ( ((LA38_71 >= '\u0000' && LA38_71 <= ')')||(LA38_71 >= '+' && LA38_71 <= '\uFFFF')) ) {s = 142;}

                        else if ( (LA38_71=='*') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA38_143 = input.LA(1);

                        s = -1;
                        if ( (LA38_143=='/') ) {s = 142;}

                        else if ( ((LA38_143 >= '\u0000' && LA38_143 <= '.')||(LA38_143 >= '0' && LA38_143 <= '\uFFFF')) ) {s = 196;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}
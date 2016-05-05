// $ANTLR 3.5.2 Lex.g 2016-05-03 13:13:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Lex extends Lexer {
	public static final int EOF=-1;
	public static final int ALLOC=4;
	public static final int AND=5;
	public static final int ASSIGNMENT=6;
	public static final int BIGGER=7;
	public static final int BOREQUAL=8;
	public static final int CLOSEPAREN=9;
	public static final int COLUMN=10;
	public static final int COMMENT=11;
	public static final int DEVIDE=12;
	public static final int DO=13;
	public static final int ELSE=14;
	public static final int EQUAL=15;
	public static final int FALSE=16;
	public static final int FOR=17;
	public static final int IDENTIFIER=18;
	public static final int IF=19;
	public static final int INTNUM=20;
	public static final int MINUS=21;
	public static final int MULTIPLY=22;
	public static final int NOT=23;
	public static final int NOTEQUAL=24;
	public static final int OPENPAREN=25;
	public static final int PLUS=26;
	public static final int READ=27;
	public static final int REALNUM=28;
	public static final int REPEAT=29;
	public static final int SBRACKETC=30;
	public static final int SBRACKETO=31;
	public static final int SEMICOLON=32;
	public static final int SKIP=33;
	public static final int SMALLER=34;
	public static final int SOREQUAL=35;
	public static final int STRING=36;
	public static final int THEN=37;
	public static final int TRUE=38;
	public static final int UNTIL=39;
	public static final int WHILE=40;
	public static final int WRITE=41;
	public static final int WRITELN=42;
	public static final int WS=43;
	public static final int XOR=44;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Lex() {} 
	public Lex(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Lex(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Lex.g"; }

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:8:13: ( 'write' )
			// Lex.g:8:15: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "WRITELN"
	public final void mWRITELN() throws RecognitionException {
		try {
			int _type = WRITELN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:9:13: ( 'writeln' )
			// Lex.g:9:15: 'writeln'
			{
			match("writeln"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITELN"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:10:9: ( 'do' )
			// Lex.g:10:11: 'do'
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

	// $ANTLR start "UNTIL"
	public final void mUNTIL() throws RecognitionException {
		try {
			int _type = UNTIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:11:8: ( 'until' )
			// Lex.g:11:10: 'until'
			{
			match("until"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNTIL"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:12:7: ( 'else' )
			// Lex.g:12:9: 'else'
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

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:13:8: ( 'false' )
			// Lex.g:13:10: 'false'
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

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:14:7: ( 'true' )
			// Lex.g:14:9: 'true'
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

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:15:6: ( 'if' )
			// Lex.g:15:8: 'if'
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

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:16:8: ( 'read' )
			// Lex.g:16:10: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "SKIP"
	public final void mSKIP() throws RecognitionException {
		try {
			int _type = SKIP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:17:8: ( 'skip' )
			// Lex.g:17:10: 'skip'
			{
			match("skip"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SKIP"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:18:8: ( 'then' )
			// Lex.g:18:10: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:19:9: ( 'while' )
			// Lex.g:19:11: 'while'
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

	// $ANTLR start "REPEAT"
	public final void mREPEAT() throws RecognitionException {
		try {
			int _type = REPEAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:20:9: ( 'repeat' )
			// Lex.g:20:11: 'repeat'
			{
			match("repeat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REPEAT"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:21:7: ( 'for' )
			// Lex.g:21:9: 'for'
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

	// $ANTLR start "ALLOC"
	public final void mALLOC() throws RecognitionException {
		try {
			int _type = ALLOC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:22:8: ( 'alloc' )
			// Lex.g:22:10: 'alloc'
			{
			match("alloc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALLOC"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:27:14: ( ';' )
			// Lex.g:27:16: ';'
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
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "OPENPAREN"
	public final void mOPENPAREN() throws RecognitionException {
		try {
			int _type = OPENPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:28:14: ( '(' )
			// Lex.g:28:16: '('
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
	// $ANTLR end "OPENPAREN"

	// $ANTLR start "CLOSEPAREN"
	public final void mCLOSEPAREN() throws RecognitionException {
		try {
			int _type = CLOSEPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:29:14: ( ')' )
			// Lex.g:29:16: ')'
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
	// $ANTLR end "CLOSEPAREN"

	// $ANTLR start "SBRACKETO"
	public final void mSBRACKETO() throws RecognitionException {
		try {
			int _type = SBRACKETO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:30:12: ( '[' )
			// Lex.g:30:14: '['
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
	// $ANTLR end "SBRACKETO"

	// $ANTLR start "SBRACKETC"
	public final void mSBRACKETC() throws RecognitionException {
		try {
			int _type = SBRACKETC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:31:12: ( ']' )
			// Lex.g:31:14: ']'
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
	// $ANTLR end "SBRACKETC"

	// $ANTLR start "ASSIGNMENT"
	public final void mASSIGNMENT() throws RecognitionException {
		try {
			int _type = ASSIGNMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:32:14: ( ':=' )
			// Lex.g:32:16: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGNMENT"

	// $ANTLR start "MULTIPLY"
	public final void mMULTIPLY() throws RecognitionException {
		try {
			int _type = MULTIPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:33:11: ( '*' )
			// Lex.g:33:13: '*'
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
	// $ANTLR end "MULTIPLY"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:34:8: ( '+' )
			// Lex.g:34:10: '+'
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

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:35:9: ( '-' )
			// Lex.g:35:11: '-'
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

	// $ANTLR start "DEVIDE"
	public final void mDEVIDE() throws RecognitionException {
		try {
			int _type = DEVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:36:10: ( '/' )
			// Lex.g:36:12: '/'
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
	// $ANTLR end "DEVIDE"

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:37:8: ( '^' )
			// Lex.g:37:10: '^'
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

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:38:9: ( '=' )
			// Lex.g:38:11: '='
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
	// $ANTLR end "EQUAL"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:39:11: ( '!=' )
			// Lex.g:39:13: '!='
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
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "SOREQUAL"
	public final void mSOREQUAL() throws RecognitionException {
		try {
			int _type = SOREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:40:11: ( '<=' )
			// Lex.g:40:13: '<='
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
	// $ANTLR end "SOREQUAL"

	// $ANTLR start "BOREQUAL"
	public final void mBOREQUAL() throws RecognitionException {
		try {
			int _type = BOREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:41:11: ( '>=' )
			// Lex.g:41:13: '>='
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
	// $ANTLR end "BOREQUAL"

	// $ANTLR start "SMALLER"
	public final void mSMALLER() throws RecognitionException {
		try {
			int _type = SMALLER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:42:11: ( '<' )
			// Lex.g:42:13: '<'
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
	// $ANTLR end "SMALLER"

	// $ANTLR start "BIGGER"
	public final void mBIGGER() throws RecognitionException {
		try {
			int _type = BIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:43:11: ( '>' )
			// Lex.g:43:13: '>'
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
	// $ANTLR end "BIGGER"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:44:8: ( '!' )
			// Lex.g:44:10: '!'
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
	// $ANTLR end "NOT"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:45:8: ( '&' )
			// Lex.g:45:10: '&'
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

	// $ANTLR start "COLUMN"
	public final void mCOLUMN() throws RecognitionException {
		try {
			int _type = COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:46:11: ( ':' )
			// Lex.g:46:13: ':'
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
	// $ANTLR end "COLUMN"

	// $ANTLR start "INTNUM"
	public final void mINTNUM() throws RecognitionException {
		try {
			int _type = INTNUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:48:14: ( ( '0' .. '9' )+ )
			// Lex.g:48:16: ( '0' .. '9' )+
			{
			// Lex.g:48:16: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Lex.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTNUM"

	// $ANTLR start "REALNUM"
	public final void mREALNUM() throws RecognitionException {
		try {
			int _type = REALNUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:50:11: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// Lex.g:50:13: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// Lex.g:50:13: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Lex.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match('.'); 
			// Lex.g:50:29: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Lex.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REALNUM"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:52:14: ( '\\'' ( '\\'' '\\'' |~ '\\'' )* '\\'' )
			// Lex.g:52:16: '\\'' ( '\\'' '\\'' |~ '\\'' )* '\\''
			{
			match('\''); 
			// Lex.g:52:21: ( '\\'' '\\'' |~ '\\'' )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\'') ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1=='\'') ) {
						alt4=1;
					}

				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= '\uFFFF')) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// Lex.g:52:22: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					}
					break;
				case 2 :
					// Lex.g:52:34: ~ '\\''
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
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
					break loop4;
				}
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
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:54:14: ( '{' (~ '}' )* '}' )
			// Lex.g:54:16: '{' (~ '}' )* '}'
			{
			match('{'); 
			// Lex.g:54:20: (~ '}' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '|')||(LA5_0 >= '~' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Lex.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '|')||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
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
					break loop5;
				}
			}

			match('}'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:56:14: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// Lex.g:56:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// Lex.g:56:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Lex.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:64:14: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )
			int alt7=8;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
				int LA7_1 = input.LA(2);
				if ( ((LA7_1 >= '0' && LA7_1 <= '9')||(LA7_1 >= 'A' && LA7_1 <= 'Z')||(LA7_1 >= 'a' && LA7_1 <= 'z')) ) {
					int LA7_2 = input.LA(3);
					if ( ((LA7_2 >= '0' && LA7_2 <= '9')||(LA7_2 >= 'A' && LA7_2 <= 'Z')||(LA7_2 >= 'a' && LA7_2 <= 'z')) ) {
						int LA7_4 = input.LA(4);
						if ( ((LA7_4 >= '0' && LA7_4 <= '9')||(LA7_4 >= 'A' && LA7_4 <= 'Z')||(LA7_4 >= 'a' && LA7_4 <= 'z')) ) {
							int LA7_6 = input.LA(5);
							if ( ((LA7_6 >= '0' && LA7_6 <= '9')||(LA7_6 >= 'A' && LA7_6 <= 'Z')||(LA7_6 >= 'a' && LA7_6 <= 'z')) ) {
								int LA7_8 = input.LA(6);
								if ( ((LA7_8 >= '0' && LA7_8 <= '9')||(LA7_8 >= 'A' && LA7_8 <= 'Z')||(LA7_8 >= 'a' && LA7_8 <= 'z')) ) {
									int LA7_10 = input.LA(7);
									if ( ((LA7_10 >= '0' && LA7_10 <= '9')||(LA7_10 >= 'A' && LA7_10 <= 'Z')||(LA7_10 >= 'a' && LA7_10 <= 'z')) ) {
										int LA7_12 = input.LA(8);
										if ( ((LA7_12 >= '0' && LA7_12 <= '9')||(LA7_12 >= 'A' && LA7_12 <= 'Z')||(LA7_12 >= 'a' && LA7_12 <= 'z')) ) {
											alt7=8;
										}

										else {
											alt7=7;
										}

									}

									else {
										alt7=6;
									}

								}

								else {
									alt7=5;
								}

							}

							else {
								alt7=4;
							}

						}

						else {
							alt7=3;
						}

					}

					else {
						alt7=2;
					}

				}

				else {
					alt7=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Lex.g:64:16: ( 'a' .. 'z' | 'A' .. 'Z' )
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					// Lex.g:65:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					// Lex.g:66:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 4 :
					// Lex.g:67:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 5 :
					// Lex.g:68:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 6 :
					// Lex.g:69:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 7 :
					// Lex.g:70:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 8 :
					// Lex.g:71:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	@Override
	public void mTokens() throws RecognitionException {
		// Lex.g:1:8: ( WRITE | WRITELN | DO | UNTIL | ELSE | FALSE | TRUE | IF | READ | SKIP | THEN | WHILE | REPEAT | FOR | ALLOC | SEMICOLON | OPENPAREN | CLOSEPAREN | SBRACKETO | SBRACKETC | ASSIGNMENT | MULTIPLY | PLUS | MINUS | DEVIDE | XOR | EQUAL | NOTEQUAL | SOREQUAL | BOREQUAL | SMALLER | BIGGER | NOT | AND | COLUMN | INTNUM | REALNUM | STRING | COMMENT | WS | IDENTIFIER )
		int alt8=41;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// Lex.g:1:10: WRITE
				{
				mWRITE(); 

				}
				break;
			case 2 :
				// Lex.g:1:16: WRITELN
				{
				mWRITELN(); 

				}
				break;
			case 3 :
				// Lex.g:1:24: DO
				{
				mDO(); 

				}
				break;
			case 4 :
				// Lex.g:1:27: UNTIL
				{
				mUNTIL(); 

				}
				break;
			case 5 :
				// Lex.g:1:33: ELSE
				{
				mELSE(); 

				}
				break;
			case 6 :
				// Lex.g:1:38: FALSE
				{
				mFALSE(); 

				}
				break;
			case 7 :
				// Lex.g:1:44: TRUE
				{
				mTRUE(); 

				}
				break;
			case 8 :
				// Lex.g:1:49: IF
				{
				mIF(); 

				}
				break;
			case 9 :
				// Lex.g:1:52: READ
				{
				mREAD(); 

				}
				break;
			case 10 :
				// Lex.g:1:57: SKIP
				{
				mSKIP(); 

				}
				break;
			case 11 :
				// Lex.g:1:62: THEN
				{
				mTHEN(); 

				}
				break;
			case 12 :
				// Lex.g:1:67: WHILE
				{
				mWHILE(); 

				}
				break;
			case 13 :
				// Lex.g:1:73: REPEAT
				{
				mREPEAT(); 

				}
				break;
			case 14 :
				// Lex.g:1:80: FOR
				{
				mFOR(); 

				}
				break;
			case 15 :
				// Lex.g:1:84: ALLOC
				{
				mALLOC(); 

				}
				break;
			case 16 :
				// Lex.g:1:90: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 17 :
				// Lex.g:1:100: OPENPAREN
				{
				mOPENPAREN(); 

				}
				break;
			case 18 :
				// Lex.g:1:110: CLOSEPAREN
				{
				mCLOSEPAREN(); 

				}
				break;
			case 19 :
				// Lex.g:1:121: SBRACKETO
				{
				mSBRACKETO(); 

				}
				break;
			case 20 :
				// Lex.g:1:131: SBRACKETC
				{
				mSBRACKETC(); 

				}
				break;
			case 21 :
				// Lex.g:1:141: ASSIGNMENT
				{
				mASSIGNMENT(); 

				}
				break;
			case 22 :
				// Lex.g:1:152: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 23 :
				// Lex.g:1:161: PLUS
				{
				mPLUS(); 

				}
				break;
			case 24 :
				// Lex.g:1:166: MINUS
				{
				mMINUS(); 

				}
				break;
			case 25 :
				// Lex.g:1:172: DEVIDE
				{
				mDEVIDE(); 

				}
				break;
			case 26 :
				// Lex.g:1:179: XOR
				{
				mXOR(); 

				}
				break;
			case 27 :
				// Lex.g:1:183: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 28 :
				// Lex.g:1:189: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 29 :
				// Lex.g:1:198: SOREQUAL
				{
				mSOREQUAL(); 

				}
				break;
			case 30 :
				// Lex.g:1:207: BOREQUAL
				{
				mBOREQUAL(); 

				}
				break;
			case 31 :
				// Lex.g:1:216: SMALLER
				{
				mSMALLER(); 

				}
				break;
			case 32 :
				// Lex.g:1:224: BIGGER
				{
				mBIGGER(); 

				}
				break;
			case 33 :
				// Lex.g:1:231: NOT
				{
				mNOT(); 

				}
				break;
			case 34 :
				// Lex.g:1:235: AND
				{
				mAND(); 

				}
				break;
			case 35 :
				// Lex.g:1:239: COLUMN
				{
				mCOLUMN(); 

				}
				break;
			case 36 :
				// Lex.g:1:246: INTNUM
				{
				mINTNUM(); 

				}
				break;
			case 37 :
				// Lex.g:1:253: REALNUM
				{
				mREALNUM(); 

				}
				break;
			case 38 :
				// Lex.g:1:261: STRING
				{
				mSTRING(); 

				}
				break;
			case 39 :
				// Lex.g:1:268: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 40 :
				// Lex.g:1:276: WS
				{
				mWS(); 

				}
				break;
			case 41 :
				// Lex.g:1:279: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\1\uffff\12\37\5\uffff\1\56\6\uffff\1\60\1\62\1\64\1\uffff\1\65\4\uffff"+
		"\2\37\1\71\6\37\1\100\3\37\12\uffff\2\37\1\uffff\3\37\1\112\2\37\1\uffff"+
		"\7\37\1\124\1\37\1\uffff\1\126\1\127\1\130\1\37\1\132\1\37\1\135\1\136"+
		"\1\137\1\uffff\1\140\3\uffff\1\37\1\uffff\1\142\1\37\4\uffff\1\144\1\uffff"+
		"\1\145\2\uffff";
	static final String DFA8_eofS =
		"\146\uffff";
	static final String DFA8_minS =
		"\1\11\1\150\1\157\1\156\1\154\1\141\1\150\1\146\1\145\1\153\1\154\5\uffff"+
		"\1\75\6\uffff\3\75\1\uffff\1\56\4\uffff\2\151\1\60\1\164\1\163\1\154\1"+
		"\162\1\165\1\145\1\60\1\141\1\151\1\154\12\uffff\1\164\1\154\1\uffff\1"+
		"\151\1\145\1\163\1\60\1\145\1\156\1\uffff\1\144\1\145\1\160\1\157\2\145"+
		"\1\154\1\60\1\145\1\uffff\3\60\1\141\1\60\1\143\3\60\1\uffff\1\60\3\uffff"+
		"\1\164\1\uffff\1\60\1\156\4\uffff\1\60\1\uffff\1\60\2\uffff";
	static final String DFA8_maxS =
		"\1\173\1\162\1\157\1\156\1\154\1\157\1\162\1\146\1\145\1\153\1\154\5\uffff"+
		"\1\75\6\uffff\3\75\1\uffff\1\71\4\uffff\2\151\1\172\1\164\1\163\1\154"+
		"\1\162\1\165\1\145\1\172\1\160\1\151\1\154\12\uffff\1\164\1\154\1\uffff"+
		"\1\151\1\145\1\163\1\172\1\145\1\156\1\uffff\1\144\1\145\1\160\1\157\2"+
		"\145\1\154\1\172\1\145\1\uffff\3\172\1\141\1\172\1\143\3\172\1\uffff\1"+
		"\172\3\uffff\1\164\1\uffff\1\172\1\156\4\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA8_acceptS =
		"\13\uffff\1\20\1\21\1\22\1\23\1\24\1\uffff\1\26\1\27\1\30\1\31\1\32\1"+
		"\33\3\uffff\1\42\1\uffff\1\46\1\47\1\50\1\51\15\uffff\1\25\1\43\1\34\1"+
		"\41\1\35\1\37\1\36\1\40\1\44\1\45\2\uffff\1\3\6\uffff\1\10\11\uffff\1"+
		"\16\11\uffff\1\5\1\uffff\1\7\1\13\1\11\1\uffff\1\12\2\uffff\1\1\1\14\1"+
		"\4\1\6\1\uffff\1\17\1\uffff\1\15\1\2";
	static final String DFA8_specialS =
		"\146\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\36\2\uffff\1\36\22\uffff\1\36\1\27\4\uffff\1\32\1\34\1\14\1\15\1\21"+
			"\1\22\1\uffff\1\23\1\uffff\1\24\12\33\1\20\1\13\1\30\1\26\1\31\2\uffff"+
			"\32\37\1\16\1\uffff\1\17\1\25\2\uffff\1\12\2\37\1\2\1\4\1\5\2\37\1\7"+
			"\10\37\1\10\1\11\1\6\1\3\1\37\1\1\3\37\1\35",
			"\1\41\11\uffff\1\40",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45\15\uffff\1\46",
			"\1\50\11\uffff\1\47",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"",
			"",
			"",
			"",
			"",
			"\1\55",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\57",
			"\1\61",
			"\1\63",
			"",
			"\1\66\1\uffff\12\33",
			"",
			"",
			"",
			"",
			"\1\67",
			"\1\70",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\101\16\uffff\1\102",
			"\1\103",
			"\1\104",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\105",
			"\1\106",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\113",
			"\1\114",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\125",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\131",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\133",
			"\12\37\7\uffff\32\37\6\uffff\13\37\1\134\16\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"",
			"",
			"\1\141",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"\1\143",
			"",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\6\uffff\32\37",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WRITE | WRITELN | DO | UNTIL | ELSE | FALSE | TRUE | IF | READ | SKIP | THEN | WHILE | REPEAT | FOR | ALLOC | SEMICOLON | OPENPAREN | CLOSEPAREN | SBRACKETO | SBRACKETC | ASSIGNMENT | MULTIPLY | PLUS | MINUS | DEVIDE | XOR | EQUAL | NOTEQUAL | SOREQUAL | BOREQUAL | SMALLER | BIGGER | NOT | AND | COLUMN | INTNUM | REALNUM | STRING | COMMENT | WS | IDENTIFIER );";
		}
	}

}

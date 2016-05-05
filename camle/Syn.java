// $ANTLR 3.5.2 Syn.g 2016-05-03 13:13:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class Syn extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALLOC", "AND", "ASSIGNMENT", 
		"BIGGER", "BOREQUAL", "CLOSEPAREN", "COLUMN", "COMMENT", "DEVIDE", "DO", 
		"ELSE", "EQUAL", "FALSE", "FOR", "IDENTIFIER", "IF", "INTNUM", "MINUS", 
		"MULTIPLY", "NOT", "NOTEQUAL", "OPENPAREN", "PLUS", "READ", "REALNUM", 
		"REPEAT", "SBRACKETC", "SBRACKETO", "SEMICOLON", "SKIP", "SMALLER", "SOREQUAL", 
		"STRING", "THEN", "TRUE", "UNTIL", "WHILE", "WRITE", "WRITELN", "WS", 
		"XOR"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Syn(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Syn(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return Syn.tokenNames; }
	@Override public String getGrammarFileName() { return "Syn.g"; }


	  private String cleanString(String s){
	    String tmp;
	    tmp = s.replaceAll("^'", "");
	    s = tmp.replaceAll("'$", "");
	    tmp = s.replaceAll("''", "'");
	    return tmp;
	  }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Syn.g:22:1: program : statements ;
	public final Syn.program_return program() throws RecognitionException {
		Syn.program_return retval = new Syn.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope statements1 =null;


		try {
			// Syn.g:22:9: ( statements )
			// Syn.g:23:5: statements
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statements_in_program54);
			statements1=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statements1.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// Syn.g:26:1: statements : statement ( SEMICOLON ^ statement )* ;
	public final Syn.statements_return statements() throws RecognitionException {
		Syn.statements_return retval = new Syn.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON3=null;
		ParserRuleReturnScope statement2 =null;
		ParserRuleReturnScope statement4 =null;

		Object SEMICOLON3_tree=null;

		try {
			// Syn.g:26:12: ( statement ( SEMICOLON ^ statement )* )
			// Syn.g:27:5: statement ( SEMICOLON ^ statement )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements67);
			statement2=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());

			// Syn.g:27:15: ( SEMICOLON ^ statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==SEMICOLON) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Syn.g:27:17: SEMICOLON ^ statement
					{
					SEMICOLON3=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements71); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON3_tree = (Object)adaptor.create(SEMICOLON3);
					root_0 = (Object)adaptor.becomeRoot(SEMICOLON3_tree, root_0);
					}

					pushFollow(FOLLOW_statement_in_statements74);
					statement4=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement4.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Syn.g:30:1: statement : ( WRITE ^ OPENPAREN ! ( string | exp | boolexp ) CLOSEPAREN !| WRITELN | IDENTIFIER ASSIGNMENT ^ exp | SKIP | IF ^ boolexp THEN ! statement ELSE ! statement | WHILE ^ boolexp DO ! statement | REPEAT ^ statement UNTIL ! boolexp | FOR ^ OPENPAREN ! statement boolexp statement CLOSEPAREN ! DO ! statement | READ ^ OPENPAREN ! IDENTIFIER CLOSEPAREN !| OPENPAREN ! statements CLOSEPAREN !| ALLOC ^ IDENTIFIER SBRACKETO ! INTNUM SBRACKETC !);
	public final Syn.statement_return statement() throws RecognitionException {
		Syn.statement_return retval = new Syn.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WRITE5=null;
		Token OPENPAREN6=null;
		Token CLOSEPAREN10=null;
		Token WRITELN11=null;
		Token IDENTIFIER12=null;
		Token ASSIGNMENT13=null;
		Token SKIP15=null;
		Token IF16=null;
		Token THEN18=null;
		Token ELSE20=null;
		Token WHILE22=null;
		Token DO24=null;
		Token REPEAT26=null;
		Token UNTIL28=null;
		Token FOR30=null;
		Token OPENPAREN31=null;
		Token CLOSEPAREN35=null;
		Token DO36=null;
		Token READ38=null;
		Token OPENPAREN39=null;
		Token IDENTIFIER40=null;
		Token CLOSEPAREN41=null;
		Token OPENPAREN42=null;
		Token CLOSEPAREN44=null;
		Token ALLOC45=null;
		Token IDENTIFIER46=null;
		Token SBRACKETO47=null;
		Token INTNUM48=null;
		Token SBRACKETC49=null;
		ParserRuleReturnScope string7 =null;
		ParserRuleReturnScope exp8 =null;
		ParserRuleReturnScope boolexp9 =null;
		ParserRuleReturnScope exp14 =null;
		ParserRuleReturnScope boolexp17 =null;
		ParserRuleReturnScope statement19 =null;
		ParserRuleReturnScope statement21 =null;
		ParserRuleReturnScope boolexp23 =null;
		ParserRuleReturnScope statement25 =null;
		ParserRuleReturnScope statement27 =null;
		ParserRuleReturnScope boolexp29 =null;
		ParserRuleReturnScope statement32 =null;
		ParserRuleReturnScope boolexp33 =null;
		ParserRuleReturnScope statement34 =null;
		ParserRuleReturnScope statement37 =null;
		ParserRuleReturnScope statements43 =null;

		Object WRITE5_tree=null;
		Object OPENPAREN6_tree=null;
		Object CLOSEPAREN10_tree=null;
		Object WRITELN11_tree=null;
		Object IDENTIFIER12_tree=null;
		Object ASSIGNMENT13_tree=null;
		Object SKIP15_tree=null;
		Object IF16_tree=null;
		Object THEN18_tree=null;
		Object ELSE20_tree=null;
		Object WHILE22_tree=null;
		Object DO24_tree=null;
		Object REPEAT26_tree=null;
		Object UNTIL28_tree=null;
		Object FOR30_tree=null;
		Object OPENPAREN31_tree=null;
		Object CLOSEPAREN35_tree=null;
		Object DO36_tree=null;
		Object READ38_tree=null;
		Object OPENPAREN39_tree=null;
		Object IDENTIFIER40_tree=null;
		Object CLOSEPAREN41_tree=null;
		Object OPENPAREN42_tree=null;
		Object CLOSEPAREN44_tree=null;
		Object ALLOC45_tree=null;
		Object IDENTIFIER46_tree=null;
		Object SBRACKETO47_tree=null;
		Object INTNUM48_tree=null;
		Object SBRACKETC49_tree=null;

		try {
			// Syn.g:30:11: ( WRITE ^ OPENPAREN ! ( string | exp | boolexp ) CLOSEPAREN !| WRITELN | IDENTIFIER ASSIGNMENT ^ exp | SKIP | IF ^ boolexp THEN ! statement ELSE ! statement | WHILE ^ boolexp DO ! statement | REPEAT ^ statement UNTIL ! boolexp | FOR ^ OPENPAREN ! statement boolexp statement CLOSEPAREN ! DO ! statement | READ ^ OPENPAREN ! IDENTIFIER CLOSEPAREN !| OPENPAREN ! statements CLOSEPAREN !| ALLOC ^ IDENTIFIER SBRACKETO ! INTNUM SBRACKETC !)
			int alt3=11;
			switch ( input.LA(1) ) {
			case WRITE:
				{
				alt3=1;
				}
				break;
			case WRITELN:
				{
				alt3=2;
				}
				break;
			case IDENTIFIER:
				{
				alt3=3;
				}
				break;
			case SKIP:
				{
				alt3=4;
				}
				break;
			case IF:
				{
				alt3=5;
				}
				break;
			case WHILE:
				{
				alt3=6;
				}
				break;
			case REPEAT:
				{
				alt3=7;
				}
				break;
			case FOR:
				{
				alt3=8;
				}
				break;
			case READ:
				{
				alt3=9;
				}
				break;
			case OPENPAREN:
				{
				alt3=10;
				}
				break;
			case ALLOC:
				{
				alt3=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// Syn.g:31:5: WRITE ^ OPENPAREN ! ( string | exp | boolexp ) CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					WRITE5=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement90); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WRITE5_tree = (Object)adaptor.create(WRITE5);
					root_0 = (Object)adaptor.becomeRoot(WRITE5_tree, root_0);
					}

					OPENPAREN6=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement93); if (state.failed) return retval;
					// Syn.g:31:23: ( string | exp | boolexp )
					int alt2=3;
					switch ( input.LA(1) ) {
					case STRING:
						{
						alt2=1;
						}
						break;
					case IDENTIFIER:
						{
						int LA2_2 = input.LA(2);
						if ( (synpred3_Syn()) ) {
							alt2=2;
						}
						else if ( (true) ) {
							alt2=3;
						}

						}
						break;
					case INTNUM:
						{
						int LA2_3 = input.LA(2);
						if ( (synpred3_Syn()) ) {
							alt2=2;
						}
						else if ( (true) ) {
							alt2=3;
						}

						}
						break;
					case REALNUM:
						{
						int LA2_4 = input.LA(2);
						if ( (synpred3_Syn()) ) {
							alt2=2;
						}
						else if ( (true) ) {
							alt2=3;
						}

						}
						break;
					case OPENPAREN:
						{
						int LA2_5 = input.LA(2);
						if ( (synpred3_Syn()) ) {
							alt2=2;
						}
						else if ( (true) ) {
							alt2=3;
						}

						}
						break;
					case FALSE:
					case NOT:
					case TRUE:
						{
						alt2=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// Syn.g:31:25: string
							{
							pushFollow(FOLLOW_string_in_statement98);
							string7=string();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, string7.getTree());

							}
							break;
						case 2 :
							// Syn.g:31:34: exp
							{
							pushFollow(FOLLOW_exp_in_statement102);
							exp8=exp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exp8.getTree());

							}
							break;
						case 3 :
							// Syn.g:31:40: boolexp
							{
							pushFollow(FOLLOW_boolexp_in_statement106);
							boolexp9=boolexp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp9.getTree());

							}
							break;

					}

					CLOSEPAREN10=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement111); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Syn.g:32:5: WRITELN
					{
					root_0 = (Object)adaptor.nil();


					WRITELN11=(Token)match(input,WRITELN,FOLLOW_WRITELN_in_statement118); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WRITELN11_tree = (Object)adaptor.create(WRITELN11);
					adaptor.addChild(root_0, WRITELN11_tree);
					}

					}
					break;
				case 3 :
					// Syn.g:33:5: IDENTIFIER ASSIGNMENT ^ exp
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement124); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER12_tree = (Object)adaptor.create(IDENTIFIER12);
					adaptor.addChild(root_0, IDENTIFIER12_tree);
					}

					ASSIGNMENT13=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_statement126); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGNMENT13_tree = (Object)adaptor.create(ASSIGNMENT13);
					root_0 = (Object)adaptor.becomeRoot(ASSIGNMENT13_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_statement129);
					exp14=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp14.getTree());

					}
					break;
				case 4 :
					// Syn.g:34:5: SKIP
					{
					root_0 = (Object)adaptor.nil();


					SKIP15=(Token)match(input,SKIP,FOLLOW_SKIP_in_statement135); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SKIP15_tree = (Object)adaptor.create(SKIP15);
					adaptor.addChild(root_0, SKIP15_tree);
					}

					}
					break;
				case 5 :
					// Syn.g:35:5: IF ^ boolexp THEN ! statement ELSE ! statement
					{
					root_0 = (Object)adaptor.nil();


					IF16=(Token)match(input,IF,FOLLOW_IF_in_statement141); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IF16_tree = (Object)adaptor.create(IF16);
					root_0 = (Object)adaptor.becomeRoot(IF16_tree, root_0);
					}

					pushFollow(FOLLOW_boolexp_in_statement144);
					boolexp17=boolexp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp17.getTree());

					THEN18=(Token)match(input,THEN,FOLLOW_THEN_in_statement150); if (state.failed) return retval;
					pushFollow(FOLLOW_statement_in_statement153);
					statement19=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement19.getTree());

					ELSE20=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement159); if (state.failed) return retval;
					pushFollow(FOLLOW_statement_in_statement162);
					statement21=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement21.getTree());

					}
					break;
				case 6 :
					// Syn.g:38:5: WHILE ^ boolexp DO ! statement
					{
					root_0 = (Object)adaptor.nil();


					WHILE22=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement168); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WHILE22_tree = (Object)adaptor.create(WHILE22);
					root_0 = (Object)adaptor.becomeRoot(WHILE22_tree, root_0);
					}

					pushFollow(FOLLOW_boolexp_in_statement171);
					boolexp23=boolexp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp23.getTree());

					DO24=(Token)match(input,DO,FOLLOW_DO_in_statement177); if (state.failed) return retval;
					pushFollow(FOLLOW_statement_in_statement180);
					statement25=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement25.getTree());

					}
					break;
				case 7 :
					// Syn.g:40:5: REPEAT ^ statement UNTIL ! boolexp
					{
					root_0 = (Object)adaptor.nil();


					REPEAT26=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_statement186); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					REPEAT26_tree = (Object)adaptor.create(REPEAT26);
					root_0 = (Object)adaptor.becomeRoot(REPEAT26_tree, root_0);
					}

					pushFollow(FOLLOW_statement_in_statement189);
					statement27=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement27.getTree());

					UNTIL28=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_statement195); if (state.failed) return retval;
					pushFollow(FOLLOW_boolexp_in_statement198);
					boolexp29=boolexp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp29.getTree());

					}
					break;
				case 8 :
					// Syn.g:42:5: FOR ^ OPENPAREN ! statement boolexp statement CLOSEPAREN ! DO ! statement
					{
					root_0 = (Object)adaptor.nil();


					FOR30=(Token)match(input,FOR,FOLLOW_FOR_in_statement204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FOR30_tree = (Object)adaptor.create(FOR30);
					root_0 = (Object)adaptor.becomeRoot(FOR30_tree, root_0);
					}

					OPENPAREN31=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement207); if (state.failed) return retval;
					pushFollow(FOLLOW_statement_in_statement210);
					statement32=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement32.getTree());

					pushFollow(FOLLOW_boolexp_in_statement212);
					boolexp33=boolexp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp33.getTree());

					pushFollow(FOLLOW_statement_in_statement214);
					statement34=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement34.getTree());

					CLOSEPAREN35=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement216); if (state.failed) return retval;
					DO36=(Token)match(input,DO,FOLLOW_DO_in_statement223); if (state.failed) return retval;
					pushFollow(FOLLOW_statement_in_statement226);
					statement37=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement37.getTree());

					}
					break;
				case 9 :
					// Syn.g:44:5: READ ^ OPENPAREN ! IDENTIFIER CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					READ38=(Token)match(input,READ,FOLLOW_READ_in_statement232); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					READ38_tree = (Object)adaptor.create(READ38);
					root_0 = (Object)adaptor.becomeRoot(READ38_tree, root_0);
					}

					OPENPAREN39=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement235); if (state.failed) return retval;
					IDENTIFIER40=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement239); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER40_tree = (Object)adaptor.create(IDENTIFIER40);
					adaptor.addChild(root_0, IDENTIFIER40_tree);
					}

					CLOSEPAREN41=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement242); if (state.failed) return retval;
					}
					break;
				case 10 :
					// Syn.g:45:5: OPENPAREN ! statements CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					OPENPAREN42=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement249); if (state.failed) return retval;
					pushFollow(FOLLOW_statements_in_statement253);
					statements43=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements43.getTree());

					CLOSEPAREN44=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement256); if (state.failed) return retval;
					}
					break;
				case 11 :
					// Syn.g:46:5: ALLOC ^ IDENTIFIER SBRACKETO ! INTNUM SBRACKETC !
					{
					root_0 = (Object)adaptor.nil();


					ALLOC45=(Token)match(input,ALLOC,FOLLOW_ALLOC_in_statement263); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ALLOC45_tree = (Object)adaptor.create(ALLOC45);
					root_0 = (Object)adaptor.becomeRoot(ALLOC45_tree, root_0);
					}

					IDENTIFIER46=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER46_tree = (Object)adaptor.create(IDENTIFIER46);
					adaptor.addChild(root_0, IDENTIFIER46_tree);
					}

					SBRACKETO47=(Token)match(input,SBRACKETO,FOLLOW_SBRACKETO_in_statement268); if (state.failed) return retval;
					INTNUM48=(Token)match(input,INTNUM,FOLLOW_INTNUM_in_statement271); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTNUM48_tree = (Object)adaptor.create(INTNUM48);
					adaptor.addChild(root_0, INTNUM48_tree);
					}

					SBRACKETC49=(Token)match(input,SBRACKETC,FOLLOW_SBRACKETC_in_statement273); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class boolexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolexp"
	// Syn.g:50:1: boolexp : boolterm ( AND ^ boolterm )* ;
	public final Syn.boolexp_return boolexp() throws RecognitionException {
		Syn.boolexp_return retval = new Syn.boolexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND51=null;
		ParserRuleReturnScope boolterm50 =null;
		ParserRuleReturnScope boolterm52 =null;

		Object AND51_tree=null;

		try {
			// Syn.g:50:8: ( boolterm ( AND ^ boolterm )* )
			// Syn.g:51:3: boolterm ( AND ^ boolterm )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolterm_in_boolexp285);
			boolterm50=boolterm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolterm50.getTree());

			// Syn.g:51:12: ( AND ^ boolterm )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==AND) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Syn.g:51:13: AND ^ boolterm
					{
					AND51=(Token)match(input,AND,FOLLOW_AND_in_boolexp288); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND51_tree = (Object)adaptor.create(AND51);
					root_0 = (Object)adaptor.becomeRoot(AND51_tree, root_0);
					}

					pushFollow(FOLLOW_boolterm_in_boolexp291);
					boolterm52=boolterm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolterm52.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolexp"


	public static class boolterm_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolterm"
	// Syn.g:54:1: boolterm : ( NOT ^ bool | bool );
	public final Syn.boolterm_return boolterm() throws RecognitionException {
		Syn.boolterm_return retval = new Syn.boolterm_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT53=null;
		ParserRuleReturnScope bool54 =null;
		ParserRuleReturnScope bool55 =null;

		Object NOT53_tree=null;

		try {
			// Syn.g:54:9: ( NOT ^ bool | bool )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==NOT) ) {
				alt5=1;
			}
			else if ( (LA5_0==FALSE||LA5_0==IDENTIFIER||LA5_0==INTNUM||LA5_0==OPENPAREN||LA5_0==REALNUM||LA5_0==TRUE) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Syn.g:55:4: NOT ^ bool
					{
					root_0 = (Object)adaptor.nil();


					NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_boolterm304); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT53_tree = (Object)adaptor.create(NOT53);
					root_0 = (Object)adaptor.becomeRoot(NOT53_tree, root_0);
					}

					pushFollow(FOLLOW_bool_in_boolterm307);
					bool54=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool54.getTree());

					}
					break;
				case 2 :
					// Syn.g:56:4: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_boolterm312);
					bool55=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool55.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolterm"


	public static class bool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// Syn.g:59:1: bool : ( TRUE | FALSE | exp EQUAL ^ exp | exp SOREQUAL ^ exp | exp BOREQUAL ^ exp | exp SMALLER ^ exp | exp BIGGER ^ exp | exp NOTEQUAL ^ exp | OPENPAREN ! boolexp CLOSEPAREN !);
	public final Syn.bool_return bool() throws RecognitionException {
		Syn.bool_return retval = new Syn.bool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TRUE56=null;
		Token FALSE57=null;
		Token EQUAL59=null;
		Token SOREQUAL62=null;
		Token BOREQUAL65=null;
		Token SMALLER68=null;
		Token BIGGER71=null;
		Token NOTEQUAL74=null;
		Token OPENPAREN76=null;
		Token CLOSEPAREN78=null;
		ParserRuleReturnScope exp58 =null;
		ParserRuleReturnScope exp60 =null;
		ParserRuleReturnScope exp61 =null;
		ParserRuleReturnScope exp63 =null;
		ParserRuleReturnScope exp64 =null;
		ParserRuleReturnScope exp66 =null;
		ParserRuleReturnScope exp67 =null;
		ParserRuleReturnScope exp69 =null;
		ParserRuleReturnScope exp70 =null;
		ParserRuleReturnScope exp72 =null;
		ParserRuleReturnScope exp73 =null;
		ParserRuleReturnScope exp75 =null;
		ParserRuleReturnScope boolexp77 =null;

		Object TRUE56_tree=null;
		Object FALSE57_tree=null;
		Object EQUAL59_tree=null;
		Object SOREQUAL62_tree=null;
		Object BOREQUAL65_tree=null;
		Object SMALLER68_tree=null;
		Object BIGGER71_tree=null;
		Object NOTEQUAL74_tree=null;
		Object OPENPAREN76_tree=null;
		Object CLOSEPAREN78_tree=null;

		try {
			// Syn.g:59:5: ( TRUE | FALSE | exp EQUAL ^ exp | exp SOREQUAL ^ exp | exp BOREQUAL ^ exp | exp SMALLER ^ exp | exp BIGGER ^ exp | exp NOTEQUAL ^ exp | OPENPAREN ! boolexp CLOSEPAREN !)
			int alt6=9;
			switch ( input.LA(1) ) {
			case TRUE:
				{
				alt6=1;
				}
				break;
			case FALSE:
				{
				alt6=2;
				}
				break;
			case IDENTIFIER:
				{
				int LA6_3 = input.LA(2);
				if ( (synpred18_Syn()) ) {
					alt6=3;
				}
				else if ( (synpred19_Syn()) ) {
					alt6=4;
				}
				else if ( (synpred20_Syn()) ) {
					alt6=5;
				}
				else if ( (synpred21_Syn()) ) {
					alt6=6;
				}
				else if ( (synpred22_Syn()) ) {
					alt6=7;
				}
				else if ( (synpred23_Syn()) ) {
					alt6=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INTNUM:
				{
				int LA6_4 = input.LA(2);
				if ( (synpred18_Syn()) ) {
					alt6=3;
				}
				else if ( (synpred19_Syn()) ) {
					alt6=4;
				}
				else if ( (synpred20_Syn()) ) {
					alt6=5;
				}
				else if ( (synpred21_Syn()) ) {
					alt6=6;
				}
				else if ( (synpred22_Syn()) ) {
					alt6=7;
				}
				else if ( (synpred23_Syn()) ) {
					alt6=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case REALNUM:
				{
				int LA6_5 = input.LA(2);
				if ( (synpred18_Syn()) ) {
					alt6=3;
				}
				else if ( (synpred19_Syn()) ) {
					alt6=4;
				}
				else if ( (synpred20_Syn()) ) {
					alt6=5;
				}
				else if ( (synpred21_Syn()) ) {
					alt6=6;
				}
				else if ( (synpred22_Syn()) ) {
					alt6=7;
				}
				else if ( (synpred23_Syn()) ) {
					alt6=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OPENPAREN:
				{
				int LA6_6 = input.LA(2);
				if ( (synpred18_Syn()) ) {
					alt6=3;
				}
				else if ( (synpred19_Syn()) ) {
					alt6=4;
				}
				else if ( (synpred20_Syn()) ) {
					alt6=5;
				}
				else if ( (synpred21_Syn()) ) {
					alt6=6;
				}
				else if ( (synpred22_Syn()) ) {
					alt6=7;
				}
				else if ( (synpred23_Syn()) ) {
					alt6=8;
				}
				else if ( (true) ) {
					alt6=9;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// Syn.g:60:4: TRUE
					{
					root_0 = (Object)adaptor.nil();


					TRUE56=(Token)match(input,TRUE,FOLLOW_TRUE_in_bool323); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRUE56_tree = (Object)adaptor.create(TRUE56);
					adaptor.addChild(root_0, TRUE56_tree);
					}

					}
					break;
				case 2 :
					// Syn.g:61:4: FALSE
					{
					root_0 = (Object)adaptor.nil();


					FALSE57=(Token)match(input,FALSE,FOLLOW_FALSE_in_bool328); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FALSE57_tree = (Object)adaptor.create(FALSE57);
					adaptor.addChild(root_0, FALSE57_tree);
					}

					}
					break;
				case 3 :
					// Syn.g:62:4: exp EQUAL ^ exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_bool333);
					exp58=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp58.getTree());

					EQUAL59=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_bool335); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUAL59_tree = (Object)adaptor.create(EQUAL59);
					root_0 = (Object)adaptor.becomeRoot(EQUAL59_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_bool338);
					exp60=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp60.getTree());

					}
					break;
				case 4 :
					// Syn.g:63:4: exp SOREQUAL ^ exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_bool343);
					exp61=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp61.getTree());

					SOREQUAL62=(Token)match(input,SOREQUAL,FOLLOW_SOREQUAL_in_bool345); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SOREQUAL62_tree = (Object)adaptor.create(SOREQUAL62);
					root_0 = (Object)adaptor.becomeRoot(SOREQUAL62_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_bool348);
					exp63=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp63.getTree());

					}
					break;
				case 5 :
					// Syn.g:64:4: exp BOREQUAL ^ exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_bool353);
					exp64=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp64.getTree());

					BOREQUAL65=(Token)match(input,BOREQUAL,FOLLOW_BOREQUAL_in_bool355); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BOREQUAL65_tree = (Object)adaptor.create(BOREQUAL65);
					root_0 = (Object)adaptor.becomeRoot(BOREQUAL65_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_bool358);
					exp66=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp66.getTree());

					}
					break;
				case 6 :
					// Syn.g:65:4: exp SMALLER ^ exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_bool363);
					exp67=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp67.getTree());

					SMALLER68=(Token)match(input,SMALLER,FOLLOW_SMALLER_in_bool365); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SMALLER68_tree = (Object)adaptor.create(SMALLER68);
					root_0 = (Object)adaptor.becomeRoot(SMALLER68_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_bool368);
					exp69=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp69.getTree());

					}
					break;
				case 7 :
					// Syn.g:66:4: exp BIGGER ^ exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_bool373);
					exp70=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp70.getTree());

					BIGGER71=(Token)match(input,BIGGER,FOLLOW_BIGGER_in_bool375); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BIGGER71_tree = (Object)adaptor.create(BIGGER71);
					root_0 = (Object)adaptor.becomeRoot(BIGGER71_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_bool378);
					exp72=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp72.getTree());

					}
					break;
				case 8 :
					// Syn.g:67:4: exp NOTEQUAL ^ exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_bool383);
					exp73=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp73.getTree());

					NOTEQUAL74=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_bool385); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOTEQUAL74_tree = (Object)adaptor.create(NOTEQUAL74);
					root_0 = (Object)adaptor.becomeRoot(NOTEQUAL74_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_bool388);
					exp75=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp75.getTree());

					}
					break;
				case 9 :
					// Syn.g:68:4: OPENPAREN ! boolexp CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					OPENPAREN76=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_bool393); if (state.failed) return retval;
					pushFollow(FOLLOW_boolexp_in_bool396);
					boolexp77=boolexp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp77.getTree());

					CLOSEPAREN78=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_bool398); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool"


	public static class exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// Syn.g:71:1: exp : term ( ( PLUS ^| MINUS ^| XOR ^) term )* ;
	public final Syn.exp_return exp() throws RecognitionException {
		Syn.exp_return retval = new Syn.exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS80=null;
		Token MINUS81=null;
		Token XOR82=null;
		ParserRuleReturnScope term79 =null;
		ParserRuleReturnScope term83 =null;

		Object PLUS80_tree=null;
		Object MINUS81_tree=null;
		Object XOR82_tree=null;

		try {
			// Syn.g:71:4: ( term ( ( PLUS ^| MINUS ^| XOR ^) term )* )
			// Syn.g:72:3: term ( ( PLUS ^| MINUS ^| XOR ^) term )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_exp409);
			term79=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term79.getTree());

			// Syn.g:72:8: ( ( PLUS ^| MINUS ^| XOR ^) term )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==MINUS||LA8_0==PLUS||LA8_0==XOR) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Syn.g:72:10: ( PLUS ^| MINUS ^| XOR ^) term
					{
					// Syn.g:72:10: ( PLUS ^| MINUS ^| XOR ^)
					int alt7=3;
					switch ( input.LA(1) ) {
					case PLUS:
						{
						alt7=1;
						}
						break;
					case MINUS:
						{
						alt7=2;
						}
						break;
					case XOR:
						{
						alt7=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// Syn.g:72:11: PLUS ^
							{
							PLUS80=(Token)match(input,PLUS,FOLLOW_PLUS_in_exp414); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS80_tree = (Object)adaptor.create(PLUS80);
							root_0 = (Object)adaptor.becomeRoot(PLUS80_tree, root_0);
							}

							}
							break;
						case 2 :
							// Syn.g:72:19: MINUS ^
							{
							MINUS81=(Token)match(input,MINUS,FOLLOW_MINUS_in_exp419); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS81_tree = (Object)adaptor.create(MINUS81);
							root_0 = (Object)adaptor.becomeRoot(MINUS81_tree, root_0);
							}

							}
							break;
						case 3 :
							// Syn.g:72:28: XOR ^
							{
							XOR82=(Token)match(input,XOR,FOLLOW_XOR_in_exp424); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							XOR82_tree = (Object)adaptor.create(XOR82);
							root_0 = (Object)adaptor.becomeRoot(XOR82_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_term_in_exp429);
					term83=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term83.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exp"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// Syn.g:75:1: term : factor ( MULTIPLY ^ factor | DEVIDE ^ factor )* ;
	public final Syn.term_return term() throws RecognitionException {
		Syn.term_return retval = new Syn.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULTIPLY85=null;
		Token DEVIDE87=null;
		ParserRuleReturnScope factor84 =null;
		ParserRuleReturnScope factor86 =null;
		ParserRuleReturnScope factor88 =null;

		Object MULTIPLY85_tree=null;
		Object DEVIDE87_tree=null;

		try {
			// Syn.g:75:5: ( factor ( MULTIPLY ^ factor | DEVIDE ^ factor )* )
			// Syn.g:76:3: factor ( MULTIPLY ^ factor | DEVIDE ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term441);
			factor84=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor84.getTree());

			// Syn.g:76:10: ( MULTIPLY ^ factor | DEVIDE ^ factor )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==MULTIPLY) ) {
					alt9=1;
				}
				else if ( (LA9_0==DEVIDE) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// Syn.g:76:11: MULTIPLY ^ factor
					{
					MULTIPLY85=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term444); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MULTIPLY85_tree = (Object)adaptor.create(MULTIPLY85);
					root_0 = (Object)adaptor.becomeRoot(MULTIPLY85_tree, root_0);
					}

					pushFollow(FOLLOW_factor_in_term447);
					factor86=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor86.getTree());

					}
					break;
				case 2 :
					// Syn.g:76:29: DEVIDE ^ factor
					{
					DEVIDE87=(Token)match(input,DEVIDE,FOLLOW_DEVIDE_in_term450); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DEVIDE87_tree = (Object)adaptor.create(DEVIDE87);
					root_0 = (Object)adaptor.becomeRoot(DEVIDE87_tree, root_0);
					}

					pushFollow(FOLLOW_factor_in_term453);
					factor88=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor88.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// Syn.g:79:1: factor : ( IDENTIFIER | INTNUM | REALNUM | OPENPAREN ! exp CLOSEPAREN !);
	public final Syn.factor_return factor() throws RecognitionException {
		Syn.factor_return retval = new Syn.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER89=null;
		Token INTNUM90=null;
		Token REALNUM91=null;
		Token OPENPAREN92=null;
		Token CLOSEPAREN94=null;
		ParserRuleReturnScope exp93 =null;

		Object IDENTIFIER89_tree=null;
		Object INTNUM90_tree=null;
		Object REALNUM91_tree=null;
		Object OPENPAREN92_tree=null;
		Object CLOSEPAREN94_tree=null;

		try {
			// Syn.g:79:7: ( IDENTIFIER | INTNUM | REALNUM | OPENPAREN ! exp CLOSEPAREN !)
			int alt10=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt10=1;
				}
				break;
			case INTNUM:
				{
				alt10=2;
				}
				break;
			case REALNUM:
				{
				alt10=3;
				}
				break;
			case OPENPAREN:
				{
				alt10=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// Syn.g:80:4: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER89=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_factor467); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER89_tree = (Object)adaptor.create(IDENTIFIER89);
					adaptor.addChild(root_0, IDENTIFIER89_tree);
					}

					}
					break;
				case 2 :
					// Syn.g:81:4: INTNUM
					{
					root_0 = (Object)adaptor.nil();


					INTNUM90=(Token)match(input,INTNUM,FOLLOW_INTNUM_in_factor472); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTNUM90_tree = (Object)adaptor.create(INTNUM90);
					adaptor.addChild(root_0, INTNUM90_tree);
					}

					}
					break;
				case 3 :
					// Syn.g:82:4: REALNUM
					{
					root_0 = (Object)adaptor.nil();


					REALNUM91=(Token)match(input,REALNUM,FOLLOW_REALNUM_in_factor477); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					REALNUM91_tree = (Object)adaptor.create(REALNUM91);
					adaptor.addChild(root_0, REALNUM91_tree);
					}

					}
					break;
				case 4 :
					// Syn.g:83:4: OPENPAREN ! exp CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					OPENPAREN92=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_factor482); if (state.failed) return retval;
					pushFollow(FOLLOW_exp_in_factor486);
					exp93=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp93.getTree());

					CLOSEPAREN94=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_factor489); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	protected static class string_scope {
		String tmp;
	}
	protected Stack<string_scope> string_stack = new Stack<string_scope>();

	public static class string_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string"
	// Syn.g:86:1: string : s= STRING -> STRING[$string::tmp] ;
	public final Syn.string_return string() throws RecognitionException {
		string_stack.push(new string_scope());
		Syn.string_return retval = new Syn.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token s=null;

		Object s_tree=null;
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// Syn.g:88:5: (s= STRING -> STRING[$string::tmp] )
			// Syn.g:89:5: s= STRING
			{
			s=(Token)match(input,STRING,FOLLOW_STRING_in_string517); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STRING.add(s);

			if ( state.backtracking==0 ) { string_stack.peek().tmp = cleanString((s!=null?s.getText():null)); }
			// AST REWRITE
			// elements: STRING
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 89:54: -> STRING[$string::tmp]
			{
				adaptor.addChild(root_0, (Object)adaptor.create(STRING, string_stack.peek().tmp));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			string_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "string"

	// $ANTLR start synpred3_Syn
	public final void synpred3_Syn_fragment() throws RecognitionException {
		// Syn.g:31:34: ( exp )
		// Syn.g:31:34: exp
		{
		pushFollow(FOLLOW_exp_in_synpred3_Syn102);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_Syn

	// $ANTLR start synpred18_Syn
	public final void synpred18_Syn_fragment() throws RecognitionException {
		// Syn.g:62:4: ( exp EQUAL exp )
		// Syn.g:62:4: exp EQUAL exp
		{
		pushFollow(FOLLOW_exp_in_synpred18_Syn333);
		exp();
		state._fsp--;
		if (state.failed) return;

		match(input,EQUAL,FOLLOW_EQUAL_in_synpred18_Syn335); if (state.failed) return;

		pushFollow(FOLLOW_exp_in_synpred18_Syn338);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_Syn

	// $ANTLR start synpred19_Syn
	public final void synpred19_Syn_fragment() throws RecognitionException {
		// Syn.g:63:4: ( exp SOREQUAL exp )
		// Syn.g:63:4: exp SOREQUAL exp
		{
		pushFollow(FOLLOW_exp_in_synpred19_Syn343);
		exp();
		state._fsp--;
		if (state.failed) return;

		match(input,SOREQUAL,FOLLOW_SOREQUAL_in_synpred19_Syn345); if (state.failed) return;

		pushFollow(FOLLOW_exp_in_synpred19_Syn348);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_Syn

	// $ANTLR start synpred20_Syn
	public final void synpred20_Syn_fragment() throws RecognitionException {
		// Syn.g:64:4: ( exp BOREQUAL exp )
		// Syn.g:64:4: exp BOREQUAL exp
		{
		pushFollow(FOLLOW_exp_in_synpred20_Syn353);
		exp();
		state._fsp--;
		if (state.failed) return;

		match(input,BOREQUAL,FOLLOW_BOREQUAL_in_synpred20_Syn355); if (state.failed) return;

		pushFollow(FOLLOW_exp_in_synpred20_Syn358);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_Syn

	// $ANTLR start synpred21_Syn
	public final void synpred21_Syn_fragment() throws RecognitionException {
		// Syn.g:65:4: ( exp SMALLER exp )
		// Syn.g:65:4: exp SMALLER exp
		{
		pushFollow(FOLLOW_exp_in_synpred21_Syn363);
		exp();
		state._fsp--;
		if (state.failed) return;

		match(input,SMALLER,FOLLOW_SMALLER_in_synpred21_Syn365); if (state.failed) return;

		pushFollow(FOLLOW_exp_in_synpred21_Syn368);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred21_Syn

	// $ANTLR start synpred22_Syn
	public final void synpred22_Syn_fragment() throws RecognitionException {
		// Syn.g:66:4: ( exp BIGGER exp )
		// Syn.g:66:4: exp BIGGER exp
		{
		pushFollow(FOLLOW_exp_in_synpred22_Syn373);
		exp();
		state._fsp--;
		if (state.failed) return;

		match(input,BIGGER,FOLLOW_BIGGER_in_synpred22_Syn375); if (state.failed) return;

		pushFollow(FOLLOW_exp_in_synpred22_Syn378);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred22_Syn

	// $ANTLR start synpred23_Syn
	public final void synpred23_Syn_fragment() throws RecognitionException {
		// Syn.g:67:4: ( exp NOTEQUAL exp )
		// Syn.g:67:4: exp NOTEQUAL exp
		{
		pushFollow(FOLLOW_exp_in_synpred23_Syn383);
		exp();
		state._fsp--;
		if (state.failed) return;

		match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_synpred23_Syn385); if (state.failed) return;

		pushFollow(FOLLOW_exp_in_synpred23_Syn388);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred23_Syn

	// Delegated rules

	public final boolean synpred3_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statements_in_program54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements67 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements71 = new BitSet(new long[]{0x000007022A0E0010L});
	public static final BitSet FOLLOW_statement_in_statements74 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_WRITE_in_statement90 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_OPENPAREN_in_statement93 = new BitSet(new long[]{0x0000005012950000L});
	public static final BitSet FOLLOW_string_in_statement98 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_exp_in_statement102 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_boolexp_in_statement106 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_statement111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WRITELN_in_statement118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement124 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_statement126 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_statement129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SKIP_in_statement135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement141 = new BitSet(new long[]{0x0000004012950000L});
	public static final BitSet FOLLOW_boolexp_in_statement144 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_THEN_in_statement150 = new BitSet(new long[]{0x000007022A0E0010L});
	public static final BitSet FOLLOW_statement_in_statement153 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ELSE_in_statement159 = new BitSet(new long[]{0x000007022A0E0010L});
	public static final BitSet FOLLOW_statement_in_statement162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement168 = new BitSet(new long[]{0x0000004012950000L});
	public static final BitSet FOLLOW_boolexp_in_statement171 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_in_statement177 = new BitSet(new long[]{0x000007022A0E0010L});
	public static final BitSet FOLLOW_statement_in_statement180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEAT_in_statement186 = new BitSet(new long[]{0x000007022A0E0010L});
	public static final BitSet FOLLOW_statement_in_statement189 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_UNTIL_in_statement195 = new BitSet(new long[]{0x0000004012950000L});
	public static final BitSet FOLLOW_boolexp_in_statement198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_statement204 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_OPENPAREN_in_statement207 = new BitSet(new long[]{0x000007022A0E0010L});
	public static final BitSet FOLLOW_statement_in_statement210 = new BitSet(new long[]{0x0000004012950000L});
	public static final BitSet FOLLOW_boolexp_in_statement212 = new BitSet(new long[]{0x000007022A0E0010L});
	public static final BitSet FOLLOW_statement_in_statement214 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_statement216 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_in_statement223 = new BitSet(new long[]{0x000007022A0E0010L});
	public static final BitSet FOLLOW_statement_in_statement226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_statement232 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_OPENPAREN_in_statement235 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement239 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_statement242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPENPAREN_in_statement249 = new BitSet(new long[]{0x000007022A0E0010L});
	public static final BitSet FOLLOW_statements_in_statement253 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_statement256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALLOC_in_statement263 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement266 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_SBRACKETO_in_statement268 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INTNUM_in_statement271 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_SBRACKETC_in_statement273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolterm_in_boolexp285 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_boolexp288 = new BitSet(new long[]{0x0000004012950000L});
	public static final BitSet FOLLOW_boolterm_in_boolexp291 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NOT_in_boolterm304 = new BitSet(new long[]{0x0000004012150000L});
	public static final BitSet FOLLOW_bool_in_boolterm307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_boolterm312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_bool323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_bool328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_bool333 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQUAL_in_bool335 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_bool338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_bool343 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_SOREQUAL_in_bool345 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_bool348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_bool353 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BOREQUAL_in_bool355 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_bool358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_bool363 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_SMALLER_in_bool365 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_bool368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_bool373 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BIGGER_in_bool375 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_bool378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_bool383 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_NOTEQUAL_in_bool385 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_bool388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPENPAREN_in_bool393 = new BitSet(new long[]{0x0000004012950000L});
	public static final BitSet FOLLOW_boolexp_in_bool396 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_bool398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_exp409 = new BitSet(new long[]{0x0000100004200002L});
	public static final BitSet FOLLOW_PLUS_in_exp414 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_MINUS_in_exp419 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_XOR_in_exp424 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_term_in_exp429 = new BitSet(new long[]{0x0000100004200002L});
	public static final BitSet FOLLOW_factor_in_term441 = new BitSet(new long[]{0x0000000000401002L});
	public static final BitSet FOLLOW_MULTIPLY_in_term444 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_factor_in_term447 = new BitSet(new long[]{0x0000000000401002L});
	public static final BitSet FOLLOW_DEVIDE_in_term450 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_factor_in_term453 = new BitSet(new long[]{0x0000000000401002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_factor467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTNUM_in_factor472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REALNUM_in_factor477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPENPAREN_in_factor482 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_factor486 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_factor489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_string517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred3_Syn102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred18_Syn333 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_EQUAL_in_synpred18_Syn335 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_synpred18_Syn338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred19_Syn343 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_SOREQUAL_in_synpred19_Syn345 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_synpred19_Syn348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred20_Syn353 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BOREQUAL_in_synpred20_Syn355 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_synpred20_Syn358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred21_Syn363 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_SMALLER_in_synpred21_Syn365 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_synpred21_Syn368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred22_Syn373 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BIGGER_in_synpred22_Syn375 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_synpred22_Syn378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred23_Syn383 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_NOTEQUAL_in_synpred23_Syn385 = new BitSet(new long[]{0x0000000012140000L});
	public static final BitSet FOLLOW_exp_in_synpred23_Syn388 = new BitSet(new long[]{0x0000000000000002L});
}

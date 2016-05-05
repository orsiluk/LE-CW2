// COMS22201: Syntax analyser

parser grammar Syn;

options {
  tokenVocab = Lex;
  output = AST;
  backtrack=true;
}

@members
{
  private String cleanString(String s){
    String tmp;
    tmp = s.replaceAll("^'", "");
    s = tmp.replaceAll("'$", "");
    tmp = s.replaceAll("''", "'");
    return tmp;
  }
}

program :
    statements
;

statements :
    statement ( SEMICOLON^ statement )*
;

statement :
    WRITE^ OPENPAREN! ( string | exp | boolexp  ) CLOSEPAREN!
  | WRITELN
  | IDENTIFIER ASSIGNMENT^ exp
  | SKIP
  | IF^ boolexp
    THEN! statement
    ELSE! statement
  | WHILE^ boolexp
    DO! statement
  | REPEAT^ statement
    UNTIL! boolexp
  | FOR^ OPENPAREN! statement boolexp statement CLOSEPAREN!
    DO! statement
  | READ^ OPENPAREN!  IDENTIFIER  CLOSEPAREN!
  | OPENPAREN!  statements  CLOSEPAREN!
  | ALLOC^ IDENTIFIER SBRACKETO! INTNUM SBRACKETC!
;


boolexp:
  boolterm (AND^ boolterm)*
;

boolterm:
   NOT^ bool
  |bool
;

bool:
   TRUE
  |FALSE
  |exp EQUAL^ exp
  |exp SOREQUAL^ exp
  |exp BOREQUAL^ exp
  |exp SMALLER^ exp
  |exp BIGGER^ exp
  |exp NOTEQUAL^ exp
  |OPENPAREN! boolexp CLOSEPAREN!
;

exp:
  term ( (PLUS^ | MINUS^ | XOR^ ) term)*
;

term:
  factor (MULTIPLY^ factor |DEVIDE^ factor)*
;

factor: 
   IDENTIFIER
  |INTNUM
  |REALNUM
  |OPENPAREN!  exp  CLOSEPAREN!
;

string
    scope { String tmp; }
    :
    s=STRING { $string::tmp = cleanString($s.text); }-> STRING[$string::tmp]
;
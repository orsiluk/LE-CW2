// COMS22201: IR tree construction

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Irths {
// The code below is generated automatically from the ".tokens" file of the
// ANTLR syntax analysis, using the TokenConv program.
//
// CAMLE TOKENS BEGIN
  public static final String[] tokenNames = new String[] {
    "NONE", "NONE", "NONE", "NONE", "ALLOC", "AND", "ASSIGNMENT", "BIGGER", "BOREQUAL", "CLOSEPAREN", "COLUMN", "COMMENT", "DEVIDE", "DO", "ELSE", "EQUAL", "FALSE", "FOR", "IDENTIFIER", "IF", "INTNUM", "MINUS", "MULTIPLY", "NOT", "NOTEQUAL", "OPENPAREN", "PLUS", "READ", "REALNUM", "REPEAT", "SBRACKETC", "SBRACKETO", "SEMICOLON", "SKIP", "SMALLER", "SOREQUAL", "STRING", "THEN", "TRUE", "UNTIL", "WHILE", "WRITE", "WRITELN", "WS", "XOR"
  };
  public static final int ALLOC = 4;
  public static final int AND = 5;
  public static final int ASSIGNMENT = 6;
  public static final int BIGGER = 7;
  public static final int BOREQUAL = 8;
  public static final int CLOSEPAREN = 9;
  public static final int COLUMN = 10;
  public static final int COMMENT = 11;
  public static final int DEVIDE = 12;
  public static final int DO = 13;
  public static final int ELSE = 14;
  public static final int EQUAL = 15;
  public static final int FALSE = 16;
  public static final int FOR = 17;
  public static final int IDENTIFIER = 18;
  public static final int IF = 19;
  public static final int INTNUM = 20;
  public static final int MINUS = 21;
  public static final int MULTIPLY = 22;
  public static final int NOT = 23;
  public static final int NOTEQUAL = 24;
  public static final int OPENPAREN = 25;
  public static final int PLUS = 26;
  public static final int READ = 27;
  public static final int REALNUM = 28;
  public static final int REPEAT = 29;
  public static final int SBRACKETC = 30;
  public static final int SBRACKETO = 31;
  public static final int SEMICOLON = 32;
  public static final int SKIP = 33;
  public static final int SMALLER = 34;
  public static final int SOREQUAL = 35;
  public static final int STRING = 36;
  public static final int THEN = 37;
  public static final int TRUE = 38;
  public static final int UNTIL = 39;
  public static final int WHILE = 40;
  public static final int WRITE = 41;
  public static final int WRITELN = 42;
  public static final int WS = 43;
  public static final int XOR = 44;
// CAMLE TOKENS END
  private static int count = 1;
  public static IRTree convert(CommonTree ast) {
    IRTree irt = new IRTree();
    program(ast, irt);
    return irt;
  }

  public static void program(CommonTree ast, IRTree irt) {
    statements(ast, irt);
  }

  public static void statements(CommonTree ast, IRTree irt) {
    int i;
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == SEMICOLON) {
      IRTree irt1 = new IRTree();
      IRTree irt2 = new IRTree();
      CommonTree ast1 = (CommonTree)ast.getChild(0);
      CommonTree ast2 = (CommonTree)ast.getChild(1);
      statements(ast1, irt1);
      statements(ast2, irt2);
      irt.setOp("Comp");
      irt.addSub(irt1);
      irt.addSub(irt2);
    } else {
      statement(ast, irt);
    }
  }

  public static void statement(CommonTree ast, IRTree irt) {
    CommonTree ast1, ast2, ast3;
    IRTree irt1 = new IRTree(), irt2 = new IRTree(), irt3 = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == WRITE) {
      ast1 = (CommonTree)ast.getChild(0);
      String type = arg(ast1, irt1);
      if (type.equals("int")) {
        irt.setOp("WriteA");
        irt.addSub(irt1);
      } if (type.equals("string")) {
        irt.setOp("WriteS");
        irt.addSub(irt1);
      } else if (!type.equals("int")) {
        irt.setOp("WriteB");
        irt.addSub(irt1);
      }

    } else if (tt == WRITELN) {
      irt.setOp("WriteLn");
    } else if (tt == ASSIGNMENT) {
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      String var = ast1.getToken().getText();
      //arg(ast1, irt1);
      arg(ast2, irt2);
      irt.setOp("Ass");
      irt.addSub(new IRTree("\"" + var + "\"" ));
      irt.addSub(irt2);
    } else if (tt == SKIP) {
      irt.setOp("Skip");
    } else if (tt == IF) {
      ast1 = (CommonTree)ast.getChild(0);//boolexp
      ast2 = (CommonTree)ast.getChild(1);//if true
      ast3 = (CommonTree)ast.getChild(2);//else
      irt.setOp("If");
      arg(ast1, irt1);
      statements(ast2, irt2);
      statements(ast3, irt3);
      irt.addSub(irt1);
      irt.addSub(irt2);
      irt.addSub(irt3);
    } else if (tt == WHILE) {
      ast1 = (CommonTree)ast.getChild(0);//while
      ast2 = (CommonTree)ast.getChild(1);//do
      irt.setOp("While");
      arg(ast1, irt1);
      statements(ast2, irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
    } else if (tt == READ) {
      ast1 = (CommonTree)ast.getChild(0);
      Token t2 = ast1.getToken();
      String tx2 = t2.getText();
      irt.setOp("Read");
      irt.addSub(new IRTree("\"" + tx2 + "\""));
    }
  }

  public static String arg(CommonTree ast, IRTree irt) {
    Token t = ast.getToken();
    int tt = t.getType();
    CommonTree ast1, ast2, ast3;
    IRTree irt1 = new IRTree(), irt2 = new IRTree(), irt3 = new IRTree();

    if (tt == STRING) {
      String tx = t.getText();
      irt.setOp("\"" + tx + "\"");
      return "string";
    } if (tt == TRUE) {
      irt.setOp("TRUE");
      return "true";
    } else if (tt == FALSE) {
      irt.setOp("FALSE");
      return "false";
    } else if (tt == EQUAL) {
      ast1 = (CommonTree)ast.getChild(0);//while
      ast2 = (CommonTree)ast.getChild(1);//do
      irt.setOp("Eq");
      arg(ast1, irt1);
      arg(ast2, irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
      return "equal";
    } else if (tt == SMALLER) {
      ast1 = (CommonTree)ast.getChild(0);//while
      ast2 = (CommonTree)ast.getChild(1);//do
      irt.setOp("Le");
      arg(ast1, irt1);
      arg(ast2, irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
      return "smaller";
    } else if (tt == NOT) {
      ast1 = (CommonTree)ast.getChild(0);//while
      irt.setOp("Neg");
      arg(ast1, irt1);
      irt.addSub(irt1);
      return "neg";
    } else if (tt == AND) {
      ast1 = (CommonTree)ast.getChild(0);//while
      ast2 = (CommonTree)ast.getChild(1);//do
      irt.setOp("And");
      arg(ast1, irt1);
      arg(ast2, irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
      return "and";
    } else if (tt == INTNUM) {
      String tx = t.getText();
      irt.setOp("N");
      irt.addSub(new IRTree(tx));
      return "int";
    } else if (tt == IDENTIFIER) {
      String tx = t.getText();
      irt.setOp("V");
      irt.addSub(new IRTree("\"" + tx + "\""));
      return "int";
    } else if (tt == AND) {
      ast1 = (CommonTree)ast.getChild(0);//while
      ast2 = (CommonTree)ast.getChild(1);//do
      irt.setOp("And");
      arg(ast1, irt1);
      arg(ast2, irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
      return "and";
    } else if (tt == PLUS) {
      ast1 = (CommonTree)ast.getChild(0);//while
      ast2 = (CommonTree)ast.getChild(1);//do
      irt.setOp("Add");
      arg(ast1, irt1);
      arg(ast2, irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
      return "int";
    } else if (tt == MULTIPLY) {
      ast1 = (CommonTree)ast.getChild(0);//while
      ast2 = (CommonTree)ast.getChild(1);//do
      irt.setOp("Mult");
      arg(ast1, irt1);
      arg(ast2, irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
      return "int";
    } else if (tt == MINUS) {
      ast1 = (CommonTree)ast.getChild(0);//while
      ast2 = (CommonTree)ast.getChild(1);//do
      irt.setOp("Sub");
      arg(ast1, irt1);
      arg(ast2, irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
      return "int";
    } else {
      constant(ast, irt);
      return "int";
    }
  }

  public static void constant(CommonTree ast, IRTree irt) {
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == INTNUM) {
      String tx = t.getText();
      irt.setOp(tx);
    } else {
      System.out.println("Error in Irt 'constant' ");
      error(tt);
    }
  }

  private static void error(int tt) {
    System.out.println("IRT error: " + tokenNames[tt]);
    System.exit(1);
  }
}

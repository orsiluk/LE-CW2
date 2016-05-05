// COMS22201: IR tree construction

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Irt {
// The code below is generated automatically from the ".tokens" file of the
// ANTLR syntax analysis, using the TokenConv program.
//
// CAMLE TOKENS BEGIN
  public static final String[] tokenNames = new String[] {
"NONE", "NONE", "NONE", "NONE", "ALLOC", "AND", "ASSIGNMENT", "BIGGER", "BOREQUAL", "CLOSEPAREN", "COLUMN", "COMMENT", "DEVIDE", "DO", "ELSE", "EQUAL", "FALSE", "FOR", "IDENTIFIER", "IF", "INTNUM", "MINUS", "MULTIPLY", "NOT", "NOTEQUAL", "OPENPAREN", "PLUS", "READ", "REALNUM", "REPEAT", "SBRACKETC", "SBRACKETO", "SEMICOLON", "SKIP", "SMALLER", "SOREQUAL", "STRING", "THEN", "TRUE", "UNTIL", "WHILE", "WRITE", "WRITELN", "WS", "XOR"};
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
      irt.setOp("SEQ");
      irt.addSub(irt1);
      irt.addSub(irt2);
    } else {
      statement(ast, irt);
    }
  }

  public static void statement(CommonTree ast, IRTree irt) {
    CommonTree ast1, ast2, ast3, ast4;
    IRTree irt1 = new IRTree(), irt2 = new IRTree(), irt3 = new IRTree();
    IRTree e = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();

    if (tt == IF) {
      ast1 = (CommonTree)ast.getChild(0);//boolexp
      ast2 = (CommonTree)ast.getChild(1);//if true
      ast3 = (CommonTree)ast.getChild(2);//else

      String label3 = "L" + count;
      count ++;

      IRTree itLb3 = new IRTree("LABEL", new IRTree(label3));

      IRTree it1 = new IRTree();
      it1.setOp("SEQ");
      statements(ast3, irt3);
      //System.out.println("------------------irt3: " + irt3);
      it1.addSub(irt3);
      it1.addSub(itLb3);

      String label2 = "L" + count;
      count ++;
      IRTree itLb2 = new IRTree("LABEL", new IRTree(label2));
      IRTree it2 = new IRTree();
      it2.setOp("SEQ");
      it2.addSub(itLb2);
      it2.addSub(it1);

      IRTree jump = new IRTree("JUMP", new IRTree(label3));
      IRTree it3 = new IRTree();
      it3.setOp("SEQ");
      it3.addSub(jump);
      it3.addSub(it2);

      IRTree it4 = new IRTree();
      it4.setOp("SEQ");
      statements(ast2, irt2);
      //System.out.println("------------------irt2: " + irt2);
      it4.addSub(irt2);
      it4.addSub(it3);

      String label1 = "L" + count;
      count ++;
      IRTree itLb1 = new IRTree("LABEL", new IRTree(label1));
      IRTree it5 = new IRTree();
      it5.setOp("SEQ");
      it5.addSub(itLb1);
      it5.addSub(it4);

      e = translate(ast1, label1, label2);
      irt.setOp("SEQ");
      irt.addSub(e);
      irt.addSub(it5);
      //System.out.println("The tree: " + irt);


    } else if (tt == WHILE) {
      ast1 = (CommonTree)ast.getChild(0);//while
      ast2 = (CommonTree)ast.getChild(1);//do

      String label3 = "L" + count;
      count ++;
      String label2 = "L" + count;
      count ++;
      String label1 = "L" + count;
      count ++;

      IRTree itLb3 = new IRTree("LABEL", new IRTree(label3));
      IRTree it1 = new IRTree();
      it1.setOp("SEQ");
      IRTree jump = new IRTree("JUMP", new IRTree(label1));
      it1.addSub(jump);
      it1.addSub(itLb3);

      IRTree it2 = new IRTree();
      it2.setOp("SEQ");
      statements(ast2, irt2);
      it2.addSub(irt2);
      it2.addSub(it1);

      IRTree itLb2 = new IRTree("LABEL", new IRTree(label2));
      IRTree it3 = new IRTree();
      it3.setOp("SEQ");
      it3.addSub(itLb2);
      it3.addSub(it2);

      IRTree it4 = new IRTree();
      e = translate(ast1, label2, label3);
      it4.setOp("SEQ");
      it4.addSub(e);
      it4.addSub(it3);

      IRTree itLb1 = new IRTree("LABEL", new IRTree(label1));
      //IRTree irt = new IRTree();
      irt.setOp("SEQ");
      irt.addSub(itLb1);
      irt.addSub(it4);

    } else if (tt == REPEAT) {
      ast1 = (CommonTree)ast.getChild(0);//repeat
      ast2 = (CommonTree)ast.getChild(1);//until

      String label3 = "L" + count;
      count ++;
      String label2 = "L" + count;
      count ++;
      String label1 = "L" + count;
      count ++;

      IRTree itLb3 = new IRTree("LABEL", new IRTree(label3));
      IRTree it1 = new IRTree();
      it1.setOp("SEQ");
      IRTree jump = new IRTree("JUMP", new IRTree(label1));
      it1.addSub(jump);
      it1.addSub(itLb3);

      IRTree it2 = new IRTree();
      it2.setOp("SEQ");
      statements(ast1, irt2);
      it2.addSub(irt2);
      it2.addSub(it1);

      IRTree itLb2 = new IRTree("LABEL", new IRTree(label2));
      IRTree it3 = new IRTree();
      it3.setOp("SEQ");
      it3.addSub(itLb2);
      it3.addSub(it2);

      IRTree it4 = new IRTree();
      e = translate(ast2, label2, label3);
      it4.setOp("SEQ");
      it4.addSub(e);
      it4.addSub(it3);

      IRTree itLb1 = new IRTree("LABEL", new IRTree(label1));
      //IRTree irt = new IRTree();
      irt.setOp("SEQ");
      irt.addSub(itLb1);
      irt.addSub(it4);

    } else if (tt == FOR) {
      ast1 = (CommonTree)ast.getChild(0);//for i=0
      ast2 = (CommonTree)ast.getChild(1);//i<n
      ast3 = (CommonTree)ast.getChild(2);//i=i+1
      ast4 = (CommonTree)ast.getChild(3);//do

      System.out.println("ast1 : " + ast1);
      System.out.println("ast2 : " + ast2);
      System.out.println("ast3 : " + ast3);
      System.out.println("ast4 : " + ast4);

      String label3 = "L" + count;
      count ++;
      String label2 = "L" + count;
      count ++;
      String label1 = "L" + count;
      count ++;

      IRTree itLb3 = new IRTree("LABEL", new IRTree(label3));
      IRTree it1 = new IRTree();
      it1.setOp("SEQ");
      IRTree jump = new IRTree("JUMP", new IRTree(label1));
      it1.addSub(jump);
      it1.addSub(itLb3);

      IRTree it32 = new IRTree();
      IRTree irt32 = new IRTree();
      it32.setOp("SEQ");
      statements(ast3, irt32);
      it32.addSub(irt32);
      it32.addSub(it1);

      IRTree it2 = new IRTree();
      it2.setOp("SEQ");
      statements(ast4, irt2);
      it2.addSub(irt2);
      it2.addSub(it32);

      IRTree itLb2 = new IRTree("LABEL", new IRTree(label2));
      IRTree it3 = new IRTree();
      it3.setOp("SEQ");
      it3.addSub(itLb2);
      it3.addSub(it2);

      IRTree it4 = new IRTree();
      e = translate(ast2, label2, label3);
      it4.setOp("SEQ");
      it4.addSub(e);
      it4.addSub(it3);

      IRTree itLb1 = new IRTree("LABEL", new IRTree(label1));
      IRTree it22 = new IRTree();
      it22.setOp("SEQ");
      it22.addSub(itLb1);
      it22.addSub(it4);

      IRTree irt22 = new IRTree();
      irt.setOp("SEQ");
      statements(ast1, irt22);
      irt.addSub(irt22);
      irt.addSub(it22);

    } else if (tt == WRITE) {
      ast1 = (CommonTree)ast.getChild(0);


      String type = arg(ast1, irt1);

      if (type.equals("int") || type.equals("identifier")) {
        irt.setOp("WR");
        irt.addSub(irt1);
      } else {
        irt.setOp("WRS");
        irt.addSub(irt1);
      }
    } else if (tt == ASSIGNMENT) {
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      String type = arg(ast1, irt1);
      String type2 = arg(ast2, irt2);
      irt.setOp("ASS");
      irt.addSub(irt1);
      irt.addSub(irt2);

    } else if (tt == ALLOC) {
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      String type = arg(ast1, irt1);
      String type2 = arg(ast2, irt2);
      irt.setOp("ALLOC");
      irt.addSub(irt1);
      irt.addSub(irt2);
      System.out.println("Array in statement: " + irt);

    } else if (tt == WRITELN) {
      String a = String.valueOf(Memory.allocateString("\n"));
      irt.setOp("WRS");
      irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a))));
    } else if (tt == READ) {
      ast1 = (CommonTree)ast.getChild(0);
      String type = arg(ast1, irt1);
      irt.setOp("RD");
      irt.addSub(irt1);
    } else  if (tt == SKIP) {
      irt.setOp("SKIP");
    } else {
      error(tt);
    }
  }

  public static IRTree translate(CommonTree ast, String label1, String label2) {

    Token t = ast.getToken();
    int tt = t.getType();
    IRTree tr = new IRTree();
    IRTree tr2 = new IRTree();
    String next = "L" + count;
    count++;
    if (tt == AND) {
      tr.setOp("SEQ");
      tr.addSub(translate((CommonTree)ast.getChild(0), next, label2));
      tr2.setOp("SEQ");
      tr2.addSub( new IRTree("LABEL", new IRTree(next) ) );
      tr2.addSub(translate((CommonTree)ast.getChild(1), label1, label2));
      tr.addSub(tr2);
    } else if (tt == NOT) {
      tr = translate((CommonTree)ast.getChild(0), label2, label1);
    } else if (tt == EQUAL) {
      tr = cJump(EQUAL, ast, label1, label2);
    } else if (tt == SOREQUAL) {
      tr = cJump(SOREQUAL, ast, label1, label2);
    } else if (tt == BOREQUAL) {
      tr = cJump(BOREQUAL, ast, label1, label2);
    } else if (tt == SMALLER) {
      tr = cJump(SMALLER, ast, label1, label2);
    } else if (tt == BIGGER) {
      tr = cJump(BIGGER, ast, label1, label2);
    } else if (tt == NOTEQUAL) {
      tr = cJump(NOTEQUAL, ast, label1, label2);
    }
    return tr;
    /*
    translate((b1 && b2), label1, n2) => translate(b1, next, n2)
    next: translate(b2, n1, n2)
    translate((b1 || b2), n1, n2) => translate(b1, n1, next)
    next: translate(b2, n1, n2)
    translate((e1 op e2), n1, n2) => CJUMP(op, e1, e2, NAME n1, NAME n2)
    */
  }
  public static IRTree cJump(int type, CommonTree ast, String label1, String label2) {
    IRTree tr = new IRTree();
    IRTree tr2 = new IRTree();
    //CommonTree ast1, ast2;
    tr.setOp("CJUMP");
    IRTree irt1 = new IRTree();
    IRTree irt2 = new IRTree();
    IRTree irt3 = new IRTree();

    if (type == EQUAL) {
      tr2.setOp("BEQZ");
      String help1 = arg((CommonTree)ast.getChild(0), irt1);
      String help2 = arg((CommonTree)ast.getChild(1), irt2);
      tr2.addSub(irt1);
      tr2.addSub(irt2);

    } else if (type == BOREQUAL) {
      tr2.setOp("BGEZ");
      String help1 = arg((CommonTree)ast.getChild(0), irt1);
      String help2 = arg((CommonTree)ast.getChild(1), irt2);
      tr2.addSub(irt1);
      tr2.addSub(irt2);

    } else if (type == SOREQUAL) {
      tr2.setOp("BGEZ");
      String help1 = arg((CommonTree)ast.getChild(1), irt1);
      String help2 = arg((CommonTree)ast.getChild(0), irt2);
      tr2.addSub(irt1);
      tr2.addSub(irt2);

    } else if (type == SMALLER) {
      tr2.setOp("BLTZ");
      String help1 = arg((CommonTree)ast.getChild(0), irt1);
      String help2 = arg((CommonTree)ast.getChild(1), irt2);
      tr2.addSub(irt1);
      tr2.addSub(irt2);

    } else if (type == BIGGER) {
      tr2.setOp("BLTZ");
      String help1 = arg((CommonTree)ast.getChild(1), irt1);
      String help2 = arg((CommonTree)ast.getChild(0), irt2);
      tr2.addSub(irt1);
      tr2.addSub(irt2);

    } else if (type == NOTEQUAL) {
      tr2.setOp("BNEZ");
      String help1 = arg((CommonTree)ast.getChild(1), irt1);
      String help2 = arg((CommonTree)ast.getChild(0), irt2);
      tr2.addSub(irt1);
      tr2.addSub(irt2);

    }
    tr2.addSub(new IRTree(label1));
    tr2.addSub(new IRTree(label2));
    tr.addSub(tr2);
    return tr;
  }

  public static String arg(CommonTree ast, IRTree irt) {

    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == STRING) {
      String tx = t.getText();

      int a = Memory.allocateString(tx);
      String st = String.valueOf(a);
      irt.setOp("MEM");
      irt.addSub(new IRTree("CONST", new IRTree(st)));
      return "string";

    } else if (tt == IDENTIFIER) {
      String tx = t.getText();
      int a = Memory.allocateVariable(tx);
      String st = String.valueOf(a);
      irt.setOp("MEM");
      irt.addSub(new IRTree("CONST", new IRTree(st)));
      return "identifier";

    } else if (tt == TRUE || tt == FALSE || tt == NOT || tt == AND) {
      expression(ast, irt);
      int tt2 = Integer.parseInt(irt.getOp());
      String rs = "nothing";
      if (tt2 == 0) {
        rs = "false";
      } else {
        rs = "true";
      }
      int a = Memory.allocateString(rs);
      String st = String.valueOf(a);
      irt.setOp("MEM");
      irt.addSub(new IRTree("CONST", new IRTree(st)));
      return "bool";

    } else {
      expression(ast, irt);
      return "int";
    }
  }

  public static void expression(CommonTree ast, IRTree irt) {
    CommonTree ast1, ast2;
    IRTree irt1 = new IRTree();
    IRTree irt2 = new IRTree();
    IRTree irt3 = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();

    if (tt == INTNUM ) {
      constant(ast, irt1);
      irt.setOp("CONST");
      irt.addSub(irt1);

    } else if (tt == REALNUM) {
      constant(ast, irt1);
      irt.setOp("CONSTR");
      irt.addSub(irt1);

    } else if (tt == TRUE || tt == FALSE) {
      String bool = t.getText();
      int tt2;
      if (bool.equals("true")) {
        tt2 = 1;
      } else {
        tt2 = 0;
      }
      irt.setOp(String.valueOf(tt2));

    } else if (tt == NOT) {
      ast1 = (CommonTree)ast.getChild(0);
      expression(ast1, irt1);
      int change = Integer.parseInt(irt1.getOp());
      int neg = 1 - change;
      irt.setOp(String.valueOf(neg));

    } else if (tt == AND) {
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      expression(ast1, irt1);
      expression(ast2, irt2);
      int first = Integer.parseInt(irt1.getOp());
      int second = Integer.parseInt(irt2.getOp());
      int anding = first & second;
      irt.setOp(String.valueOf(anding));

    }  else if (tt == PLUS || tt == MINUS || tt == MULTIPLY || tt == DEVIDE ) {
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      String type = arg(ast1, irt1);
      String type2 = arg(ast2, irt2);

      //checks if the subtrees are numbers if they are it makes the calculation, doasn't put it in the tree
      if (irt1.getOp() == "CONST" && irt2.getOp() == "CONST") {
        int a = Integer.parseInt(irt1.getSub(0).getOp());
        int b = Integer.parseInt(irt2.getSub(0).getOp());
        int result = 0;
        switch (tt) {
        case PLUS:
          result = a + b;
          break;
        case MINUS:
          result = a - b;
          break;
        case MULTIPLY:
          result = a * b;
          break;
        case DEVIDE:
          result = a / b;
          break;
        default:
          break;
        }
        String trs = String.valueOf(result);
        irt1.setOp(trs);
        irt.setOp("CONST");
        irt.addSub(irt1);

      } else {

        irt.setOp("BINOP");

        switch (tt) {
        case PLUS:
          irt3.setOp("+");
          break;
        case MINUS:
          irt3.setOp("-");
          break;
        case MULTIPLY:
          irt3.setOp("*");
          break;
        case DEVIDE:
          irt3.setOp("/");
          break;
        default:
          break;
        }
        irt.addSub(irt3);
        irt.addSub(irt1);
        irt.addSub(irt2);
      }
    } else if (tt == XOR) {
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      String type = arg(ast1, irt1);
      String type2 = arg(ast2, irt2);
      irt.setOp("BINOP");
      irt3.setOp("^");
      irt.addSub(irt3);
      irt.addSub(irt1);
      irt.addSub(irt2);
    }
  }

  public static void constant(CommonTree ast, IRTree irt) {
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == INTNUM || tt == REALNUM) {
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

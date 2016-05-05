// COMS22201: Code generation

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Cg {
  private static int count = 1;
  private static String result = "";
  public static void program(IRTree irt, PrintStream o) {
    emit(o, "XOR R0,R0,R0");   // Initialize R0 to 0
    statement(irt, o);
    emit(o, "HALT");           // Program must end with HALT
    Memory.dumpData(o);        // Dump DATA lines: initial memory contents
  }

  private static void statement(IRTree irt, PrintStream o) {
    if (irt.getOp().equals("SEQ")) {
      statement(irt.getSub(0), o);
      statement(irt.getSub(1), o);
    } else if (irt.getOp().equals("WRS") && irt.getSub(0).getOp().equals("MEM") && irt.getSub(0).getSub(0).getOp().equals("CONST")) {
      String a = irt.getSub(0).getSub(0).getSub(0).getOp();
      emit(o, "WRS " + a);
    } else if (irt.getOp().equals("WR")) {
      String e = expression(irt.getSub(0), o);
      emit(o, "WR " + e);
    }  else if (irt.getOp().equals("WRR")) {
      String e = expression(irt.getSub(0), o);
      emit(o, "WRR " + e);
    } else if (irt.getOp().equals("RD")) {
      String aa = irt.getSub(0).getSub(0).getSub(0).getOp();
      String e = expression(irt.getSub(0), o);
      emit(o, "RD "  + e);
      emit(o, "STORE " + e + ",R0," + aa);

    } else if (irt.getOp().equals("ASS")) {
      String aa = irt.getSub(0).getSub(0).getSub(0).getOp();
      String ae = expression(irt.getSub(1), o);
      emit(o, "STORE " + ae + ",R0," + aa);

    } /*else if (irt.getOp().equals("ALLOC")) {
      String aa = irt.getSub(0).getSub(0).getSub(0).getOp();
      String ae = expression(irt.getSub(1), o);

    }*/ else if (irt.getOp().equals("CJUMP")) {

      IRTree sub = irt.getSub(0);
      String aa = expression(sub.getSub(0), o);
      String ae = expression(sub.getSub(1), o);
      result = "R" + count;
      count++;
      emit(o, "SUB " + result + ", " + aa + ", " + ae);
      if (sub.getOp().equals("BGEZ")) {//Ri ≥ 0
        emit(o, "BGEZ" + " " + result + ", " + sub.getSub(2).getOp());
        emit(o, "BLTZ" + " " + result + ", " + sub.getSub(3).getOp());
      } else if (sub.getOp().equals("BEQZ")) { //Ri = 0
        emit(o, "BNEZ" + " " + result + ", " + sub.getSub(3).getOp());
        emit(o, "BEQZ" + " " + result + ", " + sub.getSub(2).getOp());
      } else if (sub.getOp().equals("BLTZ")) {//Ri < 0
        emit(o, "BLTZ" + " " + result + ", " + sub.getSub(2).getOp());
        emit(o, "BGEZ" + " " + result + ", " + sub.getSub(3).getOp());
      } else if (sub.getOp().equals("BNEZ")) {
        emit(o, "BNEZ" + " " + result + ", " + sub.getSub(2).getOp());
        emit(o, "BEQZ" + " " + result + ", " + sub.getSub(3).getOp());
      }
      count --;
    } else if (irt.getOp().equals("LABEL")) {
      emit(o, irt.getSub(0).getOp() + ":");
    } else if (irt.getOp().equals("JUMP")) {
      emit(o, "JMP " + irt.getSub(0).getOp());
    }  else if (irt.getOp().equals("SKIP")) {
      emit(o, "NOP ");
    } else if (irt.getOp().equals("AND")) {

    } else {

      error(irt.getOp());
    }
  }

  private static String expression(IRTree irt, PrintStream o) {

    if (irt.getOp().equals("CONST")) {
      String t = irt.getSub(0).getOp();
      result = "R" + count;
      emit(o, "ADDI " + result + ",R0," + t);
      count++;
    }  /*if (irt.getOp().equals("CONSTR")) {
      String t = irt.getSub(0).getOp();
      result = "R" + count;
      emit(o, "MOVIR " + result + ",R0," + t);
      count++;
    } */else if (irt.getOp().equals("MEM")) {
      String t = irt.getSub(0).getSub(0).getOp();
      result = "R" + count;
      emit(o, "LOAD " + result + ",R0," + t);
      count++;

    } else if (irt.getOp().equals("BINOP")) {

      String t = irt.getSub(0).getOp();
      String ls = expression(irt.getSub(1), o);
      String rs = expression(irt.getSub(2), o);
      result = "R" + count;
      count++;
      if (t == "+") {
        emit(o, "ADD " + result + ", " + ls + ", " + rs);

      } else if (t == "-") {
        emit(o, "SUB " + result + ", " + ls + ", " + rs);

      } else if (t == "*") {
        emit(o, "MUL " + result + ", " + ls + ", " + rs);

      } else if (t == "/") {
        emit(o, "DIV " + result + ", " + ls + ", " + rs);

      } else if (t == "^") {
        emit(o, "XOR " + result + ", " + ls + ", " + rs);
      } else if (t == "||") {
        emit(o, "OR " + result + ", " + ls + ", " + rs);
      }
    } else {
      error(irt.getOp());
    }
    //count--;
    return result;
  }

  private static void emit(PrintStream o, String s) {
    o.println(s);
  }

  private static void error(String op) {
    System.out.println("CG error: " + op);
    System.exit(1);
  }
}

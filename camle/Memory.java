// COMS22201: Memory allocation for strings

import java.util.*;
import java.io.*;

public class Memory {

  static ArrayList<Byte> memory = new ArrayList<Byte>();
  static HashMap< String, Integer > variables = new HashMap<String, Integer>();

  static public int allocateString(String text) {
    int addr = memory.size();
    int size = text.length();
    int c = 0;
    for (int i = 0; i < size; i++) {
      c++;
      memory.add(new Byte("", text.charAt(i)));
    }
    memory.add(new Byte("", 0));
    return addr;
  }

  static public int allocateVariable(String number) {
    int addr = memory.size();
    int counter = 0;
    boolean inMemory = false;
    //int a = 0;

    if (variables.containsKey(number) ==  false) {

      while (memory.size() % 4 != 0) {
        counter++;
        memory.add(new Byte("", 0));
      }
      addr = memory.size();

      for (int i = 0; i < 4; i++) {
        memory.add(new Byte("", number.charAt(0)));
      }
      variables.put( number , addr);
    } else {
      addr = variables.get(number);
      // System.out.println("addres " + variables.get(number));
    }
    return addr;
  }

  static public void dumpData(PrintStream o) {
    Byte b;
    String s;
    int c;
    int size = memory.size();
    for (int i = 0; i < size; i++) {
      b = memory.get(i);
      c = b.getContents();
      if (c >= 32) {
        s = String.valueOf((char)c);
      } else {
        s = ""; // "\\"+String.valueOf(c);
      }
      o.println("DATA " + c + " ; " + s + " " + b.getName());
    }
  }
}

class Byte {
  String varname;
  int contents;

  Byte(String n, int c) {
    varname = n;
    contents = c;
  }

  String getName() {
    return varname;
  }

  int getContents() {
    return contents;
  }
}

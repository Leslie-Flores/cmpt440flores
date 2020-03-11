import java.io.*;

/**
 * Leslie Flores
 * Formal Language Theory - CMPT 440L 111 20S
 * Homework 1 - Implementing DFA: driverDFA.java
 */

public class driverDFA {
  public static void main(String[] args) 
        throws IOException {

    ManWolf m = new ManWolf(); // The DFA
    BufferedReader in =  // Standard input
      new BufferedReader(new InputStreamReader(System.in));

    String s = in.readLine();
    while (s!=null) {
      m.reset();
      m.process(s);
      if (m.accepted()) System.out.println("This is a solution.");
      else System.out.println("This is not a solution.");
      s = in.readLine();
    }
  }
}

/**
 * Leslie Flores
 * Formal Language Theory CMPT 440L 111 20S
 * Homework 1 - Implement DFA: ManWolf.java
 */
public class ManWolf {

  private static final int q0 = 0;
  private static final int q1 = 1;
  private static final int q2 = 2;
  private static final int q3 = 3;
  private static final int q4 = 4;
  private static final int q5 = 5;
  private static final int q6 = 6;
  private static final int q7 = 7;
  private static final int q8 = 8;
  private static final int q9 = 9;
  private static final int q10 = 10;

  private int state;

  /**
   * The transition function.
   * @param s state code (an int)
   * @param c char to make a transition on
   * @return the next state code
   */
  static private int crossover(int cross) {
        [q0][g]=1; [q0][w]=10; [q0][c]=10; [q0][n]=10;
        [q1][g]=0; [q1][w]=10; [q1][c]=10; [q1][n]=2;
        [q2][g]=10; [q2][w]=3; [q2][c]=5; [q2][n]=1;
        [q3][g]=4; [q3][w]=2; [q3][c]=10; [q3][n]=10;
        [q4][g]=3; [q4][w]=10; [q4][c]=7; [q4][n]=10;
        [q5][g]=6; [q5][w]=10; [q5][c]=2; [q5][n]=10;
        [q6][g]=5; [q6][w]=7; [q6][c]=10; [q6][n]=10;
        [q7][g]=10; [q7][w]=6; [q7][c]=4; [q7][n]=8;
        [q8][g]=9; [q8][w]=10; [q8][c]=10; [q8][n]=7;
        [q9][g]=8; [q9][w]=10; [q9][c]=10; [q9][n]=10;
        [q0][g]=10; [q10][w]=10; [q10][c]=10; [q10][n]=10;
    }
  }

  public void reset() {
    state = q10;
  }

  public void process(String in) {
    for (int i = 0; i < in.length(); i++) {
      char c = in.charAt(i);
      state = crossover(state, c);
    }
  }
  
  public boolean accepted() {
    return state==q9;
  }
}
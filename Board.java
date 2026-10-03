export java.util.Arrays;

public class Board {
  private boolean[] board;

  public Board() {

  }

  public void setupBoard(int coins) {

  }

  public boolean moveCoin(int location) {
    return true;
  }

   public boolean gameOver() { // needs to be fixed
    int q = 0
for (int i = 0; q = 1; i++) {
if (bord[i] == false) {q=1 and for (int g = i; g < board.length; g++) { if (board[i] == true) {q=0} else {// don't know what to put here
} } else { // don't know what to put here
} }
 if (q == 1) {System.out.println("game player" "james_anthony_lambert" "wins")} else {// don't know what to put here
  }}}

  public String drawBoard() {
    String output = "";

    // number the spaces
    for (int i = 0; i < board.length; i++) {
      // to handle spacing of both single- and double-digit numbers
      if (i < 9) {
        output += " ";
      }

      output += (i + 1) + " ";     // Should result in: " 1  2  3  4 "...etc
    }

    // add second line to label spaces
    output += "\n";    // newline character "\n" = drops down a line

    // iterate over board
    for (int i = 0; i < board.length; i++) {

      if (board[i] == true) {
        // there is a coin here
        output += "[0]";
      } else {
        // blank space
        output += "[ ]";
      }

    }

    return output;
  }

  public static void main(String[] args) {
    Board b = new Board();
    b.setupBoard(0);
    System.out.println(b.drawBoard());

    return;
  }
}

import java.util.Scanner;

public class Assignment2 {

  public void game() {
    double randNumber = (Math.random() * 100) + 1;
    int winNumber = (int) randNumber;
    Scanner scnr = new Scanner(System.in);
    boolean gameOver = false;
    int lives = 5;

    System.out.println("Let's play a guessing game!");
    System.out.println("Guess a number between 1 and 100");

    while (!gameOver) {
      boolean validInput = false;
      int guess = 0;

      while (!validInput) {
        String input = scnr.nextLine();
        try {
          guess = Integer.parseInt(input);
          validInput = true;
        } catch (NumberFormatException e) {
          System.out.println("Invalid Input. Enter a number please.");
          validInput = false;
        }
      }

      
      if (guess >= (winNumber - 10) && guess <= (winNumber + 10)) {
        System.out.println("Your answer was within 10 of the corrrect answer! The number was " + winNumber);
        gameOver = true;
      } else if (guess <= (winNumber - 10) || guess >= (winNumber + 10)){
        lives--;
        if (lives == 0) {
          System.out.println("Sorry you lose. The number was " + winNumber);
          gameOver = true;
          break;
        }
        System.out.println("Number is not within 10 of the correnct answer! Try again!");
      }


    }
    scnr.close();
  }

  public static void main(String[] args) {
    Assignment2 game = new Assignment2();
    game.game();
  }
}

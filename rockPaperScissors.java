import java.util.Scanner;

public class rockPaperScissors {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Generate random number between 0 and 2 inclusive
    int computerPick = (int) (System.currentTimeMillis() % 3);

    // Prompt the user to enter a number 0, 1, or 2
    System.out.println("Enter a number for choosing rock(0), paper(1), or scissors(2): ");
    int userChoice = input.nextInt();
    System.out.println(" You picked " + userChoice);

    // Display the computer's choice
    System.out.println("The computer picked " + computerPick);

    // Determine the winner
    if (computerPick == userChoice) {
      System.out.println("It's a tie!");
    } else if (computerPick == 0 && userChoice == 1) {
      System.out.println("You win!");
    } else if (computerPick == 1 && userChoice == 2) {
      System.out.println("You win!");
    } else if (computerPick == 2 && userChoice == 0) {
      System.out.println("You win!");
    } else if (computerPick == 0 && userChoice == 2) {
      System.out.println("You lost!");
    } else if (computerPick == 1 && userChoice == 0) {
      System.out.println("You lost!");
    } else if (computerPick == 2 && userChoice == 1) {
      System.out.println("You lost!");
    } else {
      System.out.println("That's not an option!");
    }

    input.close();

  } 

} 

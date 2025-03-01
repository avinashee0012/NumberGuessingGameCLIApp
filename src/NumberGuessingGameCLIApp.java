import java.util.Scanner;

public class NumberGuessingGameCLIApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n****** Welcome to the Number Guessing Game! ******\nRule: I will think of a number between 1 and 100. You have to guess the number within given chances.");
        
        boolean playAgain = true;

        while (playAgain == true) {
            System.out.print("\nPlease select the difficulty level:\n1. Easy (10 chances)\t2. Medium (5 chances)\t3. Hard (3 chances)\n\nEnter your choice: ");
            int difficultyLevel = scanner.nextInt();
            GameManager gm = new GameManager(scanner, difficultyLevel);
            gm.playGame();
            System.out.println("\nWanna play again? (y/n)");
            String playAgainChoice = scanner.next();
            playAgain = (playAgainChoice.equals("y")) ? true : false;
        }

        scanner.close();
        System.out.println("\nExiting game. See you again soon!");
    }
}

import java.util.Scanner;

public class GameManager {

    // FIELDS
    private int computerGuessedNum;
    private int chances;
    private int attempts;
    private char gameStatus;
    private Scanner sc;

    // CONSTRUCTOR
    public GameManager(Scanner scanner, int difficultyLevel) {
        setChances(difficultyLevel);
        this.computerGuessedNum = getComputerGuessedNumber();
        this.attempts = 0;
        this.gameStatus = 'P';
        this.sc = scanner;
    }

    // GETTERS AND SETTERS
    public void setChances(int difficultyLevel) {
        switch (difficultyLevel) {
            case 1:
                this.chances = 10;
                break;
            case 2:
                this.chances = 5;
                break;
            case 3:
                this.chances = 3;
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }

    // METHODS

    void playGame() {
        sc = new Scanner(System.in);
        while(gameStatus == 'P'){
            System.out.print("\nEnter your guess: ");
            int userGuessedNum = sc.nextInt();
            this.attempts++;
            checkGameStatus(userGuessedNum);
        }
    }

    // HELPER METHODS
    private int getComputerGuessedNumber() {
        double num =  (Math.random() * 100);
        System.out.printf("\nI've thought of a number between 1 and 100. You have %d chances to guess.\nLet's start the game!\n", this.chances);
        return (int) num;
    }

    private void checkGameStatus(int userGuessedNum) {
        if(userGuessedNum ==  computerGuessedNum) {
            System.out.printf("\nCongratulations! You guessed the correct number in %d attempts.\n", attempts);
            gameStatus = 'W';
        } else if(userGuessedNum > computerGuessedNum) {
            System.out.printf("Incorrect! The number is less than %d.\n", userGuessedNum);
        } else {
            System.out.printf("Incorrect! The number is more than %d.\n", userGuessedNum);
        }

        if(attempts == chances) {
            System.out.println("\nBad Luck! You have run out of chances.");
            gameStatus = 'L';
        }
    }   

}

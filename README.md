# [COMPLETE] Number Guessing Game CLI App

A simple number guessing command line game where the computer randomly selects a number and the user has to guess it. The user will be given a limited number of chances to guess the number. If the user guesses the number correctly, the game will end, and the user will win. Otherwise, the game will continue until the user runs out of chances.

Project does not use a dependency management tool and hence, is done manually. JAR file includes all dependencies.

### Technologies Used:
1. Java - for programming
2. Git - for versioning
3. GitHub - as remote repository for codebase

### Installation
1. Clone the repo
```bash
git clone git@github.com:avinashee0012/NumberGuessingGameCLIApp .git
cd NumberGuessingGameCLIApp 
```
2. Run the jar file
```bash
java -jar NumberGuessingGameCLIApp.jar
```
### Usage Example
```txt

****** Welcome to the Number Guessing Game! ******
Rule: I will think of a number between 1 and 100. You have to guess the number within given chances.

Please select the difficulty level:
1. Easy (10 chances)    2. Medium (5 chances)   3. Hard (3 chances)

Enter your choice: 3

I've thought of a number between 1 and 100. You have 3 chances to guess.
Let's start the game!

Enter your guess: 15
Incorrect! The number is more than 15.

Enter your guess: 30
Incorrect! The number is less than 20.

Enter your guess: 25
Incorrect! The number is less than 25.

Bad Luck! You have run out of chances.

Wanna play again? (y/n)
y

Please select the difficulty level:
1. Easy (10 chances)    2. Medium (5 chances)   3. Hard (3 chances)

Enter your choice: 2

I've thought of a number between 1 and 100. You have 10 chances to guess.
Let's start the game!

Enter your guess: 15
Incorrect! The number is less than 15.

Enter your guess: 10

Congratulations! You guessed the correct number in 2 attempts.

Wanna play again? (y/n)
n

Exiting game. See you again soon!
```
_____

Future Releases:
1. Add a timer to see how long it takes the user to guess the number.
2. Implement a hint system that provides clues to the user if they are stuck.
3. Keep track of the user’s high score (i.e., the fewest number of attempts it took to guess the number under a specific difficulty level).

Project Idea: [roadmap.sh](https://roadmap.sh/projects/number-guessing-game) 
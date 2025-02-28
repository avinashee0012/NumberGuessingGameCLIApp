# [Ongoing] Number Guessing Game CLI App

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

### Usage Example
```bash
****** Welcome to the Number Guessing Game! ******
Type "q" to exit at any stage.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2

I've thought of a number between 1 and 100. You have 5 chances to guess. 
Let's start the game!

Enter your guess: 50
Incorrect! The number is less than 50.

Enter your guess: 25
Incorrect! The number is greater than 25.

Enter your guess: 35
Incorrect! The number is less than 30.

Enter your guess: 30
Congratulations! You guessed the correct number in 4 attempts.

Wanna play again? (y/n)
y

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: q

Exiting game. See you again soon!
```
_____

Future Releases:
1. Add a timer to see how long it takes the user to guess the number.
2. Implement a hint system that provides clues to the user if they are stuck.
3. Keep track of the user’s high score (i.e., the fewest number of attempts it took to guess the number under a specific difficulty level).

Project Idea: [roadmap.sh](https://roadmap.sh/projects/number-guessing-game) 
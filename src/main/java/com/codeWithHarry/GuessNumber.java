package com.codeWithHarry;
import java.util.Scanner;

public class GuessNumber {
    int guessCount = 0;
    private final int randomNumber = (int) (Math.random() * 100);
    int userEnteredNumber;


    public int getUserEnteredNumber(){
        return userEnteredNumber;
    }

    public void setUserEnteredNumber(int userEnteredNumber){
        this.userEnteredNumber = userEnteredNumber;
        guessCount++;
    }

    public int getRandomNumber(){
        return randomNumber;
    }

    public int getGuessCount(){
        return guessCount;
    }


    public void play(){
        Scanner scanner = new Scanner(System.in);
        while (true) {  // Infinite loop, will break when correct
            System.out.print("Please enter a number: ");
            userEnteredNumber = scanner.nextInt();
            scanner.close();
            guessCount++;

            if (getUserEnteredNumber() == getRandomNumber()) {
                System.out.println("Hurray! You chose the correct number in " + getGuessCount() + " guesses.");
                break; // better than System.exit(0)
            } else if (getUserEnteredNumber() < getRandomNumber()) {
                System.out.println("Your entered number " + getUserEnteredNumber() + " is less than the opponent's number.");
            } else {
                System.out.println("Your entered number " + getUserEnteredNumber() + " is greater than the opponent's number.");
            }
        }
    }
}

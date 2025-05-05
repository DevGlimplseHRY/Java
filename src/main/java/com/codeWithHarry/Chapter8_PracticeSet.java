package com.codeWithHarry;


import java.util.Scanner;
public class Chapter8_PracticeSet {
    public static void main(String[] args) {
//        Employee employee1 = new Employee();
//        employee1.setSalary(32663);
//        System.out.println(employee1.getSalary());
//        employee1.setSalary(32);
//        System.out.println(employee1.getSalary());
//
//        CellPhone mi = new CellPhone();
//        mi.ring();
//        mi.vibrate();


//        Problem 2
//        int guessCount = 0;
//        int randomNumber = (int) (Math.random() * 10);
//        System.out.println("Random number is: " + randomNumber);
//        while (true) {
            Scanner scanner = new Scanner(System.in);
//            System.out.print("Please enter a number: ");
//            int userEnteredNumber = scanner.nextInt();
//            guessCount++;
//
//            if (userEnteredNumber == randomNumber) {
//                System.out.println("Hurray! You choose the same number in " + guessCount + " guess.");
//                System.exit(0);
//            } else if (userEnteredNumber < randomNumber) {
//                System.out.println("Your entered number " + userEnteredNumber + " is less than " + randomNumber);
//            } else {
//                System.out.println("Your entered number " + userEnteredNumber + " is greater than " + randomNumber);
//            }
//        }

//        GuessNumber object1 = new GuessNumber();
//        System.out.println("Random number is: " + object1.getRandomNumber());
//        System.out.print("Please enter a number: ");
//        object1.userEnteredNumber = scanner.nextInt();
//        object1.guessCount++;
//        if (object1.getUserEnteredNumber() == object1.getRandomNumber()) {
//            System.out.println("Hurray! You choose the same number in " + object1.getGuessCount() + " guess.");
//            System.exit(0);
//        }else if (object1.getUserEnteredNumber() < object1.getRandomNumber()) {
//            System.out.println("Your entered number " + object1.getUserEnteredNumber() + " is less than opponent's number.");
//        } else {
//            System.out.println("Your entered number " + object1.getUserEnteredNumber() + " is greater than opponent's number.");
//        }
//
//        while (object1.getUserEnteredNumber() != object1.getRandomNumber()){
//            System.out.print("Please enter another number: ");
//            object1.userEnteredNumber = scanner.nextInt();
//            object1.guessCount++;
//            if (object1.getUserEnteredNumber() == object1.getRandomNumber()) {
//                System.out.println("Hurray! You choose the same number in " + object1.getGuessCount() + " guess.");
//                System.exit(0);
//            }
//            else if (object1.getUserEnteredNumber() < object1.getRandomNumber()) {
//                System.out.println("Your entered number " + object1.getUserEnteredNumber() + " is less than opponent's number.");
//            } else {
//                System.out.println("Your entered number " + object1.getUserEnteredNumber() + " is greater than opponent's number.");
//            }
//        }

//        Optimized code
//        GuessNumber object1 = new GuessNumber();
//
//        while (true) {  // Infinite loop, will break when correct
//            System.out.print("Please enter a number: ");
//            object1.userEnteredNumber = scanner.nextInt();
//            object1.guessCount++;
//
//            if (object1.getUserEnteredNumber() == object1.getRandomNumber()) {
//                System.out.println("Hurray! You chose the correct number in " + object1.getGuessCount() + " guesses.");
//                break; // better than System.exit(0)
//            } else if (object1.getUserEnteredNumber() < object1.getRandomNumber()) {
//                System.out.println("Your entered number " + object1.getUserEnteredNumber() + " is less than the opponent's number.");
//            } else {
//                System.out.println("Your entered number " + object1.getUserEnteredNumber() + " is greater than the opponent's number.");
//            }
//        }

//        GuessNumber object1 = new GuessNumber();
//        object1.play();

//        Cylinder cylinder1 = new Cylinder();
//        cylinder1.radius = 4;
//        cylinder1.height = 3;
//        System.out.println(cylinder1.getVolume());
//        System.out.println(cylinder1.getSurfaceArea());

       Phone obj = new SmartPhone();
       obj.on();

    }
}

        class Phone{
            int memory;

             void on(){
                System.out.println("Turning on phone...");
                }

                Phone(){

                }
                Phone(int memory){
                    this.memory = memory;
                }

            }

        class SmartPhone extends Phone{
            
                void on(){
                            System.out.println("Turning on smartPhone...");
                        }
                    }


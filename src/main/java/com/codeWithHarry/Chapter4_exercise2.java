package com.codeWithHarry;
import java.util.Scanner;
public class Chapter4_exercise2 {
    public static void main(String[] args) {
//        double number =  Math.random()*100;
//        String you, your_opponent;
        String final_winner;
        int your_win_chance = 0;
        int your_opponent_win_chance = 0;
//        1 = rock, 2 = paper, 3 = scissor
//        1 & 2 = 2
//        1 & 3 = 1
//        2 & 3 = 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your 1st move: ");
        int your_1st_move = scanner.nextInt();
        System.out.print("Enter your opponent 1st move: ");
        int your_opponent_1st_move = scanner.nextInt();
        System.out.print("Enter your 2nd move: ");
        int your_2nd_move = scanner.nextInt();
        System.out.print("Enter your opponent 2nd move: ");
        int your_opponent_2nd_move = scanner.nextInt();
        System.out.print("Enter your 3rd move: ");
        int your_3rd_move = scanner.nextInt();
        System.out.print("Enter your opponent 3rd move: ");
        int your_opponent_3rd_move = scanner.nextInt();

        if(your_1st_move == 1 && your_opponent_1st_move == 2){
            your_opponent_win_chance++;
        } else if (your_2nd_move == 1 && your_opponent_2nd_move == 3) {
            your_win_chance++;
        } else if (your_3rd_move == 2 && your_opponent_3rd_move == 3) {
            your_opponent_win_chance++;
        }

        if (your_win_chance > your_opponent_win_chance){
            System.out.println("Congrats! You're the winner.");
        }else {
            System.out.println("Congrats! Your opponent is the winner.");
        }
    }
}
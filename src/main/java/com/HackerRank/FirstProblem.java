package com.HackerRank;
import java.io.*;
import java.util.*;

public class FirstProblem {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            scanner.close();
            String newStr = "";

            int originalStringLastCharacterIndex = -1;
            int strLength = str.length();

            for(int i = 0; i < strLength; i++){
//                if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
//                    newStr += str.charAt(i);
//                    originalStringLastCharacterIndex = i;
//                }


                if(str.charAt(i) < 'A' && str.charAt(i) > 'Z'){

                }
//                if(str.charAt(i) < 0 && str.charAt(i) > 9){
//                    newStr += str.charAt(i);
////                    originalStringLastCharacterIndex = i;
//                }
            }
//            for(int j = 0; j < (15 - strLength); j++){
//                newStr += ' ';
//            }

            for(int i = originalStringLastCharacterIndex +1; i < 15; i++){
                newStr += ' ';
            }
            if((strLength - (originalStringLastCharacterIndex+1)) == 1){
                newStr += "00";
            }else if((strLength - (originalStringLastCharacterIndex+1)) == 2){
                newStr += "0";
            }
            for(int i = originalStringLastCharacterIndex+1; i < strLength; i++){
                newStr += str.charAt(i);
            }
            System.out.printf(newStr);
        }

}

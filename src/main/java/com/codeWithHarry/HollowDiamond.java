package com.codeWithHarry;

public class HollowDiamond {
    public static void main(String[] args) {
        for (int i = 3; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }

//        for (int i = 3; i > 0; i--){
//            for (int j = i; j > 0; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        for (int i = 1; i < 3; i++){
            for (int j = i; j >= 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}

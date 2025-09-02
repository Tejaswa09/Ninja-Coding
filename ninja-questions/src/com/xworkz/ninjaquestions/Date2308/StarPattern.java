package com.xworkz.ninjaquestions.Date2308;

public class StarPattern {
    public static void main(String[] args) {
        int k=2;
        for (int i = 1; i <= 9; i++) {
            if (i < 6) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }else {

                for (int j=i-k;j>=1;j--){
                    System.out.print("*\t");
                }
                System.out.println();
                k=k+2;
            }
        }

    }
}

package com.xworkz.ninjaquestions.Date2308;

public class NumberPattern1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int countForJ = i;

            for (int j = countForJ; j >= 1; j--) {
                System.out.print(j + "\t");
            }

            for (int k= 1; k< i;k++){


                    System.out.print(k+1 +"\t");

            }

            System.out.println();
        }
    }
}

package com.xworkz.ninjaquestions.Date2008;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 13;
        if (isEven(number)) {
            System.out.println("Even");
        }else {
            System.out.println( "Odd");
        }

    }

    private static boolean isEven(int number) {
        if (number%2==0){
            return true;
        }
        return false;
    }
}

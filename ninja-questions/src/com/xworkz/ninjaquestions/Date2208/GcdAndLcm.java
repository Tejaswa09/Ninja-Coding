package com.xworkz.ninjaquestions.Date2208;

public class GcdAndLcm {
    public static void main(String[] args) {
        int number1=12;
        int number2=8;

        int GCD= getGCD(number1,number2);
        int LCM = (Math.abs(number1*number2))/ GCD;

        System.out.println("GCD is "+GCD);
        System.out.println("LCM is "+LCM);
    }

    private static int getGCD(int number1, int number2) {
        // Euclidean principle state that the GCD of two numbers is same as the if the larger number is replaced with remainder of large%small

        if(number2 == 0) return number1;

        return getGCD(number2,number1%number2);
    }
}

package com.xworkz.ninjaquestions.Date2008;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int number = 21;
        System.out.println("Factorial of "+number+" is "+factorial(number));
    }

    private static BigInteger factorial(int number) {
        BigInteger result= BigInteger.valueOf(1);
        if (number<0){
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        if (number != 0){
            for (int i = 1 ;i <= number;i++){
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
        return result;
    }
}

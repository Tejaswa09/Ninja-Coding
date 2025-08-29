package com.xworkz.ninjaquestions.Date2208;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(isPerfectNumber(number));
    }

    private static boolean isPerfectNumber(int number) {
        int sumOfDivisors=1;

        for (int i =2;i*i <= number ;i++){
            if (number%i ==0){
                sumOfDivisors = sumOfDivisors + i;
                sumOfDivisors += (number/i);
            }

        }
        return sumOfDivisors == number;
    }
}

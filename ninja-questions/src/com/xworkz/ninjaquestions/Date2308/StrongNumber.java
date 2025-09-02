package com.xworkz.ninjaquestions.Date2308;

public class StrongNumber {
    public static void main(String[] args) {
        int number = 0;

        if (isStrongNumber(number)){
            System.out.println(number+" is Strong number");
        }else System.out.println(number+" is not Strong Number");
    }

    private static boolean isStrongNumber(int number) {
        int lastNumber = 0, remNumber = number,sum=0;

        if (number == 0) return  false;

        while (remNumber >0) {

            lastNumber = remNumber % 10;
            remNumber = remNumber / 10;
            sum = sum + fact(lastNumber);

        }

        return sum == number;

    }

    private static int fact(int lastNumber) {
        if (lastNumber == 0) return 1;

        int fact = lastNumber;

        for (int i=lastNumber-1;i>1;i--){
            fact = fact * i;
        }

        return fact;
    }
}

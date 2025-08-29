package com.xworkz.ninjaquestions.Date2008;

public class AmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        System.out.println(isAmstrongNumber(number));


    }

    public static boolean isAmstrongNumber(int number) {
        if (number != 0 && number > 0) {
            int numberLen = numberLength(number);
            double sum = 0;
            int temp_variable = number;
            for (int i = 0; i < numberLen; i++) {
                sum = Math.pow(temp_variable % 10, numberLen) + sum;
                temp_variable = temp_variable / 10;
            }

            if (sum == number) return true;

        }
        return false;
    }

    private static int numberLength(int number) {
        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        return count;
    }
}

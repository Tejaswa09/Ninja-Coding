package com.xworkz.ninjaquestions.Date2108;

public class ReverseInteger {
    public static void main(String[] args) {
        int number = 29092003;

        System.out.println("Reverse of " + number + " is " + rev_Integer(number));
    }

    private static Integer rev_Integer(int number) {
        int rev_Int = 0;
        int temp = number;

        while (temp > 0) {
            int lastNumber = 0;
            lastNumber = temp % 10;
             rev_Int= rev_Int * 10 + lastNumber;
            temp = temp / 10;
        }
        return rev_Int;
    }
}

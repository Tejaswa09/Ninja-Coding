package com.xworkz.ninjaquestions.Date2208;

public class ReverseString {
    public static void main(String[] args) {
        String string= "Tejaswa";
        System.out.println("Reverse of "+string+" is "+reverseOfString(string));
    }

    private static String reverseOfString(String string) {
        return String.valueOf(new StringBuilder(string).reverse());
    }
}

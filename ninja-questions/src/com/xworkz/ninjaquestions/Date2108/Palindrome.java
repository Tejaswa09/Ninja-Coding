package com.xworkz.ninjaquestions.Date2108;

public class Palindrome {
    public static void main(String[] args) {
        Integer number = 505;
        if (is_Palindrome(number)){
            System.out.println("Pallindrome");
        }else System.out.println("Not a Palindrome");
    }

    private static boolean is_Palindrome(Integer number) {
        String num = String.valueOf(number);
        StringBuilder rev_num = new StringBuilder(num).reverse();
        if (num.equals(rev_num.toString())) return true;
        return false;
    }

}

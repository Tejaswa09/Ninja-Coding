package com.xworkz.ninjaquestions.Date2208;

public class LeapYearOrNot {
    public static void main(String[] args) {
        int year = 2025;
        if (isLeapYear(year)) {
            System.out.println(year + " is leap year");
        } else System.out.println(year + " is not leap year");
    }

    private static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year%100!=0)) || year%400==0) return true;
        return false;
    }
}

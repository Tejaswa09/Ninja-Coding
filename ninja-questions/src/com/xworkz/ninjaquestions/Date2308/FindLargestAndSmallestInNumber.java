package com.xworkz.ninjaquestions.Date2308;

import java.util.HashMap;

public class FindLargestAndSmallestInNumber {
    public static void main(String[] args) {
        int number = 0;

       HashMap<String,Integer> largeAndSmall= largestAndSmallest(number);
        System.out.println("Large Number="+largeAndSmall.get("largeNumber"));
        System.out.println("Small Number="+largeAndSmall.get("smallNumber"));

    }

    private static HashMap<String, Integer> largestAndSmallest(int number) {
        int lastNumber= number % 10;
        Integer small=lastNumber,large=lastNumber;

        int rem= number/10;

        while (rem != 0){

            small = Math.min(small,lastNumber);
            large = Math.max(large,lastNumber);
            rem = rem/10;
        }
        HashMap<String, Integer> result = new HashMap<>();
        result.put("smallNumber",small);
        result.put("largeNumber",large);
        return result;

    }
}

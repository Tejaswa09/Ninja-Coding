package com.xworkz.ninjaquestions.Date2208;

import java.util.List;
import java.util.stream.Stream;

public class AverageofN {
    public static void main(String[] args) {
        Integer[] number={10,5,4,3,8,9,55};
        

        System.out.print(" average is "+average(number));
    }

    private static double average(Integer[] number) {
        int sum=0;

        for (int n: number){
            sum = sum + n;
        }

        return sum/number.length;
    }
}

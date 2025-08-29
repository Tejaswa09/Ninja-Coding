package com.xworkz.ninjaquestions.Date2108;

import java.util.ArrayList;
import java.util.List;

public class Fibonaci {
    public static void main(String[] args) {
        int n = 18;
        fibonacii(n);
    }

    private static void fibonacii(int n) {
        List<Integer> fibonaci=new ArrayList<>();
        fibonaci.add(0);
        fibonaci.add(1);

        if (n==1) {
            System.out.println(0);
            return;
        }

        for (int i = 2; i<n ;i++){
            fibonaci.add(fibonaci.get(i-1)+fibonaci.get(i-2));
        }
        fibonaci.stream().forEach(System.out::println);
    }
}

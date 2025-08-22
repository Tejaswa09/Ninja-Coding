package com.xworkz.ninjaquestions.Date2008;

public class IsPrime {
    public static void main(String[] args) {
        int number = 12;
        if (primeOrNot(number)){
            System.out.println(number+" is Prime");
        }else {
            System.out.println(number+" is Not Prime");
        }

    }
    public static boolean primeOrNot(int number){
        if (number<=1) return false;

        for (int i =2 ; i*i <=number; i++){
            if (number % i ==0) return false;
        }
        return true;
    }
}

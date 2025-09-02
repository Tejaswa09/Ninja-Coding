package com.xworkz.ninjaquestions.Date2308;

import java.util.ArrayList;
import java.util.List;

public class NumberPattern {
    public static void main(String[] args) {
        int number = 10,
                countForJ = number,
                countForK=number;
        int frontCount=1;
        int beginOfSeondPart = (number*(number+1)) - (number-1);
        int beginAfterFirstLine = beginOfSeondPart ;


        for (int i = 1; i<=number;i++){
            for (int j = countForJ; j>=1;j--) {
                System.out.print(frontCount++ + "\t");
            }countForJ--;

            for (int k= countForK;k>=1;k--){
                System.out.print(beginOfSeondPart++ +"\t");
            }countForK--;

            beginAfterFirstLine =beginAfterFirstLine-(number-i) ;
            beginOfSeondPart = beginAfterFirstLine;
            System.out.println();

        }
    }
}

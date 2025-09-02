package com.xworkz.ninjaquestions.Date2208;

import java.util.HashMap;


public class CountCOS {
    public static void main(String[] args) {
        String string= "Hello World! My Name is Tejaswa.";
        HashMap<String,Integer> values=findCountCOS(string);

        System.out.println("Vowels="+values.get("Vowels"));
        System.out.println("Consonants "+values.get("Consonants"));
        System.out.println("Spaces "+values.get("Space"));
    }

    private static HashMap<String,Integer> findCountCOS(String string) {
        HashMap<String,Integer> count = new HashMap<>();

        count.put("Vowels",0);
        count.put("Consonants",0);
        count.put("Space",0);
        string= string.toLowerCase();
        System.out.println(string);
        for (int i=0; i< string.length();i++){
            char ch = string.charAt(i);
            if (Character.isLetter(ch)){
                 if ("aeiou".indexOf(ch) != -1){
                     count.put("Vowels",count.get("Vowels")+1);
                 }else count.put("Consonants",count.get("Consonants")+1);
            }
            if (ch == ' '){
                count.put("Space",count.get("Space")+1);
            }
        }

        return count;
    }
}

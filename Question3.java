package com.company;

public class Number {
    public static void main(String[] args) {
        String s = "This is a java program";
        int count = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Total number of characters in string: " + count);
    }
}
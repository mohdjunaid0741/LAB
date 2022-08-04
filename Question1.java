package com.company;

public class Average {
    public static void main(String[] args) {
        int[] num = new int[]{2, 4, 6, 8, 10};
        //Calculating sum of all elements
        int sum =0;
        for (int x: num){
            sum += x;
        }
      float avg = sum / num.length;
        System.out.println("Average of elements in the array is: " + avg);
    }
}
package com.bridgelabz.logicalprograms;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 23456, reversed = 0;
        System.out.println("Original Number: " + num);
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
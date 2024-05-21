package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int num) {
        int reversed_num = 0;
        int num1 = num;
        while (num != 0) {
            reversed_num = reversed_num * 10 + num % 10;
            num /= 10;
        }

        return num1 == reversed_num;
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static String numberToWords(int num) {

        String[] numNames = {
                "Zero",
                " One",
                " Two",
                " Three",
                " Four",
                " Five",
                " Six",
                " Seven",
                " Eight",
                " Nine",
        };
        if (num < 0) {
            return "Invalid Value";
        }

        return "Hello";
    }
}

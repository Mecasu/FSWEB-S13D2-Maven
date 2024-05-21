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

        if (num < 0) {
            return "Invalid Value";
        }
        StringBuilder returnStr = new StringBuilder();
        char[] nums = String.valueOf(num).toCharArray();
        for (char number : nums) {
            switch (String.valueOf(number)) {
                case "0":
                    returnStr.append("Zero ");
                    break;
                case "1":
                    returnStr.append("One ");
                    break;
                case "2":
                    returnStr.append("Two ");
                    break;
                case "3":
                    returnStr.append("Three ");
                    break;
                case "4":
                    returnStr.append("Four ");
                    break;
                case "5":
                    returnStr.append("Five ");
                    break;
                case "6":
                    returnStr.append("Six ");
                    break;
                case "7":
                    returnStr.append("Seven ");
                    break;
                case "8":
                    returnStr.append("Eight ");
                    break;
                case "9":
                    returnStr.append("Nine ");
                    break;

            }

        }
        return (returnStr.toString().trim());
    }
}

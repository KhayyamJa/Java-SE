package control.flow;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        boolean result = isPalindrome(number);
        System.out.println(result ? "true" : "false");

    }

    public static boolean isPalindrome(int number) {
        String original = String.valueOf(Math.abs(number));
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);


    }

}
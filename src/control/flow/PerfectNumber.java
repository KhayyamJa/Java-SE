package control.flow;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        boolean result = isPerfectNumber(number);
        System.out.println(result);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int perfectNumber = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    perfectNumber += i;
                }
                if (perfectNumber == number) {
                    return true;
                }

            }
            return false;
        }
    }
}

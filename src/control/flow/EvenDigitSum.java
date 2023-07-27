package control.flow;

import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int result = getEvenDigitSum(number);
        System.out.println(result);
    }

    public static int getEvenDigitSum(int number) {
        int sumEvenDigits = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                int evenDigits = number % 10;
                if (evenDigits % 2 == 0) {
                    sumEvenDigits += evenDigits;

                }
                number /= 10;
            }
        }
        return sumEvenDigits;
    }
}


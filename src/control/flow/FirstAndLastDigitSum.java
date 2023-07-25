package control.flow;

import java.util.Scanner;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int result = sumFirstAndLastDigit(number);
        System.out.println(result);

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;

            while (number >= 10) {
                number /= 10;

            }
            return (lastDigit + number);
        }

    }
}




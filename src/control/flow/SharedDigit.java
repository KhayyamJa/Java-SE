package control.flow;

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a : ");
        int a = sc.nextInt();
        System.out.println("Enter number b : ");
        int b = sc.nextInt();

        boolean result = hasSharedDigit(a, b);
        System.out.println(result);

    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        } else if ((a % 10 == b / 10) || (a / 10 == b / 10)) {
            return true;
        } else {
            return false;
        }
    }
}


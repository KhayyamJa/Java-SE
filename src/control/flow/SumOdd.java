package control.flow;

import java.util.Scanner;
public class SumOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter start : ");
        int start = sc.nextInt();
        System.out.println("Enter end : ");
        int end = sc.nextInt();
        int result = sumOdd(start, end);
        System.out.println(result);


    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;

        } else {
            return false;

        }
    }


    public static int sumOdd(int start, int end) {
        if (end < start  || start < 0 || end < 0) {
            return -1;
        }
        else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }


            }
            return sum;
        }
    }
}
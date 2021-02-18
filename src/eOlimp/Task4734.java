package eOlimp;

import java.util.Scanner;

//100
public class Task4734 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int num1 = num.charAt(0) - '0';

        if (num.length() == 1) {
            if (num1 % 3 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");
            if (num1 % 6 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");
            if (num1 % 9 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }

        if (num.length() == 2) {
            int num2 = num.charAt(1) - '0';
            if ((num1 * 10 + num2) % 3 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");
            if ((num1 * 10 + num2) % 6 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");
            if ((num1 * 10 + num2) % 9 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }

        if (num.length() >= 3) {
            int sum = 0;
            int lastOne = num.charAt(num.length() - 1) - '0';
            for (int i = 0; i < num.length(); i++) {
                int nums = num.charAt(i) - '0';
                sum += nums;
            }

            if (sum % 3 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");

            if ((sum % 3 == 0) && (lastOne % 2 == 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            if (sum % 9 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }
}

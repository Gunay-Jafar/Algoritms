package eOlimp;

import java.util.Scanner;

//100
public class Task4733 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int one = a.charAt(0) - '0';

        if (a.length() == 1) {
            if (one % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            if (one % 4 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");
            if (one % 8 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        if (a.length() == 2) {
            int two = a.charAt(1) - '0';
            int num2R = one * 10 + two;
            if (num2R % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            if (num2R % 4 == 0) {
                System.out.println("Yes");
            } else
                System.out.println("No");
            if (num2R % 8 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }


        if (a.length() > 2) {

            int lastDigit = a.charAt(a.length() - 1) - '0';
            if (lastDigit % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            int lastDigit2 = a.charAt(a.length() - 2) - '0';

            if ((lastDigit2 * 10 + lastDigit) % 4 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            int lastDigit3 = a.charAt(a.length() - 3) - '0';

            if ((lastDigit3 * 100 + lastDigit2 * 10 + lastDigit) % 8 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}

package eOlimp;

import java.util.Scanner;

//100
public class Task4735 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int last = num.charAt(num.length() - 1) - '0';
        if ((last == 0) || (last == 5)) {
            System.out.println("Yes");
        } else
            System.out.println("No");

        if (last == 0) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}

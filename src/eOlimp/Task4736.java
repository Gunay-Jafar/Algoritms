package eOlimp;

import java.util.Scanner;

//100
public class Task4736 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int sumTek = 0;
        int sumCut = 0;

        for (int i = 0; i < num.length(); i = i + 2) {
            int numCut = num.charAt(i) - '0';
            sumCut += numCut;
        }

        for (int i = 1; i < num.length(); i = i + 2) {
            int numTek = num.charAt(i) - '0';
            sumTek += numTek;
        }

        if ((sumCut - sumTek) % 11 == 0) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}

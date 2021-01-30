package eOlimp;

import java.util.Scanner;

//100
public class Task4721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='5'){
                count++;
            }
        }

        System.out.println(count);
    }
}

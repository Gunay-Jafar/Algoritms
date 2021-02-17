package eOlimp;

import java.util.Scanner;

//100
public class Task4732 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibNum = scanner.nextInt();
        int num0 = 1;
        int num1 = 1;

        int sum = 0;
        if (fibNum==0){
            System.out.println("1");
            return;
        }

        if (fibNum==1){
            System.out.println("1");
            return;
        }

        if (fibNum==2){
            System.out.println("2");
            return;
        }

        for (int i = 1; i <= fibNum; i++) {
            if (sum == fibNum) {
                System.out.println(i);
                break;
            } else {
                sum = num0 + num1;
                num0 = num1;
                num1 = sum;
            }
        }
    }
}

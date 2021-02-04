package eOlimp;

import java.util.Scanner;

//100
public class Task4725 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long sum=0;
        for (int i=1;i<=a;i++){
            long kvd= (long) Math.pow(i,2);
            sum+=kvd;
        }
        System.out.println(sum);
    }
}

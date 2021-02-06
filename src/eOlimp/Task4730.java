package eOlimp;

import java.util.Scanner;

//96
public class Task4730 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t1=1,t2=1;
        int num= scanner.nextInt();

        int sum = 0;

        for (int i=2;i<=num;i++){
            sum=t1+t2;
            t1=t2;
            t2=sum;
        }

        System.out.println(sum);
    }
}

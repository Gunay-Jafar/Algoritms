package eOlimp;

import java.util.Scanner;

//100
public class Task4730 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t1=1,t2=1;
        int num= scanner.nextInt();

        if (num==0){
            System.out.println("1");
            return;
        }

        if (num==1){
            System.out.println("1");
            return;
        }
        int sum = 0;

        for (int i=2;i<=num;i++){
            sum=t1+t2;
            t1=t2;
            t2=sum;
        }

        System.out.println(sum);
    }
}

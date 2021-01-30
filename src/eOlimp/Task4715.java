package eOlimp;

import java.util.Scanner;

//100
public class Task4715 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int onluq=n/10;
        int teklik=n%10;
        int reqemSum=onluq+teklik;

        int newN=((n-reqemSum)/9)+1;
        int lastN=n%10;
        String num=String.valueOf(newN).concat(String.valueOf(lastN));
        int num2=Integer.parseInt(num)-10;
        System.out.println(num2);
    }
}

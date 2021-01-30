package eOlimp;

import java.util.Scanner;

//100
public class Task4717 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int bucket=k%n;
        System.out.println(bucket);
    }
}

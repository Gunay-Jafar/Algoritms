package eOlimp;

import java.util.Scanner;

public class Task4736 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long a=scanner.nextInt();
        if (a%11==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

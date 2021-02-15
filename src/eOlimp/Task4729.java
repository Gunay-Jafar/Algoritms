package eOlimp;

import java.util.Scanner;

//100
public class Task4729 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        while (true){
            int a=scanner.nextInt();
            if (a!=0){
              count++;
            }else{
                break;
            }
        }
        System.out.println(count);

    }
}

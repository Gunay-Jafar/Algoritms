package eOlimp;

import java.util.Scanner;

//100
public class Task4731 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValue=0;
        int count=0;

        while (true) {
            int a=scanner.nextInt();
            if (a==0){
                break;
            }
            if (maxValue<a){
                maxValue=a;
                count=1;
            }else if(maxValue==a){
                count++;
            }
        }

        System.out.println(count);

    }
}

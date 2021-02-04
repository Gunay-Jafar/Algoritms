package eOlimp;

import java.util.Scanner;

//100
public class Task4726 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
         int sumF=0;

        for (int i = 0; i < str.length(); i++) {
            char ff=str.charAt(i);
            if (ff=='f'){
                sumF++;
            }
        }

        int first=str.indexOf('f');
        if (sumF==1){
            System.out.println(first);
        }else if (sumF>1){
            int second=str.indexOf("f",first);
            int last=str.lastIndexOf("f");
            System.out.println(second+" "+last);

        }
    }
}

package Testpad.String;

import java.util.Scanner;

public class getDesiredString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(Syatem.in);
        int t=sc.nextInt();

        while(t-->0){
            String s=sc.nextLine();
            System.out.println(getDesiredString(s));
        }
    }    
}

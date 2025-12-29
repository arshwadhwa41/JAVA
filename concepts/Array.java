import java.util.*;
public class Array {
    public static void main(String[] args) {
        int marks[]=new int[3];
        marks[0]=92;
        marks[1]=91;
        marks[2]=95;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i=0;i<3;i++){System.out.println(marks[i]);}

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int numbers[]=new int[num];
        for(int i=0;i<num;i++){numbers[i]=sc.nextInt(i);}//array input
        for(int i=0;i<num;i++){System.out.println(numbers[i]);}//array output
        
        //find element in ARRAY
        int nu=sc.nextInt();
        int tar=sc.nextInt();

        int number[]=new int[nu];
        for(int i=0;i<nu;i++){number[i]=sc.nextInt(i);}//array input
        for(int i=0;i<nu;i++){if(number[i]==tar){System.out.println("found the target at index:"+i+1);}else{System.out.println("not found in array!");}}//array checking

        sc.close();
    }
}

import java.util.*;
public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        
        System.out.println(sb);//Tony

        //char at index 0
        System.out.println(sb.charAt(0));//T

        //Set Character at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);//Pony
        sb.setCharAt(3,'d');
        System.out.println(sb);//Pond

        //length : use to find the length of string.
        System.out.println(sb.length());//4

        //insert: use to add the letters to string
        sb.insert(4,'y')
        System.out.println(sb);//Pondy
        sb.insert(2,'n')
        System.out.println(sb);//Ponndy

        //delete: use to delete from start index letter to ending index letter where ending is non inclusive;
        sb.delete(2,3)//Pondy : where 'n' is removed from 2nd index.

        //append : use to add at the last of the string
        sb.append(" is my good friend!");
        System.out.println(sb);//Pondy is my good friend!
    }
}

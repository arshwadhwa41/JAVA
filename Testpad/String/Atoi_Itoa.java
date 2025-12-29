import java.util.*;

package Testpad.String;

public class Atoi_Itoa {
    // ------------------ EASY ATOI (string → int) ---------------------
    public static int atoi(String s) {
        return atoiRec(s, 0);
    }

    public static int atoiRec(String s, int index) {
        if (index == s.length()) return 0;

        int digit = s.charAt(index) - '0';

        return digit + 10 * atoiRec(s, index + 1);
    }


    // ------------------ EASY ITOA (int → string) ---------------------
    public static String itoa(int num) {
        if (num == 0) return "0";
        return itoaRec(num);
    }

    public static String itoaRec(int num) {
        if (num == 0) return "";

        int digit = num % 10;
        return itoaRec(num / 10) + (char)(digit + '0');
    }


    // --------------------------- MAIN --------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String str = sc.next();     // example "100"
            int num = sc.nextInt();     // example 135

            str = str.replace("\"", "");

            int a = atoi(str);
            String b = "\"" + itoa(num) + "\"";

            System.out.print(a+" "+b);
        }
    }
}
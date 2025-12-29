package Testpad.String;

import java.util.Scanner;

public class Substr {
    public static boolean isSubsequence(String str1, String str2) {

        int i = 0;  // pointer for str1
        int j = 0;  // pointer for str2

        // Go through all letters of str1
        while (i < str1.length() && j < str2.length()) {

            // If letters match, move pointer of str2
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }

            // Always move pointer of str1
            i++;
        }

        // If j reached end, all letters of str2 were found
        return (j == str2.length());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases
        sc.nextLine(); // clear the leftover newline

        while (t-- > 0) {

            // Read the entire line and split into two words
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String str1 = parts[0];
            String str2 = parts[1];

            // Call function
            boolean result = isSubsequence(str1, str2);

            // Print answer
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

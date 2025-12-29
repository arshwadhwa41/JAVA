package java_questions.ST2;

public class SimpleTitleCase {

    public static String toTitleCaseEasy(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // 1. String ko chote (lowercase) mein badal do taaki beech ke letters chote rahein.
        String lowerCaseInput = input.toLowerCase();
        
        // 2. String ko shabdon (words) mein split karo.
        String[] words = lowerCaseInput.split(" ");
        
        StringBuilder result = new StringBuilder();

        // 3. Har shabd (word) par loop chalao.
        for (String word : words) {
            if (word.length() > 0) {
                // Pehla akshar lo aur use capital karo.
                String firstLetter = word.substring(0, 1).toUpperCase();
                
                // Baaki aksharon ko jodd do.
                String remaining = word.substring(1);
                
                // Result mein naya shabd jodd do aur ek space bhi.
                result.append(firstLetter).append(remaining).append(" ");
            }
        }

        // Aakhri extra space (jo humne har shabd ke baad joda tha) ko hata do.
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String name = "arsh wadhwa";
        System.out.println("Original: " + name);
        System.out.println("Converted: " + toTitleCaseEasy(name)); // Output: Arsh Wadhwa
    }
}

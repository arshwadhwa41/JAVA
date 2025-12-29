package java_questions.CodeChallange1;

public class TheCompanyLogo {
    public static char findMinIndexLetter(String husbandName, String wifeName) {
        // 1. Minimum index को track करने के लिए इसे एक बड़ी वैल्यू (जैसे -1) से initialize करें
        int minIndex = Integer.MAX_VALUE;
        // 2. वह character जो minimum index पर मिला है, उसे track करने के लिए
        char resultChar = '\0'; // '\0' means 'null' character (initial state)

        // पत्नी के नाम के हर अक्षर पर Iterate करें
        for (int i = 0; i < wifeName.length(); i++) {
            char wifeChar = wifeName.charAt(i);

            // 3. पति के नाम में इस अक्षर का index ढूंढें
            // indexOf() method अक्षर का पहला occurrence (minimum index) रिटर्न करता है।
            int currentFoundIndex = husbandName.indexOf(wifeChar);

            // 4. अगर अक्षर पति के नाम में मिला (index -1 नहीं है)
            if (currentFoundIndex != -1) {
                
                // 5. Check करें कि क्या यह index, अभी तक मिले minIndex से भी छोटा है?
                if (currentFoundIndex < minIndex) {
                    
                    // अगर हाँ, तो minIndex को update करें और resultChar को save करें
                    minIndex = currentFoundIndex;
                    resultChar = wifeChar;
                }
            }
        }

        // 6. अगर resultChar अभी भी '\0' है, तो कोई भी कॉमन अक्षर नहीं मिला।
        // लेकिन प्रश्न के अनुसार, हमें वह अक्षर return करना है जो criteria match करता है।
        return resultChar; 
    }

    public static void main(String[] args) {
        String husband = "Vicky";
        String wife = "Priya";
        
        // Output के लिए Names को lower case में बदलें ताकि case-sensitivity की दिक्कत न हो
        // (अगर सवाल में case-sensitivity का उल्लेख नहीं है)
        char letter = findMinIndexLetter(husband.toLowerCase(), wife.toLowerCase());
        
        if (letter != '\0') {
            System.out.println("पति का नाम (Husband Name): " + husband);
            System.out.println("पत्नी का नाम (Wife Name): " + wife);
            System.out.println("------------------------------------");
            System.out.println("वह अक्षर जो पत्नी के नाम का है और पति के नाम में न्यूनतम इंडेक्स पर है: **" + letter + "**");//i
        } else {
            System.out.println("पति और पत्नी के नाम में कोई भी कॉमन अक्षर नहीं मिला।");
        }
    }
}
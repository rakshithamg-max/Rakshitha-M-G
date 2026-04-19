 package AJ2;
import java.util.*;

public class string1 {
    public static void main(String[] args) {

        // 1. String Creation
        String str1 = "Hello";
        String str2 = "World";

        // 2. Length and Character Access
        System.out.println("Length: " + str1.length());
        System.out.println("Char at 1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("Equals: " + str1.equals("Hello"));
        System.out.println("CompareTo: " + str1.compareTo(str2));

        // 4. String Searching
        System.out.println("Contains 'lo': " + str1.contains("lo"));
        System.out.println("Index of 'l': " + str1.indexOf('l'));

        // 5. Substring
        System.out.println("Substring: " + str1.substring(1, 4));

        // 6. String Modification
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Replace: " + str1.replace('l', 'x'));

        // 7. Whitespace Handling
        String str3 = "  Java Programming  ";
        System.out.println("Trim: '" + str3.trim() + "'");

        // 8. Concatenation
        System.out.println("Concat: " + str1.concat(" " + str2));

        // 9. Splitting
        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        for (String w : words) {
            System.out.println(w);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 20);
        System.out.println(formatted);

        // 12. Email Validation
        String email = "test@gmail.com";
        if (email.contains("@") && email.startsWith("test") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}


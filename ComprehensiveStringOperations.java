/* Develop a java program for performing various string operations with different string handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations ,
 String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate
 Email with contains( ) and startsWith() and endsWith()*/


package prog3;
import java.util.*;

public class ComprehensiveStringOperations {
    public static void main(String[] args) {

        
        String str1 = "Hello";
        String str2 = "World";

        
        System.out.println("Length: " + str1.length());
        System.out.println("Char at index 1: " + str1.charAt(1));

        
        System.out.println("Equals: " + str1.equals("Hello"));
        System.out.println("CompareTo: " + str1.compareTo(str2));

        
        System.out.println("Contains 'lo': " + str1.contains("lo"));
        System.out.println("Index of 'l': " + str1.indexOf('l'));

        
        System.out.println("Substring: " + str1.substring(1, 4));

        
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Replace: " + str1.replace('l', 'x'));

        
        String str3 = "  Java Programming  ";
        System.out.println("Trimmed: '" + str3.trim() + "'");


        System.out.println("Concat: " + str1.concat(" " + str2));

        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        for (String w : words) {
            System.out.println(w);
        }

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println("StringBuilder: " + sb);

        String formatted = String.format("Name: %s, Age: %d", "John", 20);
        System.out.println(formatted);
        String email = "test@gmail.com";
        if (email.contains("@") && email.startsWith("test") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}

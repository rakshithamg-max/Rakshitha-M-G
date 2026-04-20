/*Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function
 isPalindrome():*/


package prog3b;
public class PalindromeUtility {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam"));
    }
}

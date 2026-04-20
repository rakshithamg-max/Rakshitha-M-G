/*Write a Java Program for Reversing the characters in a string using user defined function reverseString().
*/

package prog3b;
public class ReverseStringUtility {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Java"));
    }
}

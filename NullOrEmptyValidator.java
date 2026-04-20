/*Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
*/

package prog3b;
public class NullOrEmptyValidator {
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("   "));
    }
}

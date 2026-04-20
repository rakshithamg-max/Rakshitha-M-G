/* Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()

*/
package prog3c;
public class StringTruncator {
    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        System.out.println(truncate("Java Programming Language", 10));
    }
}

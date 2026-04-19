package prog3b;
public class WhitespaceUtility {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        System.out.println(removeWhitespace("Java Programming"));
    }
}

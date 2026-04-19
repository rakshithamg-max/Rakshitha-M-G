package prog3c;
public class NumericStringValidator {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("12345"));
        System.out.println(isNumeric("123a"));
    }
}

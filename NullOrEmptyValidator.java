package prog3b;
public class NullOrEmptyValidator {
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("   "));
    }
}
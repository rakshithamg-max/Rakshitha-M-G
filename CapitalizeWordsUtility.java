package prog3c;
public class CapitalizeWordsUtility {
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String w : words) {
            if (w.length() > 0) {
                result += Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase() + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWords("java programming language"));
    }
}

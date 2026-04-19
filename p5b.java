//5. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList 
//object by using remove by index

package AJ;
import java.util.*;

public class p5b {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        int n = 1; // delete 2nd element
        colors.remove(n);

        System.out.println(colors);
    }
}


//2. Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue"
//from the ArrayList
package AJ;
import java.util.*;

public class p2b {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        // Remove 2nd element (index 1)
	        colors.remove(1);

	        // Remove "Blue"
	        colors.remove("Blue");

	        System.out.println(colors);
	    }
	}

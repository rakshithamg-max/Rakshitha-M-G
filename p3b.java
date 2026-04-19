//3. Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort(ArrayListObj)
package AJ;
	import java.util.*;

	public class p3b{
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        Collections.sort(colors);

	        System.out.println(colors);
	    }
	}


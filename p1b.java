//1. Write a java program for getting different colors through ArrayList interface and search whether the color "Red" 
//is available or not

package AJ;
import java.util.*;

public class p1b {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        if (colors.contains("Red")) {
	            System.out.println("Red is available");
	        } else {
	            System.out.println("Red is not available");
	        }
	    }
	}


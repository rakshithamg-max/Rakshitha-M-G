//4. Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from 
//the ArrayList object by using SubList()

package AJ;
import java.util.*;

public class p4b{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        List<String> sub = colors.subList(0, 2);

        System.out.println(sub);
    }
}

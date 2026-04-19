//4. Write a Java program to display elements and their positions in a linked list (using 1_listobj.get(p))
package AJ;
import java.util.*;

public class p4c {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        for (int p = 0; p < list.size(); p++) {
            System.out.println("Position " + p + ": " + list.get(p));
        }
    }
}


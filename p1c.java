//1. Write a Java program to iterate through all elements in a linked list starting at the specified position 
//(2nd) using iterator (hint: Iterator iteratorobj = listobj.listIterator(1))
package AJ;
import java.util.*;

public class p1c {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        // Start from 2nd position (index 1)
        ListIterator<String> iteratorobj = list.listIterator(1);

        while (iteratorobj.hasNext()) {
            System.out.println(iteratorobj.next());
        }
    }
}
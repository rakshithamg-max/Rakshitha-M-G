//2. Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
package AJ;
import java.util.*;

public class p2c {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        Iterator<String> it = list.descendingIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}



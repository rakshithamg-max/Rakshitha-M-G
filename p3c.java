//3. Write a Java program to insert the specified element at the end of a linked list.(using 1_listobj.offerLast("Pink"))
package AJ;
import java.util.*;

public class p3c {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");

        list.offerLast("Pink");

        System.out.println(list);
    }
}

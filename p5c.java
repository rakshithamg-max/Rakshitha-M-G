//5. Write a Java program that swaps two elements (first and third elements) in a linked list (using Collections.swap(1_list, 0, 2))
//[give class name as p1c,p2c,.........]
package AJ;
import java.util.*;

public class p5c {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        // Swap 1st (index 0) and 3rd (index 2)
        Collections.swap(list, 0, 2);

        System.out.println(list);
    }
}


//1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform
//the following operations with different functions directed as follows 1. Adding elements, 2. Adding element at specific index, 
//3. Adding multiple elements, 4. Accessing elements, 5. Updating elements, 6. Removing elements, 7. Searching elements,
//8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
package AJ;
	import java.util.*;
	public class p1 {
	    public static void main(String[] args) {

	        // 1. Adding elements
	        ArrayList<String> arrayList = new ArrayList<>();
	        LinkedList<String> linkedList = new LinkedList<>();

	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");

	        // 2. Adding element at specific index
	        arrayList.add(1, "Mango");
	        linkedList.add(1, "Mango");

	        // 3. Adding multiple elements
	        List<String> extra = Arrays.asList("Grapes", "Pineapple");
	        arrayList.addAll(extra);
	        linkedList.addAll(extra);

	        // 4. Accessing elements
	        System.out.println("ArrayList Element: " + arrayList.get(2));

	        // 5. Updating elements
	        arrayList.set(0, "Kiwi");
	        linkedList.set(0, "Kiwi");

	        // 6. Removing elements
	        arrayList.remove("Banana");
	        linkedList.remove(2);

	        // 7. Searching elements
	        System.out.println("Contains Apple: " + arrayList.contains("Apple"));

	        // 8. List size
	        System.out.println("ArrayList Size: " + arrayList.size());

	        // 9. Iterating over list
	        System.out.println("For-each loop:");
	        for (String item : arrayList) {
	            System.out.println(item);
	        }

	        // 10. Using Iterator
	        System.out.println("Using Iterator:");
	        Iterator<String> it = arrayList.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        System.out.println("Sorted List: " + arrayList);

	        // 12. Sublist
	        List<String> sub = arrayList.subList(0, 2);
	        System.out.println("Sublist: " + sub);

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();

	        System.out.println("ArrayList after clear: " + arrayList);
	        System.out.println("LinkedList after clear: " + linkedList);
	    }
	}


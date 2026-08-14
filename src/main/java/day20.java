import java.util.ArrayList;
import java.util.Collections;

public class day20 {
    public static void main(String[] args) {
        System.out.println("ArrayList Operations: \n===================");
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");
        list1.add("Elderberry");
        list1.add("Fig");
        list1.add(0, "Avocado"); // Adding at index 0
        list1.set(4, "Grape"); // Modifying element at index 4
        list1.remove(2); // Removing element at index 2
        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)); // prints each element in the list
        }
        System.out.println("The size of the list is: ");

        System.out.println(list1.size()); // prints size of the list
        System.out.println("\n");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Zucchini");
        list2.add("Indian Fig");
        list2.add("Jackfruit");
        list2.add("Kiwi");
        Collections.sort(list2); // Sorting list2
        System.out.println("Sorted list2 contains: \n===================");
        for(String fruit : list2) {
            System.out.println(fruit); // prints each element in the sorted list2
        }
        System.out.println("\n");
         list1.addAll(list2); // Merging list2 into list1
        System.out.println("After merging, list1 contains: \n===================");
        for(String fruit : list1) {
            System.out.println(fruit); // prints each element in the merged list1
        }

        
    }
}

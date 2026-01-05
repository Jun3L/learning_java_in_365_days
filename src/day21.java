
import java.util.LinkedList;
public class day21 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("LinkedList contains: \n===================");
        //system.out.println(numbers[0]); // This line would cause an error
        System.out.println(numbers.get(1));
        numbers.remove(2);
        System.out.println("After removing element at index 2, LinkedList contains: \n===================");
        System.out.println(numbers);

      
    }
    
}

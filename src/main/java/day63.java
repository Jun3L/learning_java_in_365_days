import java.util.ArrayDeque;
public class day63 {
   public static void main(String[] args) {
     ArrayDeque<Integer> queue = new ArrayDeque<>();
     queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue); // Output: [20, 30, 40]
        System.out.println("remove element: " + queue.remove()); // Output: 20
        System.out.println(queue); // Output: [30, 40]  
        System.out.println("Top element: " + queue.peek()); // Output: 30
        System.out.println("Size of queue: " + queue.size()); // Output: 2
   }
}

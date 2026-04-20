import java.util.ArrayDeque;
public class day62 {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
       /*
       push() → add to top
       pop() → remove from top
       peek() → view top
       ArrayDeque → fast and modern way to use stacks
       */ 
    }
}

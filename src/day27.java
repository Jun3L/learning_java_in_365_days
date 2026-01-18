
import java.util.*;
public class day27 {
   public static void main(String[] args) {
     List<Integer> num = new ArrayList<>();
    num.add(10);
    num.add(7);
    num.add(5);
    num.add(9);
    System.out.println("List: " + num);
    Collections.sort(num);
    System.out.println("Sorted list: " + num);
   }
}

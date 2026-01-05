import java.util.TreeSet;
public class day23 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        //TreeSet stores elements in sorted order
        
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        for (Integer number : numbers) {
            System.out.println(number);
        }
     }
}

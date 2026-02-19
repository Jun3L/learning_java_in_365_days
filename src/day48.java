import java.util.*;
public class day48 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = numbers.stream()
                        .filter(n -> n % 2 == 0) // 2, 4
                        .mapToInt(n -> n * n) // 4, 16
                        .sum(); // 20
        System.out.println("Sum of squares of even numbers: " + result);
    }
}

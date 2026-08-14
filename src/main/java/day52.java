import java.util.*;
import java.util.stream.*;
public class day52 {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(10,130,45,13,89,25,150,200);
        List<Integer> topPrices = prices.stream()
        .filter(p -> p  > 50) // filter out price that are less than or equal to 50
        .sorted(Comparator.reverseOrder()) // sort the remaining prices in descending order
        .limit(3)// take the top 3 prices
        .collect(Collectors.toList()); // collect the result into a list
        System.out.println("Top expensive items: " + topPrices);
    }
}

import java.util.*;

public class day69 {
    static double getAverage(List<? extends Number> numbers) { //this is a bounded wildcard, it can accept any type that extends Number class
        double sum = 0;

        for (Number number : numbers) {

            sum += number.doubleValue();
        }
        return sum / numbers.size();
    }

    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(90, 87, 98, 93, 75);
        List<Double> temperature = Arrays.asList(78.9, 90.8, 23.5, 67.5, 12.5);
        System.out.println("Average of scores: " + getAverage(scores));
        System.out.println("Average of temperature: " + getAverage(temperature));
    }
}

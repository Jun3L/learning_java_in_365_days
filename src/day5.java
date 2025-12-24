import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Celsius : ");
        double celsius = s.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " °C" + " = " + fahrenheit + " °F");
        s.close();
    }
}

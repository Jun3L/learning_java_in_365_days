import java.util.*;
public class day61 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = s.nextLine();
    String reversed = new StringBuilder(input).reverse().toString();
    System.out.println("Reversed string: " + reversed);
    s.close();
  }
}

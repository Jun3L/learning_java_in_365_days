import java.util.Scanner;
public class day10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ans;
        do {
         System.out.print("Say anything('quit' to exit): ");
         ans = s.nextLine();
         if (!ans.equalsIgnoreCase("quit")) {
            System.out.println(ans);
         }
        } while (!ans.equalsIgnoreCase("quit"));
        System.out.println("Program end...");
        s.close();
    }
}

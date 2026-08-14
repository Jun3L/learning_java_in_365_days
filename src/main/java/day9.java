import java.util.Scanner;
public class day9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int fact = 1;
        int i = 1;
       while (i <= num) {
         fact = fact * i;
         i++;
       }
        System.out.println("The factorial of " + num + " is " + fact);
        s.close();
    }
}

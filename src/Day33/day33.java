package Day33;
import java.util.Scanner;
public class day33 {
    static void checkAge(int age) throws InvalidAgeException{
           if (age < 18) {
            throw new InvalidAgeException("Age must be 18 and above!!");
           }
           System.out.println("Access Granted");
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = s.nextInt();
            checkAge(age);
          
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        s.close();
    }
}

    
import java.util.Scanner;
public class day37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = s.nextLine();

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email.matches(regex)) {
            System.out.println("Valid email");
        }else{
            System.out.println("Invalid email");
        }
        s.close();
    }
}

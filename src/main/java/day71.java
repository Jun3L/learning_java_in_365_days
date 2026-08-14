import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = s.nextLine();
        System.out.print("Enter grade : ");
        int grade = s.nextInt();
        assert grade >= 0 : "Grade must be non-negative";
        assert grade <= 100 : "Grade must be less than or equal to 100";
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        s.close();
    }
}

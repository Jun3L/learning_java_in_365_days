import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class day40 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a date: ");
        String datestr = s.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(datestr, formatter);
        System.out.println(date);

        s.close();
    }
}

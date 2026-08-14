import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;;
public class day38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String txt = s.nextLine();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(txt);
        System.out.println("Numbers found: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        s.close();
    }
}

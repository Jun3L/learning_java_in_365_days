import java.nio.file.*;
import java.util.*;
public class day30 {
    public static void main(String[] args) {
        Path filepath = Paths.get("students.txt");
        List<String> students = new ArrayList<>();
        students.add("Anna, 20");
        students.add("Josh, 10");

        try {
            Files.write(filepath, students);
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        try {
            List<String> lines = Files.readAllLines(filepath);
                System.out.println("Reading files content: ");
                for (String line : lines) {
                    System.out.println(line);
                }
            
        } catch (Exception e) {
            System.out.println("Error reading a file: " + e.getMessage());
        }

    }
}

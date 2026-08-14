package Day28;
import java.util.*;
public class day28 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Junel", 19));
        students.add(new Student("John", 32));
        students.add(new Student("Joshua", 24));
        students.add(new Student("Rico", 18));
        Collections.sort(students, Comparator.comparingInt(s -> s.age));
        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}

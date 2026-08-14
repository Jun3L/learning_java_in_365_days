import java.util.*;
import java.util.stream.Collectors;
public class day49 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(2025007445, "Junel"),
            new Student(2025102785, "Rico"),
            new Student(2025459871, "Joseph")
        );

        Map<Integer, String> studentMap = students.stream()
                .collect(Collectors.toMap(
                    Student::getID, 
                    Student::getName
                ));              
           System.out.println(studentMap);
           System.out.println("Students Map: " + studentMap.size());
           System.out.println("Students in Map: " + studentMap.values());
           System.out.println("Student with ID 2025102785: " + studentMap.get(2025102785));
           System.out.println("Student in with ID 2025459871: " + studentMap.get(2025459871));
    }
}
class Student {
  int id;
  String name;

  Student(int id, String name){
    this.name = name;
    this.id = id;
  }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
}

import java.util.*;

public class day50 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(2025007445, "Junel"),
            new Student(2025102785, "Rico"),
            new Student(2025459871, "Joseph")
        );

      Optional<Student> result = students.stream()
                        .filter(s -> s.getName().equals("Rico"))
                        .findFirst();
      
      String studentName = result
                 .map(Student::getName)
                 .orElse("Student not found");
      System.out.println(studentName);
   
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

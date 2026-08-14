package Day18;

public class day18 {
    public static void main(String[] args) {
        // Create three Student objects
        Student s1 = new Student("Alice"); 
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");
        
        
        // Display the total number of Student objects created
        Student.displayCount();
        // Display names of the students
        s1.name = "Alice";
        s2.name = "Bob";
        s3.name = "Charlie";
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}

import java.util.HashSet;
public class day22 {
    public static void main(String[] args) {
        HashSet<String> id = new HashSet<>();
        id.add("101");
        id.add("102");
        id.add("103");
        id.add("102"); // Duplicate, will not be added
        
        for (String studentID : id) {
            System.out.println(studentID);
        }
        System.out.println("id contains 101: " + id.contains("101"));
        System.out.println("id size: " + id.size());
        
    }
}

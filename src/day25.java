import java.util.HashMap;
public class day25 {
    public static void main(String[] args) {
        HashMap<Integer, String> id = new HashMap<>();
        id.put(201, "Junel");
        id.put(202, "Mark");
        id.put(203, "Anna");
        for(Integer key : id.keySet()){ // retrieving keys only
            System.out.println("ID : " + key + "\t Name : " + id.get(key )); // accessing values using keys using get()
        }
    }
}

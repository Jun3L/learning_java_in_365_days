package Day53;
import com.google.gson.Gson;
public class day53 {
    public static void main(String[] args) {
        try {
            // convert json to java object
        String json = "{\"name\":\"Rico\",\"age\":20,\"course\":\"IT\"}"; //create a json format
        Gson gson = new Gson();
        Student student = gson.fromJson(json, Student.class); //convert json to java object

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.course);

        // Convert Java Back to JSON
        String newJson = gson.toJson(student);
        System.out.println(newJson);
        } catch (Exception e) {
            System.out.println("JSON Failed");
            e.printStackTrace();
        }
       

    }
}
 

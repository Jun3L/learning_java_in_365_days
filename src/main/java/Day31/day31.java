package Day31;
import java.io.*;
public class day31 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Junel";
        s.age = 19;
        try{
         FileOutputStream file = new FileOutputStream("students.txt");
         ObjectOutputStream out = new ObjectOutputStream(file);
        
         out.writeObject(s);
         out.close();
        }catch(Exception e){
           e.printStackTrace();
        }

       try {
            FileInputStream fileIn = new FileInputStream("students.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student ds = (Student) in.readObject();
            in.close();

            System.out.println("Name: " + ds.name);
            System.out.println("Age: " + ds.age);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

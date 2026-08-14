package Day29;
import java.io.*;
public class day29 {
    public static void main(String[] args) {
        String filename = "students.txt";
        try(FileWriter writer = new FileWriter("students.txt", true)){
            
            writer.write("Rico, 20\n");
            writer.write("Junel, 1\n");
            writer.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Reading files content: ");
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
           String line;
           while ((line = reader.readLine()) != null) {
            System.out.println(line);
            
           }
        }catch(IOException e){
            System.out.println("Error reading a file: " + e.getMessage());
        }
    }
}

package Sample;
import java.util.Scanner;
import java.util.ArrayList;
public class sample {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       
       ArrayList<Integer> ids = new ArrayList<>();
       ArrayList<String> names = new ArrayList<>();
       ArrayList<Integer> ages = new ArrayList<>();
       try {
        while (true) {
       System.out.println("===== Student Record Management System =====\n");
       System.out.println("[1] Add student");
       System.out.println("[2] View students");
       System.out.println("[3] Update students"); 
       System.out.println("[4] Delete student");
       System.out.println("[5] Exit\n");
       System.out.print("Select an option: ");
       int choice = s.nextInt();
       switch (choice) {
        case 1:
            System.out.print("Enter ID: ");
            int id = s.nextInt();
            s.nextLine();
            System.out.print("Enter name: ");
            String name = s.nextLine();
            System.out.print("Enter age: ");
            int age = s.nextInt();

            ids.add(id);
            names.add(name);
            ages.add(age);
            System.out.println("Student added successfully!\n");
            break;
        case 2: 
        System.out.println("===== Student's List =====");
        if (ids.isEmpty()) {
            System.out.println("No student records found.");
        }else{
            for(int i = 0; i < ids.size(); i++){
                System.out.println("ID: " + ids.get(i) + " | " + " Name: " + names.get(i) + " | " + " Age: " + ages.get(i));
            }
        }
        break;
        case 3:
            System.out.print("Enter ID to update: ");
           int updateID = s.nextInt();
           s.nextLine();
           boolean updated = false;
           for(int i = 0; i < ids.size(); i++){
            if (ids.get(i) == updateID) {
                System.out.print("Enter new name: ");
                names.set(i, s.nextLine());
                System.out.print("Enter new age: ");
                ages.set(i, s.nextInt());
                System.out.println("Student updated successfully!");
                updated = true;
            }
            if (!updated) {
                System.out.println("Student not found");
            }
           }
           case 4:
            System.out.print("Enter ID to delete: ");
            int deleteID = s.nextInt();
            boolean deleted = false;

            for(int i = 0; i < ids.size(); i++){
                if (ids.get(i) == deleteID) {
                    ids.remove(i);
                    names.remove(i);
                    ages.remove(i);
                    System.out.println("Student deleted successfully!");
                    deleted = true;
                    break;
                }
                if (!deleted) {
                    System.out.println("Student not found");
                }
            }
           break;
           case 5:
            System.out.println("Exiting program....");
            s.close();
            return;
            
        default:
            System.out.println("Invalid choice. Try again. ");
            break;
       }
       }
       } catch (Exception e) {
        e.printStackTrace();
       }
       
       
    
    }
}

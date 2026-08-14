import java.util.Scanner;
public class day32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       try{
         System.out.println("Enter a number: ");
        String input = s.nextLine();
        
        int num = Integer.parseInt(input);
        System.out.println("Number is: " + num);
       }catch(Exception e){
       e.printStackTrace();
       }
       s.close();

    }
}

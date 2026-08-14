import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = s.nextLine();

        //Split into words
        String[] words = sentence.split(" ");

        System.out.println("Split sentence:");
        for (String word : words) {
            System.out.print("[" + word + "]\n");
        }
        System.out.println();
        int wordCount = sentence.length();
        System.out.print("Number of words: " + wordCount);
        
        s.close();
    }
}

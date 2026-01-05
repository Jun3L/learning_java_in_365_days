import java.util.Scanner;
import java.util.HashMap;
public class day24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = s.nextLine();
        String[] words = sentence.split(" ");

        // Hashmap is used to store key-value pairs
        HashMap<String, Integer> wordCount = new HashMap<>(); // Create a HashMap to store word counts
        for(String word : words) {// Iterate through each word
            word = word.toLowerCase(); // Normalize to lowercase
            if (wordCount.containsKey(word)) { // Check if the word is already in the map, if yes increment its count
                wordCount.put(word, wordCount.get(word) + 1);  // Increment count
            } else { // If not, add the word with count 1
                wordCount.put(word, 1); // Initialize count
            }
            System.out.println(word + ": " + wordCount.get(word)); // Print the word and its count
        }
        s.close();
    }
}

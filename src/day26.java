import java.util.HashMap;

public class day26 {
    public static void main(String[] args) {
      //.computeIfAbsent is a method in HashMap that computes a value for a key if the key is not already present in the map.
    HashMap<String, Integer> wordCount = new HashMap<>();
    String[] words ={"apple", "banana", "grape", "apple", "orange", "banana", "apple"};
    for(String word : words) {
        wordCount.computeIfAbsent(word, k -> 0); 
        /*is apple encountered for the first time, it adds apple to the map with a value of 0.
           in the next line, we increment the count of the word by 1.
          So, the first time apple is encountered, its count becomes 1.
           is banana encountered for the first time, it adds banana to the map with a value of 0.
           in the next line, we increment the count of the word by 1.
           So, the first time banana is encountered, its count becomes 1.
           This process continues for all words in the array.
           if a word seen again, it will increment its count by 1.
          
        */
        wordCount.put(word, wordCount.get(word) + 1);// 
    }
    System.out.println(wordCount);
    }
}

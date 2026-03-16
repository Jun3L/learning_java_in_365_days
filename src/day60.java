import java.util.Scanner;
public class day60 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        if(isPalindrome(input)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        s.close();
    }
    static boolean isPalindrome(String str){
       str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
       int left = 0; // start of the string
       int right = str.length() - 1;// end of the string

       while (left < right) {
        if(str.charAt(left) != str.charAt(right)){
            return false; // not a palindrome
        }
        left++;
        right--;
       }
         return true; // is a palindrome
    }
}

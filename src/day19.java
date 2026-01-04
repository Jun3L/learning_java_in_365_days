public class day19 {
    public static void main(String[] args) {
        String str1 = "Junel";
        String str2 = "Nel";
        String str3 = "Junel";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // true

        String str = "Hello, World!";
        System.out.println(str.hashCode()); // prints hash code of the string

    }
}

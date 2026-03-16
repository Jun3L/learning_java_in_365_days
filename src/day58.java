public class day58 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println("QuadHex");
            } else if (i % 4 == 0) {
                System.out.println("Quad");
            } else if (i % 6 == 0) {
                System.out.println("Hex");
            } else {
                System.out.println(i);
            }
        }
    }
}

public class day72 {
    public static void main(String[] args) {
        System.out.println("Command line argument: ");

        for(int i = 0; i < args.length; i++){
            System.out.print("Argument " + (i + 1) + ": " + args[i] + "\n");
        }
    }
}

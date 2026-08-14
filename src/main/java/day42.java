public class day42 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
        public void run(){
            for (int i = 0; i <= 5; i++) {
                System.out.println("Number: " + i);
            }
        }
        };
        Thread t = new Thread(task);
        t.start();
    }
}

import java.util.Scanner;
public class day41 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.print("Set a timer: ");
        int timeDurationinSec = s.nextInt();

        long startTime = System.currentTimeMillis();

        while (true) {
            long currennttime = System.currentTimeMillis();
            long elapsedTime = currennttime - startTime;
            long elapsedSeconds = elapsedTime / 1000;
            System.out.println("Time passed: " + elapsedSeconds + " seconds");
            if (elapsedSeconds >= timeDurationinSec) {
                break;
            }
            Thread.sleep(1000);
        }
         System.out.println("Timer finished!");
        s.close();
    }
}

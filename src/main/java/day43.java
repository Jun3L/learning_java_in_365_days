import java.util.concurrent.*;
public class day43 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> task = new Callable<>() {
            public Integer call(){
            int sum = 0;
            for(int i = 0; i <= 5; i++){
             sum += i;
            }
            return sum;
            }
            
        };
        Future<Integer> future = executor.submit(task);

        int result = future.get();
        System.out.println("Sum of numbers 1 - 5: " + result);
    }
}

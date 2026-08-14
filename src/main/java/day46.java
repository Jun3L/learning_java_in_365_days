import java.util.concurrent.ConcurrentHashMap;
public class day46 {
    public static void main(String[] args) throws Exception {
         ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
         map.put("count", 0);
   Thread t1 = new Thread(()->{
      for (int i = 0; i < 1000; i++) {
        map.merge("count", 1, Integer::sum);
      }
   });
   Thread t2 = new Thread(() -> {
    for (int i = 0; i < 1000; i++) map.merge("count", 1, Integer::sum);
});
t1.start();
t2.start();

t1.join();
t2.join();

System.out.println("Final count: " + map.get("count"));
   }
    }


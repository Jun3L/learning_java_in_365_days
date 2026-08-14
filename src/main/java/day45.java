public class day45 {
public static void main(String[] args) throws Exception {
    Counter counter = new Counter();

    Worker t1 = new Worker(counter);
    Worker t2 = new Worker(counter);
    
    t1.start();
    t2.start();

    t1.join();
    t2.join();
    
    System.out.println("Final count: " + counter.count);
}    
}
class Counter{
    int count = 0;
    void increment(){
        count++;
    }
}
class Worker extends Thread{
Counter counter;
Worker(Counter counter){
    this.counter = counter;
}
public void run(){
    for (int i = 0; i < 1000; i++) {
        counter.increment();
    }
}
    
}


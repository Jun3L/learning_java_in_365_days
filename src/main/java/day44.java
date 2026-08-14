public class day44 {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Worker t1 = new Worker(counter);
        Worker t2 = new Worker(counter);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}

class Counter {
int count = 0;
synchronized void addOne(){
    count++;
  }
}

class Worker extends Thread {
  Counter counter;
  Worker(Counter counter){
    this.counter = counter;
  }
    public void run(){
        counter.addOne();
    }
}
import java.util.Scanner;
import java.util.concurrent.*;
public class day47 {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); //blocking queue with capacity of 5
    //producer thread
    Thread producer = new Thread(() -> {
        for (int i = 0; i < 10; i++) {
            try {
                queue.put(i); //put item in the queue
                System.out.println("Produced: " + i);
                Thread.sleep(500); //simulate time taken to produce an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    //consumer thread
    Thread consumer = new Thread(() -> {
        for (int i = 0; i < 10; i++) {
            try {
                int item = queue.take(); //take item from the queue
                System.out.println("Consumed: " + item);
                Thread.sleep(1000); //simulate time taken to consume an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    producer.start();
    consumer.start();
    /*
    BlockingQueue is a thread-safe queue 
    that blocks when trying to add an item to a full queue or take an item from an empty queue.
    */
   /*
   A thread-safe queue is a queue that allows multiple threads 
   to access and modify it safely without causing data corruption.
    */
   s.close();
 }
    
}
public class day45 {
    public static void main(String[] args) throws Exception {
        CounterDay45 counter = new CounterDay45();

        WorkerDay45 t1 = new WorkerDay45(counter);
        WorkerDay45 t2 = new WorkerDay45(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
    }
}

class CounterDay45 {
    int count = 0;

    void increment() {
        count++;
    }
}

class WorkerDay45 extends Thread {
    CounterDay45 counter;

    WorkerDay45(CounterDay45 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

}

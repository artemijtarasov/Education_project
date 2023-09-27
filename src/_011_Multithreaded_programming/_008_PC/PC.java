package _011_Multithreaded_programming._008_PC;

// An incorrect implementation of a producer and consumer.

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        // start the threads
        p.t.start();
        c.t.start();

        System.out.println("Press Control-C to stop.");
    }
}

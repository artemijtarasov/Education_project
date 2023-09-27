package _011_Multithreaded_programming._008_PC;

public class Q {
    int n;

    synchronized int get() {
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("put: " + n);
    }
}

package _011_Multithreaded_programming._003_ExtendThread;

// Create a second thread by extending Thread.

public class NewThread extends Thread {
    NewThread() {
        // create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    // This is entry point for the second thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

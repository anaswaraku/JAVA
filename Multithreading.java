class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Runnable: " + i);
        }
    }
}

// b. Implementing multithreading using the Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Thread: " + i);
        }
    }
}

public class Multithreading {
    public static void main(String args[]) {
        // a. Using Runnable interface
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();

        // b. Using Thread class
        MyThread threadObject = new MyThread();
        threadObject.start();

        // Main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Main: " + i);
        }
    }
}

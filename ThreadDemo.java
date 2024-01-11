// Create a second thread.
class NewThread implements Runnable {
	// This is the entry point for the second thread.
	public void run() {
		for(int i = 5; i > 0; i--) {
			System.out.println("Child Thread: " + i);
		}
		System.out.println("Exiting child thread.");
	}
}

class ThreadDemo {
	public static void main(String args[]) {
		NewThread nt = new NewThread(); // create a new thread
		Thread t = new Thread(nt);
		t.start(); // Start the thread
		for(int i = 5; i > 0; i--) {
			System.out.println("Main Thread: " + i);
		}
		System.out.println("Main thread exiting.");
	}
}


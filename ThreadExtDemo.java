// Create a thread by extending Thread

class NewThread extends Thread {
	// This is the entry point for the second thread.
	public void run() {
		for(int i = 5; i > 0; i--) {
			System.out.println("Child Thread: " + i);
		}
		System.out.println("Exiting child thread.");
	}
}

class ThreadExtDemo{
	public static void main(String args[]) {
		NewThread t = new NewThread(); // create a new thread
		t.start(); // Start the thread
		for(int i = 5; i > 0; i--) {
			System.out.println("Main Thread: " + i);
		}
		System.out.println("Main thread exiting.");
	}
}


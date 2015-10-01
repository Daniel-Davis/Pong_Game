package Game;
import java.util.Random;

//test sentence for git push and pull//


public class MyThread implements Runnable { // creating my own threads
	
	String name; // variable to hold the name of the threads
	int time; // variable to hold the random time generated
	Random r = new Random(); // temp var to generate random time
	
	// Constructor
	public MyThread(String string) {
		name = string;
		time = r.nextInt(999); // generates random thread
	}// end of constructor
	
	// method to display that my threads are working
	public void run() {
		try{
			System.out.print(name + " is sleeping for: " + time + "\n");
			Thread.sleep(time);
			System.out.println(name + " is done sleeping.");
		}catch(Exception e){}
	}// end of run
	
	
	// to test my new threads //
	public static void main(String[] args) {
		// making three testing threads //
		Thread thread1 = new Thread(new MyThread("one"));
		Thread thread2 = new Thread(new MyThread("two"));
		Thread thread3 = new Thread(new MyThread("three"));
		//starting up new threads//
		thread1.start();
		thread2.start();
		thread3.start();
	}// end of main
	
	
}// end of class

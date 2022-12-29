package q5;

public class Main {
	public static void main(String[] args) {
		
		ruby1 obj = new ruby1();		
		ruby2 obj1 = new ruby2();
		
		Thread thread1 = new Thread(obj);
		
		Thread thread2 = new Thread(obj1);
		
		thread1.start();
		thread2.start();

		System.out.println("This Main thread Ended. ");
	}
}

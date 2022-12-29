package q4;

public class Main {
public static void main(String[] args) {
		
		ruby1 obj = new ruby1();
		ruby2 obj2 = new ruby2();
		ruby3 obj3 = new ruby3();
		
		obj.start();
		obj2.start();
		obj3.start();
		
		System.out.println("The Main Thread  ended.");
	}
	
}

package q2;

public class ruby {
	public static void funA() {

		for (int r = 1; r <= 10; r++) {

			System.out.println(Thread.currentThread().getName() + " is running");

		}

	}

	public void funB() {

		for (int r = 20; r <= 30; r++) {

			System.out.println(Thread.currentThread().getName() + " is running");

		}

	}

}

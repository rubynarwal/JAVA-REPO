package Q1;

public class SALMAN extends Thread{
	@Override
	public void run() {
		int sum = 0;

		for (int r = 0; r < 10; r++) {

			sum += r;

			System.out.println("This is salman thread : " + sum);
		}

	}
}

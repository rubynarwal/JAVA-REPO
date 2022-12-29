package Q1;

public class HRITIK extends Thread{
	@Override
	public void run() {

		int product = 1;

		for (int r = 1; r <= 10; r++) {

			product *= r;
			
			System.out.println("This is Hritik Thread : " + product);
		}

	}
}

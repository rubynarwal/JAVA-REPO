package Q1;

public class AKSHYA  extends Thread{

	@Override
	public void run() {

		for (int r = 1; r <= 10; r++) {

			System.out.println(Thread.currentThread().getName() + " is Running ");

		}

	}

	public static void main(String[] args) {

		SALMAN obj1 = new SALMAN();
                                                      
		HRITIK obj2 = new HRITIK();

		AKSHYA obj3 = new AKSHYA();

		Thread salmanObj = new Thread(obj1);

		Thread hritikObj = new Thread(obj2);

		Thread akshayObj = new Thread(obj3);
		
		
		akshayObj.setName("Akashy");
		
		salmanObj.start();
		hritikObj.start();
		akshayObj.start();
	}
}

package at.campus02.pr3.threads.example2;

public class Worker implements Runnable {

	private char sign;
	private final int sleepIntervall = 100; //msec
	private final int count = 100;

	private boolean isRunning = true;

	public Worker(char sign) {
		this.sign = sign;
	}

	public void requestShutDown() {
		isRunning = false;
	}

	@Override
	public void run() {
		while(isRunning) {

			System.out.print("[");
			System.out.print(sign);
			System.out.print(sign);
			System.out.print(sign);
			System.out.print("]");

			try {
				Thread.sleep(sleepIntervall);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package at.campus02.pr3.threads.example5;

import java.util.concurrent.atomic.AtomicInteger;

public class Worker implements Runnable {

	/*

	When a thread invokes a synchronized method, it automatically acquires the
	intrinsic lock for that method's object and releases it when the method returns.
	The lock release occurs even if the return was caused by an uncaught exception.

	You might wonder what happens when a static synchronized method is invoked,
	since a static method is associated with a class, not an object. In this case,
	 the thread acquires the intrinsic lock for the Class object associated with
	 the class. Thus access to class's static fields is controlled by a lock that's
	 distinct from the lock for any instance of the class.

	 */
	private char sign;
	private final AtomicInteger counter = new AtomicInteger(0);
	private final int count = 100;
	private final int sleepIntervall = 10;
	
	private Konto k1;
	private Konto k2;

	private static Object lock = new Object();
	private static Object lock1 = new Object();
	
	public Worker(char sign, Konto k1, Konto k2) {
		this.sign = sign;
		this.k1 = k1;
		this.k2 = k2;
	}

	@Override
	public void run() {
		for(int i=0; i<count; i++) {
			// L�st zwar unser Critical-Section-Problem nicht
			// provoziert jedoch einen Deadlock.
			synchronized(k1) {
				synchronized(k2) {
					double wert1 = k1.getWert();
					System.out.println(sign + ": Wert von k1 ermittelt");
					
					double wert2 = k2.getWert();
					System.out.println(sign + ": Wert von k2 ermittelt");
					
					k1.setWert(wert1 - 10);
					System.out.println(sign + ": 10 von k1");

					k2.setWert(wert2 + 10);
					System.out.println(sign + ": 10 auf k2");
				}
			}
			
			try {
				Thread.sleep(sleepIntervall);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

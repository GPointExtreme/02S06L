package org.campus02.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable{

	private static int counter = 0;
	private static Lock lock = new ReentrantLock();
	
	
	private void Increase() {
		lock.lock();
		try {
			counter++;
		}
		finally {
			lock.unlock();
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1_000_000; i++) {
			Increase();
		}
		System.out.println(counter);
	}

}

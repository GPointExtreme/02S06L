package org.campus02.uhrzeit;

import java.util.Scanner;

public class TimeDemo {

	public static void main(String[] args) {
		System.out.println("Press ENTER");
		
		Time t = new Time();
		Thread t1 = new Thread(t);
		t1.start();
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		t.stopWorker();
		System.out.println("finished");
		scanner.close();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

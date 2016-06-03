package org.campus02.uhrzeit;

import java.util.Date;

public class Time implements Runnable{

	private boolean isStopped = false;
	
	public void stopWorker() {
		this.isStopped = true;
	}
	
	@Override
	public void run() {
		while(isStopped == false) {
			Date d = new Date();
			System.out.println(d.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}

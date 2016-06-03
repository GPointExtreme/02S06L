package org.campus02.primThreads;

public class Prim implements Runnable{
	
	private long c;
	private boolean isPrim;

	public Prim(long c) {
		super();
		this.c = c;
		this.isPrim = true;
	}

	@Override
	public void run() {
		long d;
		for (int i = 2; i < c/2; i++) {
			d=c%i;
			if(d==0) {
				isPrim = false;
				break;
			}
		}
		System.out.println(c + " " + isPrim);
	}

	public boolean isPrim() {
		return isPrim;
	}

}

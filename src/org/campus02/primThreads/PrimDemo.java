package org.campus02.primThreads;

public class PrimDemo {

	public static void main(String[] args) {
		
		Prim p1 = new Prim(1979990039);
		Prim p2 = new Prim(1989990048);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

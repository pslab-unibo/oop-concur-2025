package oop.concur.gui_reactive;

public class MyAgent extends Thread {

	private int maxCount;
	
	public MyAgent(int maxCount) {
		this.maxCount = maxCount;
	}

	public void run() {
		log("starting a long job...");
		long t0 = System.currentTimeMillis();
		doMyJob();
		long t1 = System.currentTimeMillis();
		log("job finished (after " + (t1 - t0) + "ms)");
		
	}

	protected void doMyJob() {
		int count = 0;
		while (count < maxCount) {
			try {
				Thread.sleep(1000);
				count++;
				log("Time elapsed: " + count + " seconds (of " + maxCount +")");
			} catch (Exception ex) {}
		}
	}
	
	protected void log(String msg) {
		System.out.println("[MYAGENT][" + Thread.currentThread().getName()+"] " + msg);
	}
}

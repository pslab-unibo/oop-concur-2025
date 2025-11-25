package oop.concur.gui_reactive;

public class MyController  {

	public MyController() {}
	
	public void notifyStarted() {
		log("started event => spawning a new agent...");
		MyAgent agent = new MyAgent(10);
		agent.start();
		log("agent spawned.");
	}
	
	protected void log(String msg) {
		System.out.println("[MYCONTROLLER][" + Thread.currentThread().getName()+"] " + msg);
	}
	
}

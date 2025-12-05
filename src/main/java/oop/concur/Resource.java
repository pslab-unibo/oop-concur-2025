package oop.concur;

public class Resource {
 public synchronized void op() {
    System.out.println("[Resource] Thread " + Thread.currentThread() + " entered.");
    try {
      Thread.sleep(5000);
    } catch (Exception ex) {}
    System.out.println("[Resource] - Thread " + Thread.currentThread() + " exited.");
  }
}
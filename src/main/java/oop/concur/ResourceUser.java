package oop.concur;

public class ResourceUser extends Thread {
  private Resource res;

  public ResourceUser(String name, Resource res) {
    super(name);
    this.res = res;
  }

  public void run() {
    log("before invoking op");
    res.op();
    log("after invoking op");
  }

  private void log(String msg) {
    System.out.println("[" + Thread.currentThread() + "] " + msg);
  }
}
package oop.concur;

public class TestResourceUsers {
  public static void main(String[] args) {
    Resource res = new Resource();
    ResourceUser userA = new ResourceUser("pippo", res);
    ResourceUser userB = new ResourceUser("pluto", res);
    userA.start();
    try {
      Thread.sleep(500);
    } catch (Exception ex) {
    }
    userB.start();
  }
}
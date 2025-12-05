package oop.concur;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {

  public MyFrame(){
    super("Test Swing thread");
    setSize(120,60);
    setVisible(true);
    JButton button = new JButton("test");
    button.addActionListener(this);
    getContentPane().add(button);
    addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent ev){
        System.exit(-1);
      }
    });
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("This is: " + Thread.currentThread().getName());
    try {
        Thread.sleep(2000);
    } catch (Exception ex){}
  }

}

public class TestSwingBlock {
  static public void main(String[] args){
    new MyFrame();
    new MyFrame();
  }
}

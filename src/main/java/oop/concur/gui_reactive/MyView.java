package oop.concur.gui_reactive;

import javax.swing.SwingUtilities;

public class MyView {

	private MyFrame frame;

	public MyView(MyController controller) {
		frame = new MyFrame(controller);
	}
	
	public void display() {
		SwingUtilities.invokeLater(() -> {
			frame.setVisible(true);
		});
	}

}

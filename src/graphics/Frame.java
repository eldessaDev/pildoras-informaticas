package graphics;
import javax.swing.*;
public class Frame {

	public static void main(String[] args) {
		
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MyFrame extends JFrame{
	//constructor
	public MyFrame() {
		//setSize(500, 300);
		//setLocation(500,300);
		//setResizable(false);
		//setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		setBounds(500,300, 550,250);
		setTitle("My First Window");
		
		
	
	}
	
	
}

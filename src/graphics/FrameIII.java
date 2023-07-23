package graphics;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
public class FrameIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameText myFrame = new FrameText();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	

}
class FrameText extends JFrame{
	public FrameText() {
		setVisible(true);
		setBounds(400,200,600,450);
		setTitle("My first Text");
		Panel panel = new Panel();
		add(panel);
	}
}
class Panel extends JPanel{
	public void paintComponent(Graphics g) {
		//invoke JComponent method
		super.paintComponent(g);
		g.drawString("My First Swing Text ", 100, 100);
		
		
	}
	
}

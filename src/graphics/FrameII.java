package graphics;
import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;

public class FrameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameCenter mainFrame = new FrameCenter();
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameCenter extends JFrame{
	//constructor
	public FrameCenter() {
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Dimension sizeScreen = myScreen.getScreenSize();
		int screenHeight = sizeScreen.height;
		int screenWidth = sizeScreen.width;
		setSize(screenWidth/2, screenHeight/2);
		setLocation(screenWidth/4, screenHeight/4);
		setTitle("Center Frame");
		Image myIcon = myScreen.getImage("src/graphics/JavaIcon.png");
		setIconImage(myIcon);
	}
	
}
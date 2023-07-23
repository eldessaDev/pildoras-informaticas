package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class TestTimer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Watch myWatch = new Watch();
		myWatch.setWatch(3000, true);
		JOptionPane.showMessageDialog(null, "Click on Ok to stop");
		System.exit(0);
		

	}

}

class Watch{
	
	public void setWatch(int interval, final boolean sound) {
		 class GiveMeTime2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("I set the time each " + now);
				
				if(sound) {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
		}
		ActionListener listener = new GiveMeTime2();
		Timer myTimer = new Timer(interval, listener);
		myTimer.start();
	}
	

}	

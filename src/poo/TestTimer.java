package poo;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

import javax.swing.*;


public class TestTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GiveMeTime listener = new GiveMeTime();
		
		Timer  myTimer = new Timer(3000, listener);
		
		
		myTimer.start();
		
		JOptionPane.showMessageDialog(null, "Click on Ok to Stop");
		System.exit(0);


	}

}

class GiveMeTime implements ActionListener{
	
	//setter
	public void actionPerformed(ActionEvent e) {
		Date now = new Date();
		System.out.println("I set the time every 3 seconds " + now);
		
		Toolkit.getDefaultToolkit().beep();
	}
	
	
}

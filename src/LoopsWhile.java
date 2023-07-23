//Loops While
import javax.swing.*;
public class LoopsWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key = "Kenny";
		String pass = "";
		
		while(key.equals(pass) == false) {
		pass = JOptionPane.showInputDialog("Enter the password");
			
			if(key.equals(pass) == false) {
				System.out.println("Incorrect password");
				
			}
		}
		System.out.println("Correct password. Access allowed.");
		
			

	}

}

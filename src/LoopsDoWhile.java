//Loops do - While
import javax.swing.*;
public class LoopsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender = "";
		do {
			gender = JOptionPane.showInputDialog("Enter your gender (W/M)");
		}
		while (gender.equalsIgnoreCase("W") == false && gender.equalsIgnoreCase("M") == false);
		int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in cm"));
		
		int idealWeight = 0;
		if(gender.equalsIgnoreCase("M")) {
			idealWeight = height - 110;
		}
		else if(gender.equalsIgnoreCase("W")) {
			idealWeight = height - 120;
		}
		System.out.println("Your ideal weight is " + idealWeight + " Kg.");

	}

}

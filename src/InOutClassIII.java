//Print with decimals
//Convert String to double
import javax.swing.*;
public class InOutClassIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = JOptionPane.showInputDialog("Type a number");
		double num2 = Double.parseDouble(num1);
		
		System.out.print("The Sqrt of " + num2 + " is ");
		System.out.printf("%1.2f", Math.sqrt(num2));
		
	}

}

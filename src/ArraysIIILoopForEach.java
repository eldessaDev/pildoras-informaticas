//filling the array with a pop-up window
import javax.swing.*;
public class ArraysIIILoopForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] countries = new String[8];
		
		for(int i=0; i<8; i++) {
			countries[i]=JOptionPane.showInputDialog("Enter a Country " + (i+1));
		}
		
		for(String element:countries) {
			System.out.println("Country: " + element);
		}
		

	}

}

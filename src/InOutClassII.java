//JOptionPaneClass
import javax.swing.*;
public class InOutClassII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String nameUser = JOptionPane.showInputDialog("Type your name");
		String ageUser = JOptionPane.showInputDialog("Type your age");
		
		int age = Integer.parseInt(ageUser);//Convert String To int
		System.out.println("Hello " +nameUser + " The next year you will be " 
		+ (age+1) + " years old");

	}

}

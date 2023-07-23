import javax.swing.*;
public class LoopsForIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long result = 1L;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		for(int i=num; i>0; i--) {
			result = result*i;
		}
		System.out.println("The factorial of " + num + " is " +  result);
	}

}

import javax.swing.*;

//check email

public class LoopsForII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int at = 0;
		boolean point = false;
		String email = JOptionPane.showInputDialog("Enter email");
		
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				at++;
			}
			if(email.charAt(i)=='.') {
				point = true;
			}
		}
		if(at==1 && point==true) {
			System.out.println("The email is correct");
		}
		else {
			System.out.println("The email is not correct");
		}

	}

}

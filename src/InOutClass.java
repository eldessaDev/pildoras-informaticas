//ScannerClass
import java.util.*;

public class InOutClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Please type your name");
		String nameUser = enter.nextLine();
		
		System.out.println("Please type your age");
		int ageUser = enter.nextInt();
		
		System.out.println("Hello " + nameUser + ". The next year you will be " 
		+(ageUser+1) + " years old" );

	}

}

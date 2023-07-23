//Condicional if
import java.util.*;
public class Condicionalif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age = enter.nextInt();
		
		if(age<18) {
			System.out.println("You are a teenager");
		}
		else if(age<40) {
			System.out.println("You are Young");
		}
		else if(age<65) {
			System.out.println("You are a senior");
		}
		else {
			System.out.println("Be Careful");
		}
		
		
		

	}

}

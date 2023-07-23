//Loop While Game, change to do-while
import java.util.*;
public class LoopsWhileGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random = (int)(Math.random()*100);
		Scanner enter = new Scanner(System.in);
		
		int num = 0;
		int tries = 0;
		
		 do{
			 tries++;
			System.out.println("Please enter a number");
			num = enter.nextInt();
		if(random < num) {
			System.out.println("lower");
			
			}
		else if(random > num) {
			System.out.println("higher");
			}
		
		}
		 while(num != random);
		System.out.println("Correct. number of attempts " + tries);
		
		
	}

}

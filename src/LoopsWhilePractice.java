//Guess the things kenny likes game
import java.util.*;
public class LoopsWhilePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner type = new Scanner(System.in);
		String color = "negro";
		String color1 = "";
		String woman = "blancas";
		String drink = "beer";
		String team = "Real madrid";
		String sport = "Futbol";
		String tshirt = "unicolor";
		
		
		while(color1 != color) {
			System.out.println("Que color le gusta de ropa?");
			color1 = type.next();
			if(color1 != color) {
				System.out.println("Ese no es el color");
				
			}
			else {
				System.out.println("Adivinaste el color");			}
			
			
		}
		
		
				
		
		

	}

}

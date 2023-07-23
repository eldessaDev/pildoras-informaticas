import java.util.*;
public class CondicionalSwitchPracticeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner enter = new Scanner(System.in);
		System.out.println("Choose an option: \n1: Kenny Romero \n2: Patricia Mendez \n3: Carlotta Medina" );
	
		int accion = enter.nextInt();
		
		switch(accion) {
		case 1:
			System.out.println("You Choose Kenny Romero \nBorn in Maracaibo Venezuela, He is 33 years old and lives in the United States.");
			break;
		case 2: 
			System.out.println("You Choose Patricia Mendez \nBorn in Maracaibo Venezuela, She is 32 years old and lives in the United States.");
			break;
		case 3:
			System.out.println("You Choose Carlotta Medina \nBorn in Maracaibo Venezuela, She is 6 years old and lives in the United States.");
		
		default:
			System.out.println("The option is not correct");
		}
	
	}

}

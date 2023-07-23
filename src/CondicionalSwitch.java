//Condicional Switch
import java.util.*;
import javax.swing.*;
public class CondicionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an option: \n1: Square \n2: Rectangle \n3: Triangle \n4: Circle");
		
		int figure = input.nextInt();
		
		switch  (figure) {
		case 1:
			System.out.println("You have selected square:");
			int side = Integer.parseInt(JOptionPane.showInputDialog("Type the side"));
			System.out.println("The area of the square is " + Math.pow(side, 2));
			break;
			
		case 2:
			System.out.println("You have selected Rectangle:");
			int base = Integer.parseInt(JOptionPane.showInputDialog("Type the base"));
			int height = Integer.parseInt(JOptionPane.showInputDialog("Type the height"));
			System.out.println("The area of the rectangle is: " + base*height);
			break;
		case 3:
			System.out.println("You have selected Triangle:");
			base = Integer.parseInt(JOptionPane.showInputDialog("Type the base"));
			height = Integer.parseInt(JOptionPane.showInputDialog("Type the height"));
			System.out.println("The area of the Triangle is " + (base*height)/2);
			break;
		case 4:
			System.out.println("You have selected Circle:");
			int radio = Integer.parseInt(JOptionPane.showInputDialog("type the radio"));
			System.out.print("The area of the Circle is ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
		
		default:
			System.out.println("The option is not correct");
		
		}
		
		

	}

}

//Programming a calculator using the switch conditional
import java.util.*;
import javax.swing.*;
public class CondicionalSwitchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an option: \n1: Sum \n2: Subtraction "
				+ "\n3: Multiply \n4: division \n5: Sqrt \n6: Absolute value "
				+ "\n7: Elevated");
		int accion = input.nextInt();
		
		switch (accion){
		case 1:
			System.out.println("***You chose sum***");
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Type the first number to sum"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Type the Second number to sum"));
			System.out.println("The sum of " + num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case 2:
			System.out.println("***You chose Subtraction***");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Type the first number to subtrated"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Type the second number to subtrated"));
			System.out.println("The Subtraction of " + num1 + " - " + num2 + " = " + (num1-num2));		
			break;
		case 3:
			System.out.println("***You Chose Multiply***");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Type the first number to mulptiply"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Type the second number to nultiply"));
			System.out.println("The multiplication of " + num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case 4:
			System.out.println("***You Chose Divide***");
			double num3 = Double.parseDouble(JOptionPane.showInputDialog("Type the first number to divide"));
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Type the second number to divide"));
			System.out.printf("The Division of " + num3 + " / " + num1 + " = " + "%1.2f", num3/num1);
			break;
		case 5:
			System.out.println("***You Chose Sqrt***");
			num3 = Double.parseDouble(JOptionPane.showInputDialog("Type the number to get the square root"));
			System.out.printf("The Sqrt of " + num3 + " = "+"%1.2f", Math.sqrt(num3));
			break;
		case 6:
			System.out.println("***You Chose Absolute***");
			num3 = Double.parseDouble(JOptionPane.showInputDialog("Type the number to know the absolute value"));
			System.out.printf("%1.2f", Math.abs(num3));
			break;
		case 7:
			System.out.println("***You Chose Raise a number***");
			num3 = Double.parseDouble(JOptionPane.showInputDialog("Type the first number to raise"));
			double num4 = Double.parseDouble(JOptionPane.showInputDialog("Type the second number to raise"));
			int result = (int) Math.pow(num3, num4);
			System.out.println("The number " + num3 + " raised to " + num4 + " = " + result);
			
		default:
			System.out.println("The option is not correct");
			
		
		}
		

	}

}

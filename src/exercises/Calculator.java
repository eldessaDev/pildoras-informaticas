//Calculator
package exercises;

import java.util.*;

import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose an option: \n1: Sum \n2: Subtraction  \n3: Multiplication \n4: Division \n5: Sqrt \n6: Round \n7: Absolute Value");
		
		int choose = input.nextInt();
		int num1;
		int num2;
		double num3, num4;
		
		switch(choose) {
		case 1:
			System.out.println("You have selected Sum");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter The First Number To Sum"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number to sum"));
			System.out.println("The sum of " + num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case 2:
			System.out.println("You have selected Subtraction");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Type the first number to subtract"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Type the second number to subtrac"));
			System.out.println("The subtraction of " + num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case 3:
			System.out.println("You have selected Multiplication");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Type the first number to Mult"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Type the second number to Mult"));
			System.out.println("The Mult of " + num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case 4:
			System.out.println("Toy have selected Division");
			num3 = Double.parseDouble(JOptionPane.showInputDialog("Type the first number to Divide"));
			num4 = Double.parseDouble(JOptionPane.showInputDialog("Type the second number to Divide"));
			System.out.println( "The Division of " + num3 + " / " + num4 + " = " + (num3/num4));
			break;
		case 5:
			System.out.println("You have selected SQRT");
			num3 = Double.parseDouble(JOptionPane.showInputDialog("Type the number to obtain the square Root "));
			System.out.printf("%1.2f", Math.sqrt(num3));
		case 6:
			System.out.println("You have selected Round");
			num3 = Double.parseDouble(JOptionPane.showInputDialog("Type the number to round"));
			System.out.println("The Round of " + num3 + " = " + Math.round(num3));
		case 7:
			System.out.println("You have selected Absolute Value");
			num3 = Double.parseDouble(JOptionPane.showInputDialog("Type the number to know Absolute Value"));
			System.out.println("The Absolute Value of " + num3 + " = " + Math.abs(num3));
		}
		
		
	}

}

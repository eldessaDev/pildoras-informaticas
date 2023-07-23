package poo;
import javax.swing.*;

public class UseCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Car myCar = new Car();
		
		myCar.setColor(JOptionPane.showInputDialog("Enter a color"));
		
		System.out.println(myCar.getGeneralInfo());
		System.out.println(myCar.getColor());
		
		myCar.setSeats(JOptionPane.showInputDialog("Would you like leather seats?"));
		System.out.println(myCar.getSeats());
		
		myCar.setClimate(JOptionPane.showInputDialog("Would you like Premium leather seats?"));
		System.out.println(myCar.getClimate());
		
		System.out.println(myCar.getCarWeight());
		
		System.out.println("The Final Price of the car is " + myCar.getPrice());*/
		
		Car myCar1 = new Car();
		myCar1.setColor("Red");
		
		Van myVan1 = new Van(7, 580);
		myVan1.setColor("Blue");
		myVan1.setSeats("yes");
		myVan1.setClimate("yes");
		
		System.out.println(myCar1.getGeneralInfo() + "\n"+ myCar1.getColor());
		
		System.out.println(myVan1.getGeneralInfo() + "\n" + myVan1.getGeneralInfoVan());
		
		
		
		
		
		
		
		
	}

}

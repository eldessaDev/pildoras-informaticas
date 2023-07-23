package poo;

public class Car {

	private int wheels;
	private int length;
	private int width;
	private int motor;
	private int platformWeight;
	
	private String color;
	private int totalWeight;
	private boolean leatherSeats, climateControl;
	
	//constructor method
	public Car(){
		wheels = 4;
		length = 2000;
		width = 300;
		motor = 1600;                       
		platformWeight = 500;
		
	}
	//getter
	public String getGeneralInfo() {
		return"The vehicle platform has " + wheels + " wheels" +
		". Measure " + length/100 + " meters with a width of " + 
		width + " cm and a platform weight of " + platformWeight + " kg";
	}
	//setter
	public void setColor(String colorCar) {
		 color = colorCar;
	}
	//getter
	public String getColor() {
		return"The car color is " + color;
	}
	//setter
	public void setSeats(String leatherSeats) {
		if(leatherSeats.equalsIgnoreCase("yes")) {
			this.leatherSeats =  true;
		}
		else {
			this.leatherSeats = false;
		}
	}
	//getter
	public String getSeats() {
		if(leatherSeats == true) {
			return "The car has Premium Leather Seats";
		}
		else {
			return"The car has Fabric Seats";
		}
	}
	//setter
	public void setClimate(String climateControl) {
		if(climateControl.equalsIgnoreCase("yes")) {
			this.climateControl = true;
		}
		else {
			this.climateControl = false;
		}
	}
	//getter
	public String getClimate() {
		if(climateControl == true) {
			return"The car incorporates a climate control system ";
		}
		else {
			return"The car has Ac";
		}
	}
	//setter - getter
	public String getCarWeight() {
		int bodyWeight = 500;
		totalWeight = platformWeight+bodyWeight;
		
		if(leatherSeats == true) {
			totalWeight = totalWeight + 50;
		}
		if(climateControl == true	) {
			totalWeight = totalWeight + 20; 
		}
		return"The weight of the car is " + totalWeight;
	
	}
	//getter
	public int getPrice() {
		int finalPrice = 10000;
		
		if(leatherSeats == true) {
			finalPrice += 2000;
		}
		if(climateControl == true) {
			finalPrice += 1500;
		}
		return finalPrice;
	}
	
	 
}

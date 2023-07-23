package poo;

public class Van extends Car {
	
	private int loadCapacity;
	private int extraRows;
	
	//constructor
	public Van(int extraRows, int loadCapacity) {
		super();//calls the constructor of the parent class
		this.extraRows = extraRows;
		this.loadCapacity = loadCapacity;
		
	}
	
	public String getGeneralInfoVan() {
		return "The load capacity is: " + loadCapacity + " and the rows are: " + extraRows ;
	}

}

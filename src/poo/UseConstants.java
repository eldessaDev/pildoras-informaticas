package poo;
//Constant and Static
public class UseConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employees worker1 = new Employees("Paco");
		Employees worker2 = new Employees("Ana");
		Employees worker3 = new Employees("Antonio");
		Employees worker4 = new Employees("Maria");
		worker1.changeSection("RRHH");
		
		System.out.println(worker1.getData() + "\n" + worker2.getData() + 
				"\n" + worker3.getData() + "\n" + worker4.getData());
		
		System.out.println(Employees.getNextId());
		
		
		
		
	}

}
class Employees{
	//constructor
	public Employees(String nam) {
		
		name = nam;
		section  = "Administracion";
		id = nextId++;
		
		
		
	}
	//setter
	public void changeSection(String section) {
		this.section = section;
	}
	//getter
	public String getData() {
		return "Name: " + name + "\nSection: " + section + " \nid =  " + id;
	}
	//getter
	public static String getNextId() {
		return"The next id is " + nextId;
	}
	
	
	private final String name;
	private String section;
	private int id;
	private static int nextId = 1;
}


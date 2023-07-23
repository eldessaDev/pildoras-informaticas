package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Staff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person [] persons = new Person[2];
		persons[0] = new Employees2("Luis conde", 50000, 2009, 02, 25);
		persons[1] = new Student("Ana Lopez", "Biologic");
		
		for(Person e: persons) {
			System.out.println(e.getName() + ", " + e.getDescription());
		}

	}

}
//class Person
abstract class Person{
	
	//class fields
	private String name;
	
	//Constructor
	public Person(String nam) {
		
		name  = nam;
	}
	public String getName() {
		return name;
	}
	
	public abstract String getDescription();
	
	
	
}
//class Employees2
class Employees2 extends Person{

	//class fields
	private double salary;
	private Date contract;
	private int id;
	private static int nextId = 1;
	
	//constructor
	public Employees2(String nam, double sal, int year, int month, int day) {
		super(nam);
		
		salary  = sal;
		id = nextId++;
		
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		
		contract = calendar.getTime();
	}
	
	//getter
	public double getSalary() {
		
		return salary;
	}
	
	//getter
	public Date getContract() {
		return contract;
	}
	//setter
	public void setUpSalary(double porcent) {
		
		double increase = salary*porcent/100;
		salary += increase;
	}

	@Override
	public String getDescription() {
		
		return "This employee has an id: " + id + " . Salary: " + salary;
	}
	
	
}

class Student extends Person{
	
	//class fields
	private String career;
	
	//constructor
	public Student(String nam, String career) {
		super(nam);
		this.career = career;
	}
	
	
	@Override
	public String getDescription() {

		return "The student is studying " + career;
	}
	
	
	
	
}
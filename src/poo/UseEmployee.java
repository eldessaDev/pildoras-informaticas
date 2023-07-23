package poo;
import java.util.*;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boss bossHS = new Boss("Carlos", 55000, 2006, 9, 25);
		bossHS.setBonus(2570);
		
		Employee [] emplo = new Employee[6];
		emplo[0] = new Employee("Kenny Romero", 30000, 1990, 12, 17);
		emplo[1] = new Employee("Patricia Mendez", 50000, 1995, 6, 2);
		emplo[2] = new Employee("Carlotta Medina", 25000, 2002, 03, 15);
		emplo[3] = new Employee("Santiago Romero", 47500, 2009, 11, 9);
		emplo[4] = bossHS;//polymorphism, substitution principle
		emplo[5] = new Boss("Maria", 95000, 1999, 5, 26);
		Boss bossFinance = (Boss) emplo[5];//Casting of object
		bossFinance.setBonus(55000);
		
		System.out.println(bossFinance.makeDecisions("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("Boss Finance " + bossFinance.getName() + ", have a bonus of: " 
				 + bossFinance.setBonusInterface(500));
		
		System.out.println(emplo[3].getName() + " have a bonus of: " + emplo[3].setBonusWorker(200));
		
		for( Employee e: emplo) {
			e.setUpSalary(5);
		}
		
		Arrays.sort(emplo);
		
		for(Employee e: emplo) {
			System.out.println("Name: " + e.getName() + " Salary: " 
		+ e.getSalary()	+ " Contract: " + e.getContract());
			
		}
		
	}

}

//class Employee
class Employee implements Comparable, Workers{

	//class fields
	private String name;
	private double salary;
	private Date contract;
	private int id;
	private static int nextId = 1;
	
	//constructor
	public Employee(String nam, double sal, int year, int month, int day) {
		
		name = nam;
		salary  = sal;
		id = nextId++;
		
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		
		contract = calendar.getTime();
	}
	
	//constructor
	public Employee(String nam) {
		this(nam, 3000, 2000, 1, 1);
	}
	//getter
	public String getName() {
		
		return name + " id: " + id;
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
	public int compareTo(Object myObject) {
		
		Employee otherEmployee = (Employee) myObject;
		
		if(this.id < otherEmployee.salary) {
			return -1;
		}
		if(this.id > otherEmployee.salary) {
			return 1;
		}
		return 0;
		
	}

	@Override
	public double setBonusWorker(double gratuity) {
		return Workers.bonusBase + gratuity;
	}
	
}


//class Boss
class Boss extends Employee implements Bosses{
	//constructor
	public Boss(String nam, double sal, int year, int month, int day) {
		super(nam, sal, year, month, day);
	}
	
	//setter
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	//getter
	public double getSalary() {
		double salaryBoss = super.getSalary();//super to call method parent class
		return salaryBoss + bonus;
	}
	
	private double bonus;

	@Override 
	public String makeDecisions(String decision) {
		return "a member of management has made the decision: " + decision;
	} 
	
	public double setBonusInterface(double gratuity) {
		double prima = 2000;
		return Workers.bonusBase + gratuity + prima;
	}
	
	
}







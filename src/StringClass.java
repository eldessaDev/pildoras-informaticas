
public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Kenny Romero";
		System.out.println("My name is " +  name);
		
		System.out.println("My name have " + name.length() + " letters ");
		
		System.out.println("The first letter of " + name + " is " + name.charAt(0));
		
		int lastLetter;
		lastLetter = name.length();
		System.out.println("The las letter is " + name.charAt(lastLetter-1));
		
		

	}

}

package exercises;
import javax.swing.*;
public class UseUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Creating the objects of the Users class and requesting the 
		 * information from the user through a JOptionPane window*/
		Users user1 = new Users("Kenny", "Romero");
		user1.setEmail(JOptionPane.showInputDialog("Enter Your Email"));
		user1.setPhoneNumber(JOptionPane.showInputDialog("Enter Your Phone Number"));
		user1.setPassword(JOptionPane.showInputDialog("Enter your Password"));
		
		
		Users user2 = new Users("Patricia", "Mendez");
		user2.setEmail(JOptionPane.showInputDialog("Enter Your Email"));
		user2.setPhoneNumber(JOptionPane.showInputDialog("Enter Your Phone Number"));
		user2.setPassword("Enter your Password");
		
		System.out.println(user1.getUserData() + "\n" +user1.getEmail() +"\n" + user1.getPhoneNumber() + "\n***********Registration completed***********");
		System.out.println(user2.getUserData() + "\n" + user2.getEmail() + "\n" + user2.getPhoneNumber()+ "\n***********Registration completed***********");
		
		
	}
	

}
 class Users{
	 //constructor
	 public Users(String name, String lastName) {
		 this.name = name;
		 this.lastName = lastName;
		 id = nextId++;
		 
		 
	 }
	 //setter
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 //getter
	 public String getEmail() {
		 return"Email: " + email;
	 }
	 //setter
	 public void setPhoneNumber(String phoneNumber) {
		 this.phoneNumber = phoneNumber;
	 }
	 //getter
	 public String getPhoneNumber() {
		 return "Phone Number: " + phoneNumber;
	 }
	
	 //setter
	 public void setPassword(String password) {
		 this.password = password;
	 }
	 
	 
	 //getter
	 public String getUserData() {
		 return "Numero de id: " + id + "\nName: " + name + "\nLast Name: " + lastName;
	 }
	 
	 private final String name;
	 private final String lastName;
	 private String email;
	 private String phoneNumber;
	 private String password;
	 private int id;
	 private static int nextId = 1;
	 
}

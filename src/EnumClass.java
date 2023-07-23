//enum types are declared outside of main

import java.util.*;

public class EnumClass {
	
//enum Talla{SMALL, MEDIUM, LARGE, XLARGE}
	
	enum Size{
		
		SMALL("S"), MEDIUM("M"), LARGE("L"), XLARGE("XL"); 
		
		//constructor
		private Size(String abbreviations) {
			this.abbreviations = abbreviations;
		}
		
		private String abbreviations;
		
	//getter
	public String getAbbreviations() {
		return abbreviations;
	}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner enter = new Scanner(System.in);
		System.out.println("Type a Size: Small, Medium, Large, XLarge");
		String enterUser = enter.next().toUpperCase();
		
		Size theSize = Enum.valueOf(Size.class, enterUser);
		
		System.out.println("Size: " + theSize);
		System.out.println("Abbreviations: " + theSize.getAbbreviations());
		
		
		
		
		
		
	}

}

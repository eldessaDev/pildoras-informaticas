//ENUM
import java.util.*;
public class Sizes {
	
	//enum size {SMALL, MEDIUM, LARGE, XLARGE	}; 

	enum Size{
		SMALL("S"), MEDIUM("M"), LARGE("L"), XLARGE("XL");
		
		private Size(String shorts) {//constructor
			this.shorts = shorts;
			
		}
		public String getShort() {//getter
			return shorts;
		}
		
		private String shorts;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner enter = new Scanner(System.in);
		System.out.println("Type a size: SMALL, MEDIUM, LARGE, XLARGE");
		String enterData = enter.next().toUpperCase();
		
		Size theSize = Enum.valueOf(Size.class, enterData);
		
		System.out.println("Size = " + theSize);
		System.out.println("Abbreviation = " + theSize.getShort());
		
		
		
		

	}

}

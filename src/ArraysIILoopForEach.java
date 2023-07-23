
public class ArraysIILoopForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] countries = new String[8];
		countries[0]="Spain";
		countries[1]="Mexico";
		countries[2]="Colombia";
		countries[3]="Peru";
		countries[4]="Chile";
		countries[5]="Argentine";
		countries[6]="Ecuador";
		countries[7]="Venezuela";
		
		/*for(int i=0; i<countries.length;i++) {
			System.out.println("County " + (i+1)+" " + countries[i]);
		}*/
		
		//New Loops For - Each
		int index = 0;
		for(String element:countries) {
			index++;
			System.out.println("Country: " + index + " " +element);
		}


	}

}

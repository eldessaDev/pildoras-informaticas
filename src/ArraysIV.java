
public class ArraysIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] randomArray = new int[150];
		for(int i=0; i<randomArray.length; i++) {
			randomArray[i] = (int)Math.round(Math.random()*100);
		}
		
		for(int numbers:randomArray) {
			System.out.print(numbers + " ");
		}
	}

}

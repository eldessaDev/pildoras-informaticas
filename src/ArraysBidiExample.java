
public class ArraysBidiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double accumulated;
		double interest = 0.10;
		
		double[][] balance = new double[6][5];
		
		for(int i=0; i<6; i++) {
			balance[i][0]=1000;
			accumulated = 1000;
			
			for(int j=1; j<5; j++) {
				accumulated = accumulated + (accumulated*interest);
				balance[i][j]=accumulated;
			}
			
			interest = interest + 0.01;
		}
		
		for(int z=0; z<6; z++) {
			System.out.println();
			
			for(int h=0; h<5; h++) {
				System.out.printf("%1.2f", balance[z][h]);
				System.out.print(" | ");
			}
		}
		
	}

}

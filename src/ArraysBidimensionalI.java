
public class ArraysBidimensionalI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = {
				{10,15,43,44,34},
				{32,45,65,77,43},
				{67,45,87,88,99},
				{346,87,56,44,33}
		};
		
		
		
		/*for(int i=0;i<4; i++) { //loop for 
			System.out.println();
			
			for(int j=0; j<5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}*/
		
		for(int[]row:matrix	) {//loop for each
			System.out.println();
			
			for(int z:row) {
				System.out.print(z + " ");
			}
		}

	}

}


public class ArraysBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = new int [4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=21;
		matrix[0][2]=34;
		matrix[0][3]=15;
		matrix[0][4]=45;
		
		matrix[1][0]=54;
		matrix[1][1]=45;
		matrix[1][2]=63;
		matrix[1][3]=77;
		matrix[1][4]=36;
		
		matrix[2][0]=19;
		matrix[2][1]=11;
		matrix[2][2]=01;
		matrix[2][3]=88;
		matrix[2][4]=76;
		
		matrix[3][0]=86;
		matrix[3][1]=84;
		matrix[3][2]=23;
		matrix[3][3]=35;
		matrix[3][4]=55;
		
		//nested for loops
		for(int i=0;i<4;i++) {//loops for
			System.out.println();
			for(int j=0; j<5;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			
		}

	}

}

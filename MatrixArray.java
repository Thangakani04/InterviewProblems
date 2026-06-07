package InterviewProblems;

import java.util.Arrays;

public class MatrixArray {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int[][] matrix = new int [3][3];
		
		int k=0;
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				matrix[i][j] = arr[k++];
			}
		}
		//System.out.println(Arrays.deepToString(matrix));
		//or
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//or enhanced for loop
		for(int[] row : matrix) {
			for(int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

}

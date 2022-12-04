package array;

import java.util.*;
public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int i,j;
		
	
		int matrix[][] = new int[m][n];
		int n_matrix[][] = new int[m][n];
		
		System.out.println("Enter the elements into the matrix");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				matrix[i][j] = sc.nextInt();
				n_matrix[i][j] = matrix[j][i];
			}
		}
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				n_matrix[i][j] = matrix[j][i];
				
			}
			
		}
		
	System.out.println("The original the Matrix is :");
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(matrix[i][j] + " ");
				
			}
			System.out.println();
		}

		System.out.println("The Transpose of the Matrix is :");
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(n_matrix[i][j] + " ");
				
			}
			System.out.println();
		}
		
		


	}

}

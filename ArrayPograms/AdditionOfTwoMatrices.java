package array;

import java.util.*;
public class AdditionOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m , n, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		 m =sc.nextInt();
		 n = sc.nextInt();
         int arr1[][] = new int[m][n];	
         int arr2[][] = new int[m][n];
         // add array to store the addition
         int add[][] = new int [m][n];
         System.out.println("Enter the elements of first Matrix");
         // Entering the elements into the first array
         for(i=0;i<m;i++) {
         	for(j=0;j<n;j++) {
         		arr1[i][j] = sc.nextInt();
         		
         		
         	}
         }
         System.out.println("Enter the elements of second Matrix");
         // Entering elements into the second array.
         for(i=0;i<m;i++) {
         	for(j=0;j<n;j++) {
         		arr2[i][j] = sc.nextInt();
         		
         		
         	}
         }
         
        
         // addition of the matrices
         for(i=0;i<m;i++) {
         	for(j=0;j<n;j++) {
         		add[i][j] = arr1[i][j] + arr2[i][j];
         		
         		
         	}
         }
         System.out.println("The Resultant Matrix is as follows :");
         // printing the new matrix
         for(i=0;i<m;i++) {
         	for(j=0;j<n;j++) {
         		System.out.print(add[i][j] + "  ");
         		
         		
         	}
         	System.out.println();
         }
	}

}

package array;

import java.util.*;
public class IdentityMatrixCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// taking variable m and n for the row and column size.
		int n,m,i,j;
		System.out.println("Enter the number of rows and columns : ");
		m = sc.nextInt();
		n = sc.nextInt();
        int arr[][] = new int[m][n];
        // to check the matrix elements are zero and one or not at specific positions.
        boolean flag = true;
        // Entering the elements into the matrix
        for(i=0;i<m;i++) {
        	for(j=0;j<n;j++) {
        		arr[i][j] = sc.nextInt();
        		
        		
        	}
        }
        
        for(i=0;i<m;i++) {
        	for(j=0;j<n;j++) {
        		System.out.print(arr[i][j]+" ");
        		
        		
        	}
        	System.out.println();
        }
        
        if(m!=n) {
        	System.out.println("Matrix should be square matrix....!");
        	
        	
        }
        for(i=0;i<m;i++) {
        	for(j=0;j<n;j++) {
        		if(i==j & arr[i][j]!=1 ) {
        			flag = false;
        			break;
        		}
        	    if(i!=j & arr[i][j]!=0) {
        	    	flag = false;
        	    	break;
        	    }
        	}
        }
        
        if(flag) {
        	System.out.println("The matrix is a identity matrix..:)");
        }
        else {
        	System.out.println("Matrix is not Identity Matrix");
        }
        
	}

}

package array;

import java.util.*;
public class NegativeNumberArray {
	
	public static void NegativeNumArray( int arr[], int n) {
		
		int newarr[]= new int[n];
		int i;
		System.out.println("The new arry which included only negative numbers in the old array is :");
		for(i=0;i<n;i++) {
			
		 if(arr[i]<0) {
			 newarr[i] = arr[i];
			 System.out.println(newarr[i]);
		 }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int i ;
		int arr[] = new int[n];
		System.out.println("Enter the elements of an array");
		
		for(i=0;i<n;i++) {
			
		   arr[i] = sc.nextInt();
			
		}
		NegativeNumArray(arr , n);
     
		
	}

}

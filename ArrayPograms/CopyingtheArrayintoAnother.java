package array;

import java.util.*;
public class CopyingtheArrayintoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i =0;i<n;i++) {
			
			arr1[i] = sc.nextInt();
			arr2[i] = arr1[i];
			
			
		}
		System.out.println("=============================================================================");
		System.out.println("The array after copying is : ");
		for(int i =0; i<n;i++) {
			System.out.println(arr2[i]);
			
		}
		
		
		
		

	}

}

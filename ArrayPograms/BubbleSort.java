package array;

import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the" + n+ " elements into the array");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		// now to sort the array
		
		for(i=0;i<n;i++) {
			
			for(j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		}
		
		System.out.println("The array after the sorting is look like : ");

		for(i=0;i<n;i++) {
			
			System.out.println(arr[i] + " ");
		}
	}

}

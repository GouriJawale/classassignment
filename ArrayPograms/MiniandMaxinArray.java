package array;

import java.util.*;
public class MiniandMaxinArray {
	public static void MaxElement(int arr[]) {
		int i;
		// intializing the maximum numnber.
		int max = arr[0];
		
		// intializing the minimum number.
		int min = arr[0];
		for(i=1;i<arr.length;i++) {
			//Checking and finding the maximum number.
			if(max<arr[i]) {
				max = arr[i];
			}
			//Checking and finding the minimum number.
			if(min > arr[i]) {
				
				min = arr[i];
			}
			
			
		}
		System.out.println("The maximum number in the array is : " + max);
		System.out.println("The minimum number in the array is : " + min);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements into the arry : ");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("====================================================================");
		// calling the method
		MaxElement(arr);
		

	}

}

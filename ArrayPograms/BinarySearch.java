package array;

import java.util.*;
public class BinarySearch {
           // method to write the binary search code
	public static void binaryySearch(int first, int last, int arr[], int key) {
		
		int mid = (first+last)/2;
		
		while(first<=last) {
			
			// here the if condition to decide the start i.e the middle element is less than or greater than key to find
			if(arr[mid]<key) {
				
				first = mid+1;
			}
			else if(arr[mid]==key) {
				
				System.out.println("The "+key+" is found at"+ mid+ "posoition .");
				break;
			}
			
			else {
			   last = mid-1;
			}
			
			
			mid = (first+last)/2;
			
		}
		if(first>last) {
			
			System.out.println("Element not found");
		}
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of the arry");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the "+n+" elements to the array");
		for(int i = 0; i<n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to search");
		int key = sc.nextInt();
		
		int last = arr.length - 1;
		binaryySearch(0, last, arr, key);

	}

}

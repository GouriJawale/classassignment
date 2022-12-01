package array;

import java.util.*;
public class FirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array Elements");
		
		for(int i=0; i<5; i++) {
			
			 arr [i] = sc.nextInt();
		}
		
		System.out.println("The elements in array are:");
		
		for(int i = 0;i<5;i++) {
			System.out.println(arr[i]);
		}

	}

}

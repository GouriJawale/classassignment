package array;

import java.util.*;
public class CountEvenandOddNum {
	
	public static void countEvenOddNum(int arr[]) {
		int evencount = 0;
		int oddcount =0 , i;
		for(i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				// if the number is even the evencount will increase by 1.
				evencount++;
			}
			if(arr[i]%2==1) {
				// if the number is even the oddcount will increase by 1.
				oddcount++;
			}
		}
		
		System.out.println("There are "+evencount+" even numbers are there in array");
		System.out.println("There are "+oddcount+" odd numbers are there in array");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements into the array");
		for(int i = 0; i<n;i++) {
			
			arr[i] = sc.nextInt();
		}
		// calling the function
		countEvenOddNum(arr);

	}

}

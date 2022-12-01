package array;

import java.util.Scanner;

public class LinearSearch {
	
	public static void searchElement(int arr[], int key) {
		int i;
		boolean flag = false;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				
				flag = true;
				System.out.println(key + " found at "+ (i+1) +"position");
			}
		}
		
		if(flag==false) {
			System.out.println("data not found");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
        int arr[] = new int[n];
        // enter the emlments now 
        
        System.out.println("Enter the elements into the array :");
        
        for(int j=0; j<n;j++) {
        	arr[j] = sc.nextInt();
        }
        System.out.println("Enter the element to search :");
        int key1 = sc.nextInt();
        
       
        searchElement(arr , key1 );
		

	} 

}

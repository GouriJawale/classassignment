package array;

import java.util.*;

public class foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
	    for(int i =0; i< arr.length; i++) {
	    	arr[i] = sc.nextInt();
	    	
	    }
	    System.out.println("Enter the element to search : ");
	    int key = sc.nextInt();
	    for(int var : arr) {
	    	
	    	if(var == key) {
	    		System.out.println(var + " found in the array");
	    	}
	    	
	    	break;
	    }
	  
	    
	 
				

	}

}

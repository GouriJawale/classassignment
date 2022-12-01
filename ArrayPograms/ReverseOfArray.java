package array;
   // Program to Reverse an array.
import java.util.*;
public class ReverseOfArray {
	
	public static void ReverseArray(int arr[], int n) {
		int i,j;
		int arr2[] = new int[n];
		for( i=0;i<n;i++) {
			
			// to reverse array in arr2 i th position the arr's (n-1)-i th value will be stored.
			// for eg.  at arr2[0] position the arr[(5-1)-0] that is arr[4] value is stored.
			// as this the array is reveresed.
			
			arr2[i] = arr[(n-1)-i];
		
		
		}
		for(i=0;i<n;i++) {
			System.out.println(arr2[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n;i++) {
			
			arr[i] = sc.nextInt();
		}
		
		ReverseArray(arr, n);
		
	
	}

}

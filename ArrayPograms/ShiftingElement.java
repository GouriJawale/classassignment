package array;

import java.util.*;
public class ShiftingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size, pos, num, i;
		int arr[] = new int[10];
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		System.out.println("Enter the "+size+" elements in the array");
		for(i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the position where you want to enter the element :");
		pos = sc.nextInt();
		
		if(pos>size || pos<0 || pos == size) {
			
			System.out.println("Please enter the position according to the size");
		}
		else {
			
			System.out.println("Enter the element to enter :");
			num = sc.nextInt();
			
			// shifting the elements
			for(i=size; i>=pos; i--) {
				arr[i] = arr[i-1];
				
			}
			// entering the element to the position
			// pos-1 beacuse array index start with 0 so indexes of any array will be position-1.
			arr[pos-1] = num;
			size++ ;   //size will be increase by one beacuse we added one element into the array.
			
			for(i=0; i<size; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	

	}

}

package array;

import java.util.*;
public class MergingTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first[] , sec[], third[], size1, size2, i , k;
		// Entering size and the elements in the first array.
		System.out.println("Enter the size of the first array");
		size1 = sc.nextInt();
		first = new int[size1];
		System.out.println("Enter the " +size1+ " elements in the first array");
		for(i=0;i<size1;i++) {
			first[i] = sc.nextInt();
			
		}
		
		// Entering size and the elements of the second array.
		
		System.out.println("Enter the size of the second array");
		size2 = sc.nextInt();
		sec = new int[size2];
		System.out.println("Enter the " +size2+ " elements in the second array");
		for(i=0;i<first.length;i++) {
			sec[i] = sc.nextInt();
		}
		
		third = new int[size1+size2];
		for(i=0;i<size1;i++) {
			third[i] = first[i];
		}
		k=i;  // to store the next location in the third array
		// if size is 5 the when loop will end then K is 5 then .
		for(i=0;i<sec.length;i++) {
			third[k]=sec[i];
			k++; // it will increase the position of the third array by one 5/6/7/9/10.
		}
		
		System.out.println("The array after merging the two array is : ");
		for(i=0;i<third.length;i++) {
			
			System.out.print(third[i] + " ");
		}
		
	

	}

}

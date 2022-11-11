
// Program to calculate the sum of all even numbers form 1 to n.
package basicprogram;

import java.util.*;
public class EvenNumSum {
	public static void main(String[]args) {
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			sum = sum+i;
			
		}
		System.out.println("The sum of all even numbers form 1 t0 "+n+" is "+sum);
	}

}

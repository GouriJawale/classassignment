package basicprogram;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, fact=1;
		System.out.println("Enter the number to find factorial of");
		 n = sc.nextInt();
		for(i=n;i>=1;i--) {
			fact = fact * i;
		}
		System.out.println("The factorrial of the "+n+" is"+fact);
		

	}

}

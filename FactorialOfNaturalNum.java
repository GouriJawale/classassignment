package basicprogram;

import java.util.*;
public class FactorialOfNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n natural numbers whose factorial you want to calculate");
		n = sc.nextInt();
		
		//outer for loop for deciding value of i;
		for(i=1;i<=n;i++) {
			int fact = 1;
			for(j=1;j<=i;j++) {
				fact = fact * j;
				
				
			}
			System.out.println(fact);
			
		}
		
		

	}

}

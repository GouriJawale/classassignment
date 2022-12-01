package oopsConcepts;
import java.util.*;
public class PerfectNumberfrom1to50 {

	public static void main(String[] args) { 
		
		// TODO Auto-generated method stub
		
		int num , i , sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		for(num = 1; num<=n; num++) {
			
			
			
			for(i =1; i<num; i++) {
				 
				if(num%i==0) {
					sum = sum+i;
					
				}
				
			}
			if(sum == num) {
				System.out.println(num);
			}
			sum = 0;
		}

	}

}

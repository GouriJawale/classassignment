package oopsConcepts;

import java.util.*;

class Armstrong{
	int num, temp, add=0;
	public Armstrong(int no) {
		this.num = no;
		this.temp = no;
		while(num!=0) {
		 int d = num%10;
		 add = add+(d*d*d);
		 num = num/10;
		}
		if(add==temp) {
			System.out.println("The number "+temp+" is a Armstrong number");
		}
		else {
			System.out.println("The number is now Armstrong numbers");
		}
	
		
		
	}
}

public class ArmstrongNumberUsingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number to that it is Armstrong or not: ");
		int number = sc.nextInt();
		
		Armstrong am = new Armstrong(number);

	}

}

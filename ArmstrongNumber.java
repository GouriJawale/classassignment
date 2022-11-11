package basicprogram;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	
		//Armstrong number is number whose addition of the cube of the digits in that number is same to original number.
		
		Scanner sc = new Scanner(System.in);
		int num , temp, rem, arm_num=0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		//storing original number in temp
		temp =num;
		while(num!=0) {
			rem = num%10;
			arm_num = arm_num+(rem*rem*rem);
			num = num/10;
		}
		//to check the number is Armstrong or not.
		if(arm_num==temp) {
			System.out.println("The number is armstrong");
		}
		else {
			System.out.println("The number is not armstrong");
		}
		
	}

}

package basicprogram;
//program to count the no. of digits in the number.

import java.util.*;
public class DigitCount {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int num, temp, count=0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		temp = num;
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("The number of digits in the "+temp+" are"+count);
		
		
	}

}

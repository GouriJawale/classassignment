package basicprogram;

//Program to count digits in a number using for.
import java.util.*;
public class CountDigitFor {
	public static void main(String[]args) {
		int num, temp, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		//temp variable is there to store the original number.
		temp = num;
		for(;num!=0;) {
			num = num/10;
			count++;
		}
		System.out.println("The number of digits in the "+temp+" are"+count);
		
	}

}

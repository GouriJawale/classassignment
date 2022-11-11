package basicprogram;
//Program to check that number is character or number or zero.
import java.util.*;
public class CharacterOrNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.println("Enter a number or Character");
		num = sc.nextInt();
		if(num<0||num>0) {
			System.out.println("Your entered a number");
		}
		else {
		
				if(num==0) {
					System.out.println("You entered zero");
				}
			}
		}
		
		
	}



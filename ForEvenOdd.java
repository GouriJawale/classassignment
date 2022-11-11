package basicprogram;

import java.util.Scanner;

public class ForEvenOdd {
	public static void main(String[]args) {
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto you want find enve numbers");
		n = sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}

package basicprogram;
//Program to check which number is greater.
import java.util.* ;
public class GreaterNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three number");
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b&&a>c) {
			System.out.println(a+ "is greater");
		}
		else {
			if(b>a&&b>c) {
				System.out.println(b+"is greater");
			}
			else {
				if(c>a&&c>b) {
					System.out.println(c+"is greater");
				}
			}
		}
	}

}

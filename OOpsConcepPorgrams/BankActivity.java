package oopsConcepts;
import java.util.*;
class Bank{
	public float withdraw_amt;
	public float deposite_amt;
	public float balance = 10000;
	
	void deposite(float deposite_amt) {
		this.deposite_amt = deposite_amt;
		System.out.println("You have deposited " +deposite_amt + "successfully.");
		balance = balance + deposite_amt;
		System.out.println("Your current balance is "+balance);
		System.out.println("Thank You.....");
	}
	
	void withdraw(float withdraw_amt) {
		this.withdraw_amt = withdraw_amt;
		
		if(balance<withdraw_amt) {
			System.out.println("You have insufficient balance");
		}
		else {
			System.out.println("You withdrawn the"+ withdraw_amt + " sucessfully...");
			
			balance = balance - withdraw_amt; 
			System.out.println("Your current balance is"+balance);
			System.out.println("Thank You....");
		}
	}
}

public class BankActivity {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bank bn = new Bank();
		int choice;
		float amt;
		System.out.println("Enter 1. Withdraw / 2. Deposite");
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 :
			System.out.println("Enter the amount to withdraw");
			amt = sc.nextInt();
			bn.withdraw(amt);
			
			break;
			
		case 2 :
			System.out.println("Enter the amount to deposite");
			amt = sc.nextInt();
			bn.deposite(amt);
			
			break;
			
		default:
			System.out.println("Wrong input");			
		    break;
		
		
		}
		
		}

	}



package oopsConcepts;

class UserDetails{
	int id;
	String name;
	long phno;
	
BankDetails bankdetails;   // entity reference

   public UserDetails(int id, String name, long phno,BankDetails bankdetails) {
	   super();
	   this.id = id;
	   this.name= name;
	   this.phno=phno;
	   this.bankdetails = bankdetails;
   }

public int getId() {
	return id;
}




public String getName() {
	return name;
}



public long getPhno() {
	return phno;
}


public BankDetails getBankdetails() {
	return bankdetails;
}

@Override
public String toString() {
	return "UserDetails [id=" + id + ", name=" + name + ", phno=" + phno + ", bankdetails=" + bankdetails + "]";
}


   
	
}

public class AggregationDemo {
	
	public static void main(String[]args) {
	
	BankDetails acc1 = new BankDetails("sbi", "pube", 12345);
	BankDetails acc2 = new BankDetails("axis", "Mumbai",14578);
	
	UserDetails Gouri = new UserDetails(10, "Gouri", 1235, acc2 );  // object for the userdetail class
	
	System.out.println("ID:" + Gouri.getId());
	System.out.println("Bank Name:"+ Gouri.getBankdetails().getBankname());
	
	}

}

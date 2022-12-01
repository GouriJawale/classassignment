package oopsConcepts;

public class BankDetails {
	
		String bankname, location;
		long accno;

		public BankDetails(String bankname, String location, long accno) {
			this.bankname = bankname;
			this.location=location;
			this.accno = accno;
		}
		
	

	public String getBankname() {
			return bankname;
		}


		public String getLocation() {
			return location;
		}







		public long getAccno() {
			return accno;
		}



		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

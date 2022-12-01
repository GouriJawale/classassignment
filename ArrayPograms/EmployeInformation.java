package array;


class Employee{
	
	long employeeId;
	String employeeName;
	String employeeAdd;
	long empphone;
	double basicsalary;
	double special_allowance = 250.80;
	double Hra = 1000.50;
	
	public void TransferAllowance(double basicsalary) {
		this.basicsalary = basicsalary;
		double T_allow;
		T_allow = 10*this.basicsalary/100;
		System.out.println("Transfer Allowance :"+ T_allow);
	}
}
class Manager extends Employee{
	public Manager(long employeeId,String employeeName,String employeeAdd,long empphone,double basicsalary) {
		super.employeeId=employeeId;
		super.employeeName=employeeName;
		super.employeeAdd=employeeAdd;
		super.empphone=empphone;
		super.basicsalary=basicsalary;
		double salary = basicsalary+(basicsalary*super.special_allowance/100) + (basicsalary*super.special_allowance/100);
		System.out.println("MANAGER INFORMATION : ");
	    System.out.println("Employee ID      :"+employeeId);
	    System.out.println("Employee Name    :"+employeeName);
	    System.out.println("Employee Address :"+employeeAdd);
	    System.out.println("Employee Phone   :"+empphone);
	    System.out.println("Employee Salary  :"+salary);
	    
	    
		
	}

	@Override
	public void TransferAllowance(double basicsalary) {
		// TODO Auto-generated method stub
		super.basicsalary=basicsalary;
		double T_allow = 15*this.basicsalary/100;
		System.out.println("Transfer Allowance :"+ T_allow);
		
	}
	
	
}
class Trainee extends Employee{
	public Trainee(long employeeId,String employeeName,String employeeAdd,long empphone,double basicsalary) {
		super.employeeId=employeeId;
		super.employeeName=employeeName;
		super.employeeAdd=employeeAdd;
		super.empphone=empphone;
		super.basicsalary=basicsalary;
		double salary = basicsalary+(basicsalary*super.special_allowance/100) + (basicsalary*super.special_allowance/100);
		System.out.println("TRAINEE INFORMATION : ");
	    System.out.println("Employee ID      :"+employeeId);
	    System.out.println("Employee Name    :"+employeeName);
	    System.out.println("Employee Address :"+employeeAdd);
	    System.out.println("Employee Phone   :"+empphone);
	    System.out.println("Employee Salary  :"+salary);
		
	}
	
}

public class EmployeInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg = new Manager(126534,"Peter","Chennai India", 237844, 65000);
		mg.TransferAllowance(65000);
		System.out.println("=============================================================");
		Trainee tr = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		tr.TransferAllowance(45000);
		

	}

}

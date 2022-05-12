package java1;

public class EmployDetails { 
	
	public void printEmployName(String empName,int empId) {
    System.out.println("empName,empId-"+empName+","+empId);
	}
	public void getEmployAddress(String empAddress) {
		System.out.println("empAddress-"+empAddress);
	}
	public void printEmploySalary(double empSalary) {
		System.out.println("empSalary-"+empSalary);
	}
	public void printEmployMobileNo(long empMobile) {
		System.out.println("empMobile-"+empMobile);
	}
	public static void main(String[] args) {
		EmployDetails det=new EmployDetails();
		det.printEmployName("pavi",20);
		det.getEmployAddress("vellore");
		det.printEmploySalary(5637.50);
		det.printEmployMobileNo(944244614);
	}
}
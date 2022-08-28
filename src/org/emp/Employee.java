package org.emp;

public class Employee {
	private void empId() {
		System.out.println("100");
	}
	private void empName() {
		System.out.println("swathy");
	}
	private void empDob() {
		System.out.println("may 31 1997");
	}
	private void empPhone() {
		System.out.println("9894406626");
	}
	private void empEmail() {
		System.out.println("swathychitra31@gmail.com");
	}
	private void empAddress() {
		System.out.println("Thanjavur, Tamilnadu");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
}

 
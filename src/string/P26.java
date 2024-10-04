package string;

final class Employee {
	private final int empId;
	private final String empName;
	private final double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + empSalary;
	}

}

public class P26 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Zeus", 20000.0);
		System.out.println(e1);
	}
}

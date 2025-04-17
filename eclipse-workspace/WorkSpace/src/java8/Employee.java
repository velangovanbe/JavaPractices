package java8;

public class Employee {

	private String name;
	private int empID,exp,salary;
	public Employee(String name, int empID, int exp, int salary) {
		super();
		this.name = name;
		this.empID = empID;
		this.exp = exp;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

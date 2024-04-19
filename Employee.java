package practise;

public class Employee {
	
	private String Name;
	private String Department;
	private int id;
	private double salary;
	
	public void SetName(String Name) {
		this.Name=Name;
	}
	
	public void SetDepartment(String Department) {
		this.Department=Department;
	}
	
	public void Setid(int id) {
		this.id=id;
	}
	
	public void Setsalary(double salary) {
		this.salary=salary;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getDepartment() {
		return Department;	
	}
	
	public int getid() {
		return id;	
	}
	
	public double getsalary() {
		return salary;	
	}
}

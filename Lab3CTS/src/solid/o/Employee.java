package solid.o;

public class Employee {
	private int ID;
	private String name;
	private String employeeType;
	private float salary;
	
	public Employee(int iD, String name, String employeeType, int salary) {
		super();
		ID = iD;
		this.name = name;
		this.employeeType=employeeType;
		this.salary=salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//@Override
	//public String toString() {
	//	return "Employee [ID=" + ID + ", name=" + name + "]";
	//}
	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
//	@Override
//	public String toString() {
//		return "Employee [ID=" + ID + ", name=" + name + ", employeeType=" + employeeType + "]";
//	}
	
	public String getEmployeeType() {
		return employeeType;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", employeeType=" + employeeType + ", salary=" + salary + "]";
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	public float calculateBonus() {
		if(this.employeeType="FTE") {
			return this.salary*.05f;
		}
		else {
			return 0;
		}
	}
	

}

package solid.o.resolved;

public class FTEmployee extends Employee{

private float salary;
	
	
	public FTEmployee(int iD, String name, float salary) {
		super(iD, name);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public float calculateBonus() {
		// TODO Auto-generated method stub
		return this.salary*.1f;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "FTEmployee:" +super.toString()+"[salary=" + salary + "]";
	}
}

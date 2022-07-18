package telran.people;

public class Employee extends Person {
	private int basicSalary;
	

	public Employee(long id, int birthYear, String email, int basicSalary) {
		super(id, birthYear, email);
		setBasicSalary(basicSalary);
	}


	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int computePay() {
		return basicSalary;
	}
	

}

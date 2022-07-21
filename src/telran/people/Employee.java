package telran.people;

public class Employee extends Person {
	private int basicSalary;
	private static int minBirthYear = 1950;
	private static int maxBirthYear = 2000;
	public static int getMinBirthYear() {
		return minBirthYear;
	}


	public static void setMinBirthYear(int minBirthYear) {
		Employee.minBirthYear = minBirthYear;
	}


	public static int getMaxBirthYear() {
		return maxBirthYear;
	}


	public static void setMaxBirthYear(int maxBirthYear) {
		Employee.maxBirthYear = maxBirthYear;
	}
	
	

	public Employee(long id, int birthYear, String email, int basicSalary)  {
		super(id, birthYear, email);
		if (birthYear < minBirthYear || birthYear > maxBirthYear) {
			throw new IllegalArgumentException(String.format("%d - wrong birth year, "
					+ "should be in range [%d - %d]", birthYear,
					minBirthYear, maxBirthYear));
		}
		setBasicSalary(basicSalary);
	}


	public void setBasicSalary(int basicSalary) {
		//TODO 
		//check basic salary - can not be less than 100 with possible throwing exception
		this.basicSalary = basicSalary;
	}
	public int computePay() {
		return basicSalary;
	}
	

}

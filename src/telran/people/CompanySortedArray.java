package telran.people;

import java.util.Arrays;

public class CompanySortedArray extends CompanyArray {
	@Override
public boolean addEmployee(Employee empl) {
		//TODO
		//finds index for adding with keeping array sorted
		//calls getEmployeeIndex
		
	return false;
}
	
	@Override 
	protected int getEmployeeIndex(long id) {
		//TODO
		// based on Arrays.binarySearch
		return -1;
	}
	@Override
	public Employee[] getAllEmployees() {
		return Arrays.copyOf(employees, employees.length);
	}
}

package telran.people;

import java.util.Arrays;

public class CompanyArray implements ICompany {
protected  Employee[] employees = new Employee[0];
	@Override
	public boolean addEmployee(Employee empl) {
		if (getEmployee(empl.getId()) != null) {
			return false;
		}
		employees = Arrays.copyOf(employees, employees.length + 1);
		employees[employees.length - 1] = empl;
		
		return true;
	}

	@Override
	public Employee removeEmployee(long id) {
		int index = getEmployeeIndex(id);
		if(index < 0) {
			return null;
		}
		Employee res = employees[index];
		Employee[] tmp = new Employee[employees.length - 1];
		System.arraycopy(employees, 0, tmp, 0, index);
		System.arraycopy(employees, index+1, tmp, index, tmp.length - index);
		employees = tmp;
		
		return res;
	}

	@Override
	public Employee getEmployee(long id) {
		int index = getEmployeeIndex(id);
		
		return index < 0 ? null : employees[index];
	}

	protected int getEmployeeIndex(long id) {
		for(int i = 0; i < employees.length; i++) {
			if (employees[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public long computeSalaryBudget() {
		long res = 0;
		for(int i = 0; i < employees.length; i++) {
			res += employees[i].computePay();
		}
		return res;
	}

	@Override
	public Employee[] getAllEmployees() {
		Employee[]res = Arrays.copyOf(employees, employees.length);
		Arrays.sort(res);
		return res;
	}

}

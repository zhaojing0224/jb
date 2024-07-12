package jb.basic;

public class Manager extends Employee {

	private String department;//部門

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * 
	 * @param name
	 * @param salary
	 */
	public Manager(String name, int salary, String department) {

		super(name, salary);
		this.department = department;
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("部門: " + department);
	}
}

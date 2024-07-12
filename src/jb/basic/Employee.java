package jb.basic;

public class Employee {

	private String name;//名前
	private int salary;//給料

	/**
	 * 
	 * @param name
	 * @param salary
	 */
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * 
	 */
	public void showDetails() {
         System.out.println("名前: " + name);
         System.out.println("給料: " + salary);
     }

}

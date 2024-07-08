package jb.basic;

public class Animal {

	private String species;//種類
	private int age;//年齢
	private String healthStatus;//健康状態

	/**
	 * 
	 * @param species
	 * @param age
	 * @param healthStatus
	 */
	public Animal(String species, int age, String healthStatus) {

		this.species = species;
		this.age = age;
		this.healthStatus = healthStatus;

	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	@Override
	public String toString() {
		return species + " (年齢: " + age + ", 健康状態: " + healthStatus + ")";
	}

}

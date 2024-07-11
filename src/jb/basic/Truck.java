package jb.basic;

public class Truck extends Car {

	int loadCapacity;

	/**
	 * 
	 * @param loadCapacity
	 */
	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	/**
	 * 
	 */
	public void showLoadCapacity() {
		System.out.println("Load Capacity: " + loadCapacity);
	}

	/**
	 * 
	 */
	public void showSpeed() {
		System.out.println("Speed: " + speed);
	}

}
package jb.basic;

/**自動車とトラック*/

public class ch49 {

	public static void main(String[] args) {

		Truck truck = new Truck();

		truck.setSpeed(50);
		truck.setLoadCapacity(5000);
		truck.showSpeed();
		truck.showLoadCapacity();

	}

}

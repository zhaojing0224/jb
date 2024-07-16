package jb.basic;

public class Car extends Vehicle {

	private String model; // 車種
	private int maxSpeed; // 最高速度
	int speed;// 自動車の速度

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void move() {
		System.out.println("自動車は道路を走ります。");
	}
}

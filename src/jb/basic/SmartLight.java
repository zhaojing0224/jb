package jb.basic;

public class SmartLight extends SmartDevice implements Controllable {

	public SmartLight(String deviceName) {
		super(deviceName);
	}

	@Override
	public void displayInfo() {
		System.out.println("デバイス: " + getDeviceName());
	}

	@Override
	public void turnOn() {
		System.out.println("ライトをオンにしました。");
	}

	@Override
	public void turnOff() {
		System.out.println("ライトをオフにしました。");
	}

}

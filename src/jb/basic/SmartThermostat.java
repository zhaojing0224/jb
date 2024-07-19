package jb.basic;

public class SmartThermostat extends SmartDevice implements Controllable {

	public SmartThermostat(String deviceName) {
		super(deviceName);
	}

	@Override
	public void displayInfo() {
		System.out.println("デバイス: " + getDeviceName());
	}

	@Override
	public void turnOn() {
		System.out.println("サーモスタットをオンにしました。");
	}

	@Override
	public void turnOff() {
		System.out.println("サーモスタットをオフにしました。");
	}

}

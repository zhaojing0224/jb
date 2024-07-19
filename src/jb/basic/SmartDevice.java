package jb.basic;

public abstract class SmartDevice {

	private String deviceName;

	public SmartDevice(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	// 抽象メソッド
	public abstract void displayInfo();

}

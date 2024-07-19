package jb.basic;

/**スマートホーム制御システム*/

public class ch57 {

	public static void main(String[] args) {

		SmartDevice light = new SmartLight("スマートライト");
		light.displayInfo();
		((Controllable) light).turnOn();

		SmartDevice thermostat = new SmartThermostat("スマートサーモスタット");
		thermostat.displayInfo();
		((Controllable) thermostat).turnOff();

	}

}

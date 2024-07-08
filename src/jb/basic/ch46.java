package jb.basic;

/**車クラスを設計しよう*/

public class ch46 {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.setModel("Toyota");
		myCar.setMaxSpeed(180);
		
		System.out.println("車種：" + myCar.getModel());
		System.out.println("最大速度：" + myCar.getMaxSpeed());

	}

}

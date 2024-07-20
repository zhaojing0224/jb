package jb.basic;

public class Cars {

	private static int totalCars = 0;
	private static final int BaseRentalFee = 3000;

	private String modelName;
	private int rentalFee;

	/**
	 * コンストラクタ
	 * @param modelName
	 */
	public Cars(String modelName) {

		this.modelName = modelName;
		this.rentalFee = BaseRentalFee;
		totalCars++;

	}

	/**
	 * レンタル料金を計算するstaticメソッド
	 * @param rentalDays
	 * @return
	 */
	public static int calculateRentalFee(int rentalDays) {
		return BaseRentalFee * rentalDays;
	}

	public void displayCarDetails(int rentalDays) {
		int totalFee = calculateRentalFee(rentalDays);
		System.out.println("モデル: " + modelName);
		System.out.println("レンタル日数: " + rentalDays + "日");
		System.out.println("合計レンタル料金: " + totalFee + "円");
	}

	public static void displayTotalCars() {
		System.out.println("全車両数: " + totalCars);
	}

}

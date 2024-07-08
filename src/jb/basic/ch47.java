package jb.basic;

/**動物園管理システムを設計しよう*/

public class ch47 {

	public static void main(String[] args) {
		
		Zoo myZoo = new Zoo(10);

		myZoo.addAnimal(new Animal("ライオン", 5, "健康"));
		myZoo.addAnimal(new Animal("ゾウ", 10, "病気"));

		myZoo.showAllAnimals();
	}

}

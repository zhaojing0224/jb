package jb.basic;

public class Zoo {

	private Animal[] animals;//動物を配列で管理する
	private int animalCount;//動物数

	/**
	 * 
	 * @param maxSize
	 */
	public Zoo(int maxSize) {
		animals = new Animal[maxSize];
		animalCount = 0;
	}

	/**
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		if (animalCount < animals.length) {
			animals[animalCount] = animal;
			animalCount++;
		} else {
			System.out.println("動物園は満員です。");
		}
	}
	
	/**
	 * 動物を表示する
	 */
	public void showAllAnimals() {
		for (int i = 0; i < animalCount; i++) {
			if (animals[i] != null) {
				System.out.println(animals[i]);
			}
		}
	}

}

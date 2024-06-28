package jb.ch04;

/**最大値と最小値*/

public class ch0407 {

	public static void main(String[] args) {
		
        int[] numbers = { 5, 3, 8, 4, 0 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("最大値: " + max + " 最小値: " + min);
       
    }

}

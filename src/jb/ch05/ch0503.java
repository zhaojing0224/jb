package jb.ch05;

/**二次元配列の要素の合計*/

public class ch0503 {

	public static void main(String[] args) {
        
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println(sum);
    }

}

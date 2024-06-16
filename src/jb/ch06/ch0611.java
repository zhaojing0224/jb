package jb.ch06;

import java.util.Arrays;

/**二つの整数配列を受け取り、それらを一つの配列に結合し、新しい配列として返すメソッドconcatenateArraysを作成してください。forループを使用して結合処理を行い、mainメソッドでこのメソッドを呼び出し、結果をコンソールに出力してください。*/

public class ch0611 {

	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3};
		int[] array2 = {3, 4, 5};
		int[] combinedArray = concatenateArrays(array1, array2);
		
		System.out.println(Arrays.toString(combinedArray));

	}
	
	public static int[] concatenateArrays(int[] array1, int[] array2) {
		
		int[] result = new int[array1.length + array2.length];
		for(int i = 0;i < array1.length; i++) {
			result[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }
		
		return result;
		
	}

}

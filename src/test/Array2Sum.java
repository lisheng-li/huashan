package test;

public class Array2Sum {
	
	public static void main(String[] args) {
		int sum = 0;
		int[][] arr = {{11, 22, 33}, {11, 22}, {11, 22, 33, 44}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}

package src.methods;

public class Task1 {

	// write a method that takes matrix as parameter
	// and returns sum of all elements of that matrix

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int suma = sum(matrix);
		System.out.println(suma);
	}

	private static int sum(int[][] values) {
		int suma = 0;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length; j++)

			{
				suma += values[i][j];
			}
		}
		return suma;

	}

}

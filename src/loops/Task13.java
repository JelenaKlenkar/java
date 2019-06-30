package loops;

public class Task13 {
	public static void main(String[] args) {
		// sum all the numbers of array with for each loop

		int[] numbers = { 1, 2, 5, 7, 6 };
		int sum = 0;

		for (int e : numbers) {
			sum += e;
		}
		System.out.println("Sum of array of integers is " + sum);

	}

}

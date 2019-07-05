package src.methods;

public class Task3 {
	// method accepts integer as parameter
	// and sums all odd numbers till that number, including that number
	public static void main(String[] args) {
		System.out.println(sumOfOddNumbers(9));
	}

	static int sumOfOddNumbers(int x) {
		int sum = 0;

		for (int i = 0; i <= x; i++) {
			if (i % 2 == 1) {
				sum += i;
			}

		}
		return sum;
	}

}

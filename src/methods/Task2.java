package src.methods;

public class Task2 {
	// write a method that takes integer as parameter
	// and returns factorial of that integer
	// with recursive method

	public static void main(String[] args) {
		System.out.println(calculateFactorialOfNumber(4));
	}

	public static int calculateFactorialOfNumber(int x) {

		if (x == 1) {
			return 1;
		}

		return x * calculateFactorialOfNumber(x - 1);
	}

}

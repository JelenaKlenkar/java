package src.loops;

public class Task15 {
	public static void main(String[] args) {
		// with while loop print out 1 2 4 8 16 32 64 128 256 512

		int a = 1;

		while (a <= 512) {
			System.out.print(a + " ");
			a *= 2;
		}
	}

}

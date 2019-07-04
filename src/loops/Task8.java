package src.loops;

public class Task8 {
	public static void main(String[] args) {
		// loopinloops

		int b = 10;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}

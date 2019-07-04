package src.loops;

public class Task9 {

	public static void main(String[] args) {
		// loopinloop

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}

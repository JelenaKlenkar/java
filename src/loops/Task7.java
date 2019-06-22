package loops;

public class Task7 {
	public static void main(String[] args) {
		// increment,decrement

		int z = 1, t = 3;

		z = --t;
		t += t++ - --z;
		z++;
		t--;
		z = --t + ++z;
		System.out.println(z++ + "," + t--);

	}

}

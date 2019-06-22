package loops;

public class Task4 {

	// increment,decrement

	public static void main(String[] args) {

		int y = 2, x = 3;

		x = ++y;
		y = x++ - x;
		y--;
		x++;
		y = ++x - x--;

		System.out.println(x + "&&" + y);
	}

}

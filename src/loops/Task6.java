package src.loops;

public class Task6 {
	public static void main(String[] args) {
		// increment,decrement

		int i = 3, j = 4;
		j = i++;
		i = ++i - j--;
		j++;
		j = i-- + j++ + ++i;
		System.out.println(++i + "," + --j);
	}

}

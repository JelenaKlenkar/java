package src.loops;

public class Task5 {

	public static void main(String[] args) {
		// increment,decrement

		int i = 10, j = 15;

		i = j++;
		j = ++i - --j;
		j++;
		--i;
		j = i++ - j--;
		System.out.println(i++ + "%" + --j);
	}
}

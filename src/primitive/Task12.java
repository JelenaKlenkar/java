package src.primitive;

public class Task12 {

	public static void main(String[] args) {
		// using String builder to convert characters to String
		String str;
		char a = 'B';
		char b = 'u';
		char c = 'b';
		char d = 'i';
		char e = 'c';
		char f = 'a';

		str = new StringBuilder().append("").append(a).append(b).append(c).append(d).append(e).append(f).toString();

		System.out.println(str);

	}

}

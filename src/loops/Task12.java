package loops;

import javax.swing.JOptionPane;

public class Task12 {
	// Two numbers are entered through the keyboard. Write a program to find the
	// value of one number raised to the power of another

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Input number1: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Input number2: "));
		int result = 1;

		for (int i = 0; i <= y; i++) {
			result *= x;

		}
		System.out.println("Result: " + result);
	}

}

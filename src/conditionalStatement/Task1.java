package conditionalStatement;

import javax.swing.JOptionPane;

public class Task1 {
	public static void main(String[] args) {
		// Write a Java program to get a number from the user and print whether it is
		// positive or negative

		int i = Integer.parseInt(JOptionPane.showInputDialog("a"));

		if (i < 0) {
			System.out.println("Number is negative.");
		} else if (i > 0) {
			System.out.println("Number is positive.");
		} else {
			System.out.println("Number is zero.");
		}
	}
}

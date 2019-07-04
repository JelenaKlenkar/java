package src.conditionalStatement;

import javax.swing.JOptionPane;

public class Task8 {
	public static void main(String[] args) {
		// Write a Java program that determines a student’s grade

		int i = Integer.parseInt(JOptionPane.showInputDialog("a"));

		if (i <= 100 && i >= 90) {
			System.out.println("Grade is A.");
		} else if (i <= 85 && i >= 75) {
			System.out.println("Grade is B.");
		} else if (i <= 70 && i >= 60) {
			System.out.println("Grade is C.");
		} else if (i <= 55 && i >= 50) {
			System.out.println("Grade is D.");
		} else if (i < 50) {
			System.out.println("Grade is F.");

		}
	}

}

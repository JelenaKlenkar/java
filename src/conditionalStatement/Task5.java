package src.conditionalStatement;

import javax.swing.JOptionPane;

public class Task5 {
//Write a Java program that input two decimal numbers and tests whether they are the same up to three decimal places

	public static void main(String[] args) {

		double i = Double.parseDouble(JOptionPane.showInputDialog("a"));
		double j = Double.parseDouble(JOptionPane.showInputDialog("b"));

		i = Math.round(i * 1000);
		i = i / 1000;

		j = Math.round(j * 1000);
		j = j / 1000;

		if (i == j) {
			System.out.println("Numbers are the same");
		} else {
			System.out.println("Numbers are not the same");
		}
	}
}

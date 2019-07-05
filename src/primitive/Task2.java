package src.primitive;

import javax.swing.JOptionPane;

public class Task2 {
	public static void main(String[] args) {
		// enters two integers and prints out remainder
		int j = Integer.parseInt(JOptionPane.showInputDialog("a"));
		int i = Integer.parseInt(JOptionPane.showInputDialog("b"));

		int c = j % i;

		System.out.println(c);
	}

}

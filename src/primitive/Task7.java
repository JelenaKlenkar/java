package src.primitive;

import javax.swing.JOptionPane;

public class Task7 {

	public static void main(String[] args) {

		// enters two decimal numbers, multiples them and prints out result

		double i = Double.parseDouble(JOptionPane.showInputDialog("a"));
		double j = Double.parseDouble(JOptionPane.showInputDialog("b")

		);
		double z = i * j;
		
		System.out.println(z);
	}

}

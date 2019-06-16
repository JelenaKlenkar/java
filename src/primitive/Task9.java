package primitive;

import javax.swing.JOptionPane;

public class Task9 {

	public static void main(String[] args) {
		// substract two decimal numbers

		double i = Double.parseDouble(JOptionPane.showInputDialog("a"));
		double j = Double.parseDouble(JOptionPane.showInputDialog("b")

		);
		double z = i - j;

		System.out.println(i + "-" + j + "=" + z);

	}

}

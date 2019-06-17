package primitive;

import javax.swing.JOptionPane;

public class Task3 {

	public static void main(String[] args) {

		// enters boolean values and prints her out

		boolean i = Boolean.parseBoolean(JOptionPane.showInputDialog("boolean1"));

		boolean j = Boolean.parseBoolean(JOptionPane.showInputDialog("boolean2"));
		boolean r = i || j;

		System.out.println(r);
	}

}

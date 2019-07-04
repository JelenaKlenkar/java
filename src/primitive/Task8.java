package src.primitive;

import javax.swing.JOptionPane;

public class Task8 {
	public static void main(String[] args) {
		//  multiply two numbers and substract with third number

		System.out.println(Integer.parseInt(JOptionPane.showInputDialog("a"))
				* Integer.parseInt(JOptionPane.showInputDialog("b"))

				- Integer.parseInt(JOptionPane.showInputDialog("c")));
	}

}

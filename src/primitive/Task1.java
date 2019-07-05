package src.primitive;

import javax.swing.JOptionPane;

public class Task1 {

	public static void main(String[] args) {
        //enters two integers and prints boolean value
		int i = Integer.parseInt(JOptionPane.showInputDialog("a"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("b"));
		boolean r = i != j;

		System.out.println(r);
	}

}

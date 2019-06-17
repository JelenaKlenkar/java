package conditionalStatement;

import javax.swing.JOptionPane;

public class Task2 {
	public static void main(String[] args) {
		//Take three numbers from the user and print the greatest number.
		
		int i=Integer.parseInt(
				JOptionPane.showInputDialog("a")
				);
		int j=Integer.parseInt(
				JOptionPane.showInputDialog("b")
				);
		int k=Integer.parseInt(
				JOptionPane.showInputDialog("c")
				);
	if(i>=j&&i>=k) {
		System.out.println(i);
	}
	else if(j>=i&&j>=k) {
		System.out.println(j);
	}
	else {
		System.out.println(k);
	}
	
	}
	
}
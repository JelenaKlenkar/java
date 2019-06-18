package conditionalStatement;

import javax.swing.JOptionPane;

public class Task7 {
	
	public static void main(String[] args) {
		
		// Write Java program to allow the user to input his/her age. 
		//Then the program will show if the person is eligible to vote.
		//A person who is eligible to vote must be older than or equal to 18 years old
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("a"));
		
		if(i>=18) {
			System.out.println("Person is eligible to vote.");
		}
		else {
			System.out.println("Person is not eligible to vote.");
		}
	}

}

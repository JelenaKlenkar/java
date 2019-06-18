package conditionalStatement;

import javax.swing.JOptionPane;

public class Task3 {
	public static void main(String[] args) {
		// Write a Java program that keeps a number from the user and generates an
		// integer between 1 and 7 and displays the name of the weekday
		// using if

		int i = Integer.parseInt(JOptionPane.showInputDialog("a")

		);
		
		if (i==1) {
			System.out.println("Monday");
		}
		else if(i==2) {
			System.out.println("Tuesday");
		}
		else if(i==3) {
			System.out.println("Wednesday");
		}
		else if(i==4) {
			System.out.println("Thursday");
		}
		else if(i==5) {
			System.out.println("Friday");
		}
		else if(i==6) {
			System.out.println("Saturday");
		}
		else if(i==7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("Not a day in week");
		}
}

}

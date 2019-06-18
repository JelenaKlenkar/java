package conditionalStatement;

import javax.swing.JOptionPane;

public class Task6 {

	public static void main(String[] args) {
		//print out number of days in month
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("a"));
		
		switch(i) {
		case 1:
			System.out.println("Month has 31 days.");
			break;
		case 2:
			System.out.println("Month has 28 days, but during leap years 29 days.");
			break;
		case 3:
			System.out.println("Month has 31 days.");
			break;
		case 4:
			System.out.println("Month has 30 days.");
			break;
		case 5:
			System.out.println("Month has 31 days.");
			break;
		case 6:
			System.out.println("Month has 30 days.");
			break;
		case 7:
			System.out.println("Month has 31 days.");
			break;
		case 8:
			System.out.println("Month has 31 days.");
			break;
		case 9:
			System.out.println("Month has 30 days.");
			break;
		case 10:
			System.out.println("Month has 31 days.");
			break;
		case 11:
			System.out.println("Month has 30 days.");
			break;
		case 12:
			System.out.println("Month has 31 days.");
		}
	}
}

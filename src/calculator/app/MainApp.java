/* @author: James Conway Hutcheon
 * @Teacher: Debbie J
 * @Class: CSC160 1:00 MWF
 * @Github: https://github.com/JamesHutcheon07/Calculator.git
 */

package calculator.app;

import calculator.device.*;

public class MainApp {
	
	
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		
		System.out.println("Testing Add:");
		myCalculator.add(4);
		System.out.println();
		
		System.out.println("Testing Subtract:");
		myCalculator.subtract(2);
		System.out.println();

		System.out.println("Testing Multiply:");
		myCalculator.multiply(5);
		System.out.println();

		System.out.println("Testing Divide:");
		myCalculator.divide(7);
		System.out.println();

		
		System.out.println("Testing POW:");
		myCalculator.pow(5);
		System.out.println();
		
		System.out.println("Testing Divide:");
		myCalculator.sqrt(5);
		System.out.println();



	}
	


}

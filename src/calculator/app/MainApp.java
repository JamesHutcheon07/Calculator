/* @author: James Conway Hutcheon
 * @Teacher: Debbie J
 * @Class: CSC160 1:00 MWF
 * @Github: https://github.com/JamesHutcheon07/Calculator.git
 */

package calculator.app;

import calculator.device.*;

public class MainApp {
	
	
	public static void main(String[] args) {
		AdvanceCalculate myCalculator = new AdvanceCalculate();
		
		System.out.println("Testing Add:");
		myCalculator.add(77);
		System.out.println();
		
		System.out.println("Testing M+:");
		myCalculator.memoryAdd();
		System.out.println();
		
		System.out.println("Testing Subtract:");
		myCalculator.subtract(23);
		System.out.println();

		System.out.println("Testing Multiply:");
		myCalculator.multiply(9);
		System.out.println();
		
		System.out.println("Testing MR:");
		myCalculator.add(myCalculator.memoryRecall());
		System.out.println();

		System.out.println("Testing Divide:");
		myCalculator.divide(7);
		System.out.println();
	
		System.out.println("Testing M-:");
		myCalculator.memorySubtract();
		System.out.println();
		
		System.out.println("Testing POW:");
		myCalculator.pow(6);
		System.out.println();
		
		System.out.println("Testing Divide:");
		myCalculator.sqrt();
		System.out.println();



	}//main
	


}//class main

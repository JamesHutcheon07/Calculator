/* @author: James Conway Hutcheon
 * @Teacher: Debbie J
 * @Class: CSC160 1:00 MWF
 * @Github: https://github.com/JamesHutcheon07/Calculator.git
 */

package calculator.device;

import java.lang.Math;

public class AdvanceCalculate extends StandardCalculate implements AdvanceMath {

	/**
	 *uses the POW java math function to raise a number to a power
	 *once doing that it outputs the answer
	 */
	@Override
	public void pow(double userInput) {
		System.out.print(this.currentValue + " ^ " + userInput + " = ");
		this.currentValue = Math.pow(this.currentValue, userInput);
		System.out.println(currentValue);
	}

	
	/**
	 *uses the SQRT java math function to square root the input it receives
	 *once doing that it outputs the answer
	 */
	@Override
	public void sqrt() {
		System.out.print("The square root of: " + this.currentValue + " = ");
		this.currentValue = Math.sqrt(this.currentValue);
		System.out.println(currentValue);

	}

}//class

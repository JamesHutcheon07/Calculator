/* @author: James Conway Hutcheon
 * @Teacher: Debbie J
 * @Class: CSC160 1:00 MWF
 * @Github: https://github.com/JamesHutcheon07/Calculator.git
 */

package calculator.device;

import java.lang.Math;

public class AdvanceCalculate extends Calculator implements AdvanceMath {

	@Override
	public void pow(double userInput) {
		System.out.print(this.currentValue + " ^ " + userInput + " = ");
		this.currentValue = Math.pow(this.currentValue, userInput);
		System.out.println(currentValue);
		System.out.println(' ');

	}

	@Override
	public void sqrt() {
		System.out.println("Testing Sqrt:");
		System.out.print("The square root of: " + this.currentValue + " = ");
		this.currentValue = Math.sqrt(this.currentValue);
		System.out.println(currentValue);
		System.out.println(' ');

	}

}

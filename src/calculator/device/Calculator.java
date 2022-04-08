/* @author: James Conway Hutcheon
 * @Teacher: Debbie J
 * @Class: CSC160 1:00 MWF
 * @Github: https://github.com/JamesHutcheon07/Calculator.git
 */

package calculator.device;

public abstract class Calculator implements BasicMath{

	/**
	 * current value that the calculator works with
	 */
	protected double currentValue = 0.0;
	
	/**
	 * resets the current value to 0.0
	 */
	public void clear() {
		this.currentValue = 0.0;
		System.out.println("Clear: " + this.currentValue);
	}

	/**
	 * @param userInput
	 * adds the user's entered value to the current value
	 */
	@Override
	public void add(double userInput) {
		System.out.print(this.currentValue + " + " + userInput + " = ");
		this.currentValue += userInput;
		System.out.println(currentValue);
		
	}

	/**
	 * @param userInput
	 * subtracts the user's entered value to the current value
	 */
	@Override
	public void subtract(double userInput) {
		System.out.print(this.currentValue + " - " + userInput + " = ");
		this.currentValue -= userInput;
		System.out.println(currentValue);

	}

	/**
	 * @param userInput
	 * multiplies the user's entered value by the current value
	 */
	@Override
	public void multiply(double userInput) {
		System.out.print(this.currentValue + " x " + userInput + " = ");
		this.currentValue *= userInput;
		System.out.println(currentValue);

	}

	/**
	 * @param userInput
	 * divides the current value by the user input value
	 */
	@Override
	public void divide(double userInput) {
		System.out.print(this.currentValue + " / " + userInput + " = ");
		this.currentValue /= userInput;
		System.out.println(currentValue);

	}

}//class

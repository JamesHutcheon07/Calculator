/* @author: James Conway Hutcheon
 * @Teacher: Debbie J
 * @Class: CSC160 1:00 MWF
 * @Github: https://github.com/JamesHutcheon07/Calculator.git
 */
package calculator.device;

public class StandardCalculate extends Calculator {

	/**
	 * creates and sets the memory value to 0.0
	 */
	protected double memoryValue = 0.0;

	/*
	 * How to use the memory functions
	 * M+ to add the displayed value to the existing number in memory. 
	 * M- to subtract the displayed value from the number in memory.
	 * MR = Memory Recall uses the number in memory, acts as if you had keyed in that number yourself.
	 */

	
	/*
	 * resets the memory value to 0.0
	 */
	public void memoryClear() {
		this.memoryValue = 0.0;
		System.out.print("Clear mem value = " + memoryValue);
	}

	/**
	 * adds the current value to the memory
	 */
	public void memoryAdd() {
		System.out.println("Testing ");
		System.out.print(memoryValue + " + " + currentValue + " = ");
		this.memoryValue += currentValue;
		System.out.println(memoryValue);
		System.out.println(' ');

	}

	/**
	 * subtracts the current value
	 */
	public void memorySubtract() {
		System.out.print(memoryValue + " - " + currentValue + " = ");
		this.memoryValue -= currentValue;
		System.out.println(memoryValue);
		System.out.println(' ');
		
	}

	/**
	 * recalls the value stored in memory
	 */
	public void memoryRecall() {
		this.memoryValue = currentValue;
		System.out.println(memoryValue);
		System.out.println(' ');


	}


}

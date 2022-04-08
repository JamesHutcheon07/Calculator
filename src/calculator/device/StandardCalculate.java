package calculator.device;

public abstract class StandardCalculate extends Calculator {

	protected double memoryValue = 0.0;

	/*
	 * M+ to add the displayed value to the existing number in memory. 
	 * M- to subtract the displayed value from the number in memory.
	 * MR = Memory Recall uses the number in memory, acts as if you had keyed in
	 * that number yourself
	 */

	public void memoryClear() {
		this.memoryValue = 0.0;
		System.out.print("Clear mem value = " + memoryValue);
	}

	public void memoryAdd() {
		System.out.print(memoryValue + " + " + currentValue + " = ");
		this.memoryValue += currentValue;
		System.out.println(memoryValue);
	}

	public void memorySubtract() {
		System.out.print(memoryValue + " - " + currentValue + " = ");
		this.memoryValue -= currentValue;
		System.out.println(memoryValue);

	}

	public void memoryRecall() {
		this.memoryValue = currentValue;
		System.out.println(memoryValue);


	}

}

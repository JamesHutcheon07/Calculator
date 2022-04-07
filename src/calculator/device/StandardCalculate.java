package calculator.device;

public class StandardCalculate extends Calculator {

	protected double memoryValue = 0.0;

	/*Press "M+" to add the 
	 * displayed value to the existing number in memory.
	 *  Press "M-" to subtract the displayed 
	 * value from the number in memory.
	 * 
	 * MR = Memory Recall uses the number in memory, 
	 * acts as if you had keyed in that number yourself*/

	public void memoryClear() {
		this.memoryValue = 0.0;
		System.out.print("Clear mem value = " + memoryValue);
	}

	public void memoryAdd() {
		System.out.print(memoryValue + " + " + currentValue + " = " );
		this.memoryValue += currentValue ;
		System.out.println(memoryValue);	
		}

	public void memorySubtract() {
		this.memoryValue -= currentValue;	
	}

	public void memoryRecall() {
		this.memoryValue = currentValue;

	}

}

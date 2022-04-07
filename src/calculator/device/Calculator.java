package calculator.device;

public class Calculator {

	protected double currentValue = 0.0;
	
	
	public void clear() {
		this.currentValue = 0.0;
		System.out.println("Clear: " + this.currentValue);
	}
	
	public void add(double userInput) {
		System.out.print(this.currentValue + " + " + userInput + " = ");
		this.currentValue += userInput;
		System.out.println(currentValue);
		
	}
	
	public void subtract(double userInput) {
		System.out.print(this.currentValue + " - " + userInput + " = ");
		this.currentValue -= userInput;
		System.out.println(currentValue);

	}
	
	public void multiply(double userInput) {
		System.out.print(this.currentValue + " x " + userInput + " = ");
		this.currentValue *= userInput;
		System.out.println(currentValue);

	}
	
	public void divide(double userInput) {
		System.out.print(this.currentValue + " / " + userInput + " = ");
		this.currentValue /= userInput;
		System.out.println(currentValue);

	}

}

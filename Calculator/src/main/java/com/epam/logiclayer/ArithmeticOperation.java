package com.epam.logiclayer;

public class ArithmeticOperation extends Calculator{
	
	public void getNumbers(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public String addition() {
		return String.valueOf(this.number1 + this.number2);
	}
	
	public String subtraction() {
		return String.valueOf(this.number1 - this.number2);
	}
	
	public String multiplication() {
		return String.valueOf(this.number1 * this.number2);
	}
	
	public String division() {
		if(this.number2 != 0)
			return String.valueOf(this.number1 / this.number2);;
		return "Divide By Zero Error";
	}
}

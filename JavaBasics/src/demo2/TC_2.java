package demo2;

import demo.Calculator;

public class TC_2 {
	
	public void month() {
		System.out.println("It is January");
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.subtract(50, 4);
		TC_2 pizza = new TC_2();
		pizza.month();
	}

}

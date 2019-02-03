package demo;

public class TC_1 {
	
	public void day() {
		System.out.println("Today is Saturday");
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		TC_1 obj = new TC_1();
		basicCal.add(20, 30);
		obj.day();
		System.out.println("Christmas is on December " + basicCal.number);
		
	}

}

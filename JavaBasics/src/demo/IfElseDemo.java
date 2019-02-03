package demo;

public class IfElseDemo {
	
	public static void main(String[] args) {
		int date = 25;
		
		if(date<10) {
			System.out.println("Order pizza from the restaurant");
		}
		
		else if(date>10 && date<20) {
			System.out.println("I will order water");
		}
		
		else {
			System.out.println("I will have air only.");
		}
	}

}

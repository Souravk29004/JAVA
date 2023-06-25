public class Main {

	public static void main(String[] args) {
		
		String x = "Margheita";
		String y = "Pepperoni";
		String temp;
		
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}


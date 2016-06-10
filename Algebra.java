
public class Algebra {
	static int x = 5;
	static int y = 10;
	static int total;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Algebra ag = new Algebra();
		ag.firstoperator();
		ag.secondoperator();
		ag.thirdoperator();
		ag.fourthoperator();
	}
	public static void firstoperator(){
		total = x+(y*2);
		System.out.println("Answer for x+(y*2) is "+total );		
	}
	public static void secondoperator() {
		total = x - y + 2;
		System.out.println("Answer for x - y + 2 is "+total );
		
	}
	public static void thirdoperator() {
		total = (x+y) * 2 ;
		System.out.println("Answer for (x+y) * 2  is " + total);
		
	}
	public static void fourthoperator() {
		total = y % x;
		System.out.println("Answer for y % x is "+total);
		
	}

}
//a. x + y * 2
//b. x - y + 2
//c. (x+y) * 2 
//d. y % x
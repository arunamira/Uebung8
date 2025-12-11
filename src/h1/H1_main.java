package h1;

public class H1_main { public static void main(String[] args) {
	
	Bruch a = new Bruch(5,10);
	Bruch b = new Bruch(4,8);
	
	
	System.out.println(a.zaehler + ":" + a.nenner);
	System.out.println(b.zaehler + ":" + b.nenner);
	a.shorten();
	b.shorten();
	System.out.println(a.zaehler + ":" + a.nenner);
	System.out.println(b.zaehler + ":" + b.nenner);
	
	System.out.println(a.hasSameValueAs(b));
}

}

package p2;

public class P2_main { public static void main(String[] args) {
	
System.out.print(shortenToLowerCase("RindfLeischetikeTTierung", 13));
}
	
public static String shortenToLowerCase(String input, int shortenBy) {
	
	return input.toLowerCase().substring(0, (input.length()-shortenBy));
}

}

package AccessModifier;

public class Default {
// Default access
	int accountbalance = 100;
	
	
	public static void main(String[] args) {
		Default d = new Default ();
		System.out.println(d.accountbalance);
	}
	
}

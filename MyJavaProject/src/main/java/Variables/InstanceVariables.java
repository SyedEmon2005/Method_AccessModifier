package Variables;

public class InstanceVariables {

	String name= "Bobby";
	int age =50;
	
	
	
	public static void main(String[] args) {
		InstanceVariables ins= new InstanceVariables ();
		ins.name ();
		ins.age ();
		
		}  
		
	
public void name () {
	name = "Bobby";
	System.out.println(name);
	}


public void age () {
	age= 50;
	System.out.println(age);
	
}

}

	package Methods;
	
	public class MixedMethod {
	
		public static void main(String[] args) {
			// Mix method & inner method 
	Test1 ();
	//Reference variable
	MixedMethod mm= new MixedMethod ();
	mm.Test2();
	Test3 ();
	mm.Test4 ();
	Test6();
	

		}
		
		public static void Test1 () {
			System.out.println("Test 1");
		}
		
		public void Test2 () {
			System.out.println("Test 2");
		}
		
		public static void Test3 () {
			System.out.println("Test 3");
		}
		// inner method (instance to instance)
		public void Test4 () {
			System.out.println("Test 4 calling Test 5");
			Test5 ();
		}
		
		public void Test5 () {
			System.out.println("Test 5 called by test 4");
			//Inner method (instance calling the static)
			Test3 ();	
		}
		//--------------------------------------------------
		
		public static  void Test6 () {
			System.out.println("Test 6");
			MixedMethod mm1= new MixedMethod ();
			//inner method (Static calling instance) 
			mm1.Test7 ();
		}
		
		public void Test7 () {
			System.out.println("Test 7");
		}
	}

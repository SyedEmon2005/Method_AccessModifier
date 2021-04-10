	package Methods;
	
	public class InstanceMethod1 {
	
		public static void main(String[] args) {
			// Class Referencial variable required
			InstanceMethod1 im= new InstanceMethod1 ();
			im.InstanceMethod();			
		}
		
		// This is Instance Method
		public void InstanceMethod() {
			System.out.println("This is InstanceMethod");
		}
	}

package day6;

public class Method {
	
	
		public void hey()  //non return,wo parameter
		{
			System.out.println("guys");
		}
			
		public void hello(int i)  //non return,w parameter
		{
			System.out.println("roll no."+i);
		}
		
		public String hi()  //return,wo parameter
		{
			return "students";
		}
		public int bye(int i, int j, int k) //return,w parameter
		{
			System.out.println();
			System.out.println("buddy");
			return i + j + k;
		
		}
		public static void main(String[]args) {
			Method m = new Method();
			m.hey();
			m.hello(7);
			System.out.println(m.hi());
			System.out.println(m.bye(1,2,3));
			
		}
			
	
	
}
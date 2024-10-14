package itoro;

public class ParamitizedMethods {

	public static void main(String[] args) {
		
		
		String p =MethodA();
		
		
		System.out.println("The value of P is = "+p);
	

	}
	
	//No Paramitized Method
	
	public static String MethodA() {
		
		MethodB(7);
		
		return("This code just got started.....");
		
	}
	
	
	//Single Parameter method 
	
	public static void  MethodB(int x) {
		
		System.out.println("The value of x = "+ x);
		
		int y =MethodC(4,"Running", true);
		
		System.out.println("The value of returned number is : "+y);
		
		
	}
	
	
	//Multiple Parameter
	public static int MethodC (int a, String b, boolean d) {
		
		System.out.println("The values of the following are  a = " +a + " b = " +b + " c =" +d);
		
		return (909);
		
	}

}

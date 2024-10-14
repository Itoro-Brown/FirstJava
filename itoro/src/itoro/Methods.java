package itoro;

public class Methods {

	public static void main(String[] args) 
	{
		
		int a = 5, b=7, c;
		
		c= a+b;
		
		System.out.println(c);
		
		MethodA();
		MethodB();
		MethodC();
	};

	public static void MethodA () {
		System.out.println("This is Method A");
		
		int w= 0;
		
		while(w<5) {
			
			System.out.println("The process is running ....");
			
			w++;
		}
	};


	public static void MethodB () {
		System.out.println("This is Method B");
		
		for(int i =0; i<5;i++) {
			
			if( i == 3) {break;}
			
			System.out.println("This is a practice for test ");
		}
	}
	
	public static void MethodC() {
		
		int Highbalance = 200, lowBalance = 50, balance = 0;
		
		if(Highbalance == 200) {
			System.out.println("You big man, you have up to 200");
		} else if (lowBalance == 50) {
			System.out.println("You are moderately rich s");
		} else {
			System.out.println("I cant find you account balance...");
		}
	}
}
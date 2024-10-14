package itoro;

public class FlowControl {

	public static void main(String[] args) {
		
		// if statement syntax 
		int a = 5, b=7;
		
		if(a<b) {
			System.out.println("I run well ....");
		}
		
		
		
		//If else statements 
		if(a>b) {
			System.out.println("A is greater");
		} else {
			System.out.println("B is greater ");
		};

		//if else, else if 
		
		int balance = 1000;
		
		if(balance==1000) {
			System.out.println("You need to work harder man");
		} else if(balance > 1000) {
			System.out.println("Keep piling it up");
		} else if (balance>= 1000) {
			System.out.println("Dont stop keep going ....");
		}
		
		
		//if else, else if 
		int low = 0, medium = 1000, high = 5000;
		
		if (medium > low) {
			System.out.println("You balance is upto 1000 which Mediium ");
		} else if (medium < low) {
			System.out.println("Your account is very low ");
		}else {
			System.out.println("Your account is high");
		}
		
		
		// Switch statement
		
		String q ="fine"; 
		switch(q) {
		
		case "finer": System.out.println("This is my value of q is fine ");
			break;
		case "Not fine": System.out.println("The value of q is 1");
		 break;
		case "Abit fine": System.out.println("The value of q is 2 ");
			break;
		case "Amazing":  System.out.println("The value of q is 3");
			break;
		default: System.out.println("None of the above matches the condition ");
		
		}
	}

}

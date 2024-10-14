package itoro;

public class IterationStatements {

	public static void main(String[] args) {
		
		// Iteration statements 
		 int a = 6, b = 5; 
		 
		 
		 // While the condition is True it keeps running till it is false 
		while(a<b) {
			 System.out.println("A is greater than B");
		 }
		 
		 // So here when the condition is True the code get run else it stops 
		 int c = 3;
		 
		 while(c<3) {
			 System.out.println("This is the new value "+ c);
			 
			 c++;
		 }
		 
		 //do While loop
		 
		 int d= 0;
		 
		 do {
			 
			 System.out.println("This is the do while getting executed... this is the new value of d " + d);
			 
			 d++;
		 } while (d<3);
		 
		 
		 //For loop (addition)
		 int e = 0;
		 
		 for (e=0;e<3; e++) { 
			 System.out.println("You are currently running a for loop , here is the value of e :"+ e);
		 }
		 
		 //For Loop (Subtraction)
		 
		 for(int j =9;j>3;j--) {
			 System.out.println("This is the new value of J:" + j);
		 }
		

	}

}

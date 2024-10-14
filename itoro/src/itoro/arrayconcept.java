package itoro;

public class arrayconcept {

	public static void main(String[] args) {
		
		
		//Single dimension array
		
		
		int[] a =new int[3];  // only 3 items can be added to this array 
		
		
		//Declare the array
		int[] b  = {5,4,5,7,8,9,0,23,45,24,55,77,65};
		String[] myCars = {"Jeep","toyota","lexus","pathfinder"};
		
		
		//Assign elements 
		
		a[0] =2;
		a[1]=5;
		a[2]=9;
		myCars[0] = "Toyota";
		
		//Access values in array
		System.out.println("First element =" + a[0]);
		System.out.println(myCars[0]);
		
		// shorter version 
		String[] names = {"Itoro","Brown","Utibe"};
		
		System.out.println(names[0]);
		
		
		//To find the length of the variable
		System.out.println(names.length);
		System.out.println(myCars.length);
		
		
		// Using For loop with single dimensional array
		
		for(int i =0; i < b.length; i++) {
			
			System.out.println(b[i]);
		}
		
		
		System.out.println("Running for each loop.....");
		
		for (int temp:b) {
			
			
			
			
			System.out.println(temp);
		}
		
		
		twoDimensionalArray();
		ObjectClass ();
		
		
		}
	
	
	
	public static void twoDimensionalArray() {
		
		
		int c[][]= new int[2][3]; // The first number depicts the number of arrays on the variable  i.e 2 arrays on the variable.
		
		int[][] d = {{99,55,88},{5,7,9}}; // Add double curly bracket to initialize the multidimensional array
		
		// Access values of the array
		System.out.println("Two dimensional array");
		
		System.out.println(d[0][0]);
		
		// Access the length 
		
		System.out.println(d[0].length);
		System.out.println(d[1].length);
		
		
		
		//Using For loop for multi-dimensional arrays
		
		for (int i=0;i< d.length; i++) {
			
			
			for (int k=0; k<d[0].length;k++) {
				
				System.out.print(d[i][k]+ "  ");
			}
			
			System.out.println();
		}
		
		
	}	
	
	
	
	
	public static void  ObjectClass () {
		
		
		//Object array allows user to store every type value in a single array
		
		Object[] u = {"Itoro", true, 45, 1.23}; // Object class accepts all value types 
		
		//Using For each loop syntax see each values in the array 
		for(Object temp : u) {
			
			System.out.println(temp);
			
			
			
			
			
		}
		String s1 = "    I am learnng java";
		
		//Trim removes extra spaces 
		String s2 = s1.trim();
		System.out.println(s1.length()); // Length.() tells the total number of characters 
		System.out.println(s2);
		System.out.println(s2.length());
	}
		

	
	
	
	

}

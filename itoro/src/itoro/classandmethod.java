package itoro;

public class classandmethod {

	public static void main(String[] args) {
		
		//Objects created based on the objects 
		
		Car Toyota = new Car();
		Car Benz = new Car();
		
		
		//Referencing variables
		
		Toyota.model = "Toyota Supra";
		Toyota.cost = 2000000;
		Toyota.color = "Custom";
		Toyota.StartCar();
		Toyota.StopCar();
		Toyota.carModel();

	}

}

class Car{
	
	int cost;
	String model;
	String color;
	
	// Method belows 
	public void StartCar() {
		
		System.out.println(model + " Started ....");
	}
	
	
	public void StopCar() {
		
		System.out.println(model + " Stopped....");
	}
	
	
	public void carModel() {
		
		System.out.println("The model of the car is " + model);
		System.out.println("The cost of the car is "+ cost);
		System.out.println("The color of the car is "+ color);
	}
	}

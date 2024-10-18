
public class demo {

	public static void main(String[] args) {
		
		car c = new car();
		
		c.carMode = "Carxyz";
		c.speed = 100;
		c.startCar(c.carMode);
		c.stopCar(c.carMode);
		
		
		// Benz class
		
		benz b = new benz();
		b.carMode ="c300";
		b.numbaofGears  = 6;
		b.platenumba = "KANO653";
		b.speed = 120;
		b.carCompany();
		b.startCar(b.carMode);
		b.stopCar(b.carMode);
	}

}

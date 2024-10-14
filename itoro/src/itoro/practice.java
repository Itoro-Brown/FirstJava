package itoro;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		country africanCountries = new country();
		
		africanCountries.countryName = "Nigeria";
		africanCountries.numberOfcitizens = 2000000000;
		africanCountries.numberOfstates = 36;
		africanCountries.numberOftribes = 49;
		
		
		africanCountries.peopleinthcountry();
		africanCountries.nameOFcountry();
		africanCountries.statesIncountry();
		africanCountries.languages();
	}
	


}
class country{
	
	String countryName;
	int numberOfstates;
	int numberOfcitizens;
	int numberOftribes;
	
	public void nameOFcountry() {
		
		System.out.println("The name of the country is " + countryName);
	}
	
	public void statesIncountry() {
		
		System.out.println("Number of states in this country is " + numberOfstates);
	}
	
	public void peopleinthcountry() {
		
		System.out.println("This is the number of citizens in this country " + numberOfcitizens);
	}
	
	public void languages() {
		
		System.out.println("This is the number of languages spoken in this country " + numberOftribes);
	}
}
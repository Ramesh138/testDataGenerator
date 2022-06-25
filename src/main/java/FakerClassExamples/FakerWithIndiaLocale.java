package FakerClassExamples;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakerWithIndiaLocale {
	
	public static void main(String[] args) {
		
		// Create an object of Faker class with default locale i.e ENG
		Faker faker = new Faker(new Locale("en-IND"));
		// To generate valid random first name
		System.out.println("First name is: "+faker.name().firstName());
		// To generate valid random last name
		System.out.println("Last name is: "+faker.name().lastName());
		// To generate valid random city name
		System.out.println("City name is: "+faker.address().cityName());
		// To generate valid random state name
		System.out.println("State name is: "+faker.address().state());
		// To generate valid random country name
		System.out.println("Country name is: "+faker.address().country());
		// To generate valid random cell number
		System.out.println("Cell number is: "+faker.phoneNumber().cellPhone());
		// To generate valid random animal name
		System.out.println("Animal name is: "+faker.animal().name());

		System.out.println(faker.numerify("######"));
			
	}

}

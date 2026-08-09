//Ashley Snuggs Week 5 Countries List

package countriesList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CountriesList {
	
	private final Scanner scanner = new Scanner(System.in);
	private final ArrayList<String> countries = new ArrayList<>();
	static int opt;
	
	public ArrayList<String> getList(){
		return this.countries;
	}
	
	public void displayWelcomeMessage() {
		System.out.println("Country List Manager");
	}
	
	public void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("1 - List countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Exit");
	}
	
	public int getMenuOption() {
		System.out.println("Enter menu number: ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	
	public void checkForCountry() {
		System.out.println("Enter country name: ");
		String input = scanner.nextLine();
		if (countries.contains(input)) {
			System.out.println("Country is already in list");
		} else {
			addCountry(input);
			System.out.println("Country " + input + " has been added to the list");
		}
	}
	
	public void addCountry(String input) {
		countries.add(input);
	}
	
	public void listCountries(ArrayList<String> countires) {
		if (countries.isEmpty()) {
			System.out.println("No countires in the list");
		} else {
			Collections.sort(countries);
			for (String country : countires) {
				System.out.println(country);
			}
		}
	}
	

}

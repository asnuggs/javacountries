package countriesList;

import java.util.Scanner;
import java.util.ArrayList;

public class CountriesList {
	
	static Scanner scanner = new Scanner(System.in);
	private ArrayList<String> countries = new ArrayList<>();
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
		return opt;
	}
	
	public void checkForCountry() {
		while (true) {
			String input = scanner.nextLine();
			if (countries.contains(input)) {
			System.out.println("Country is already in list.");
			} else {
				addCountry(input);
			}
		}
	}
	
	public void addCountry(String input) {
		countries.add(input);
	}
	
	public void listCountries(ArrayList<String> countires) {
		while (true) {
			if (countries != null) {
				for (String country : countries) {
					System.out.println(country);
				}
			}else {
				System.out.println("No countries in the list");
			}
		}
	}
	

}

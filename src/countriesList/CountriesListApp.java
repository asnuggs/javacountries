package countriesList;

import java.util.ArrayList;

public class CountriesListApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opt;
		CountriesList list = new CountriesList();
		ArrayList<String> countries = list.getList();
		list.displayWelcomeMessage();
		list.displayMenu();
		do {
			opt = list.getMenuOption();
			if (opt == 1) {
				list.listCountries(countries);
			} else if (opt == 2) {
				list.checkForCountry();
			}
		} while( opt!= 3);
		
		System.out.println("Bye!");
	}

}

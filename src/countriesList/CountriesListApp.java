package countriesList;

public class CountriesListApp {

	static int opt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountriesList.displayWelcomeMessage();
		CountriesList.displayMenu();
		int opt = CountriesList.getMenuOption();
		do {
			if (opt == 1) {
				CountriesList.listCountries();
			} else if (opt == 2) {
				CountriesList.checkForCountry();
			}
		} while (opt != 3);
		System.out.println("Goodbye.");
		
	}

}

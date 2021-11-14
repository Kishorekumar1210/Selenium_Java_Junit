package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class FlightReservations {

	public WebDriver driver;
	public LoginPage login;

	@Given("User able to access Kayak link")
	public void User_able() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		login = new LoginPage(driver);
		login.goToSite();
	}

	@When("User logged into kayak page")
	public void user_logged_into_kayak_page() {
		login.getPageTitle();
	}

	@Then("user provides the From and To details")
	public void user_provides_the_from_and_to_details() throws InterruptedException {
		login.locationFrom();
		Thread.sleep(2000);
		login.locationTo();
	}

	@And("User provides the date range")
	public void user_provides_the_data_range() throws InterruptedException {
		login.departureDate();
		login.returnDate();
	}

	@And("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		login.searchFlight();
	}

	@Then("user provides {string} in From details")
	public void user_provides_in_from_details(String string) throws InterruptedException {
		login.cityNameFrom(string);
	}

	@Then("user provides {string} in To details")
	public void user_provides_in_to_details(String string) throws InterruptedException {
		login.cityNameTo(string);
	}

	@Then("user provides Departure date High price {string}")
	public void user_provides_departure_date(String string) throws InterruptedException {
		login.departureDateHigh(string);
		Thread.sleep(5000);
	}

	@Then("user provides return date High price {string}")
	public void user_provides_return_date(String string) throws InterruptedException {
		login.returnDateHigh(string);
		Thread.sleep(5000);
	}

	@Then("user provides Departure date Low price {string}")
	public void user_provides_departure_date_Low(String string) throws InterruptedException {
		login.departureDateLow(string);
		Thread.sleep(5000);
	}

	@Then("user provides return date Low price {string}")
	public void user_provides_return_date_Low(String string) throws InterruptedException {
		login.returnDateLow(string);
		Thread.sleep(5000);
	}
	
	//Outline
	
	@Then("^user provides (.*) in from details$")
	public void user_provides_from_in_details(String From) throws InterruptedException {
	    login.cityNameFromOutline(From);
	}
	
	@Then("^user provides (.*) in to details$")
	public void user_provides_to_in_details(String To) throws InterruptedException {
	    login.cityNameToOutline(To);
	}
	
	@Then("^user provides Departure date Low price (.*)$")
	public void user_provides_departure_date_low_price_dep_date(String depDate) throws InterruptedException {
	    login.departureDateLow(depDate);
	}
	
	@Then("^user provides return date Low price (.*)$")
	public void user_provides_return_date_low_price_return_date(String returnDate) throws InterruptedException {
	    login.departureDateLow(returnDate);
	}

	
	

}

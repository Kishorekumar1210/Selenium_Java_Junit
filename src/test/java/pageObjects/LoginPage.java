package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//*[@class='vvTc-item-icon'])[1]")
	WebElement CrossSymbolFrom;

	@FindBy(xpath = "(//*[@class='vvTc-item-icon'])[2]")
	WebElement CrossSymbolTo;

	@FindBy(xpath = "(//*[@class='k_my-input'])[1]")
	WebElement FromDetails;

	@FindBy(xpath = "(//*[@class='JyN0-item JyN0-pres-item-horizon'])[1]")
	WebElement SelectAutoSuggestion;

	@FindBy(xpath = "//*[text()='Nach?']")
	WebElement ToDetails;

	@FindBy(xpath = "//*[@class='k_my-input']")
	WebElement ToDetailsText;

	@FindBy(xpath = "(//*[@class='cQtq-prefixIcon'])[1]")
	WebElement DepatureDate;

	@FindBy(xpath = "(//*[@class='cQtq-prefixIcon'])[2]")
	WebElement ReturnDate;

	@FindBy(xpath = "(//*[text()='12'])[1]")
	WebElement SelectedDepatureDate;

	@FindBy(xpath = "(//*[text()='16'])[1]")
	WebElement SelectedReturnDate;

	@FindBy(xpath = "//*[@class='c8LPF-icon']")
	WebElement Search;

	@FindBy(xpath = "//*[text()='Akzeptieren']")
	WebElement AcceptPopUp;

	@FindBy(xpath = "//*[@id='c3ZxU-price_aTab']")
	WebElement CheapestOptions;

	@FindBy(xpath = "//*[@id='c3ZxU-bestflight_aTab']")
	WebElement BestOptions;

	@FindBy(xpath = "//*[@id='c3ZxU-duration_aTab']")
	WebElement ShortestOption;

	@FindBy(xpath = "(//*[@class='custom-text'])[4]")
	WebElement MaxFlightPrice;

	public void goToSite() throws InterruptedException {

		try {
			driver.get("https://www.kayak.ch/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			try {
				AcceptPopUp.click();
			}catch(Exception e) {
				System.out.println(e);
			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void getPageTitle() {

		try {
			String text = driver.getCurrentUrl();
			System.out.println(text);
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void locationFrom() throws InterruptedException {

		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			CrossSymbolFrom.click();
			Thread.sleep(1000);
			FromDetails.click();
			Thread.sleep(1000);
			FromDetails.sendKeys("Hyd");
			Thread.sleep(1000);
			SelectAutoSuggestion.click();
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void locationTo() throws InterruptedException {

		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			ToDetails.click();
			Thread.sleep(2000);
			ToDetailsText.click();
			ToDetailsText.sendKeys("Kra");
			Thread.sleep(1000);
			SelectAutoSuggestion.click();
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void departureDate() throws InterruptedException {

		try {
			DepatureDate.click();
			Thread.sleep(2000);
			SelectedDepatureDate.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}

	}

	public void returnDate() throws InterruptedException {

		try {
			SelectedReturnDate.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void searchFlight() throws InterruptedException {

		try {
			Search.click();
			Thread.sleep(8000);
			driver.close();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void cityNameFrom(String string) throws InterruptedException {

		try {
			Thread.sleep(3000);
			CrossSymbolFrom.click();
			Thread.sleep(1000);
			FromDetails.click();
			Thread.sleep(1000);
			FromDetails.sendKeys(string);
			Thread.sleep(1000);
			SelectAutoSuggestion.click();
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}

	}
	
	//Oultine method:
	
	public void cityNameFromOutline(String From) throws InterruptedException {

		try {
			Thread.sleep(3000);
			CrossSymbolFrom.click();
			Thread.sleep(1000);
			FromDetails.click();
			Thread.sleep(1000);
			FromDetails.sendKeys(From);
			Thread.sleep(1000);
			SelectAutoSuggestion.click();
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}

	}
	
	public void cityNameToOutline(String To) throws InterruptedException {

		try {
			Thread.sleep(1000);
			ToDetails.click();
			Thread.sleep(2000);
			ToDetailsText.click();
			ToDetailsText.sendKeys(To);
			Thread.sleep(1000);
			SelectAutoSuggestion.click();
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}
	
	

	public void cityNameTo(String string) throws InterruptedException {

		try {
			Thread.sleep(1000);
			ToDetails.click();
			Thread.sleep(2000);
			ToDetailsText.click();
			ToDetailsText.sendKeys(string);
			Thread.sleep(1000);
			SelectAutoSuggestion.click();
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void departureDateHigh(String string) throws InterruptedException {

		try {
			DepatureDate.click();
			Thread.sleep(2000);
			departureDateHighPrice(string);
		} catch (Exception e) {
			departureDateHighPrice(string);
		}
	}

	public void returnDateHigh(String string) throws InterruptedException {

		try {
			departureDateHighPrice(string);
		} catch (Exception e) {
			departureDateHighPrice(string);
		}
	}

	public void departureDateLow(String string) throws InterruptedException {

		try {
			DepatureDate.click();
			Thread.sleep(2000);
			departureDateLowPrice(string);
		} catch (Exception e) {
			System.out.println(e);
			departureDateLowPrice(string);
		}

	}

	public void returnDateLow(String string) throws InterruptedException {

		try {
			Thread.sleep(3000);
			departureDateLowPrice(string);
		} catch (Exception e) {
			departureDateLowPrice(string);
		}
	}

	public void departureDateHighPrice(String string) {

		try {
			List<WebElement> elements = driver
					.findElements(By.cssSelector("div.mkUa.mkUa-pres-default.mkUa-isPriceHigh"));
			int count = elements.size();
			for (int i = 0; i < count; i++) {
				String text = elements.get(i).getText();
				if (text.equalsIgnoreCase(string)) {
					elements.get(i).click();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void departureDateLowPrice(String string) {

		try {
			List<WebElement> elements = driver.findElements(By.xpath(
					"//*[@class='mkUa mkUa-pres-default mkUa-isPriceMedium' or @class='mkUa mkUa-pres-default mkUa-isPriceLow' or @class='mkUa mkUa-pres-default mkUa-isPriceHigh' or @class='mkUa mkUa-pres-default mkUa-isPriceMedium' or @class='mkUa mkUa-pres-default mkUa-isFocused mkUa-isHighlighted' or @class='mkUa mkUa-pres-default mkUa-isStartDate mkUa-isEndDate mkUa-isSelected']"));
			int count = elements.size();
			for (int i = 0; i < count; i++) {
				String text = elements.get(i).getText();
				if (text.equalsIgnoreCase(string)) {
					elements.get(i).click();
				}
			}
		} catch (StaleElementReferenceException e) {
			e.getMessage();
		}
	}
	
	public void departureDateLowPriceInt(String string) {

		try {
			List<WebElement> elements = driver.findElements(By.xpath(
					"//*[@class='mkUa mkUa-pres-default mkUa-isPriceMedium' or @class='mkUa mkUa-pres-default mkUa-isPriceLow' or @class='mkUa mkUa-pres-default mkUa-isPriceHigh' or @class='mkUa mkUa-pres-default mkUa-isPriceMedium' or @class='mkUa mkUa-pres-default mkUa-isFocused mkUa-isHighlighted' or @class='mkUa mkUa-pres-default mkUa-isStartDate mkUa-isEndDate mkUa-isSelected']"));
			int count = elements.size();
			for (int i = 0; i < count; i++) {
				String text = elements.get(i).getText();
				if (text.equalsIgnoreCase(string)) {
					elements.get(i).click();
				}
			}
		} catch (StaleElementReferenceException e) {
			e.getMessage();
		}
	}
}

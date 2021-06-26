package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {

	public WebDriver driver;
	private By nextButton = By.id("next_btn");
	private By safePay = By.xpath("//input[@type='radio' and @name='safepay']");
	private By safePayUsername = By.name("safepay_username");
	private By safePayPassword = By.name("safepay_password");
	private By payNowSafePay = By.id("pay_now_btn_SAFEPAY");
	private By trackingNumber = By.id("trackingNumberLabel");
	private By orderNumber = By.id("orderNumberLabel");
	
	
	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickNext() {
		driver.findElement(nextButton).click();
		System.out.println("Clicked on next button");
	}
	
	public void selectSafePay() {
		WebElement safePayOption = driver.findElement(safePay);
		if(! safePayOption.isSelected()) {
			safePayOption.click();
			System.out.println("Selected the radio button for safe pay option");
		} else
			System.out.println("Safe pay option is already selected, so skipping the selection");
			
	}
	
	public void enterSafePayUsername(String username) {
		driver.findElement(safePayUsername).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), username);
		System.out.println("Safe pay username entered as : "+username);
	}

	public void enterSafePayPassword(String password) {
		driver.findElement(safePayPassword).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), password);
		System.out.println("Safe pay password entered");
	}
	
	public void clickPayNowSafePay() {
		driver.findElement(payNowSafePay).click();
		System.out.println("Clicked on pay now button");
	}
	
	public String getTrackingNumber() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(trackingNumber));
		String result = element.getText();
		System.out.println("Tracking number is retrieved as : "+result);
		return result;
	}
	
	public String getOrderNumber() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(orderNumber));
		String result = element.getText();
		System.out.println("Order number is retrieved as : "+result);
		return result;
	}

}

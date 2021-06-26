package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public WebDriver driver;
	private By laptopsCategory = By.xpath("//div[contains(@aria-label,'Category') and contains(@id,'laptops')]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectLaptopsCategory() {
		driver.findElement(laptopsCategory).click();
		System.out.println("Clicked on Laptops category");
	}

}

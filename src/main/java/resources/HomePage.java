package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private By laptopsCategory = By.xpath("//div[contains(@aria-label,'Category') and contains(@id,'laptops')]");
	
	public void selectLaptopsCategory(WebDriver driver) {
		driver.findElement(laptopsCategory).click();
		System.out.println("Clicked on Laptops category");
	}

}

package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

	public WebDriver driver;
	private By checkOutButton = By.id("checkOutButton");
	
	
	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCheckOutButton() {
		driver.findElement(checkOutButton).click();
		System.out.println("Clicked on checkout button");
	}
}

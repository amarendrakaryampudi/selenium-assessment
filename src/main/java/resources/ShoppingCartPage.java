package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

	private By checkOutButton = By.id("checkOutButton");
	
	
	public void clickCheckOutButton(WebDriver driver) {
		driver.findElement(checkOutButton).click();
		System.out.println("Clicked on checkout button");
	}
}

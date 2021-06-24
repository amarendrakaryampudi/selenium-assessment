package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {

	private By plusIcon = By.className("plus");
	private By addToCart = By.name("save_to_cart");

	
	public void increaseQuantity(WebDriver driver) {
		driver.findElement(plusIcon).click();
		System.out.println("Clicked on plus icon");
	}
	
	public void addToCart(WebDriver driver) {
		driver.findElement(addToCart).click();
		System.out.println("Clicked on add to cart button");
	}
}

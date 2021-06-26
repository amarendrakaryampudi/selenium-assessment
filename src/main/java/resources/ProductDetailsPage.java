package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {

	public WebDriver driver;
	private By plusIcon = By.className("plus");
	private By addToCart = By.name("save_to_cart");

	
	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void increaseQuantity() {
		driver.findElement(plusIcon).click();
		System.out.println("Clicked on plus icon");
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
		System.out.println("Clicked on add to cart button");
	}
}

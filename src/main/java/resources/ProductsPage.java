package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	
	private By firstProduct = By.xpath("(//a[contains(@class,'productName')])[1]");

	public void selectFirstProduct(WebDriver driver) {
		driver.findElement(firstProduct).click();
		System.out.println("Clicked on first product");
	}
}

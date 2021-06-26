package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	
	public WebDriver driver;
	private By firstProduct = By.xpath("(//a[contains(@class,'productName')])[1]");

	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectFirstProduct() {
		driver.findElement(firstProduct).click();
		System.out.println("Clicked on first product");
	}
}

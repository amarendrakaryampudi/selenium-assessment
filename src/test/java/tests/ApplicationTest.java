package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Driver;
import resources.HomePage;
import resources.MenuBar;
import resources.PaymentPage;
import resources.ProductDetailsPage;
import resources.ProductsPage;
import resources.ShoppingCartPage;

public class ApplicationTest {
	
	public WebDriver driver;
	public String username="user1a", password="June@2021";

	@BeforeTest
	public void createDriver() {
		try {
			driver = Driver.getDriver();
			driver.manage().window().maximize();
		} catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	
	@AfterTest
	public void clearDriver() {
		driver.quit();
	}
	
	@Test
	public void purchaseLaptop() {
		
		try {
			driver.get("http://advantageonlineshopping.com/#/");
			
			MenuBar menuBar = new MenuBar(driver);
			menuBar.login(username, password);

			HomePage homePage = new HomePage(driver);
			homePage.selectLaptopsCategory();
			
			ProductsPage productsPage = new ProductsPage(driver);
			productsPage.selectFirstProduct();
			
			ProductDetailsPage prodDetailsPage = new ProductDetailsPage(driver);
			prodDetailsPage.increaseQuantity();
			prodDetailsPage.addToCart();
			
			menuBar.clickCartIcon();
			
			ShoppingCartPage shoppingCart = new ShoppingCartPage(driver);
			shoppingCart.clickCheckOutButton();
			
			PaymentPage paymentPage = new PaymentPage(driver);
			paymentPage.clickNext();
			paymentPage.selectSafePay();
			paymentPage.enterSafePayUsername(username);
			paymentPage.enterSafePayPassword(password);
			paymentPage.clickPayNowSafePay();
			
			paymentPage.getTrackingNumber();
			paymentPage.getOrderNumber();
			
			menuBar.logout();
			
			Assert.assertTrue(true);
			
		} catch(Exception exp) {
			exp.printStackTrace();
			Assert.assertTrue(false);
		}
		
	}
}

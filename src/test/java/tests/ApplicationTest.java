package tests;

import org.openqa.selenium.WebDriver;
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
		driver = Driver.getDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void clearDriver() {
		driver.quit();
	}
	
	@Test
	public void purchaseLaptop() {
		driver.get("http://advantageonlineshopping.com/#/");
		
		MenuBar menuBar = new MenuBar();
		menuBar.login(driver, username, password);

		HomePage homePage = new HomePage();
		homePage.selectLaptopsCategory(driver);
		
		ProductsPage productsPage = new ProductsPage();
		productsPage.selectFirstProduct(driver);
		
		ProductDetailsPage prodDetailsPage = new ProductDetailsPage();
		prodDetailsPage.increaseQuantity(driver);
		prodDetailsPage.addToCart(driver);
		
		menuBar.clickCartIcon(driver);
		
		ShoppingCartPage shoppingCart = new ShoppingCartPage();
		shoppingCart.clickCheckOutButton(driver);
		
		PaymentPage paymentPage = new PaymentPage();
		paymentPage.clickNext(driver);
		paymentPage.selectSafePay(driver);
		paymentPage.enterSafePayUsername(driver, username);
		paymentPage.enterSafePayPassword(driver, password);
		paymentPage.clickPayNowSafePay(driver);
		
		paymentPage.getTrackingNumber(driver);
		paymentPage.getOrderNumber(driver);
		
		menuBar.logout(driver);
		
	}
}

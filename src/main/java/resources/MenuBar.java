package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuBar {
	
	public WebDriver driver;
	private By userIcon = By.id("hrefUserIcon");
	private By usernameField = By.name("username");
	private By passwordField = By.name("password");
	private By signInButton = By.xpath("//button[contains(@id,'sign_in_btn')]");
	private By signOut = By.xpath("//label[text()='Sign out' and @role='link']");
	private By cartIcon = By.id("shoppingCartLink");

	
	public MenuBar (WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username, String password) {
		driver.findElement(userIcon).click();
		System.out.println("Clicked on user icon");
		driver.findElement(usernameField).sendKeys(username);
		System.out.println("Username entered as : "+username);
		driver.findElement(passwordField).sendKeys(password);
		System.out.println("Password entered");
		driver.findElement(signInButton).click();
		System.out.println("Clicked on sign in button");
	}

	public void logout() {
		driver.findElement(userIcon).click();
		System.out.println("Clicked on user icon");
		driver.findElement(signOut).click();
		System.out.println("Clicked on sign out link");
	}

	public void clickCartIcon() {
		driver.findElement(cartIcon).click();
		System.out.println("Clicked on shopping cart icon");
	}
	
}

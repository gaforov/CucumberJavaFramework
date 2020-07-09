package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By txt_username = By.id("name");
	
	By txtx_password = By.id("password");
	
	By btn_login = By.id("login");
	
	By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not Login Page. The current page is " + driver.getCurrentUrl());
		}
	}
	
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txtx_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void checkLogOutIsDisplayed() {
		driver.findElement(By.id("logout")).isDisplayed();
	}
	
	public void loginValidUser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txtx_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}

}

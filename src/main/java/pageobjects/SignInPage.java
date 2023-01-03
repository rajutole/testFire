package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SignInPage extends BasePage {

	public SignInPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By loginLink = By.xpath("//a[@id='LoginLink']/font[.='Sign In']");
	By userName = By.cssSelector("input#uid");
	By passWord = By.cssSelector("input#passw");
	By loginButton = By.cssSelector("#login [type='submit']");
	By loginSuccessMsg = By.cssSelector(".fl > p");
	By loginFailedMsg = By.cssSelector("p span");

	public WebElement clickOnLoginLink() throws IOException {
		
		this.driver= getDriver();
		return driver.findElement(loginLink);
	}

	public WebElement enterUsername() throws IOException {
		this.driver = getDriver();
		return driver.findElement(userName);

	}

	public WebElement enterPassword() throws IOException {
		this.driver = getDriver();
		return driver.findElement(passWord);
	}

	public WebElement clickOnLoginBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginButton);
	}

	public WebElement getloginSuccessMsg() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginSuccessMsg);
	}
	public WebElement getloginFailedMsg() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginFailedMsg);
	}

}

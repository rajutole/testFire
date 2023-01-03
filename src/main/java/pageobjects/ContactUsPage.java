package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ContactUsPage extends BasePage {

	public ContactUsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By contactUsPagelink = By.linkText("Contact Us");
	By onlineForm = By.linkText("online form");
	By name = By.cssSelector("input[name='name']");
	By email = By.cssSelector("input[name='email_addr']");
	By subject = By.cssSelector("input[name='subject']");
	By que_comment = By.cssSelector("textarea[name='comments']");
	By submitBtn = By.cssSelector("input[name='submit']");
	By clearFormBtn = By.cssSelector("input[name='reset']");
	By thankYouMsg= By.cssSelector(".fl > p");
	By signOffBtn = By.cssSelector("a#LoginLink > font");

	public WebElement clickOncontactUsPagelink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(contactUsPagelink);
	}

	public WebElement clickOnOnlineformmLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(onlineForm);
	}

	public WebElement enterYourName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(name);
	}

	public WebElement enterEmailAddress() throws IOException {
		this.driver = getDriver();
		return driver.findElement(email);
	}

	public WebElement enterSubject() throws IOException {
		this.driver = getDriver();
		return driver.findElement(subject);
	}

	public WebElement enterQueComment() throws IOException {
		this.driver = getDriver();
		return driver.findElement(que_comment);
	}
	public WebElement clickOnSubmitBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(submitBtn);
	}
	public WebElement clickOnClearFormBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(clearFormBtn);
	}
	public WebElement getThankYouMsg() throws IOException {
		this.driver = getDriver();
		return driver.findElement(thankYouMsg);
	}
	public WebElement clickOnSignOffBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(signOffBtn);
	}
}

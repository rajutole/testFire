package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ViewAccountSummaryPage extends BasePage {

	public ViewAccountSummaryPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver;
	
	By viewAccountSummaryLink= By.linkText("View Account Summary");
	By listOfAccounts= By.cssSelector("select#listAccounts");
	By goBtn= By.cssSelector("input#btnGetAccount");
	By availableBalance= By.cssSelector(".fl tr:nth-of-type(1) tr:nth-of-type(4) [align]");
	
	public WebElement clickOnViewAccountSummaryLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(viewAccountSummaryLink);
	}
	public WebElement selectlistOfAccounts() throws IOException {
		this.driver = getDriver();
		return driver.findElement(listOfAccounts);
	}
	public WebElement clickOnGoBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(goBtn);
	}
	public WebElement checkAvailableBalance() throws IOException {
		this.driver = getDriver();
		return driver.findElement(availableBalance);
	}
}

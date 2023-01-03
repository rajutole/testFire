package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ViewRecentTransactionsPage extends BasePage {

	public ViewRecentTransactionsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver;
	
	By viewRecentTransactionsPageLink = By.linkText("View Recent Transactions");
	By depositAmount= By.cssSelector("[name] tr:nth-of-type(2) [align]");
	By withdrawAmount= By.cssSelector("[name] tr:nth-of-type(3) [align]");
	
	public WebElement clickOnViewRecentTransactionsPageLink() throws IOException {
		this.driver= getDriver();
		return driver.findElement(viewRecentTransactionsPageLink);
	}
	public WebElement getDepositAmount() throws IOException {
		this.driver= getDriver();
		return driver.findElement(depositAmount);
	}
	public WebElement getWithdrawalAmount() throws IOException {
		this.driver= getDriver();
		return driver.findElement(withdrawAmount);
	}

}

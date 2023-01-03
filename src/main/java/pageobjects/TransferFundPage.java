package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class TransferFundPage extends BasePage {

	public TransferFundPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By tansferFundPagelink = By.linkText("Transfer Funds");
	By fromAccount = By.cssSelector("select#fromAccount");
	By toAccount = By.cssSelector("select#toAccount");
	By amountToTrasfer = By.cssSelector("input#transferAmount");
	By tasferMoneybtn = By.cssSelector("#transfer");
	By amountTrasferSuccessMsg = By.cssSelector("[name] [colspan] [align] span");

	public WebElement clickOntansferFundPagelink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(tansferFundPagelink);
	}
	public WebElement selectFromAccount() throws IOException {
		this.driver = getDriver();
		return driver.findElement(fromAccount);
	}
	public WebElement selectToAccount() throws IOException {
		this.driver = getDriver();
		return driver.findElement(toAccount);
	}
	public WebElement enterAmountToTransfer() throws IOException {
		this.driver = getDriver();
		return driver.findElement(amountToTrasfer);
	}
	public WebElement clickOntasferMoneybtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(tasferMoneybtn);
	}
	public WebElement getAmountTrasferSuccessMsg() throws IOException {
		this.driver = getDriver();
		return driver.findElement(amountTrasferSuccessMsg);
	}

}

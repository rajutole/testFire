package AltoroMutual.net.testfire;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Hooks;
import junit.framework.Assert;
import pageobjects.TransferFundPage;

public class TrasferFundsTest extends Hooks {

	public TrasferFundsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void FundtransferTest() throws IOException {
		LogInSuccessTest logInSuccessTest = new LogInSuccessTest();
		logInSuccessTest.getSignUpTestSuccess();
		
		TransferFundPage transferPage = new TransferFundPage();
		transferPage.clickOntansferFundPagelink().click();
		// select 1st account no
		Select option = new Select(transferPage.selectFromAccount());
		option.selectByIndex(0);
		// select 2nd account no
		Select option1 = new Select(transferPage.selectToAccount());
		option1.selectByIndex(1);
		
		transferPage.enterAmountToTransfer().sendKeys("9876");
		
		transferPage.clickOntasferMoneybtn().click();
		
		String moneyTransferMsg =transferPage.getAmountTrasferSuccessMsg().getText();
		
		System.out.println(moneyTransferMsg);
				
		moneyTransferMsg= moneyTransferMsg.substring(0, moneyTransferMsg.indexOf(" "));

			System.out.println(moneyTransferMsg);
	// validate trasfer amount with assert		
			Assert.assertEquals(moneyTransferMsg, "9876.0");
		
	}
}

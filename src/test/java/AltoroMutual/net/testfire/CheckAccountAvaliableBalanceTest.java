package AltoroMutual.net.testfire;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import junit.framework.Assert;
import pageobjects.SignInPage;
import pageobjects.ViewAccountSummaryPage;

@Listeners(resources.Listeners.class)

public class CheckAccountAvaliableBalanceTest extends Hooks {

	public CheckAccountAvaliableBalanceTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void checkAvailableBalanceTest() throws IOException {

		LogInSuccessTest logInSuccessTest = new LogInSuccessTest();
		logInSuccessTest.getSignUpTestSuccess();

		
		ViewAccountSummaryPage viewAccountSummaryPage = new ViewAccountSummaryPage();
		viewAccountSummaryPage.clickOnViewAccountSummaryLink().click();
		// select class for dropdown

		Select select = new Select(viewAccountSummaryPage.selectlistOfAccounts());
		select.selectByIndex(1);

		viewAccountSummaryPage.clickOnGoBtn().click();
		String avaliableBalance = viewAccountSummaryPage.checkAvailableBalance().getText();

		System.out.println("Available Balance: " + avaliableBalance);

		// assert actual available balance vs Exepected Available balance
		Assert.assertEquals(avaliableBalance, "$474787979442049060000.00");

	}
}

package AltoroMutual.net.testfire;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Hooks;
import pageobjects.ViewRecentTransactionsPage;

public class ViewRecentTransactionsTest extends Hooks {

	public ViewRecentTransactionsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void recentTransactionsTest() throws IOException {
		LogInSuccessTest logInSuccessTest = new LogInSuccessTest();
		logInSuccessTest.getSignUpTestSuccess();
		
		ViewRecentTransactionsPage viewRecentTransactionsPage = new ViewRecentTransactionsPage();
		viewRecentTransactionsPage.clickOnViewRecentTransactionsPageLink().click();
		String depositAmount =viewRecentTransactionsPage.getDepositAmount().getText();
				
		String withdrawAmount  =viewRecentTransactionsPage.getWithdrawalAmount().getText().toString();
		
		// Validate the DepositAmount and withdrawAmount
		System.out.println("Deposit Amount: " + depositAmount);
		System.out.println("Withdrawal Amount: " + withdrawAmount);
		
		
	}

}

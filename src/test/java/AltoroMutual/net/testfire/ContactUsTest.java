package AltoroMutual.net.testfire;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Hooks;
import pageobjects.ContactUsPage;

public class ContactUsTest extends Hooks {

	public ContactUsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void contactUsTest() throws IOException, InterruptedException {
		LogInSuccessTest logInSuccessTest = new LogInSuccessTest();
		logInSuccessTest.getSignUpTestSuccess();
		
		ContactUsPage contactUsPage = new ContactUsPage();
		contactUsPage.clickOncontactUsPagelink().click();
		
		contactUsPage.clickOnOnlineformmLink().click();
		
		contactUsPage.enterYourName().sendKeys("Ram");
		contactUsPage.enterEmailAddress().sendKeys("test123@gmail.com");
		contactUsPage.enterSubject().sendKeys("Thank you for signing");
		contactUsPage.enterQueComment().sendKeys("Thank you for seamlessly signing");
		contactUsPage.clickOnClearFormBtn().click();
		//contactUsPage.clickOnSubmitBtn().click();
		
		String thankYouMsg =contactUsPage.getThankYouMsg().getText();
		// form submited sucessfully
		System.out.println("Form sumbmited successfully" +thankYouMsg);
		
		// Sign Off application
		contactUsPage.clickOnSignOffBtn().click();

	}

}

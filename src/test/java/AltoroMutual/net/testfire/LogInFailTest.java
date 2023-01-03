package AltoroMutual.net.testfire;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageobjects.SignInPage;

public class LogInFailTest extends Hooks {

	public LogInFailTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void getSignUpTestFailed() throws IOException, InterruptedException {
	

		SignInPage signInPage = new SignInPage();
		signInPage.clickOnLoginLink().click();

		FileInputStream workbookLoaction = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\credentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(workbookLoaction);
		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row2 = sheet.getRow(2);
		XSSFCell cellR2C0 = row2.getCell(0);
		XSSFCell cellR2C1 = row2.getCell(1);

		String usernameRow2 = cellR2C0.toString();
		String passwordRow2 = cellR2C1.toString();

		System.out.println(usernameRow2);
		System.out.println(passwordRow2);
		signInPage.enterUsername().sendKeys(usernameRow2);
		signInPage.enterPassword().sendKeys(passwordRow2);

		signInPage.clickOnLoginBtn().click();

		String loginfailedMsg = signInPage.getloginFailedMsg().getText();
		
		System.out.println(loginfailedMsg);
		ExtentManager.fail("LogIn failed....");
	}


}

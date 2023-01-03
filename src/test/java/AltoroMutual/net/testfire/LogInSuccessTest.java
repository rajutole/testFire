package AltoroMutual.net.testfire;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import base.Hooks;
import pageobjects.SignInPage;

public class LogInSuccessTest extends Hooks  {

	public LogInSuccessTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void getSignUpTestSuccess() throws IOException {
		
		SignInPage signInPage = new SignInPage();
		signInPage.clickOnLoginLink().click();

		FileInputStream workbookLoaction = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\credentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(workbookLoaction);
		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cellR1C0 = row1.getCell(0);
		XSSFCell cellR1C1 = row1.getCell(1);

		String usernameRow1 = cellR1C0.toString();
		String passwordRow1 = cellR1C1.toString();

		System.out.println(usernameRow1);
		System.out.println(passwordRow1);

		signInPage.enterUsername().sendKeys(usernameRow1);
		signInPage.enterPassword().sendKeys(passwordRow1);

		signInPage.clickOnLoginBtn().click();
// Log in Successfully
		String LogInSuccessMsg = signInPage.getloginSuccessMsg().getText();
		System.out.println(LogInSuccessMsg);
		

	}
}

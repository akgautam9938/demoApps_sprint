package webElements;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genricUtility.BaseClass;
import pom.LoginPage;
import pom.RegisterPage;

public class ToResisterUserAndVerifyTest extends BaseClass
{
	@Test(priority = 1)
	public void toRegisterUserAndVerify() throws EncryptedDocumentException, IOException
	{
		String name = fUtils.fetchStringDataFromExcelSheet("Sheet1", 1, 1);
		
		String email = fUtils.fetchStringDataFromExcelSheet("Sheet1", 5, 1);
		
		String password = fUtils.fetchStringDataFromExcelSheet("Sheet1", 3, 1);
		
		RegisterPage resister = new RegisterPage(driver);
		LoginPage login = new LoginPage(driver);
		resister.registerUser(name, email, password);
		
		boolean isResister = login.verifyUserRegistration();
		Assert.assertTrue(isResister);
		System.out.println("Pass: The user is resister sucesfully");
		
	}
	
	@Test(priority = 2)
	public void toLoginUserAndVerify() throws EncryptedDocumentException, IOException
	{
        String email = fUtils.fetchStringDataFromExcelSheet("Sheet1", 5, 1);
		
		String password = fUtils.fetchStringDataFromExcelSheet("Sheet1", 3, 1);
		LoginPage login = new LoginPage(driver);
		login.loginUser(email, password);
		boolean isLogin = login.verifyUserLogin();
		Assert.assertTrue(isLogin);
		System.out.println("pass:User is login");
		
		
	}
	
	
	

}

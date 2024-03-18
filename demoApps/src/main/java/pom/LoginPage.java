package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;
	
	
	public WebElement getEmailTextField()
	{
		return emailTextField;	
	}
	
	public WebElement getPasswordTextField()
	{
		return passwordTextField;	
	}
	
	public WebElement getLoginButton()
	{
		return loginButton;	
	}
	
	public void loginUser(String email, String password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	@FindBy(xpath = "//div[text()='Registered successfully']")
	private WebElement registerSuccessfullyMsg;
	public WebElement getRegisterSuccessfullyMsg()
	{
		return registerSuccessfullyMsg;
	}
	
	@FindBy(xpath = "//div[text()='Signin successful']")
	private WebElement signInSuccessfullyMsg;
	
	public WebElement getSignInSuccessfullyMsg() {
		return signInSuccessfullyMsg;
	}
	
	
	public boolean verifyUserRegistration()
	{
		return registerSuccessfullyMsg.isDisplayed();
	}
	
	public boolean verifyUserLogin()
	{
		return signInSuccessfullyMsg.isDisplayed();
	}


}

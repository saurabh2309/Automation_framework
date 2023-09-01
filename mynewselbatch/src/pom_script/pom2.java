package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {
	@FindBy(name="email")
	private WebElement Untbox;
	@FindBy(name="pass")
	private WebElement Pwdtbox;
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public pom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String un )
	{
		Untbox.sendKeys("803529441");
	}
	public void password(String pwd)
	{
	Pwdtbox.sendKeys("bawabawabawa");
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
}

   
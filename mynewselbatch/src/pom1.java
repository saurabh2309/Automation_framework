import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	@FindBy(name="email")
	private WebElement Untbox;
	@FindBy(name="pass")
	private WebElement pwdtbox;
	@FindBy(xpath="//a[text()='login']")
	private WebElement loginBtn;
	public pom1(WebDriver driver)
	{PageFactory.initElements(driver, this);
	}
	public void username(String un)
	{
		Untbox.Sendkeys(UN);
		
	}
	

}

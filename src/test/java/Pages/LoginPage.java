package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement passWord;

    @FindBy(xpath = "//button[text()=' Login ']")
    public WebElement loginButton;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setUserName() throws Exception{
        userName.sendKeys("Admin");
        Thread.sleep(1000);
    }

    public void setPassword() throws Exception{
        passWord.sendKeys("admin123");
        Thread.sleep(1000);
    }

    public void clickLoginButton() throws Exception{
        loginButton.click();
        Thread.sleep(1000);
    }
}

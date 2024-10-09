package Pages;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    @FindBy(xpath = "//a[@class='oxd-main-menu-item']")
    public WebElement adminMenu;

    @FindBy(xpath = "//button[text()=' Add ']")
    public WebElement addButton;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    public WebElement roleList;

    @FindBy(xpath = "//div[text()='-- Select --']")
    public WebElement statusList;

    @FindBy(xpath = "//label[text()='Employee Name']/following::input")
    public WebElement employeeName;

    @FindBy(xpath = "//label[text()='Username']/following::input")
    public WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passWord;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[text()=' Save ']")
    public WebElement saveButton;

    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickAdminMenu() throws InterruptedException {
        adminMenu.click();
        Thread.sleep(1000);
    }

    public void clickAddButton() throws InterruptedException {
        addButton.click();
        Thread.sleep(1000);
    }

    public void selectRole() throws InterruptedException {
        roleList.click();
        roleList.sendKeys(Keys.ARROW_DOWN);
        roleList.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public void selectStatus() throws InterruptedException {
        statusList.click();
        Thread.sleep(1000);

        statusList.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
    }

    public void setEmployeeName() throws InterruptedException {
        employeeName.sendKeys("Test Employee");
        Thread.sleep(1000);
    }

    public void setUserName() throws InterruptedException{
        userName.sendKeys("Test User");
        Thread.sleep(1000);
    }

    public void setPassWord() throws InterruptedException{
        passWord.sendKeys("Ap@123456");
        Thread.sleep(1000);

        confirmPassword.sendKeys("Ap@123456");
        Thread.sleep(1000);
    }

    public void clickSaveButton() throws InterruptedException {
        saveButton.click();
        Thread.sleep(1000);
    }
}

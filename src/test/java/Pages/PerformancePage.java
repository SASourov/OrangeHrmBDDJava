package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformancePage {
    @FindBy(xpath ="//span[text()='Performance']")
    public WebElement performanceMenu;

    public PerformancePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void click_performance_menu() throws Exception {
        performanceMenu.click();
        Thread.sleep(2000);
    }
}

package StepDefinitions;

import Pages.PerformancePage;
import Utility.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class PerformanceStep {
    public WebDriver driver;
    public PerformancePage pp;

    public PerformanceStep() throws Exception{
        this.driver = Hooks.getDriver();

        pp = new PerformancePage(driver);
    }

    @When("user click on performance menu")
    public void user_click_on_performance_menu() throws Exception{
        pp.click_performance_menu();

        try {
            driver.quit();
            System.out.println("Script Done");
        }
        catch (Exception e){
            System.out.println("Script Failed: " + e.getMessage());
        }
    }
}

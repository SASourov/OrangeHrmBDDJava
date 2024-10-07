package StepDefinitions;

import Pages.LoginPage;
import Utility.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class LoginStep {

    public WebDriver driver;

    LoginPage lp;

    public LoginStep() throws Exception{
        this.driver = Hooks.getDriver();

        lp = new LoginPage(driver);
    }

    @Given("user open url")
    public void user_open_url() throws Exception{
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
    }

    @When("user given user name")
    public void user_given_user_name() throws Exception{
        lp.setUserName();
    }

    @And("user given password")
    public void user_given_password() throws Exception{
        lp.setPassword();
    }

    @Then("user click login button")
    public void user_click_login_button() throws Exception{
        lp.clickLoginButton();

    }

}

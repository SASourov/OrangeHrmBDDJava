package StepDefinitions;

import Pages.AdminPage;
import Utility.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class AdminStep {
    public WebDriver driver;

    AdminPage ap;

    public AdminStep() throws Exception{
        this.driver = Hooks.getDriver();
        ap = new AdminPage(driver);
    }

    @When("user click on admin menu")
    public void user_click_on_admin_menu() throws InterruptedException {
        ap.clickAdminMenu();
    }

    @And("user click on add menu")
    public void user_click_on_add_menu() throws InterruptedException {
        ap.clickAddButton();
    }

    @And("user select role")
    public void user_select_role() throws InterruptedException {
        ap.selectRole();
    }

    @And("user select status")
    public void user_select_status() throws InterruptedException {
        ap.selectStatus();
    }

    @And("user set employee name")
    public void user_set_employee_name() throws InterruptedException {
        ap.setEmployeeName();
    }

    @And("user set username")
    public void user_set_username() throws InterruptedException {
        ap.setUserName();
    }

    @And("user set password")
    public void user_set_password() throws InterruptedException {
        ap.setPassWord();
    }

    @Then("user click on save button")
    public void user_click_on_save_button() throws InterruptedException {
        ap.clickSaveButton();

        try {
            driver.quit();
            System.out.println("Script Done");
        }
        catch (Exception e){
            System.out.println("Script Failed: " + e.getMessage());
        }
    }
}

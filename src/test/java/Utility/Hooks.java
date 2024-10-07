package Utility;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;

    @Before
    public static WebDriver getDriver() throws Exception{

        if (null == driver){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        }

        return driver;
    }

}

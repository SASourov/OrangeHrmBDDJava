package FullRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = "StepDefinitions",
        monochrome = true,
        tags = "@login or @systemUser"

)

public class TestRunner {
}

package Appium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"Appium.stepdef"},
        plugin = {
                "pretty",
                "html:target/report-cucumber.html",
                "json:target/cucumber-json.json"
        },
        monochrome = true // Menampilkan output tanpa karakter warna yang bisa mempersulit pembacaan log
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {}
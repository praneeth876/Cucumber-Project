package com.pages;

import com.Config.ReadConfig;
import com.Enum.Browsers;
import com.baseClass.BasePage;
import com.mongodb.MapReduceCommand;
import com.utilities.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hooks {

    DriverUtils driverUtils;
    WebDriver driver;
//    public Hooks(DriverUtils driverUtils){
//
//        this.driverUtils=driverUtils;
//    }

    @Before
    public void setUp(Scenario scenario) {
        driverUtils = new DriverUtils();
        driver = driverUtils.getDriverManager().getWebDriver();
       driver.navigate().to("https://www.amazon.in/");
//
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
    //super.setUp();
}

    @After
    public void tearDown(Scenario scenario) throws IOException {

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driverUtils.getDriverManager().getWebDriver()).getScreenshotAs(OutputType.BYTES);
            File file = new File(System.getProperty("user.dir") + "\\Screenshots\\Defects.png");
            FileOutputStream fileOut = new FileOutputStream(file);
            fileOut.write(screenshot);
        }


    }


//    @Before
//    public void setUp() {
//        super.setUp();
//    }
//
//    @After
//    public void tearDown() {
//        super.tearDown();
//    }


}

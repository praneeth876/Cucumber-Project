package com.DriverManagers;

import com.Config.ReadConfig;
import com.Enum.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

   public static WebDriver driver;
    public WebDriver getWebDriver() {

        ReadConfig.loadFile();
        Browsers browser = ReadConfig.getBrowser();

        System.out.println(browser+"==================================");

        switch (browser) {
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
        }

        return driver;
    }

}
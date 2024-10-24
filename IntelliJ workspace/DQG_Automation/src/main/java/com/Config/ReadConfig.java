package com.Config;

import com.Enum.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    static FileInputStream file;
    static Properties prop;

public static void loadFile() {

    try {
        file = new FileInputStream("C:\\Users\\PraneethReddyKatamre\\Desktop\\IntelliJ workspace\\AmazonBDD\\src\\main\\java\\com\\Config\\readConfig.properties");
        prop = new Properties();
        prop.load(file);

    } catch (FileNotFoundException e) {
        e.printStackTrace();
        throw new RuntimeException(e);

    } catch (IOException e) {
        e.printStackTrace();
        throw new RuntimeException(e);
    }
}

    public static Browsers getBrowser() {

        String strBrowser = prop.getProperty("browser");



        switch (strBrowser.toUpperCase()) {
            case "CHROME":
                return Browsers.CHROME;

            case "EDGE":
                return Browsers.EDGE;

            case "FIREFOX":
                return Browsers.FIREFOX;

            default:
                throw new RuntimeException("The browser selected is not valid");

        }


    }}



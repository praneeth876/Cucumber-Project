package com.baseClass;

import com.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class BasePage {
public static WebDriver driver;


private HomePage homepage;
    public BasePage(WebDriver driver) {
        this.driver=driver;
    }

    public HomePage getHomepage(){
        return (homepage==null) ? (homepage=new HomePage(driver)) : homepage;
    }


}

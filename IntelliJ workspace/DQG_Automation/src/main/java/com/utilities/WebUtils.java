package com.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class WebUtils {
WebDriver driver;
Select select;
   // WebUtils webUtils;
//Actions actions;
    //Creating a constructor to initialize driver
public WebUtils(WebDriver driver){

    this.driver=driver;
    //this.webUtils=new WebUtils(driver);

    }
//Mouse hover action
public void hoverToElement(WebElement element){
     Actions actions=new Actions(driver);
        actions.moveToElement(element);
}
//Drag and drop action
public void dragAndDropElement(WebElement dragElement,WebElement dropElement){
    Actions actions=new Actions(driver);
    actions.dragAndDrop(dragElement,dropElement);
}

//KeyBoard Actions using Actions class
public void keyBoardOperations(String keyboardButtonName){
    Actions actions=new Actions(driver);
    actions.sendKeys("Keys."+keyboardButtonName+"").build().perform();
}

//Select dropdown values
    public void selectdropDownValuebyText(WebElement element,String visibleText){
         select=new Select(element);
        select.selectByVisibleText(visibleText);
}
    public void selectdropDownbyValue(WebElement element,String value){
        select=new Select(element);
        select.selectByValue(value);
    }
    public void selectdropDownValuebyIndex(WebElement element,int index){
        select=new Select(element);
        select.selectByIndex(index);
    }

    //multipleWindowHandling by Title
    public void switchToWindow(String windowName){
        Set<String> allWindows=driver.getWindowHandles();
        for(String window : allWindows){
            String title=driver.switchTo().window(window).getTitle();
            if(title.equals(windowName)){
                break;
            }
        }
    }

    //click element using javaScript




}

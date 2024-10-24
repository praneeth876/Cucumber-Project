package com.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {
    //WebDriver driver;
    JavascriptExecutor js;

   // JavaScriptUtils jsUtils;
    public JavaScriptUtils(WebDriver driver){
       // this.driver=driver;
        this.js=(JavascriptExecutor)driver;
    }

    public void clickOnElement(WebElement element){
       // js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].click();",element);
    }
    public void sendText(WebElement element,String text){
        //js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].value='"+text+"';",element);
    }
    public void getPageTitle(){
        // js=((JavascriptExecutor)driver);
         js.executeScript("return document.title");

    }

    public void srollByCordinates(int start,int end){
        //js=((JavascriptExecutor)driver);
        js.executeScript("window.scrollTo("+start+","+end+")");
    }

    public void srollToElement(WebElement element){
        //js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }

    public void highlightElement(WebElement element){
       // js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].style.border='3px solid red'",element);
    }



}

package com.pages;

import com.Enum.Context;
import com.pageElements.HomePageElements;
import com.utilities.JavaScriptUtils;
//import com.utilities.ValidationsUtils;
import com.utilities.WebUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends HomePageElements {
   // WebDriver driver;
    WebUtils webUtils;
    JavaScriptUtils jsUtils;


   // ValidationsUtils valUtils;

    public HomePage(WebDriver driver){
       // this.driver=driver;
        this.jsUtils=new JavaScriptUtils(driver);
        this.webUtils=new WebUtils(driver);
        PageFactory.initElements(driver,this);

//       this.jsUtils=new JavaScriptUtils(driver);
//        this.webUtils=new WebUtils(driver);
    }

    public void launchBrowserAndNavigate(){
       // driver.navigate().to("https://www.amazon.in/");

    }
    public void selectproductfromDropDown(String product){
//        allDropdown.click();
//        allDropdown.findElements(By.tagName("option")).get(1).click();

        webUtils.selectdropDownValuebyText(allDropdown,product);

        Context enumCls=Context.DROPDOWNPRODUCT;
        enumCls.setValue(product);

    }
    public void validateSelectedProduct(){
        String slectProduct=selectedProduct.getText();
        System.out.println(slectProduct);

        Context enumCls=Context.DROPDOWNPRODUCT;
        String enumSltProd=enumCls.getValue();
        System.out.println(enumSltProd);

       // valUtils.validateAssertEquals(enumSltProd,slectProduct);

        if(slectProduct.equals(enumSltProd)){
            System.out.println("dropdown selected value is Matched");
        }
    }

    public void clickOnLanguageSettings(){
        jsUtils.clickOnElement(langDrpDownSettings);
        //System.out.println("language===============================================");
    }

    public void selectLanguageFromLanguagesList(String language){

        Context enumCls=Context.LANG;
        enumCls.setValue(language);

        int size=lstLangNames.size();
        for(int i=0;i<size;i++){
            String lang=lstLangNames.get(i).getText();
            System.out.println(lang);
            if(lang.contains(language)){
                jsUtils.clickOnElement(lstLangRdoBtns.get(i));
            }
        }
        jsUtils.clickOnElement(svBtn);

    }

    public void validateSelectedLanguage() throws InterruptedException {
        Thread.sleep(5000);
        String selectedlang=slectLang.getText();

        Context enumCls=Context.LANG;
        String enumsltLang=enumCls.getValue();

        System.out.println("Current language : "+selectedlang);
        if(selectedlang.equals(enumsltLang)){
           // valUtils.validateAssertEquals(enumsltLang,selectedlang);
            System.out.println("Required language is selected");
        }
    }

public void searchProductInSearchField(String product){
        jsUtils.clickOnElement(srcInput);
    jsUtils.sendText(srcInput,product);
}

    public void clickOnSearchButton(){
        jsUtils.clickOnElement(srcBtn);
    }
    public void validateTheSearchedProduct(){
        Context enumCls=Context.SEARCHPRODUCT;
        String enumSrcProd=enumCls.getValue();
        String product=srcInput.getAttribute("value");
        if(product.equals(enumSrcProd)){
            System.out.println("Toys product is searched");
        }

       // valUtils.validateAssertEquals(enumSrcProd,product);
    }

    public void srollToCountrySettingButtonAndClickOnIt(){

        jsUtils.srollToElement(countryBtn);
        jsUtils.clickOnElement(countryBtn);
    }
    public void selectValueFromCountryDropdown(String country){

        Context enumCls=Context.COUNTRY;
        enumCls.setValue(country);
        webUtils.selectdropDownValuebyText(countryDropDown,country);

    }
    public void clickOnGoToWebsiteSettingsButton(){

        jsUtils.clickOnElement(goToWebsite);
    }
    public void validateExpCountryisSelected(){

        webUtils.switchToWindow("Amazon.com.au | Mid-Year Sale 2024");
        jsUtils.srollToElement(countryBtn);
        String slectdCountryText=slectdCountry.getText();
        Context enumCls=Context.COUNTRY;
        String enumClsCountry=enumCls.getValue();
        if (slectdCountryText.equals(enumClsCountry)){
            System.out.println(enumClsCountry+" is selected");
        }
    }

}

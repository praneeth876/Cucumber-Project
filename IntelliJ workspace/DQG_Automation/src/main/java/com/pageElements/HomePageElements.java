package com.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageElements {

// Select product from dropdown scenario
    @FindBy(css="#searchDropdownBox")
    public WebElement allDropdown;

    @FindBy(css="#nav-search-label-id")
    public WebElement selectedProduct;

    @FindBy(css="#icp-nav-flyout")
    public WebElement langDrpDownSettings;

    @FindBy(css="[type='radio']")
    public List<WebElement> lstLangRdoBtns;

    @FindBy(css="[class='a-label a-radio-label']")
    public List<WebElement> lstLangNames;


    @FindBy(css="[class='a-button-input'][type='submit']")
    public WebElement svBtn;

    @FindBy(css="#icp-nav-flyout div")
    public WebElement slectLang;
    @FindBy(css="#twotabsearchtextbox")
    public WebElement srcInput;

    @FindBy(css="#nav-search-submit-button")
    public WebElement srcBtn;

    @FindBy(css="[id='icp-touch-link-country']")
    public WebElement countryBtn;

    @FindBy(css="select#icp-dropdown")
    public WebElement countryDropDown;

    @FindBy(css="[class='a-button-input']")
    public WebElement goToWebsite;


    @FindBy(css="[class='icp-color-base']")
    public WebElement slectdCountry;

}

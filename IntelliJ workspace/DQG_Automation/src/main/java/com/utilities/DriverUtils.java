package com.utilities;

import com.DriverManagers.DriverManager;
import com.baseClass.BasePage;

public class DriverUtils {

    private final DriverManager driverManager;
    private final BasePage basePage;

    ScenarioContext scenarioContext;


    public DriverUtils() {
        driverManager = new DriverManager();
        basePage = new BasePage(driverManager.getWebDriver());
        scenarioContext=new ScenarioContext();
    }

    public DriverManager getDriverManager(){
        return driverManager;
    }

    public BasePage getBasePage(){
        return basePage;
    }
    public ScenarioContext getScenarioContext(){
        return scenarioContext;
    }




}

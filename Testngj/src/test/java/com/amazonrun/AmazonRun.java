package com.amazonrun;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import reusable.*;

public class AmazonRun {
    WebDriver driver;

    @Test(priority = 1)
    public void browserInvo(){
        BrowserInvocation browser=new BrowserInvocation();
        driver=browser.launchApp();

    }
    @Test(priority = 2)
    public void logInPagee(){
        LogIn log=new LogIn();
        driver=log.logInPage();
    }


    public void filterr(){
        Filter fil=new Filter();
      fil.Pendr().Dep().FlashButton().Customer().OneStarClick().SanDisk().Price();

    }

    public void addCar(){
        AddCart addd=new AddCart();
        addd.ad().addCartt();
    }

    public void removeCart() {
        RemoveCart removeC=new RemoveCart();
        removeC.Remove().Delete();
    }
    @Test(priority = 3)
    public void signOuttttt(){
        SortOut sig=new SortOut();
        driver=sig.sort();
    }

    public void close(){
      driver.close();
    }
}

package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.openqa.selenium.By.id;

public class LogOut extends BrowserInvocation {
    Actions mouse=new Actions(driver);

    private By logOutt=id("nav-line-1-container");

    //WebElement logOu=  driver.findElements(By.id("nav-flyout-accountList"));

    private By logOu=id("nav-flyout-accountList");

    private By signOu=id("nav-item-signout");


    //public LogOut Logouttt(){
      //  WebElement logOu=driver.findElements(logOu);
        //return this;
    //}

    public LogOut Sign(){
        driver.findElement(signOu).click();
        return this;
    }

}

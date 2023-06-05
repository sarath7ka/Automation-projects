package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static reusable.BrowserInvocation.driver;

public class AddCart extends BrowserInvocation {

    public static WebDriver addCart(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive"+ Keys.ENTER);

        driver.findElement(By.id("submit.add-to-cart")).click();
        driver.findElement(By.id("nav-cart")).click();




        return driver;
    }
}

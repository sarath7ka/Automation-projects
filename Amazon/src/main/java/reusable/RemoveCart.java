package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static reusable.BrowserInvocation.driver;

public class RemoveCart extends BrowserInvocation{
    public static WebDriver removeCar(){

        //List<WebElement> cart = driver.findElements(By.id("sc-active-cart"));
        // cart.set(driver.findElements(By.className("a-size-small sc-action-delete")));
        driver.findElements(By.id("sc-active-C1fa2d043-590e-4526-bb91-3ae300a2c4fe"));

        return driver;
    }



}

package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.*;
public class RemoveCart extends BrowserInvocation {

    List<WebElement>removeCar=driver.findElements(By.id("nav-belt"));

    private By remov=id("nav-cart-count-container");

    private By dele=xpath("//span[@class='a-size-small sc-action-delete']");

   // private By delet=cssSelector("input[name='submit.delete.0ed5160e-d881-4fd8-b228-af89818f5b25']");


    public RemoveCart Remove(){
        driver.findElement(remov).click();
        return this;
    }
    public RemoveCart Delete() {

        driver.findElement(dele).click();
        return this;
    }
}

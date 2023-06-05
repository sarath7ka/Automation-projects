package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.id;

public class AddCart extends BrowserInvocation{

    List<WebElement> addCart=driver.findElements(By.cssSelector("span[class='rush-component s-latency-cf-section']"));

    private By add=id("B015CH1PJU-amazons-choice-label");
    private By addCartClic=id("submit.add-to-cart");

    public AddCart ad(){
        driver.findElement(add).click();
        return this;
    }

    public AddCart addCartt(){
        driver.findElement(addCartClic).click();
        return this;
    }


}

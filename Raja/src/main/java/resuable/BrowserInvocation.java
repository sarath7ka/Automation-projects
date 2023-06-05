package resuable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Properties;

public class BrowserInvocation {
    WebDriver driver;

    public WebDriver launchApplication(){


        driver=new EdgeDriver();
        driver.navigate().to("https://www.amazon.com/");


        return driver;
    }





}

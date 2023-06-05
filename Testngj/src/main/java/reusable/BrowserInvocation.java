package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInvocation {
    static WebDriver driver;
    public static WebDriver launchApp(){
        driver=new EdgeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        return driver;
    }
}

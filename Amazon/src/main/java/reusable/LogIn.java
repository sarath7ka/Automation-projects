package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class  LogIn extends BrowserInvocation{

    public static WebDriver logInPage(){


        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.id("ap_email")).sendKeys("saravanakumarres@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Sarath");
        driver.findElement(By.id("signInSubmit")).click();

        //return driver;
        return null;
    }

}


package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class BrowserInvocation {
     static WebDriver driver;
    public  static WebDriver launchApplication() {

       // FileInputStream fis=new FileInputStream(new File("C:\\Users\\gandh\\Raja\\Amazon\\src\\main\\resources\\utility"));
        //Properties prob=new Properties();
        //prob.load(fis);
        driver=new EdgeDriver();
        System.setProperty("webdriver.edge.driver","C:\\Users\\gandh\\OneDrive\\Documents\\Raja\\Raj");

        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;

    }
}


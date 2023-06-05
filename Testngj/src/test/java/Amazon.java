import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class Amazon {
    WebDriver driver;

    public void driverLaunch (){
        driver=new EdgeDriver();

    }

    public void urlLaunch (){

      driver.navigate().to("https://www.amazon.com/");
      driver.manage().window().maximize();
    }

    public void logIn (){
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("saravanakumarres@gmail.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Sarath");
        driver.findElement(By.id("signInSubmit")).click();
    }

    public void search(){
        Actions sea=new Actions(driver);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive"+Keys.ENTER);
    }



    public void filter(){
       WebElement fil= driver.findElement(By.id("s-refinements"));
      fil.findElement(By.id("reviewsRefinements")).click();
    }


    public void close(){
        driver.close();
    }
}

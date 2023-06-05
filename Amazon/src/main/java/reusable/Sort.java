package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Sort extends BrowserInvocation {

    public static WebDriver sortBy() {

        String search = "Pendrive";
        search.toLowerCase();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
        List<WebElement> sort = driver.findElements(By.id("a-dropdown-container"));

        for (int i = 0; i < sort.size(); i++) {

            if (sort.get(i).getText().equals("Price: Low to High"));
            {
                sort.get(i).click();

            }
            if (sort.get(i).getText().equals("Price: High to Low"));
            {
                sort.get(i).click();

            }
            if (sort.get(i).getText().equals("Avg. Customer Review"));
            {
                sort.get(i).click();

            }
            if (sort.get(i).getText().equals("Newest Arrivals"));
            {
                sort.get(i).click();

            }
            if (sort.get(i).getText().equals("Best Sellers"));
            {
                sort.get(i).click();

            }
        }
        return driver;
    }

}
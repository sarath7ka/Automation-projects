package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SortOut extends BrowserInvocation {
    public static WebDriver sort(){

        String search = "Pendrive";
        search.toLowerCase();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search+ Keys.ENTER);
        List<WebElement> sort = driver.findElements(By.className("a-dropdown-container"));


        for (int i = 0; i < sort.size(); i++) {
            //System.out.println(sort.get(i).getText());
            if (sort.get(i).findElements(By.id("s-result-sort-select_3"));
            {
                sort.get(i).click();
                break;
            }

            if (sort.get(i).getText().equals("Price: Low to High"));
            {
                sort.get(i).click();

            }
            if (sort.get(i).getText().equals("Price: High to Low"));
            {
                sort.get(i).click();
                break;

           }
          //  if (sort.get(i).getText().equals("Avg. Customer Review"));
           // {
           //     sort.get(i).click();
           //     break;

           // }
          //  if (sort.get(i).getText().equals("Newest Arrivals"));
           // {
           //     sort.get(i).click();
           //     break;

           // }
          //  if (sort.get(i).getText().equals("Best Sellers"));
           // {
            //   sort.get(i).click();
             //  break;

           // }
        }
        return driver;
    }


}
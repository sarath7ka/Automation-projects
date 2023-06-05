package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Select {
    public Select(WebElement elementClass) {
    }

    public static void main(String[] args) {



        WebDriver driver=new EdgeDriver();
        driver.get("https://www.airindia.in/");
        WebElement elementClass= driver.findElement(By.id("ddladult1"));
        Actions arun = new Actions(driver);
        arun.click().clickAndHold().build().perform();

    }
}

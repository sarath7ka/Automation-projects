package com.stepdefination;

import com.sun.jdi.connect.LaunchingConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import resuable.BrowserInvocation;


public  class AmazonSteps {
    WebDriver driver;

    @Given("User navigate the home page of the Application")
    public void homePage(){

        BrowserInvocation browser=new BrowserInvocation();
        driver=browser.launchApplication();
    }


    @When("User Enter the  function like click and Enter")
    public void userEnter() {




    }

    @Then("Move to next page")
    public void moveTo() {

    }
}

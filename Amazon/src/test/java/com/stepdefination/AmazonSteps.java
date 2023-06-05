package com.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import reusable.BrowserInvocation;
import reusable.LogIn;

import java.io.IOException;

public class AmazonSteps {


        WebDriver driver;

        @Given("User launch Log In Page")
        public void logIn() throws IOException {
                BrowserInvocation browser=new BrowserInvocation();
                driver=browser.launchApplication();

        }

        @When("User enter the valid email id or phone number")
        public void enterTheValidEmailIdOrPhoneNumber() {

                LogIn log=new LogIn();
                driver=log.logInPage();

        }

        @And("User enter the valid Password")
        public void enterTheValidPassword() {

        }

        @Then("Navigate the Amazon Home Page")
        public void amazonHomePage() {

        }
}
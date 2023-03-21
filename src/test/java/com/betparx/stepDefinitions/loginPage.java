package com.betparx.stepDefinitions;

import com.betparx.page.LoginBetParx;
import com.betparx.utilities.ConfigurationReader;
import com.betparx.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage {

    LoginBetParx lgnPage = new LoginBetParx();



    @Given("user is on betParx login page")
    public void user_is_on_bet_parx_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        lgnPage.loginBtn.click();

    }

    @When("user enters username")
    public void user_enters_username() {
        lgnPage.userName.sendKeys(ConfigurationReader.getProperty("username"));


    }

    @When("user enters password")
    public void user_enters_password() {
      //Driver.getDriver().get(ConfigurationReader.getProperty("password"));
        lgnPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        lgnPage.lgn.click();
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {

    }
}

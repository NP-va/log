package com.betparx.stepDefinitions;

import com.betparx.page.LoginBetParx;
import com.betparx.utilities.ConfigurationReader;
import com.betparx.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

    WebDriver driver = Driver.getDriver();

    WebDriverWait wait;

    LoginBetParx lgnPage = new LoginBetParx();

    @Given("user is on betParx login page")
    public void user_is_on_bet_parx_login_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Thread.sleep(1000);
        lgnPage.sign.click();



    }

    @When("user enters username")
    public void user_enters_username() throws InterruptedException {
       lgnPage.userName.sendKeys(ConfigurationReader.getProperty("username"));



    }

    @When("user enters password")
    public void user_enters_password() throws InterruptedException {
     // Driver.getDriver().get(ConfigurationReader.getProperty("password"));
       lgnPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(1000);
        lgnPage.signIn.click();
        Thread.sleep(5000);

    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        String actualTitle = driver.getTitle();
        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("Actual Title of Etsy is : "+actualTitle);

    }
}

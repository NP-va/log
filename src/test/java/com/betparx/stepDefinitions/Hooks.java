package com.betparx.stepDefinitions;

import com.betparx.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks { @Before
public void setUp(){
    System.out.println("=>Before Scenario is running");
}
    @After

    public void tearDown(Scenario scenario){
        System.out.println("=>After Scenario is running");

        byte[] screenshot =  ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        Driver.closeDriver();
    }

}

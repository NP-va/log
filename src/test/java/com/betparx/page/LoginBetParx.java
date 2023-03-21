package com.betparx.page;

import com.betparx.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBetParx {

    public LoginBetParx(){

    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy (xpath = "//button[.='Log In']")
    public WebElement loginBtn;

    @FindBy (id = "userName")
    public WebElement userName;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement lgn;

}

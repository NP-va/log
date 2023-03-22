package com.betparx.page;

import com.betparx.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBetParx {

    public LoginBetParx(){

    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy (xpath= "//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button")
    public WebElement sign;

    @FindBy (id = "join_neu_email_field")
    public WebElement userName;


    @FindBy (id = "join_neu_password_field")
    public WebElement password;

    @FindBy (xpath = "//button[@name='submit_attempt']")
    public WebElement signIn;



}

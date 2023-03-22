package com.betparx.page;

import com.betparx.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    public Search(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id = "global-enhancements-search-query")
    public WebElement search;


    @FindBy (id = "join_neu_password_field")
    public WebElement password;

}

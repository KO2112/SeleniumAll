package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticePage2 {
    public AutomationPracticePage2(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    public WebElement logoutButton;


}
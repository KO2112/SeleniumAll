package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import junit.framework.TestCase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase8Page {
    public TestCase8Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h1/span")
    public WebElement title;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    public WebElement productbutton;


}

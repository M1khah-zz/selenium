package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    private static String URL="https://www.ranorex.com/web-testing-examples/vip/";
    public static String CONTENT_TITLE = "VIP Database Test Web Application";
    public static String FIRST_NAME = "Kir";

    public HomePage(WebDriver driver){
        this.driver = driver;
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Content")
    public WebElement contentTitle;

    public String checkContentTitleText(){
        return contentTitle.getText();
    }
}

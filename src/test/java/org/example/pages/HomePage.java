package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    private static String URL="https://www.ranorex.com/web-testing-examples/vip/";
    public static String WRONG_CONTENT_TITLE = "Lorem";
    private static String FIRST_NAME = "Kir";
    private static String LAST_NAME = "Alex";

    public HomePage(WebDriver driver){
        this.driver = driver;
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Content")
    public WebElement contentTitle;

    public String getContentTitleText(){
        return contentTitle.getText();
    }

    @FindBy(xpath = "//*[@type='text' and @id='FirstName']")
    public WebElement firstNameField;
    public void setFirstName(){
        firstNameField.sendKeys(FIRST_NAME);
    }

    @FindBy(xpath = "//*[@type='text' and @id='LastName']")
    public WebElement lastNameField;
    public void setLastName() {
        lastNameField.sendKeys(LAST_NAME);
    }

    @FindBy(id = "Add")
    public WebElement addbutton;
    public void clickAddButton() {
        addbutton.click();
    }

    @FindBy(id = "VIP")
    public WebElement vipButton;

}

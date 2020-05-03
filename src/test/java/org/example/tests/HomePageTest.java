package org.example.tests;

import static org.example.pages.HomePage.*;
import static org.testng.Assert.*;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class HomePageTest {

    private static WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void openHomepage() {
        HomePage homePage = new HomePage(driver);
        assertNotEquals(WRONG_CONTENT_TITLE, homePage.getContentTitleText());
    }

    @Test(priority = 2)
    public void addItem() {
        HomePage homePage = new HomePage(driver);
        homePage.setFirstName();
        homePage.setLastName();
        homePage.clickAddButton();
        assertTrue(homePage.vipButton.isDisplayed());
    }

    @AfterClass
    public static void quit(){
        driver.quit();
    }

}

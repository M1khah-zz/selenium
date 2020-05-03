package org.example.tests;

import static org.example.pages.HomePage.CONTENT_TITLE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.example.pages.HomePage;


public class HomePageTest {

    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openHomepage() {
        HomePage homePage = new HomePage(driver);
        assertEquals(true, homePage.checkContentTitleText().equals(CONTENT_TITLE));
    }

    @Test
    public void fillFirstName() {

    }

    @After
    public void quit(){
        driver.quit();
    }

}

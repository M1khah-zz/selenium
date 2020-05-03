package org.example.tests;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageTest
{

    private WebDriver driver;

    @Test
    public void openHomepage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


}
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}

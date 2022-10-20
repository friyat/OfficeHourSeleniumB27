package com.cydeo.tests.week2_10_12_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTests {
    WebDriver driver;

    @BeforeMethod
            public void setUp() {

        // set up browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1-go to home page
        driver.get("https://vytrack.com");
    }
    @AfterMethod
    public void tearDown()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        @Test
        public void verify_login_label_is_displayed() {
        //2-verify Login label is displayed
        String locator = "//ul[@id='top-menu']/li[.='LOGIN']";
        WebElement loginLabel = driver.findElement(By.xpath(locator));
        Assert.assertTrue(loginLabel.isDisplayed());
    }

    @Test
    public void verify_home_label_is_displayed() {


        //2-verify Login label is displayed
        String locator = "//ul[@id='top-menu']/li[.='Home']";
        WebElement loginLabel = driver.findElement(By.xpath(locator));
        Assert.assertTrue(loginLabel.isDisplayed());
    }

    @Test
    public void verify_about_us_label_is_displayed() {


        //2-verify Login label is displayed
        String locator = "//ul[@id='top-menu']/li[.='About us']";
        WebElement loginLabel = driver.findElement(By.xpath(locator));
        Assert.assertTrue(loginLabel.isDisplayed());
    }
}
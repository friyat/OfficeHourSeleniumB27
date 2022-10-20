package com.cydeo.tests.week01_10_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) throws InterruptedException {

        //set up Browser
        WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       //Go to the Website
       driver.get("https://www.google.com/");

       //Get Title
        System.out.println(driver.getTitle());


       //navigate a URL
        driver.navigate().to("https://www.etsy.com/");
        Thread.sleep(3000);

        //refresh the page
        driver.navigate().refresh();

        //GO BACK TO GOOGLE
        driver.navigate().back();

        //GO TO ESTY AGAIN
        driver.navigate().forward();



       //close the curunt brouser
        driver.close();
    }
}

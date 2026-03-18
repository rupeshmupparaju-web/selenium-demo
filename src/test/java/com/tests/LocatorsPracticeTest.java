package com.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocatorsPracticeTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    public void practiceLocators() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("testuser");
        driver.findElement(By.name("inputPassword")).sendKeys("wrongpass");
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();
        String errorMsg = driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println("Error message: " + errorMsg);
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Test User");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("testuser@example.com");              
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("1234567890");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();   
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
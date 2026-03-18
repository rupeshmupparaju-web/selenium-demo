package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {
        // If ChromeDriver isn't available on PATH, set its location explicitly:
        // System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.facebook.com");
            System.out.println("Title: " + driver.getTitle());

            WebElement firstLink = driver.findElement(By.cssSelector("a"));
            System.out.println("First link text: " + firstLink.getText());
        } finally {
            driver.quit();
        }
    }
}

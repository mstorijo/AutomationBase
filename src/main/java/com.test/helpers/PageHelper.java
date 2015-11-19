package com.test.helpers;

import com.test.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHelper {
    private WebDriver driver;
    protected final String BASE_URL = "http://keep.google.com";

    public PageHelper(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage goToMainPage() {
        driver.get(BASE_URL);
        WaitHelper.waitForPageLoad(driver);
        return new MainPage(driver);
    }

    public void endTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}

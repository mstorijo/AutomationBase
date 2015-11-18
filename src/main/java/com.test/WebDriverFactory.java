package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver createWebDriver() throws Exception {
        WebDriver driver = new FirefoxDriver();
        return driver;
    }


}

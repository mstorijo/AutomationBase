package com.test.pages;

import com.test.helpers.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;
    private String username;
    private String password;

    public MainPage(WebDriver driver) {

        this.driver = driver;
        this.username = "toriTSBtester@gmail.com";
        this.password = "abc123Tori";
    }

    public void login() {
        enterUsername();
        clickNext();
        enterPassword();
        clickSignIn();
    }

    public void enterUsername() {
        driver.findElement(By.id("Email")).sendKeys(username);
    }

    public void enterPassword() {
        driver.findElement(By.id("Passwd")).sendKeys(password);
    }


    public void clickNext() {
        driver.findElement(By.id("next")).click();
        WaitHelper.waitForPageLoad(driver);
    }

    public void clickSignIn() {
        driver.findElement(By.id("signIn")).click();
        WaitHelper.waitForPageLoad(driver);
    }
}

package com.test.pages;

import com.test.helpers.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;
    private String username;
    private String password;

    public MainPage(WebDriver driver) {

        this.driver = driver;
        this.username = "toriTSBtester@gmail.com";
        this.password = "abc123Tori";
    }

    public void login() throws InterruptedException {
        WebElement usernameField = driver.findElement(By.id("Email"));
        usernameField.sendKeys(username);
        usernameField.submit();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
        WebElement passwordField = driver.findElement(By.id("Passwd"));
        passwordField.sendKeys(password);
        passwordField.submit();
    }

    public void search(String searchTerm){
        WebElement searchField = driver.findElement(By.id("gbqfq"));
        searchField.sendKeys(searchTerm);
     }
}

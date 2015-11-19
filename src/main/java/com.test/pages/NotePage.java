package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotePage {

    private WebDriver driver;
    private WebElement noteStart;
    private WebElement noteText;
    private WebElement doneButton;

    public NotePage(WebDriver driver) {
        this.driver = driver;
    }

    public void createNote(String content) {
        noteStart = driver.findElement(By.xpath("//div[contains(text(),\"Add note\")]"));
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOf(noteStart));
        noteText = driver.findElement(By.xpath("//div[contains(text(),\"Add note\")]/following-sibling::div[@contenteditable=\"true\"]"));
        doneButton = driver.findElement(By.xpath("//div[contains(text(),\"Done\")]"));
        noteStart.click();
        noteText.sendKeys(content);
        doneButton.click();
    }

}
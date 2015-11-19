package com.test;

import com.test.helpers.PageHelper;
import com.test.pages.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchTest {

    WebDriver driver;
    private MainPage mainPage;
    private PageHelper pageHelper;

    @Before
    public void setUp() throws Exception {
        driver = WebDriverFactory.createWebDriver();
        pageHelper = new PageHelper(driver);
        mainPage = pageHelper.goToMainPage();
        mainPage.login();
    }

    @Test
    public void searchTest() throws Exception {

        String searchTerm = "Searching for me";
        mainPage.search(searchTerm);
        Assert.assertTrue("The note text was not found on the page.", driver.findElement(By.tagName("body")).getText().contains(searchTerm));
        Assert.assertTrue("The page is not displaying x matching note message", driver.findElement(By.tagName("body")).getText().contains("1 matching note"));
    }

    @After
    public void tearDown() throws Exception {
        pageHelper.endTest();
    }

}

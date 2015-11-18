package com.test;

import com.test.helpers.PageHelper;
import com.test.pages.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver driver;
    private MainPage mainPage;
    private PageHelper pageHelper;

    @Before
    public void setUp() throws Exception {
        driver = WebDriverFactory.createWebDriver();
        pageHelper = new PageHelper(driver);
    }

    @Test
    public void loginTest() throws Exception {
        mainPage = pageHelper.goToMainPage();
        mainPage.login();
        Assert.assertTrue("The current URL is not keep.google.com", driver.getCurrentUrl().startsWith("http://keep.google.com"));
    }

    @After
    public void tearDown() throws Exception {
        pageHelper.endTest();
    }


}

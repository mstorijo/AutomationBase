package com.test;

import com.test.helpers.PageHelper;
import com.test.pages.MainPage;
import org.apache.commons.exec.ExecuteException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OpenMainPageTest {
    WebDriver driver;
    private MainPage mainPage;
    private PageHelper pageHelper;



    @Before
    public void setUp() throws Exception {
        driver = WebDriverFactory.createWebDriver();
        pageHelper = new PageHelper(driver);
    }

    @Test
    public void openMainPageTest() throws Exception{
       mainPage = pageHelper.goToMainPage();
        Assert.assertTrue("URL didn't match", driver.getCurrentUrl().contains("google"));
    }

    @After
public void tearDown() throws Exception {
        pageHelper.endTest();
    }

}

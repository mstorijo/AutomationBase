package com.test;

import com.test.helpers.PageHelper;
import com.test.pages.MainPage;
import com.test.pages.NotePage;
import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Date;


public class CreateNoteTest {

    WebDriver driver;
    private MainPage mainPage;
    private PageHelper pageHelper;
    private NotePage notePage;

    @Before
    public void setUp() throws Exception {
        driver = WebDriverFactory.createWebDriver();
        pageHelper = new PageHelper(driver);
        mainPage = pageHelper.goToMainPage();
        mainPage.login();
    }

    @Test
    public void createNoteTest() throws Exception {
        notePage = new NotePage(driver);
        Date myDate = new Date();
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd:HH-mm-ss");
        String myDateString = fdf.format(myDate);
        String noteText = "Here is some random text for you! And a datestamp: " + myDateString;
        notePage.createNote(noteText);
        Assert.assertTrue("The note text was not found on the page.", driver.findElement(By.tagName("body")).getText().contains("noteText"));
    }

    @After
    public void tearDown() throws Exception {
        pageHelper.endTest();
    }
}

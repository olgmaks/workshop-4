package com.lits.tests;

import com.lits.common.WebDriverContext;
import com.lits.helper.EnvProps;
import com.lits.pages.AutomationPracticeFormPage;
import com.lits.tests.listener.LogListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LogListener.class)
public class ExampleTest {

    private EnvProps envProps = new EnvProps();

    @Test
    public void testSetFirstName() {

        WebDriverContext.loadURL(envProps.getWebSiteUrl());

        AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();
        WebDriverContext.captureScreen();
        automationPracticeFormPage.acceptCookies();
        WebDriverContext.captureScreen();
        automationPracticeFormPage.setFirstName("Oleh");
        automationPracticeFormPage.setLastName("Maksymuk");
        automationPracticeFormPage.selectSex("MALE");
        automationPracticeFormPage.selectExperience(5);
        WebDriverContext.captureScreen();
        automationPracticeFormPage.checkManual();
        automationPracticeFormPage.checkAutomation();

        Assert.assertEquals(
                automationPracticeFormPage
                        .getTextLabelText(),
                "Text1");
    }


    @AfterMethod
    public void afterTest () {
        WebDriverContext.stop();
    }
}

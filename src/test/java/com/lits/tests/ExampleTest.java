package com.lits.tests;

import com.lits.common.WebDriverContext;
import com.lits.pages.AutomationPracticeFormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ExampleTest {

    @Test
    public void testSetFirstName() {

        WebDriverContext.loadURL("http://toolsqa.com/automation-practice-form/");

        AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();

        automationPracticeFormPage.acceptCookies();
        automationPracticeFormPage.setFirstName("Oleh");
        automationPracticeFormPage.setLastName("Maksymuk");
        automationPracticeFormPage.selectSex("MALE");
        automationPracticeFormPage.selectExperience(5);
        automationPracticeFormPage.checkManual();
        automationPracticeFormPage.checkAutomation();
    }


    @AfterMethod
    public void afterTest () {
        WebDriverContext.stop();
    }
}

package com.lits.pages;

import com.lits.common.AbstractPage;
import com.lits.common.WebDriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticeFormPage extends AbstractPage {

    @FindBy(name = "firstname")
    private WebElement firstNameInput;
    @FindBy(id = "lastname")
    private WebElement lastNameInput;
    @FindBy(id = "sex-0")
    private WebElement maleSex;
    @FindBy(id = "sex-1")
    private WebElement femaleSex;
    @FindBy(id = "profession-1")
    private WebElement professionAutomation;
    @FindBy(id = "profession-0")
    private WebElement professionManual;

    public void setFirstName(final String name) {
        firstNameInput.sendKeys(name);
    }

    public void setLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void selectSex(String sex) {
        WebElement element;
        if ("male".equalsIgnoreCase(sex))
        {

            element = maleSex;
        }
        else
        {
            element= femaleSex;
        }

        element.click();
    }

    public void selectExperience(int yesar) {
        WebDriverContext.getDriver().findElement(By.id("exp-" + yesar)).click();
    }

    public void checkManual() {
        professionManual.click();
    }

    public void checkAutomation() {
        professionAutomation.click();
    }

    public void acceptCookies() {
        WebDriverContext
                .getDriver()
                .findElement(By.id("cookie_action_close_header"))
                .click();
    }
}

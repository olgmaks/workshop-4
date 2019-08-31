package com.lits.common;

import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

    public AbstractPage() {

            PageFactory
                    .initElements(
                            WebDriverContext.getDriver(), this);

    }
}
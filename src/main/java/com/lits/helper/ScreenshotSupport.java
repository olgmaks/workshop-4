package com.lits.helper;

import io.qameta.allure.Attachment;

public class ScreenshotSupport {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}

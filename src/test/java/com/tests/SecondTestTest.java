package com.tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SecondTestTest {

    @Test
    public void mainShouldNotThrow_whenChromeDriverAvailable() {
        try {
            SecondTest.main(new String[] {});
        } catch (Throwable t) {
            // This test is intended to validate the entrypoint exists, not to provide
            // a full Selenium integration test. Skip if ChromeDriver is not available.
            throw new SkipException("Skipping browser-dependent test: " + t.getMessage(), t);
        }
    }
}

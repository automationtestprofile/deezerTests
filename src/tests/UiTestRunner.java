package tests;

import engine.Driver;
import engine.utils.LoggerUtil;
import engine.utils.TestListener;
import org.testng.ITestContext;

import org.testng.annotations.*;

@Listeners(TestListener.class)
public class UiTestRunner  {
    Driver driver = new Driver();

        @BeforeClass
    public final void beforeClass(){
        LoggerUtil.startTestSuite("Test suite: " + getClass().getName() + " is running...");
    }
    @BeforeTest
        public final void beforeTest(){
            driver.start();
        }

    @AfterTest
    public final void afterTest(){
        driver.quit();
        LoggerUtil.endTestCase();
    }

    @AfterClass
    public final void afterClass(){
        LoggerUtil.endTestSuite();
    }
}


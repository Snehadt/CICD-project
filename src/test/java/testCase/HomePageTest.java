package testCase;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import util.TestUtil;

public class HomePageTest extends TestBase {
    HomePage homePage;
    TestUtil testUtil;

    public HomePageTest(){

        homePage = new HomePage();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
    }
    @Test
    public void verifyHomePageTitleTest(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "#1 Free CRM Power Up your Entire Business Free Forever","Home page title not matched");
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

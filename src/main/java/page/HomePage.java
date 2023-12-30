package page;

import base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public String verifyHomePageTitle(){
        System.out.println("uiuiui: "+driver.getTitle());
        return driver.getTitle();
    }
}

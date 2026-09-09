package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void ClickLoginButton() {
        homePage.clickLoginButton();
    }

    @Test
    public void EnterUserName() {
        loginPage.enterUsername("mukhanu2@gmail.com");
    }
}
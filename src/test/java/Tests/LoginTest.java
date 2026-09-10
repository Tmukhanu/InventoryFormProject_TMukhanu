package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void ClickLoginButton() {
        homePage.clickLoginButton();
    }

    @Test(priority = 1)
    public void EnterUserName() {
        loginPage.enterUsername("mukhanu2@gmail.com");
    }

    @Test(priority = 2)
    public void EnterPassword() {
        loginPage.enterPassword("@123456789");
    }

    @Test(priority = 3)
    public void ClickLoginSubmitButton() {
        loginPage.ClickLoginSubmitButton();
    }
}



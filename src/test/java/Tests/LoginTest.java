package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class LoginTest extends Base {
    @Test
    public void LoginClass() {
        homePage.clickLoginButton();
    }
}

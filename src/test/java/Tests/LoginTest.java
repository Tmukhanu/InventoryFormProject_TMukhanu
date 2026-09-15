package Tests;

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

    @Test(priority = 4)
    public void verifyLoginSuccess() {
        landingPage.verifyLoginSuccess();
    }

    @Test(priority = 5)
    public void ClickLearnButton() {
        inventoryForm.ClickLearnButton();
    }

    @Test(priority = 6)
    public void ClickLearningMaterialsButton() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.ClickLearningMaterialsButton();
    }
    @Test(priority = 7)
public void ClickWebAutomationAdvanceButton() {
        inventoryForm.ClickWebAutomationAdvanceButton();
    }
//    @Test(priority = 8)
//    public void ClickDeviceTypeDropDown() {
//        inventoryForm.ClickDeviceTypeDropDown();
//    }
    @Test(priority = 8)
    public void SelectDeviceType() {
        inventoryForm.SelectDeviceType();
    }
}



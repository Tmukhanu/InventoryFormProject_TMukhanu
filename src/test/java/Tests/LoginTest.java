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

    @Test(priority = 8)
    public void SelectDeviceType() {
        inventoryForm.SelectDeviceType();
    }

    @Test(priority = 9)
    public void SelectBrand() {
        inventoryForm.SelectBrand();
    }
    @Test(priority = 10)
    public void SelectStorage() {
        inventoryForm.SelectStorage();
    }
    @Test(priority = 11)
    public void SelectColor(){
        inventoryForm.SelectColor();
    }
}



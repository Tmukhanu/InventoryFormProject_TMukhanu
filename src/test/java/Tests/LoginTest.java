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
    public void ClickWebAutomationAdvanceButton() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.ClickWebAutomationAdvanceButton();

    }

    @Test(priority = 8)
    public void SelectDeviceType() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.SelectDeviceType();
    }

    @Test(priority = 9)
    public void SelectBrand() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.SelectBrand();
    }
    @Test(priority = 10)
    public void SelectStorage() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.SelectStorage();
    }
    @Test(priority = 11)
    public void SelectColor() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.SelectColor();
    }
    @Test(priority = 12)
    public void SelectQuantity() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.SelectQuantity();
    }
    @Test(priority = 13)
    public void EnterAddress() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.EnterAddress();
    }
    @Test(priority = 14)
    public void ClickNextButton() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.ClickNextButton();
    }
    @Test(priority = 15)
    public void SelectShippingMethod() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.SelectShippingMethod();
    }
    @Test(priority = 16)
public void WarrantyOption() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.WarrantyOption();
    }
    @Test(priority = 17)
    public void EnterDiscountCode() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.EnterDiscountCode();
    }
}



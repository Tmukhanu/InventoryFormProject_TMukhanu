package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GoToInventoryPage {
    WebDriver driver;

    public GoToInventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickLearnButton() {
        WebElement learnButton = driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]"));
        learnButton.click();

    }

    public void ClickLearningMaterialsButton() throws InterruptedException {
        WebElement learningMaterialButton = driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]"));
        learningMaterialButton.click();
    }

    @FindBy(id = "tab-btn-web")
    WebElement webAutomationAdvanceButton;

    public void ClickWebAutomationAdvanceButton() {
        webAutomationAdvanceButton.click();
    }

    public void SelectDeviceType() {
        WebElement dropdown_element = driver.findElement(By.id("deviceType"));
        Select Select_device = new Select(dropdown_element);
        Select_device.selectByVisibleText("Phone");

    }

    public void SelectBrand() {
        WebElement dropdown_element = driver.findElement(By.id("brand"));
        Select Select_brand = new Select(dropdown_element);
        Select_brand.selectByVisibleText("Apple");
    }

    public void SelectStorage() {
        WebElement StorageRadioButton = driver.findElement(By.xpath("//span[text()='128GB']"));
        StorageRadioButton.click();
    }

    public void SelectColor() {
        WebElement dropdown_element = driver.findElement(By.id("color"));
        Select Select_color = new Select(dropdown_element);
        Select_color.selectByVisibleText("Blue");
    }

    public void SelectQuantity() {
        WebElement NumberInput = driver.findElement(By.id("quantity"));
        NumberInput.clear();
        NumberInput.sendKeys("2");
    }

    public void EnterAddress() {
        WebElement AddressInputBox = driver.findElement(By.id("address"));
        AddressInputBox.sendKeys("123 Test Street");
    }

    public void ClickNextButton() {
        WebElement NextButton = driver.findElement(By.id("inventory-next-btn"));
        NextButton.click();
    }

    public void SelectShippingMethod() {
        WebElement ShippingMethodRadioButton = driver.findElement(By.id("shipping-option-express"));
        ShippingMethodRadioButton.click();
    }

    public void WarrantyOption() {
        WebElement WarrantyOptionRadioButton = driver.findElement(By.id("warranty-option-1yr"));
        WarrantyOptionRadioButton.click();
    }

    public void EnterDiscountCode() {
        WebElement DiscountCodeInputBox = driver.findElement(By.id("discount-code"));
        DiscountCodeInputBox.sendKeys("SAVE10");
    }

    public void ClickApplyDiscountButton() {
        WebElement ApplyDiscountButton = driver.findElement(By.id("apply-discount-btn"));
        ApplyDiscountButton.click();

    }

    public void ClickConfirmPurchaseButton() {
        WebElement ConfirmPurchaseButton = driver.findElement(By.id("add-to-cart-btn"));
        ConfirmPurchaseButton.click();
    }
public void ReviewCart() {
        WebElement ReviewCartButton = driver.findElement(By.id("review-cart-btn"));
        ReviewCartButton.click();
    }
    public void PlaceOrder() {
        WebElement PlaceOrderButton = driver.findElement(By.id("confirm-cart-btn"));
        PlaceOrderButton.click();
    }
    public void ViewInvoiceDetails() {
        WebElement ViewInvoiceButton = driver.findElement(By.id("view-history-btn"));
        ViewInvoiceButton.click();
    }
public void ViewInvoiceHistory() {
    WebElement viewHistoryButton = driver.findElement(
            By.cssSelector("[id*='view-invoice']")
    );
    viewHistoryButton.click();
    }
}



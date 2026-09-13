package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoToInventoryPage {
    WebDriver driver;

    public GoToInventoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickLearnButton () {
        WebElement learnButton = driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]"));
        learnButton.click();

    }
    public void ClickLearningMaterialsButton () throws InterruptedException {
        WebElement learningMaterialButton = driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]"));
        learningMaterialButton.click();
    }
    @FindBy(id="tab-btn-web")
    WebElement webAutomationAdvanceButton;

    public void ClickWebAutomationAdvanceButton()
    {
        webAutomationAdvanceButton.click();
    }
}

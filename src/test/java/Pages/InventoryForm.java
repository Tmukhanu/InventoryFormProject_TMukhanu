package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryForm {
    WebDriver driver;

    public InventoryForm(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickLearnButton () {
        WebElement learnButton = driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]"));
        learnButton.click();

    }
    public void ClickLearningMaterialsButton () {
        WebElement learningMaterialButton = driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]"));
        learningMaterialButton.click();
    }
}

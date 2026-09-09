package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "login-email")
    WebElement usernameField;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    @FindBy(id = "login-password")
    WebElement passwordField;

    public void enterPassword(String password) {
        passwordField.sendKeys(password);

    }

    @FindBy(id = "login-submit")
    WebElement loginSubmitButton;

    public void clickLoginSubmitButton() {
        loginSubmitButton.click();
    }
}


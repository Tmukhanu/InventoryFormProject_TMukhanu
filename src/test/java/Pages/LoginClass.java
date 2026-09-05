package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginClass {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://ndosisimplifiedautomation.vercel.app/#dashboard");
        driver.manage().window().maximize();
    }

    @Test
    public void ClickLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
    }

    @Test(dependsOnMethods = {"ClickLoginButton"})
    public void EnterUserName() throws InterruptedException {
        driver.findElement(By.id("login-email")).sendKeys("mukhanu2@gmail.com");
    }

    @Test(dependsOnMethods = {"EnterUserName"})
    public void EnterPassword() throws InterruptedException {
        driver.findElement(By.id("login-password")).sendKeys("@123456789");
    }

    @Test(dependsOnMethods = {"EnterPassword"})
    public void ClickLoginSubmitButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = {"ClickLoginSubmitButton"})
    public void VerifyLoginSuccess() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[3]/button/span[2]")).isDisplayed();
        }

        @AfterTest
        public void quit(){
            driver.quit();
        }
    }


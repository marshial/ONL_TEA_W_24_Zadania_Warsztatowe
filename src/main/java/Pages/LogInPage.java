package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    private WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logIn(String email, String passwd){
        WebElement loginInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement signInButton = driver.findElement(By.id("submit-login"));

        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.sendKeys(passwd);

        signInButton.click();
    }
}

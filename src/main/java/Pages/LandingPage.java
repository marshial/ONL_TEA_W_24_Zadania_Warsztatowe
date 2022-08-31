package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    final WebDriver driver;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignInButton(){
        WebElement signInButton = driver.findElement(By.className("user-info"));
        signInButton.click();
    }

    public void chooseSweater() {
        WebElement sweater = driver.findElement(By.xpath("//*[text() = 'Hummingbird printed sweater']"));
        sweater.click();
    }
}

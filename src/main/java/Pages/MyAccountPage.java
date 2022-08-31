package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAdressButton(){
        WebElement adressButton = driver.findElement(By.id("addresses-link"));

        adressButton.click();
    }

    public void returnToHomePage() {
        WebElement logo = driver.findElement(By.id("_desktop_logo"));
        logo.click();
    }
}

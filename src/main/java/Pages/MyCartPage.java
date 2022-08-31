package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCartPage {
    private WebDriver driver;

    public MyCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProceedToCheckout() {
        WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//*[text() = 'Proceed to checkout']"));
        proceedToCheckoutButton.click();
    }
}

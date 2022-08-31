package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HummingbirdPrintedSweaterPage {
    private WebDriver driver;

    public HummingbirdPrintedSweaterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseSize(String size) {
        WebElement sizeDropdown = driver.findElement(By.name("group[1]"));
        Select select = new Select(sizeDropdown);
        select.selectByVisibleText(size);
    }

    public void chooseQuantity(String arg1) throws InterruptedException {
        WebElement quantityInput = driver.findElement(By.id("quantity_wanted"));

        quantityInput.click();
        quantityInput.clear();
        quantityInput.sendKeys(arg1);

    }

    public void clickAddToCart() {
        WebElement addToCartButton = driver.findElement(By.cssSelector("button.add-to-cart"));
        addToCartButton.click();
    }

    public void clickCart() {
        driver.navigate().back();
        WebElement cartButton = driver.findElement(By.cssSelector("div.blockcart"));
        cartButton.click();
    }
}

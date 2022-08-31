package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAddressFormular {
    private WebDriver driver;

    public NewAddressFormular(WebDriver driver) {
        this.driver = driver;
    }
    public void fillNewAddressFormular(String alias, String address, String city, String postalcode, String phone) throws InterruptedException {
        WebElement alliasInput = driver.findElement(By.name("alias"));
        WebElement addressInput = driver.findElement(By.name("address1"));
        WebElement cityInput = driver.findElement(By.name("city"));
        WebElement postalCodeInput = driver.findElement(By.name("postcode"));
        WebElement countryInput = driver.findElement(By.name("id_country"));
        WebElement phoneInput = driver.findElement(By.name("phone"));
        WebElement saveButton = driver.findElement(By.className("btn btn-primary float-xs-right"));


        alliasInput.click();
        alliasInput.clear();
        alliasInput.sendKeys(alias);

        addressInput.click();
        addressInput.clear();
        addressInput.sendKeys(address);

        cityInput.click();
        cityInput.clear();
        cityInput.sendKeys(city);

        postalCodeInput.click();
        postalCodeInput.clear();
        postalCodeInput.sendKeys(postalcode);

        countryInput.click();
        countryInput.submit();

        phoneInput.click();
        phoneInput.clear();
        phoneInput.sendKeys(phone);

        saveButton.click();
    }
}

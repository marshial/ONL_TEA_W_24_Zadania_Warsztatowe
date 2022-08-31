package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesPage {
    private WebDriver driver;


    public AddressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreateNewAdressButton(){
        WebElement createNewAdressButton = driver.findElement(By.partialLinkText("Create new address"));

        createNewAdressButton.click();
    }

    public boolean checkIsNewAddressAdded(String alias){
        WebElement addressBody = driver.findElement(By.className("address-body"));
        String addressBodyText = addressBody.getText();

        if (addressBodyText.contains(alias)){
            return true;
        } else {
            return false;
        }
    }
}

package TestSteps;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AddAdressTestSteps {

    private static WebDriver driver;


    @Given("User is on the {string} website")
    public void userIsOnTheWebsite(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("User clicks on sign in button")
    public void userClicksOnSignInButton() throws InterruptedException {
        LandingPage onLandingPage = new LandingPage(driver);
        onLandingPage.clickSignInButton();
        Thread.sleep(2000);
    }

    @And("User logs in")
    public void userLogsIn() {
        String email = "glvjupczdmdfsbanjf@nthrl.com";
        String passwd = "qwerty123";
        LogInPage onLogInPage = new LogInPage(driver);
        onLogInPage.logIn(email, passwd);
    }

    @And("User clicks on Addresses button")
    public void userClicksOnAddressesButton() {
        MyAccountPage onMyAccountPage = new MyAccountPage(driver);
        onMyAccountPage.clickAdressButton();
    }

    @And("User clicks on Create new address button")
    public void userClicksOnCreateNewAddressButton() {
        AddressesPage onAddressesPage = new AddressesPage(driver);
        onAddressesPage.clickCreateNewAdressButton();
    }

    @And("User fills in fields: {string}, {string}, {string}, {string}, {string} and clicks in Save button")
    public void userFillsInFieldsAndClicksInSaveButton(String alias, String address, String city, String postalCode, String phone) throws InterruptedException {
        NewAddressFormular onNewAddressFormular = new NewAddressFormular(driver);
        onNewAddressFormular.fillNewAddressFormular(alias, address, city, postalCode, phone);
    }

    @Then("New address is added and address is correct")
    public void newAddressIsAddedAndAddressIsCorrect(String alias) {
        AddressesPage onAddressesPage = new AddressesPage(driver);
        Assert.isTrue(onAddressesPage.checkIsNewAddressAdded(alias), "Check address is failed");
    }


}

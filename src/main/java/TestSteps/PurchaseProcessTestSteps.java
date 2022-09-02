package TestSteps;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PurchaseProcessTestSteps {

    private static WebDriver driver;

    @Given("logged user with deliver address added is on the {string} website")
    public void loggedUserWithDeliverAddressAddedIsOnTheWebsite(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);

        LandingPage onLandingPage = new LandingPage(driver);
        onLandingPage.clickSignInButton();

        String email = "glvjupczdmdfsbanjf@nthrl.com";
        String passwd = "qwerty123";

        LogInPage onLogInPage = new LogInPage(driver);
        onLogInPage.logIn(email, passwd);

        MyAccountPage onMyAccountPage = new MyAccountPage(driver);
        onMyAccountPage.returnToHomePage();
    }

    @When("user clicks Hummingbird Printed Sweater")
    public void userClicksHummingbirdPrintedSweater() {
        LandingPage onLandingPage = new LandingPage(driver);
        onLandingPage.chooseSweater();
    }

    @And("chooses size {string} and quantity {string}")
    public void choosesSizeAndQuantity(String arg0, String arg1) throws InterruptedException {
        HummingbirdPrintedSweaterPage onHummingbirdPrintedSweaterPage = new HummingbirdPrintedSweaterPage(driver);
        onHummingbirdPrintedSweaterPage.chooseSize(arg0);
        Thread.sleep(2000);
        onHummingbirdPrintedSweaterPage.chooseQuantity(arg1);
    }

    @And("clicks Add to cart button and Proceed to Checkout button")
    public void clicksAddToCartButtonAndProceedToCheckoutButton() {
        HummingbirdPrintedSweaterPage onHummingbirdPrintedSweaterPage = new HummingbirdPrintedSweaterPage(driver);
        onHummingbirdPrintedSweaterPage.clickAddToCart();
        onHummingbirdPrintedSweaterPage.clickCart();

        MyCartPage onMyCartPage = new MyCartPage(driver);
        onMyCartPage.clickProceedToCheckout();
    }

    @And("confirms address")
    public void confirmsAddress() {
        CheckOutPage onCheckOutPage = new CheckOutPage(driver);
        onCheckOutPage.confirmAddress();
    }

    @And("chooses Pick-up in store delivery method")
    public void choosesPickUpInStoreDeliveryMethod() {
        CheckOutPage onCheckOutPage = new CheckOutPage(driver);
        onCheckOutPage.chooseDelivery();
    }

    @And("chooses Pay by Check method and clicks Order button")
    public void choosesPayByCheckMethodAndClicksOrderButton() {
        CheckOutPage onCheckOutPage = new CheckOutPage(driver);
        onCheckOutPage.paymentMethod();
        onCheckOutPage.clickOrder();
    }

    @Then("user confirmed shopping and made screenshot")
    public void userConfirmedShoppingAndMadeScreenshot() throws IOException {
        ConfirmationPage onConfirmationPage = new ConfirmationPage(driver);
        onConfirmationPage.screenShot();
        onConfirmationPage.fullScreenShot();
    }

}

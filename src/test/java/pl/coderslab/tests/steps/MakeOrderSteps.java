package pl.coderslab.tests.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.tests.pages.*;

import java.util.concurrent.TimeUnit;

public class MakeOrderSteps {
    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    UserPage userPage;
    ItemPage itemPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    OrderPage orderPage;


    @Given("^User is logged in to (.*)$")
    public void UserIsLoggedIn(String webAddress) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(webAddress);
        mainPage = new MainPage(driver);
        loginPage = mainPage.GoToUserLoginPage();
        userPage = loginPage.loginAs("hlahvndnrkfxmtryyc@uivvn.net", "testpass");
        mainPage = userPage.goToMainPage();
    }

    @When("^User click on item (.*)$")
    public void userClickOnItem(String item) {
        itemPage = mainPage.GoToItem(item);
    }

    @And("^User check discount equals (\\d+)%$")
    public void userCheckDiscountEquals(int arg0) {
        itemPage.discountCheck();

    }

    @And("^User choose size as (.*)$")
    public void userChooseSize(String size) {
        itemPage.chooseSize(size);
    }


    @And("^User choose quantity as (.*)$")
    public void userChooseQuantityAsQuantity(int quantity) {
        itemPage.chooseQuantity(quantity);
    }

    @And("^Add item do cart$")
    public void addItemDoCart() {
        itemPage.addToCart();
    }

    @And("^User goes to checkout$")
    public void userGoesToCheckout() {
        cartPage = itemPage.proceedToCheckout();
        checkoutPage = cartPage.proceedToCheckout();
    }

    @And("^User confirm address$")
    public void userConfirmAddress() {
        checkoutPage.confirmAddress();
    }

    @And("^User choose shipping method as Pick up in-store$")
    public void userChooseShippingMethodAsPickUpInStore() {
        checkoutPage.collectInStore();
    }

    @And("^User choose payment method as Pay by Check$")
    public void userChoosePaymentMethodAsPayByCheck() {
        checkoutPage.payByCheck();
    }

    @And("^User click on button Order with an obligation to pay$")
    public void userClickOnButtonToFinishOrder() {
        orderPage = checkoutPage.confirmOrder();
    }

    @Then("^User makes screenshot with order and price$")
    public void userMakesScreenshotWithOrderAndPrice() throws Exception {
        orderPage.takeSnapShot();
    }

    @And("^Close browser$")
    public void closeBrowser() {
        driver.quit();
    }
}

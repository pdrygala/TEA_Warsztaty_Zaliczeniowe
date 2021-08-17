package pl.coderslab.tests.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.tests.pages.*;

import java.util.concurrent.TimeUnit;

public class AddAddressSteps {
    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    UserPage userPage;
    AddressesPage addressesPage;
    CreateAddressPage createAddressPage;


    @Given("User is logged in (.*) on User Page")
    public void UserIsLoggedIn(String webAddress) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(webAddress);
        mainPage = new MainPage(driver);
        loginPage = mainPage.GoToUserLoginPage();
        userPage = loginPage.loginAs("hlahvndnrkfxmtryyc@uivvn.net", "testpass");
    }

    @When("^User goes to address page$")
    public void userGoesToAddressPage() {
        addressesPage = userPage.goToAddressesLink();

    }

    @And("^User goes to create new address link$")
    public void userGoesToCreateNewAddress(){
        createAddressPage = addressesPage.createAddress();
    }

    @And("^User input information (.*), (.*), (.*), (.*), (.*) and (.*)$")
    public void userInputInformation(String alias,
                                     String address,
                                     String city,
                                     String postCode,
                                     String country,
                                     String phone) {
        createAddressPage.fillAddressInfo(alias,address,city,postCode,country,phone);
    }

    @And("^User saves information$")
    public void userSavesInformation() {
        createAddressPage.submitAddress();

    }

    @Then("^User sees \"([^\"]*)\"$")
    public void userSees(String expected){
        Assert.assertEquals(expected, addressesPage.getAlertText());

    }
    @And("^User check address information (.*), (.*), (.*), (.*), (.*) and (.*)$")
    public void userCheckAddressInformation(String alias,
                                            String address,
                                            String city,
                                            String postCode,
                                            String country,
                                            String phone) {
        Assert.assertTrue(addressesPage.checkAddressInfo(alias,address,city,postCode,country,phone));
    }

    @And("^Close shop page$")
    public void closeShopPage() {
        driver.quit();
    }


}

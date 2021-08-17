package pl.coderslab.tests.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.tests.pages.AddressesPage;
import pl.coderslab.tests.pages.LoginPage;
import pl.coderslab.tests.pages.MainPage;
import pl.coderslab.tests.pages.UserPage;

import java.util.concurrent.TimeUnit;

public class DeleteAddressSteps {
    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    UserPage userPage;
    AddressesPage addressPage;

    @Given("User is logged to (.*) on UserPage")
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

    @When("^User goes to Addresses Page$")
    public void userGoesToAddressesPage() {
        addressPage=userPage.goToAddressesLink();

    }

    @And("^User delete address with alias \"([^\"]*)\"$")
    public void userDeleteAddress(String alias) {
        addressPage.deleteAddress(alias);

    }

    @Then("^User sees alert \"([^\"]*)\"$")
    public void userSeesAlert(String expected) {
        Assert.assertEquals(expected,addressPage.getAlertText());
    }

    @And("^Close page$")
    public void closePage() {
        driver.quit();
    }
}

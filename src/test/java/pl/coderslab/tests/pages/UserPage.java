package pl.coderslab.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
    private final WebDriver driver;

    @FindBy(className = "logo")
    private WebElement mainLogo;

    @FindBy(id = "address-link")
    private WebElement addressLink;

    @FindBy(id = "addresses-link")
    private WebElement addressesLink;

    public UserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage goToMainPage(){
        mainLogo.click();
        return new MainPage(driver);
    }

//    public AddressesPage goToAddressLink() {
//        addressLink.click();
//        return new AddressesPage(driver);
//    }

    public AddressesPage goToAddressesLink(){
        addressesLink.click();
        return new AddressesPage(driver);
    }
}

package pl.coderslab.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAddressPage {
    private final WebDriver driver;

    @FindBy(name = "alias")
    private WebElement aliasInput;

    @FindBy(name = "address1")
    private WebElement addressInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "postcode")
    private WebElement postalCodeInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(name = "id_country")
    private WebElement countrySelect;

    @FindBy(xpath = "//button[contains(text(),\"Save\")]")
    private WebElement submitButton;

    public CreateAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillAddressInfo(String alias, String address, String city, String postCode, String country, String phone) {
        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        postalCodeInput.sendKeys(postCode);

        countrySelect.click();
        Select countryInput = new Select(driver.findElement(By.name("id_country")));
        countryInput.selectByVisibleText(country);

        phoneInput.sendKeys(phone);

    }

    public AddressesPage submitAddress() {
        submitButton.click();
        return new AddressesPage(driver);
    }

}

package pl.coderslab.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private final WebDriver driver;

    @FindBy(name = "confirm-addresses")
    WebElement confirmAddressButton;

    @FindBy(id = "delivery_option_1")
    WebElement pickUpInStoreRadio;

    @FindBy(name = "confirmDeliveryOption")
    WebElement confirmDeliveryButton;

    @FindBy(id = "payment-option-1")
    WebElement paymentOptionByCheckRadio;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    WebElement conditionsToApproveButton;

    @FindBy(xpath = "//div[@id='payment-confirmation']//button")
    WebElement confirmationButton;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void confirmAddress(){
        confirmAddressButton.click();
    }

    public void collectInStore(){
        if (!pickUpInStoreRadio.isSelected()) pickUpInStoreRadio.click();
        confirmDeliveryButton.click();
    }
    public void payByCheck(){
        if (!paymentOptionByCheckRadio.isSelected()) paymentOptionByCheckRadio.click();
    }
    public OrderPage confirmOrder(){
        conditionsToApproveButton.click();
        confirmationButton.click();
        return new OrderPage(driver);
    }
}

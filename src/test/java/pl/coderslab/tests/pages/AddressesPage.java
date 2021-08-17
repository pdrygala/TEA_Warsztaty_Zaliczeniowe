package pl.coderslab.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddressesPage {
    private final WebDriver driver;

    @FindBy(className = "alert")
    private WebElement alert;

    @FindBy(xpath = "//div[@class='addresses-footer']/a")
    private WebElement createNewAddressLink;

    @FindBy(xpath = "//span[contains(text(),\"Delete\")]/..")
    private WebElement deleteAddressLink;


    public AddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CreateAddressPage createAddress(){
        createNewAddressLink.click();
        return new CreateAddressPage(driver);
    }

    public String getAlertText() {
        return alert.getText();
    }

    public boolean checkAddressInfo(String alias, String address, String city, String postCode, String country, String phone) {


        String aliasText = driver.findElement(By.xpath(String.format("//h4[text()='%s']",alias))).getText();
        if (!aliasText.contains(alias)) return false;


        String temp = driver.findElement(By.xpath(String.format("//h4[text()='%s']/following-sibling::address",alias))).getText();
        String[] tempArr = {address, city, postCode, country, phone};

        for (String s: tempArr){
            if(!temp.contains(s)){
                return false;
            }
        }
        return true;
    }

    public void deleteAddress(String addressAlias) {
    WebElement deleteButton = driver.findElement(By.xpath(String.format("//h4[text()='%s']/../following-sibling::div/a/span[contains(text(),'Delete')]",addressAlias)));
    deleteButton.click();
    }



}

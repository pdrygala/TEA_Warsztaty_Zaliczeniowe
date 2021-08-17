package pl.coderslab.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(className = "current-price")
    WebElement currentPrizeText;

    @FindBy(className = "regular-price")
    WebElement regularPrizeText;

    @FindBy(id = "group_1")
    WebElement sizeSelect;

    @FindBy(id = "quantity_wanted")
    WebElement quantityInput;

    @FindBy(className = "add-to-cart")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='cart-content-btn']/a")
    WebElement proceedToCheckoutButton;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 5);
    }

    public void discountCheck() {
        String currentPrize = currentPrizeText.getText();
        if (currentPrize.contains(" ")) {
            currentPrize = currentPrize.substring(1, currentPrize.indexOf(" "));
        }

        String regularPrize = regularPrizeText.getText();
        if (regularPrize.contains(" ")) {
            regularPrize = regularPrize.substring(1, regularPrize.indexOf(" "));
            System.out.println(regularPrize);
        }
        regularPrize = regularPrize.substring(1);
        double discount = Double.parseDouble(currentPrize) / Double.parseDouble(regularPrize) *100;
        Assert.assertEquals(20, 100 - discount, 0);
    }

    public void chooseSize(String size) {
        sizeSelect.click();
        Select sizeInput = new Select(driver.findElement(By.id("group_1")));
        sizeInput.selectByVisibleText(size);
    }

    public void chooseQuantity(int quantity) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("product-unavailable")));
        for (int i = 1; i < quantity; i++) {
            quantityInput.sendKeys(Keys.ARROW_UP);
        }
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public CartPage proceedToCheckout() {
        wait.until(ExpectedConditions.visibilityOf(proceedToCheckoutButton));
        proceedToCheckoutButton.click();
        return new CartPage(driver);
    }
}

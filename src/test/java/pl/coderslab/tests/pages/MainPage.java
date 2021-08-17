package pl.coderslab.tests.pages;

import gherkin.lexer.It;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private final WebDriver driver;

    @FindBy(className = "user-info")
    private WebElement userLoginLink;

    @FindBy(className = "account")
    private WebElement userPageLink;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage GoToUserLoginPage() {
        userLoginLink.click();
        return new LoginPage(driver);
    }

    public UserPage GoToUserPage() {
        userLoginLink.click();
        return new UserPage(driver);
    }

    public ItemPage GoToItem(String item) {
        WebElement itemToClick = driver.findElement(By.xpath(String.format("//a[text()='%s']", item)));
        itemToClick.click();
        return new ItemPage(driver);
    }
}

package pl.coderslab.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private final WebDriver driver;

    @FindBy(name = "email")
    private WebElement loginInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit-login")
    private WebElement signInBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public UserPage loginAs(String email, String password) {
        loginInput.clear();
        loginInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        signInBtn.click();
        return new UserPage(driver);
    }
}

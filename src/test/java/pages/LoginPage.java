package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DocumentUtils;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name=\"username\"]")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement button;
    @FindBy(xpath = "//span[@class=\"oxd-userdropdown-tab\"]")
    private WebElement userDropDown;
    @FindBy(xpath = "//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]")
    private WebElement loginMessage;
    @FindBy(xpath = "//div[@class=\"oxd-alert oxd-alert--error\"]")
    private WebElement errorMessage;
    @FindBy(xpath ="//ul[@role='menu']")
    private WebElement dropdown;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUsernameField() {
        usernameField.sendKeys(DocumentUtils.getPropertiesFile().getProperty("usernameField"));
    }
    public void setUsernameWrong(){
        usernameField.sendKeys(DocumentUtils.getPropertiesFile().getProperty("usernameFieldWrong"));
    }

    public void setPasswordField() {
        passwordField.sendKeys(DocumentUtils.getPropertiesFile().getProperty("passwordField"));
    }
    public void setPasswordWrong(){
        passwordField.sendKeys(DocumentUtils.getPropertiesFile().getProperty("passwordFieldWrong"));
    }

    public void clickButton() {
        button.click();
    }

    public boolean isDropdownDisplayed() {
        waitUntilVisible(userDropDown);
        userDropDown.click();
        waitUntilVisible(dropdown);
        return dropdown.isDisplayed();
    }

    public boolean isLoginSuccessful() {
        return loginMessage.isDisplayed();
    }

    public boolean verifyErrorMessage() {
        return errorMessage.isDisplayed();
    }

}

package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DocumentUtils;

import java.util.List;

public class ChangePassword extends BasePage {
    @FindBy(xpath = "//i[@class = \"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")
    private WebElement arrowUser;
    @FindBy(xpath = "//a[@class = \"oxd-userdropdown-link\"]")
    private List<WebElement> changePassword;
    @FindBy(xpath = "//input[@type =\"password\"]")
    private List<WebElement> passwordFields;
    @FindBy(xpath = "//button[@class =\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
    private WebElement buttSave;
    @FindBy(xpath = "//div[@class =\"oxd-toast oxd-toast--success oxd-toast-container--toast\"]")
    private WebElement sucMessage;


    public ChangePassword(WebDriver driver) {
        super(driver);
    }

    public void clickArrowUser() {
        arrowUser.click();
    }

    public void selectChangePass() {
        changePassword.get(2).click();
    }

    public void enterCurrentPass() {
        passwordFields.get(0).sendKeys(DocumentUtils.getPropertiesFile().getProperty("passwordField"));
    }

    public void enterNewPass() {
        passwordFields.get(1).sendKeys(DocumentUtils.getPropertiesFile().getProperty("passwordField"));

    }

    public void enterConfirmPass() {
        passwordFields.get(2).sendKeys(DocumentUtils.getPropertiesFile().getProperty("passwordField"));

    }

    public void pressSave() {
        buttSave.click();
    }

    public boolean verifySucMessage() {
        return sucMessage.isDisplayed();

    }

}

package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public class MyInfoPage extends BasePage {
    @FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")
    private List<WebElement> selectMyInfo;
    @FindBy(xpath = "//a[@class=\"orangehrm-tabs-item\"]")
    private List<WebElement> infoList;
    @FindBy(xpath = "(//div[@class=\"oxd-form-row\"]//input)[1]")
    private WebElement street1;
    @FindBy(xpath = "//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")
    private WebElement selectCountryArrow;
    @FindBy(xpath = "//div[@class= \"oxd-select-option\"]//span[text()=\"Algeria\"]")
    private WebElement countryAlgeria;
    @FindBy(xpath = "//form[@class= \"oxd-form\"]")
    private WebElement myForm;
    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
    private List<WebElement> saveButton;
    @FindBy(xpath = "//div[@class=\"oxd-toast oxd-toast--success oxd-toast-container--toast\"]")
    private WebElement successMessage;
    @FindBy(xpath = "//button[@class = \"oxd-button oxd-button--medium oxd-button--text\"]")
    private WebElement addAtach;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement browseButton;
    @FindBy(xpath = "//textarea[@class = \"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")
    private WebElement addComment;
    @FindBy(xpath = "//div[@class =\"oxd-table-cell oxd-padding-cell\"]//div[text()=\"Screenshot 2023-09-06 at 11.38.35.png\"]")
    private WebElement attach;
    @FindBy(xpath = "//span[@class = \"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"]")
    private List<WebElement> checkbox;
    @FindBy(xpath = "//button[@class =\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin\"]")
    private WebElement delete;
    @FindBy(xpath = "//button[@class =\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]")
    private WebElement confirmDeleteButton;
    @FindBy(xpath = "//p[@class =\"oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text\"]")
    private WebElement successDelete;


    public MyInfoPage(WebDriver driver) {
        super(driver);
    }

    public void goToMyInfoPage() {

        selectMyInfo.get(5).click();
    }

    public void selectContactDetails() {
        infoList.get(0).click();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].reset();", myForm);
    }

    public void addStreet1() {
        fluentWaitUntilCondition(ExpectedConditions.textToBePresentInElementValue(street1, ""));
        street1.click();
        street1.sendKeys("Angela mo1");
    }

    public void selectCountryArrow() {
        selectCountryArrow.click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void selectCountry() {
        waitUntilVisible(countryAlgeria);
        countryAlgeria.click();
    }

    public void saveButtonClick() {

        saveButton.get(0).click();
    }

    public boolean verifySuccessMessage() {

        return successMessage.isDisplayed();
    }

    public void addAtachbutt() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,380)");
        addAtach.click();
    }

    public void browseIconCLick() {
        browseButton.sendKeys("/Users/bichira/AutomationProgram/automation-learning/src/test/resources/utils/Screenshot 2023-09-06 at 11.38.35.png");
    }


    public void addCommentBox() {
        addComment.sendKeys("Comment");
    }

    public void saveButtAtach() {
        saveButton.get(1).click();
    }

    public boolean verifyAttachisthere() {
        return attach.isDisplayed();
    }

    public void selectCheckbox() {
        checkbox.get(1).click();
    }

    public void pressDeleteButton() {
        delete.click();
    }

    public void pressConfirmDeleteButton() {
        confirmDeleteButton.click();
    }

    public boolean showSuccessDelete() {
        return successDelete.isDisplayed();
    }

}

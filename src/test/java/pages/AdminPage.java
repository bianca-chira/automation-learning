package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class AdminPage extends BasePage {

    @FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")
    private List<WebElement> selectAdmin;
    @FindBy(xpath = "//span[@class = \"oxd-topbar-body-nav-tab-item\"]")
    private List<WebElement> selectDropdown;
    @FindBy(xpath = "//a[@class = \"oxd-topbar-body-nav-tab-link\"]")
    private List<WebElement> selectLanguage;
    @FindBy(xpath = "//button[@class = \"oxd-button oxd-button--medium oxd-button--text oxd-table-cell-action-space\"]")
    private List<WebElement> buttonTranslate;
    @FindBy(xpath = "//h5[@class = \"oxd-text oxd-text--h5 oxd-table-filter-title\"]")
    private WebElement languageCustomization;
    @FindBy(xpath = "//button[@class = \"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement addButtonLanguage;
    @FindBy(xpath = "//div[@class = \"oxd-select-text--after\"]")
    private WebElement arrowSelectLanguage;
    @FindBy(xpath = "//div[@class = \"oxd-select-option\"][2]")
    private WebElement selectNewLanguage;
    @FindBy(xpath = "//button[@class = \"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private List<WebElement> saveButton;
    @FindBy(xpath = "//div[@class = \"oxd-toast oxd-toast--success oxd-toast-container--toast\"]")
    private WebElement successSaved;
    @FindBy(xpath = "//a[@class=\"oxd-topbar-body-nav-tab-link\"]")
    private List<WebElement> listJob;
    @FindBy(xpath = "//button[@class =\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement addJobButton;
    @FindBy(xpath = "//input[@class = \"oxd-input oxd-input--active\"]")
    private List<WebElement> jobTitle;
    @FindBy(xpath = "//textarea[@class = \"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")
    private List<WebElement> jobDescription;
    @FindBy(xpath = "//input[@type= \"file\"]")
    private WebElement browseSpecification;
    @FindBy(xpath = "//button[@class = \"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
    private WebElement saveJob;


    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public void goToAdmin() {
        selectAdmin.get(0).click();
    }

    public void clickConfiguration() {
        selectDropdown.get(4).click();
    }

    public void clickLanguage() {
        selectLanguage.get(3).click();
    }

    public void clickTranslateSpanish() {
        buttonTranslate.get(14).click();
    }

    public boolean getLanguageCustomization() {
        return languageCustomization.isDisplayed();
    }

    public void clickAddLanguage() {
        addButtonLanguage.click();
    }

    public void clickArrow() {
        arrowSelectLanguage.click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void selectLanguage() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        selectNewLanguage.click();
    }

    public void clickSaveButton() {
        saveButton.get(1).click();
    }


    public boolean successMessageAdded() {
        return successSaved.isDisplayed();
    }

    public void clickJob() {


        selectDropdown.get(1).click();
    }

    public void selectJobTitles() {

        listJob.get(0).click();
    }

    public void clickAddJob() {
        addJobButton.click();
    }

    public void addJobTitle() {
        jobTitle.get(1).sendKeys("Analyst");
    }

    public void addJobDescription() {
        jobDescription.get(0).sendKeys("Automation Tester");
    }

    public void addSpecificationJob() {
        browseSpecification.sendKeys("/Users/bichira/AutomationProgram/automation-learning/src/test/resources/utils/Screenshot 2023-09-06 at 11.38.35.png");
    }

    public void clickSaveJob() {
        saveJob.click();
    }


}

package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import java.time.Duration;


public class StepDefinition {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private MyInfoPage myInfo;
    private AdminPage adminPage;
    private ChangePassword changePassword;

    @Before
    public void before() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "/Users/bichira/AutomationProgram/automation-learning/chromedriver-mac-x64/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        homePage = PageFactory.initElements(driver, HomePage.class);
        myInfo = PageFactory.initElements(driver, MyInfoPage.class);
        adminPage = PageFactory.initElements(driver, AdminPage.class);
        changePassword = PageFactory.initElements(driver, ChangePassword.class);
    }

    @After
    public void after() {
        driver.quit();

    }


    @Given("I am on the login page")
    public void accessPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Assert.assertTrue("The login was not successful!", loginPage.isLoginSuccessful());
    }

    @When("I add the {} credentials to the login fields")
    public void addCredentials(String status) {
        if (status.equals("correct")) {
            loginPage.setUsernameField();
            loginPage.setPasswordField();
        } else if ("incorrect".equals(status)) {
            loginPage.setUsernameWrong();
            loginPage.setPasswordWrong();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @And("I click the login button")
    public void clickLoginButton() {
        loginPage.clickButton();
    }

    @Then("I am able to login {}")
    public void loginSuccess(String status) {
        if (status.equals("successfully")) {
            Assert.assertTrue("The dropdown is not displayed!", loginPage.isDropdownDisplayed());
        } else if (status.equals("unsuccessfully")) {
            Assert.assertTrue("The dropdown is not displayed!", loginPage.verifyErrorMessage());
        } else {
            throw new IllegalArgumentException();
        }
    }

    @And("I click the leave link from the menu")
    public void clickLeave() {
        homePage.clickLeavePage();
    }

    @And("I select the Rejected status from the 'Show Leave with Status' section")
    public void selectRejectedStatus() {
        homePage.showList();
        homePage.clickRejectedOption();
    }

    @And("I check that the Rejected status is present as a selection by using XPath selector")
    public void checkRejectedStatus() {
       Assert.assertTrue("Rejected Option was not selected",homePage.verifyRejected());
    }

    @And("I click the My Info option from the menu")
    public void clickMyInfo() {
        myInfo.goToMyInfoPage();
    }

    @And("I click on the Contact Details link which will redirect me to the contactDetails page")
    public void clickContactDetails() {
        myInfo.selectContactDetails();
    }

    @And("I update the Street 1 field from contact details")
    public void updateStreet1() {

        myInfo.addStreet1();
    }

    @And("I select Algeria as country")
    public void selectCountryAlgeria() {
        myInfo.selectCountryArrow();
        myInfo.selectCountry();
    }

    @And("I press the Save button")
    public void pressSaveButton() {
        myInfo.saveButtonClick();
    }

    @Then("I should see the successfully updated confirmation message")
    public void seeTheConfirmationMessage() {
       Assert.assertTrue("Not Updated", myInfo.verifySuccessMessage());

    }

    @And("I click the Add Attachments button")
    public void clickAddAtach() {
        myInfo.addAtachbutt();
    }

    @And("I select to upload a file")
    public void clickBrowseFile() {
        myInfo.browseIconCLick();


    }

    @And("I add a comment for this document uploaded in the comment field")
    public void addCommentForUpload() {
        myInfo.addCommentBox();

    }

    @And("I press the Save button for this attachment added")
    public void clickSaveButtAtach() {
        myInfo.saveButtAtach();

    }

    @Then("I am able to see my document added in the record found section by using css selector")
    public void seeDocumentUploaded() {
        Assert.assertTrue("Attach not displayed",myInfo.verifyAttachisthere());

    }

    @And("I tick the checkbox to select one record saved in the Records Found section")
    public void tickCheckbox() {
        myInfo.selectCheckbox();

    }

    @And("I press the Delete button to delete that record")
    public void selectDeleteButton() {
        myInfo.pressDeleteButton();


    }

    @And("I press Yes to confirm this deletion")
    public void pressYes() {
        myInfo.pressConfirmDeleteButton();

    }

    @Then("I should receive a confirmation message that the record has been deleted successfull")
    public void receiveConfirmationMessage() {
        Assert.assertTrue("Message not displayes",myInfo.showSuccessDelete());

    }

    @And("I click the Admin link from the menu")
    public void clickAdminLink() {
        adminPage.goToAdmin();

    }

    @And("I click on the Configuration dropdown menu button")
    public void clickConfigurationDropdown() {
        adminPage.clickConfiguration();

    }

    @And("I click on the Language Packages option")
    public void clickLanguageOption() {
        adminPage.clickLanguage();

    }

    @And("I click on the Translate button for Spanish - Español language package")
    public void translateSpanish() {
        adminPage.clickTranslateSpanish();

    }

    @Then("I should be redirected to the languageCustomization page")
    public void redirectToTheLanguageCustomization() {
        Assert.assertTrue("You are not redirected to the language customization page", driver.getCurrentUrl().contains("languageCustomization"));
    }

    @And("I click the Add button to add a new language to the packages")
    public void pressAddLanguageButton() {
        adminPage.clickAddLanguage();

    }

    @And("I select the language Colognian\\(Germany) from that list")
    public void iSelectTheLanguageColognianGermanyFromThatList() {
        adminPage.clickArrow();
        adminPage.selectLanguage();
    }

    @And("I press the Save to add this new language to my packages")
    public void pressSaveTheLanguage() {
        adminPage.clickSaveButton();

    }

    @Then("I should be able to see the confirmation message that the language was successfully saved")
    public void seeTheConfirmationMessageLanguage() {
        adminPage.successMessageAdded();
    }

    @And("I select the Change Password option from drop-down user profile menu")
    public void selectChangePassword() {
        changePassword.clickArrowUser();
        changePassword.selectChangePass();

    }

    @And("I enter the current password in the Current Password field")
    public void enterCurrentPassword() {
        changePassword.enterCurrentPass();

    }

    @And("I enter in the Password field a new password")
    public void enterNewPassword() {
        changePassword.enterNewPass();

    }

    @And("I confirm the new password")
    public void confirmNewPassword() {
        changePassword.enterConfirmPass();

    }

    @And("I press the Save button to update the password")
    public void pressSavePassword() {
        changePassword.pressSave();

    }

    @And("I should be able to see the confirmation message")
    public void userSeeSuccessMessage() {
        Assert.assertTrue("Not Saved",changePassword.verifySucMessage());
    }

    @And("I select the Job Titles option from the Job menu dropdown")
    public void selectJobTitles() {
        adminPage.clickJob();
        adminPage.selectJobTitles();

    }

    @And("I click the Add button to add a new job")
    public void clickAddANewJob() {
        adminPage.clickAddJob();

    }

    @And("I add a name for the job in the Job Title field")
    public void addNameForJob() {
        adminPage.addJobTitle();

    }

    @And("I add a job description")
    public void addJobDescription() {
        adminPage.addJobDescription();

    }

    @And("I add a Job Specification file")
    public void addJobSpecificationFile() {
        adminPage.addSpecificationJob();

    }

    @And("I click the Save button to add the new job")
    public void clickSaveNewJob() {
        adminPage.clickSaveJob();

    }

    @Then("I should see the confirmation message that the job was successfully added")
    public void seeJobConfirmation() {
        Assert.assertTrue("Not saved", adminPage.successMessageAdded());

    }

}

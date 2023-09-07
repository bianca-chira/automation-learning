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
import pages.HomePage;
import pages.LoginPage;
import pages.MyInfoPage;

import java.time.Duration;


public class StepDefinition {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private MyInfoPage myInfo;

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
        homePage = PageFactory.initElements(driver, HomePage.class);
        myInfo = PageFactory.initElements(driver, MyInfoPage.class);
    }

    @After
    public void after() {
        driver.quit();

    }


    @Given("I am on the login page")
    public void accessPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Assert.assertTrue("The login was not successful!",loginPage.isLoginSuccessful());
    }

    @When("I add the {} credentials to the login fields")
    public void addCredentials(String status) {
        if (status.equals("correct")) {
            loginPage.setUsernameField();
            loginPage.setPasswordField();
        } else {
           loginPage.setUsernameWrong();
           loginPage.setPasswordWrong();
        }
    }

    @And("I click the login button")
    public void clickLoginButton() {
        loginPage.clickButton();
    }

    @Then("I am able to login successfully")
    public void loginSuccess() {
        Assert.assertTrue("The dropdown is not displayed!",loginPage.isDropdownDisplayed());
    }

    @Then("I see the error message")
    public void seeErrorMessage(){
        loginPage.verifyErrorMessage();
    }

    @And("I click the leave link from the menu")
    public void clickLeave(){
        homePage.clickLeavePage();

    }
    @And("I select the Rejected status from the 'Show Leave with Status' section")
    public void selectRejectedStatus(){
        homePage.showList();
        homePage.clickRejectedOption();
    }
    @And("I check that the Rejected status is present as a selection by using XPath selector")
    public void checkRejectedStatus(){
        homePage.verifyRejected();
    }

    @And("I click the My Info option from the menu")
    public void clickMyInfo(){
        myInfo.goToMyInfoPage();
    }

    @And("I click on the Contact Details link which will redirect me to the contactDetails page")
    public void clickContactDetails(){
        myInfo.selectContactDetails();
    }

    @And("I update the Street 1 field from contact details")
    public void updateStreet1(){

        myInfo.addStreet1();
    }

    @And("I select Algeria as country")
    public void selectCountryAlgeria(){
        myInfo.selectCountryArrow();
        myInfo.selectCountry();
    }

    @And("I press the Save button")
    public void pressSaveButton(){
    myInfo.saveButtonClick();
    }

    @Then("I should see the successfully updated confirmation message")
    public void seeTheConfirmationMessage(){
        myInfo.verifySuccessMessage();

    }

    @And("I click the Add Attachments button")
    public void clickAddAtach(){
        myInfo.addAtachbutt();
    }

    @And("I select to upload a file")
    public void clickBrowseFile(){
        myInfo.browseIconCLick();


    }
    @And("I add a comment for this document uploaded in the comment field")
    public void addCommentForUpload(){
        myInfo.addCommentBox();

    }
    @And("I press the Save button for this attachment added")
    public void clickSaveButtAtach(){
        myInfo.saveButtAtach();

    }

    @Then("I am able to see my document added in the record found section by using css selector")
    public void seeDocumentUploaded(){
        myInfo.verifyAttachisthere();

    }

    @And("I tick the checkbox to select one record saved in the Records Found section")
    public void tickCheckbox(){
        myInfo.selectCheckbox();

    }

    @And("I press the Delete button to delete that record")
    public void selectDeleteButton(){
        myInfo.pressDeleteButton();


    }
    @And("I press Yes to confirm this deletion")
    public void pressYes(){
        myInfo.pressConfirmDeleteButton();

    }

    @Then("I should receive a confirmation message that the record has been deleted successfull")
    public void receiveConfirmationMessage(){
        myInfo.showSuccessDelete();

    }

    @And("I click the Admin link from the menu")
    public void clickAdminLink(){

    }
    @And("I click on the Configuration dropdown menu button")
    public void clickConfigurationDropdown(){

    }

    @And("I click on the Language Packages option")
    public void clickLanguageOption(){

    }

    @And("I click on the Translate button for Spanish - Español language package")
    public void translateSpanish(){

    }

    @Then("I should be redirected to the languageCustomization page")
    public void redirectToTheLanguageCustomization(){

    }










}

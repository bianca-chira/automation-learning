package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")
    private List<WebElement> menuList;
    @FindBy(xpath = "//div[@class=\"oxd-select-text--after\"]")
    private WebElement arrowSelect;
    @FindBy(xpath = "//div[@class=\"oxd-select-option\"]")
    private List<WebElement> selectRejected;
    @FindBy(xpath = "//span[text()=\"Rejected \"]")
    private WebElement rejectedOption;

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void clickLeavePage() {

        menuList.get(2).click();
    }

    public void showList() {
        arrowSelect.click();

    }

    public void clickRejectedOption() {

        selectRejected.get(0).click();
    }

    public boolean verifyRejected() {
    return rejectedOption.isDisplayed();
    }


}

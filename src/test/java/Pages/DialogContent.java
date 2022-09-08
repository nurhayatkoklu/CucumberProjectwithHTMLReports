package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(), 'Dashboard')])[2]")
    public WebElement dashboard;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath="//ms-text-field[@formcontrolname='order']//input")
    private WebElement order;

    @FindBy(xpath = "(//span[text()='Next Grade'])[1]")
    private WebElement nextGrade;

    @FindBy(xpath = "//span[text()='None']")
    private WebElement none;

    @FindBy(xpath="(//td[contains(text(),'Ciaro')]//following::div/ms-edit-button)[1]")
    private WebElement editCiaro;

    @FindBy(xpath="(//td[contains(text(),'Ciaro')]//following::div/ms-delete-button)[1]")
    private WebElement deleteCiaro;

    @FindBy(xpath="//ms-text-field[@formcontrolname='description']//input")
    private WebElement description;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement integrationCode;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priority;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-text-field[@placeholder='DISCOUNT.TITLE.DESCRIPTION']//input")
    private WebElement descriptionSearch;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(css = "[id='ms-text-field-0']>input")
    private WebElement nameSearch;

    @FindBy(xpath = "(//td[@class='mat-cell cdk-cell cdk-column-name mat-column-name ng-tns-c328-59 ng-star-inserted'])[1]/text()")
    private WebElement existCheck;




    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        //burada string isimden webelemente ulaşıcam
        switch (strElement) {
            case "username": myElement = username; break;
            case "password": myElement = password; break;
            case "nameInput": myElement = nameInput; break;
            case "shortName": myElement = shortName; break;
            case "order": myElement = order; break;
            case "description": myElement = description; break;
            case "integrationCode": myElement = integrationCode; break;
            case "priority": myElement = priority; break;
            case "searchInput": myElement = searchInput; break;
            case "descriptionSearch": myElement = descriptionSearch; break;
            case "nameSearch": myElement = nameSearch; break;

        }
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement) {
        switch (strElement) {
            case "loginButton" : myElement = loginButton; break;
            case "addButton" : myElement = addButton; break;
            case "saveButton" : myElement = saveButton; break;
            case "acceptCookies" : myElement = acceptCookies; break;
            case "nextGrade": myElement = nextGrade;  break;
            case "none": myElement = none;  break;
            case "editCiaro" : myElement = editCiaro; break;
            case "deleteCiaro" : myElement = deleteCiaro; break;
            case "searchButton" : myElement = searchButton; break;
            case "editButton" : myElement = editButton; break;
            case "deleteButton" : myElement = deleteButton; break;
            case "deleteDialogButton" : myElement =deleteDialogButton; break;




        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "dashboard" : myElement = dashboard; break;
            case "successMessage" : myElement = successMessage; break;
            case "existCheck" : myElement = existCheck; break;

        }
        verifyContainsText(myElement, text);
    }

    public void searchAndDelete(String searchText) {

        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
        waitUntilLoading();
        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");
    }

}

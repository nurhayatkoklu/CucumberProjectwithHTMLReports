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

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//*[@id='ms-text-field-0']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement closeDialogBtn;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priority;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@data-placeholder='Employee ID']")
    private WebElement employeeID;

    @FindBy(xpath = "//*[@data-placeholder='Document Number']")
    private WebElement documentNumber;

    @FindBy(xpath = "//*[@data-placeholder='Country']")
    private WebElement country;

    @FindBy(xpath = "//span[text()='India']")
    private WebElement india;

    @FindBy(css = "[placeholder='GENERAL.FIELD.FIRST_NAME'] input")
    private WebElement firstNameSearch;

    @FindBy(css = "[placeholder='GENERAL.FIELD.LAST_NAME'] input")
    private WebElement lastNameSearch;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        //burada string isimden webelemente ulaşıcam
        switch (strElement) {
            case "username": myElement = username; break;
            case "password": myElement = password; break;
            case "nameInput": myElement = nameInput; break;
            case "codeInput": myElement = codeInput; break;
            case "shortName": myElement = shortName; break;
            case "searchInput": myElement = searchInput; break;
            case "integrationCode": myElement = integrationCode; break;
            case "priority": myElement = priority; break;
            case "firstNameInput": myElement = firstNameInput; break;
            case "lastNameInput": myElement = lastNameInput; break;
            case "employeeID": myElement = employeeID; break;
            case "documentNumber": myElement = documentNumber; break;
            case "country": myElement = country; break;
            case "firstNameSearch": myElement = firstNameSearch; break;
            case "lastNameSearch": myElement = lastNameSearch; break;



        }
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement) {
        switch (strElement) {
            case "loginButton" : myElement = loginButton; break;
            case "addButton" : myElement = addButton; break;
            case "saveButton" : myElement = saveButton; break;
            case "acceptCookies" : myElement = acceptCookies; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement = searchButton; break;
            case "deleteButton" : myElement = deleteButton; break;
            case "deleteDialogButton" : myElement =deleteDialogButton; break;
            case "india" : myElement =india; break;
            case "closeDialogBtn" : myElement =closeDialogBtn; break;




        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "dashboard" : myElement = dashboard; break;
            case "successMessage" : myElement = successMessage; break;
            case "alreadyExist" : myElement =alreadyExist; break;
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

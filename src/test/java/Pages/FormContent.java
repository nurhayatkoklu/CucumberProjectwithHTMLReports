package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }











    @FindBy(xpath = "(//span[text()='Academic Period'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//span[contains(text(),' 2021-2022 ')]")
    private WebElement AcademicPeriodOption1;

    @FindBy(xpath = "//span[contains(text(),' 2020 - 2021 ')]")
    private WebElement AcademicPeriodOption2;

    @FindBy(xpath = "(//*[starts-with(@id, 'mat-select')])[3]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement gradeLevel1;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement gradeLevel2;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement gradeLevel3;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    private WebElement gradeLevel4;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[5]")
    private WebElement gradeLevel5;

    @FindBy(xpath = "//span[text()='Gender']")
    private WebElement gender;

    @FindBy(xpath = "//span[text()=' Male ']")
    private WebElement male;

    @FindBy(xpath = "//span[text()=' Female ']")
    private WebElement female;

    @FindBy(xpath = "//span[text()='Employee Type']")
    private WebElement employeeType;

    @FindBy(xpath = "(//*[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])[1]")
    private WebElement teacher;

    @FindBy(xpath = "(//*[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])[2]")
    private WebElement supervisor;

    @FindBy(xpath = "(//*[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])[3]")
    private WebElement other;

    @FindBy(xpath = "(//span[text()='Document Type'])[1]")
    private WebElement documentType;

    @FindBy(xpath = "//span[contains(text(),'Personal ID')]")
    private WebElement documentType1;

    @FindBy(xpath = "//span[contains(text(),'Passport')]")
    private WebElement documentType2;

    @FindBy(xpath = "//span[contains(text(),'Birth Certificate')]")
    private WebElement documentType3;

    @FindBy(xpath = "//*[text()='Contact & Address']")
    private WebElement contactAddress;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='middleName']")
    private WebElement middleName;




    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {









            case "academicPeriod": myElement = academicPeriod;  break;
            case "AcademicPeriodOption1": myElement = AcademicPeriodOption1; break;
            case "AcademicPeriodOption2": myElement = AcademicPeriodOption2; break;
            case "gradeLevel": myElement = gradeLevel; break;
            case "gradeLevel1": myElement = gradeLevel1; break;
            case "gradeLevel2": myElement = gradeLevel2; break;
            case "gradeLevel3": myElement = gradeLevel3; break;
            case "gradeLevel4": myElement = gradeLevel4; break;
            case "gradeLevel5": myElement = gradeLevel5; break;
            case "documentType" : myElement =documentType; break;
            case "documentType1" : myElement = documentType1; break;
            case "documentType2" : myElement = documentType2; break;
            case "documentType3" : myElement =documentType3; break;
            case "gender": myElement = gender; break;
            case "male": myElement = male; break;
            case "female" : myElement =female; break;
            case "employeeType" : myElement = employeeType; break;
            case "teacher" : myElement = teacher; break;
            case "supervisor" : myElement =supervisor; break;
            case "middleName" : myElement =middleName; break;
            case "other" : myElement =other; break;
            case "contactAddress" : myElement =contactAddress; break;

        }
        clickFunction(myElement);


        }
}

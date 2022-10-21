package Pages;

import Utilities.GWD;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupThree;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestations;


    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;


    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fields;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccount;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupFour;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "(//*[@class='ps__thumb-y'])[1]")
    private WebElement leftNavScroll;


    WebElement myElement;

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "setupOne":
                myElement = setupOne;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "gradeLevels":
                myElement = gradeLevels;
                break;
            case "discounts":
                myElement = discounts;
                break;
            case "nationalities":
                myElement = nationalities;
                break;
            case "humanResources":
                myElement = humanResources;
                break;
            case "setupThree":
                myElement = setupThree;
                break;
            case "positions":
                myElement = positions;
                break;
            case "attestations":
                myElement = attestations;
                break;
            case "documentTypes":
                myElement = documentTypes;
                break;
            case "fields":
                myElement = fields;
                break;
            case "schoolSetup":
                myElement = schoolSetup;
                break;
            case "locations":
                myElement = locations;
                break;
            case "departments":
                myElement = departments;
                break;
            case "bankAccount":
                myElement = bankAccount;
                break;
            case "education":
                myElement = education;
                break;
            case "setupFour":
                myElement = setupFour;
                break;
            case "subjectCategories":
                myElement = subjectCategories;
                break;

        }

        clickFunction(myElement);
    }

}

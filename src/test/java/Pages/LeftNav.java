package Pages;

import Utilities.GWD;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

        public LeftNav() {
            PageFactory.initElements(GWD.getDriver(), this);
        }

        @FindBy(xpath="(//span[text()='Setup'])[1]")
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



        WebElement myElement;
        public void findAndClick(String strElement){  // 2.aşama
            // burda string isimden weblemente ulaşıcam
            switch (strElement)
            {
                case "setupOne" : myElement =setupOne; break;
                case "parameters" : myElement =parameters; break;
                case "gradeLevels" : myElement =gradeLevels; break;
                case "discounts" : myElement =discounts; break;
                case "nationalities" : myElement =nationalities; break;
                case "humanResources" : myElement =humanResources; break;
                case "setupThree" : myElement =setupThree; break;
                case "positions" : myElement = positions; break;
                case "attestations" : myElement = attestations; break;
                case "documentTypes" : myElement = documentTypes; break;
            }

            clickFunction(myElement);
        }

}

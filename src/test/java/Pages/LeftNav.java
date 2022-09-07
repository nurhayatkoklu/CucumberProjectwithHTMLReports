package Pages;

import Utilities.GWD;
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

            }

            clickFunction(myElement);
        }

}

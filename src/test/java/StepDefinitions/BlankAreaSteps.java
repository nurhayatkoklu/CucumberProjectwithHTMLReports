package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BlankAreaSteps {
DialogContent dc = new DialogContent();
LeftNav ln=new LeftNav();

    @And("Click Blank Area")
    public void clickBlankArea() {
        dc.clickOutside();
        //Bu Step'i 3. senaryoda "Stage" kısmında yaşadığım problem için ekledim.
        //Stage'e tıklatıp altında çıkan seçeneklerden birini seçtiğimde Stage
        //ekranı kapanmıyordu ve senaryo takılıyordu. ESC tuşuna basınca işlem tamamlanmadan
        //tüm ekranı kapattığı için ben de  ekranda 0,0 kordinatına tıklatıp ekranın düzgün kapanıp
        //senaryonun devam etmesini sağladım.
    }

    @And("Scroll down the Left Nav")
    public void scrollDownTheLeftNav() {
        JavascriptExecutor js=(JavascriptExecutor) GWD.driver;
        js.executeScript("document.querySelector('.nav.vertical.ng-star-inserted').scrollBy(0, 400)");
    }
}


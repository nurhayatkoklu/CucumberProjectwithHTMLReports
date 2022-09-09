package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class BlankAreaSteps {
DialogContent dc = new DialogContent();

    @And("Click Blank Area")
    public void clickBlankArea() {
        dc.clickOutside();
        //Bu Step'i 3. senaryoda "Stage" kısmında yaşadığım problem için ekledim.
        //Stage'e tıklatıp altında çıkan seçeneklerden birini seçtiğimde Stage
        //ekranı kapanmıyordu ve senaryo takılıyordu. ESC tuşuna basınca işlem tamamlanmadan
        //tüm ekranı kapattığı için ben de  ekranda 0,0 kordinatına tıklatıp ekranın düzgün kapanıp
        //senaryonun devam etmesini sağladım.
    }
}

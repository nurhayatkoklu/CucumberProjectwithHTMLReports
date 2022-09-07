package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class messageAssert {
    DialogContent dc=new DialogContent();

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");

    }
}

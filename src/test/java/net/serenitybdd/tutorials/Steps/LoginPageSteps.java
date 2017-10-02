package net.serenitybdd.tutorials.Steps;

import net.serenitybdd.tutorials.Pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginPageSteps {
    LoginPage l;

    @Step
    public void iAmOnLoginPage(){
        l.open();
        l.clickGmailButton();



    }
    @Step
    public void iEnterValidCredentials() {

        l.enterUsername("bhaveshpandey2");
        l.clickNext();

        l.enterPassword("Ssb@nov22");
        l.clickNext();

    }


}

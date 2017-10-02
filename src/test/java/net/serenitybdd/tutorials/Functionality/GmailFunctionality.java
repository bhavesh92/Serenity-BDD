package net.serenitybdd.tutorials.Functionality;
import org.openqa.selenium.WebDriver;
//import net.thucydides.core.webdriver.WebdriverManager;
import net.serenitybdd.tutorials.Steps.HomePageSteps;
import net.serenitybdd.tutorials.Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(SerenityRunner.class)

public class GmailFunctionality{

    @Managed

    //(driver="chrome", uniqueSession = true)

    private WebDriver driver;


    @Steps
    LoginPageSteps login;
    @Steps
    HomePageSteps homePage;


    @Test
    public void gmailLoginFunctionality() {
        //Given
        login.iAmOnLoginPage();

        //when
        login.iEnterValidCredentials();

        //then
        homePage.iEnterHomePage();
    }
}

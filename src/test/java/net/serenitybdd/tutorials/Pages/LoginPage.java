package net.serenitybdd.tutorials.Pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
//import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.co.in")
public class LoginPage extends PageObject {

    @FindBy(id="gb_70")
    WebElement gmailButton;

    @FindBy(xpath = "//input[@type='email']")
    WebElement userName;

    @FindBy(xpath = "//*[text()='Next']")
    WebElement next;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passWord;

    public void clickGmailButton(){
        gmailButton.click();


    }


    public void enterUsername(String username){
        waitFor(userName);
        userName.sendKeys(username);


    }

    public void enterPassword(String password){

        waitFor(passWord);
        passWord.sendKeys(password);
    }
    public void clickNext(){
waitFor(next);
        next.click();

    }



}

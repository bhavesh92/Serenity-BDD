package net.serenitybdd.tutorials.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

//import javax.validation.constraints.AssertTrue;

public class HomePage extends PageObject{


    @FindBy(css = "div.gb_hb.gb_2c.gb_wg.gb_R.gb_g.gb_Jc.gb_jb.gb_wg.gb_R")
    WebElement b;
    @FindBy(css = "a.gb_P")
    WebElement gmail;
    @FindBy(xpath = "//*[text()=bhaveshpandey2@gmail.com]")
    WebElement text;

    @FindBy(xpath = "//a[@href='https://myaccount.google.com/?utm_source=OGB&utm_medium=act']")
    WebElement myAccountButton;



    public void clickOnB(){
        //getDriver().switchTo().alert().dismiss();
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(gmail);
        gmail.click();


    }

    public void clickMyAccButton(){
        waitFor(myAccountButton);
        myAccountButton.click();
    }


    public  void  verifyId(String username){
        String s=text.getText();

        if(s.contains(username))
            System.out.print("login successful");
    }
}

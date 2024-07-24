package basetest;

import base.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.WelComePage;
import utilities.ElementPresent;


public class SignIn {

    static WelComePage welcome;
    static SignInPage signing;
    static ElementPresent element;

    public static WebDriver driver;


    public WebDriver startSession(){
       driver =  WebDriverManager.browserSetup();
       return driver;
    }

    public void getUrl(){
        driver.navigate().to("https://www.geeksforgeeks.org/jobs");
    }


    public void signInToPortal(){
      welcome= new WelComePage(driver);
      signing = new SignInPage(driver);
      element= new ElementPresent();


      welcome.clickSignInButtonAtRightTop().fillUserName().fillPassword().clickSignInButton();

      element.refreshPage().clickSignInButtonAtRightTop().fillUserName().fillPassword().clickSignInButton();
      element.refreshPage().clickSignInButtonAtRightTop().fillUserName().fillPassword().clickSignInButton();

    }

}

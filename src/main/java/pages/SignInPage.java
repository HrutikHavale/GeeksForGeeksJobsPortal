package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyReader;

public class SignInPage {

    WebDriver driver;

    public SignInPage(WebDriver driver){
        this.driver=driver;
    }

    By userNameOrEmailTextField = By.xpath("//input[@placeholder=\"Username or email\"]");
    By passwordTextField = By.xpath("//input[@placeholder=\"Password\"]");
    By signInButton = By.xpath("//button[@type=\"submit\"]");

    String Email= PropertyReader.readPropertyFileData().getProperty("userName");
    String Password= PropertyReader.readPropertyFileData().getProperty("password");

    public SignInPage fillUserName(){
        driver.findElement(userNameOrEmailTextField).sendKeys(Email);
        return this;
    }

    public SignInPage fillPassword(){
        driver.findElement(passwordTextField).sendKeys(Password);
        return this;
    }

    public AllJobsPage clickSignInButton(){
        driver.findElement(signInButton).click();
        return new AllJobsPage();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelComePage {

    WebDriver driver;

    public WelComePage(WebDriver driver){
        this.driver=driver;
    }

    By signInButton = By.xpath("//button[contains(text(),'Sign In')]");

    public SignInPage clickSignInButtonAtRightTop() {
        try {
            Thread.sleep(5000);
            driver.findElement(signInButton).click();

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        return new SignInPage(driver);
    }

}

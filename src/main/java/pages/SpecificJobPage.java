package pages;

import base.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecificJobPage {

    static By applyNowButton = By.xpath("//button[contains(text(),\"Apply Now\")]");

    public static void clickOnApplyNowButton(WebDriver driver){
        driver.findElement(applyNowButton).click();
    }
}

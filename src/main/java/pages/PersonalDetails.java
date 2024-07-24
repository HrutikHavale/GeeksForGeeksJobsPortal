package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class PersonalDetails {

   static By userNameTextField = By.xpath("//input[@name=\"user_name\"]");
   static By countryCode = By.xpath("//div[contains(text(),'Phone')]");
   static By countryCodeList = By.xpath("//div[@role=\"option\"]");
   By contantNumber = By.xpath("//input[@name=\"user_phone\"]");


    public static void clickOnCountryCode(WebDriver driver){
        driver.findElement(countryCode).click();
        List<WebElement> countrylist=driver.findElements(countryCodeList);

        Iterator<WebElement> iterator= countrylist.iterator();
        while (iterator.hasNext()){
            WebElement element= iterator.next();
            if(element.equals("Aland Islands +358")){
                element.click();
            }
        }
    }
}

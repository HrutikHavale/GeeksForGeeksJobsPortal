package utilities;

import base.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.WelComePage;

public class ElementPresent extends WebDriverManager {


    public static boolean isElementPresent(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public  WelComePage refreshPage(){
        By buttonLocator = By.xpath("//button[contains(text(),'Sign In')]");

        if (isElementPresent(driver, buttonLocator)) {
            // If button is present, refresh the page
            driver.navigate().refresh();
            System.out.println("Button found. Page refreshed.");

        } else {
            // If button is not present, navigate to the next page
            driver.navigate().to("https://www.geeksforgeeks.org/jobs");
            System.out.println("Button not found. Navigated to the next page.");
        }
        return new WelComePage(driver);
    }
}

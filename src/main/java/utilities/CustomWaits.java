package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static base.WebDriverManager.driver;

public class CustomWaits {

    //static WebDriver driver;

    public static void fluntWait(WebDriver driver,String visibilityItemsPath){
        FluentWait wait= new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5000)).pollingEvery(Duration.ofSeconds(3000)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy
                (By.xpath(visibilityItemsPath)));
    }

    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }

    public static void explicitWait(String visibilityItemsPath1){
        WebDriverWait exwait = new WebDriverWait(driver,Duration.ofSeconds(3000));
        exwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(visibilityItemsPath1)));
    }
}





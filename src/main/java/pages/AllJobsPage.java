package pages;

import base.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class AllJobsPage  {


//  WebDriver driver;
//
//    public AllJobsPage(WebDriver driver){
//        this.driver=driver;
//    }


    public static void clickOnJobTitle(WebDriver driver){
        By allJobsTitle =By.cssSelector("div[class='jobs_designation__fVwb4']");
        List<WebElement> jobTitles = driver.findElements(allJobsTitle);
        Iterator<WebElement> iterator=jobTitles.iterator();
        while(iterator.hasNext()){
            WebElement jobTitle= iterator.next();
            if(jobTitle.equals("Full Stack Developer")){
                jobTitle.click();
                break;
            }
        }
    }
}

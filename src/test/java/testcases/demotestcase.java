package testcases;

import base.WebDriverManager;
import basetest.SignIn;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AllJobsPage;
import pages.SpecificJobPage;
import pages.WelComePage;
import utilities.CustomWaits;

public class demotestcase extends SignIn {

    String visibilityItemsPathOfNotNow = "//button[contains(text(),'Not Now')]";
    By visibilityItemsPathOfNotNow1 = By.xpath("//button[contains(text(),'Not Now')]");

    String visibilityItemsPathOfRemindMeLater = "//div[@class=\"jobs_headingText__yw7A0\"]";
    By visibilityItemsPathOfRemindMeLater1 = By.xpath("//button[contains(text(),\"Remind me later\")]");

    @Test
    public void testCase1() throws InterruptedException {

        //WebDriver driver =
        startSession();
        getUrl();
        signInToPortal();
        System.out.println("Signed in");

       CustomWaits.fluntWait(driver,visibilityItemsPathOfRemindMeLater);
       // Thread.sleep(5000);
       // driver.findElement(By.xpath("//button[contains(text(),\"Remind me later\")]")).click();
        driver.findElement(visibilityItemsPathOfRemindMeLater1).click();
        System.out.println("clicked");

       // Thread.sleep(5000);
       CustomWaits.fluntWait(driver,visibilityItemsPathOfNotNow);
        System.out.println("fluntwait");
        driver.findElement(visibilityItemsPathOfNotNow1).click();
        System.out.println("clicked not now");
        AllJobsPage.clickOnJobTitle(driver);
       // SpecificJobPage.clickOnApplyNowButton(driver);

        //Thread.sleep(5000);
       // driver.quit();
    }
}

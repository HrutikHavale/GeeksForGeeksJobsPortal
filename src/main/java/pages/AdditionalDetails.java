package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class AdditionalDetails {

    public static void main(String[] args) throws Exception {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
       // driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAjw1K-zBhBIEiwAWeCOF6xtbGX3qPmwHiYfnHo3Jy755AfzXCdwwcM5j-O3gW9lYyn7oc-7yBoCt54QAvD_BwE");
        driver.get("https://www.myntra.com/");

        Actions action = new Actions(driver);
        WebElement menElement1=driver.findElement(By.xpath("//a[@data-group='men']"));
        action.moveToElement(menElement1).perform();

        //driver.findElement(By.xpath("")).click();//a[@data-group='men']
                driver.findElement(By.xpath("//ul[@class='desktop-navBlock']//a[text()='Boxers']")).click();
        /*JavascriptExecutor je= (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(100,400)");



        Alert al = driver.switchTo().alert();
        al.accept();

        WebElement elementtoclick = driver.findElement(By.xpath(""));*/


        //Actions action = new Actions(driver);
        //action.click().perform();
      /* WebElement menElement= driver.findElement(By.xpath("//a[@data-group='men']"));
        Actions action = new Actions(driver);
        action.moveToElement(menElement).perform();
       // driver.findElement(By.xpath(" //a[@title='Mobiles']")).click();
        Thread.sleep(5000);
       List<WebElement> links= driver.findElements(By.tagName("a"));

       try {
           for (WebElement l1 : links) {
               System.out.println(l1.getAttribute("href"));
               String attributes = l1.getAttribute("href");
               // "/men-sneakers"
               if (attributes.equals("https://www.myntra.com/deodorant")) {
                   // action.click(attributes).perform();
                   action.click();
               }

           }
       }
       catch (NullPointerException e){
           System.out.println("hii");
       }*/
      // driver.quit();


//a[@data-group='men']


      //  je.executeScript("window.scrollBy(0, 200)");


    }
}

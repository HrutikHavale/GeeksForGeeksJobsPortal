package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DemoClass {

    public static void main(String[] args)  {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.geeksforgeeks.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

//        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5000));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("\"//button[@class=\"signinButton gfg_loginModalBtn\"]\"")));

       // driver.findElement((By.xpath("\"//button[@class=\"signinButton gfg_loginModalBtn\"]\""))).click();
        driver.findElement(By.xpath("//button[@class=\"signinButton gfg_loginModalBtn\"]")).click();

        driver.findElement(By.xpath("//div[text()=\"Sign Up\"]")).click();
        //driver.

        driver.findElement(By.xpath("//input[@placeholder=\"E-mail\"]")).sendKeys("rutikhavale");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("gfg123");
        driver.findElement(By.xpath("//input[@placeholder=\"Institutes/Organizations\"]")).sendKeys("kle");

       List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class=\"optionItem\"]"));
       for (WebElement s1 : suggestions) {
//           System.out.println(s1.getText());
           if (s1.getText().equals("KLE University Belgaum")){
               System.out.println("entered");
               s1.click();
               System.out.println("clicked");
           }

       }

    }

}

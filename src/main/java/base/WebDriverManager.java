package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.PropertyReader;

public class WebDriverManager {

    public static WebDriver driver;
    static String browserName = PropertyReader.readPropertyFileData().getProperty("browserName");

    public static WebDriver browserSetup(){

     if(browserName.equalsIgnoreCase("chrome")){
         driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         return driver;

     }
     else if (browserName.equalsIgnoreCase("firefox")) {
         driver= new FirefoxDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         return driver;
     }
     else {
         System.out.println("Driver Not Supported");
        return null;
     }

 }

  public static void browserQuit(){
     driver.manage().window().minimize();
     driver.quit();
  }
}

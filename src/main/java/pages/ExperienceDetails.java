package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExperienceDetails {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.geeksforgeeks.org/");

        driver.close();
        //driver.quit();
        driver.manage().window().maximize();

        driver.get("https://www.geeksforgeeks.org/");


    }
}

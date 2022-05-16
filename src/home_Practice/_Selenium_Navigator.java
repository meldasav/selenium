package home_Practice;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class _Selenium_Navigator {
    public static void main(String[] args) throws InterruptedException {
        /*
    Go to https://www.techglobalschool.com
    Refresh the page
    Navigate to https://www.amazon.com/
    Navigate back to TechGlobal web site
    Navigate forward Amazon web site
    Validate the URL of the page
    Validate the title of the page
    EXPECTED RESULT:
    URL  = https://www.amazon.com/
    Title = Amazon.com. Spend less. Smile more.
     */

        WebDriver driver= Driver.getDriver();
        driver.get("https://www.techglobalschool.com");
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().to( "https://www.amazon.com/");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(2000);

        String actualResult=driver.getCurrentUrl();
        String actualTitle=driver.getTitle();

        String expectedTitle="Amazon.com. Spend less. Smile more.";
        String expectedUrl= "https://www.amazon.com/";

        if(actualResult.equals(expectedUrl)) System.out.println("Url validation passed");
        else System.out.println("Url validation failed");

        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation passed");
        else System.out.println("Title validation failed");

        Driver.quitDriver();
    }
}

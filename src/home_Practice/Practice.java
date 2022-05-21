package home_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
             /*
    Go to https://www.techglobalschool.com
    Refresh the page
    Navigate to https://www.amazon.com/
    Navigate back to TechGlobal webSite
    Navigate forward Amazon webSite
    Validate the URL of the page
    Validate the title of the page


    EXPECTED RESULT:
    URL  = https://www.amazon.com/
    Title = Amazon.com. Spend less. Smile more.

     */
        System.setProperty("WebDriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.techglobalschool.com");
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = driver.getCurrentUrl();

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();

        if (actualUrl.equals(expectedUrl)) System.out.println("ULR validation PASSED");
        else System.out.println("URL validation failed");

        if (actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation failed");


        System.setProperty("WebDriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.techglobalschool.com");
        String actualTitle1 = "SDET Bootcamp | TechGlobal";
        String expectedTitle1 = driver1.getTitle();
        if (actualTitle1.equals(expectedTitle1)) System.out.println("Title validation Passed");
        else System.out.println("Title validation failed");
        System.setProperty("WebDriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.google.com/");
        String actualURL = "https://www.google.com/";
        String expectedURL = driver2.getCurrentUrl();
        if (actualURL.equals(expectedURL)) System.out.println("Google UrL validation PASSED");
        else System.out.println("Google UrL validation Failed");

        Thread.sleep(3000);
        driver.quit();


    }
}

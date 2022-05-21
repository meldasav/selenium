package home_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium_Practice2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         Validate Comfy Elite application title and URL
         1. Go to https://comfyelite.com/
         2. Validate the URL and the title

         Expected result
         URL = https://comfyelite.com/
         Title = COMFY ELITE - Pillow, Neck Pillow, Travel, Pillow
         */
        System.setProperty("WebDriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://comfyelite.com/");
        String actualURL = "https://comfyelite.com/";
        String expectedURL = driver.getCurrentUrl();

        String actualTitle = "COMFY ELITE - Pillow, Neck Pillow, Travel, Pillow";
        String expectedTitle = driver.getTitle();

        if (actualURL.equals(expectedURL)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        if (actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        Thread.sleep(3000);
        driver.quit();


    }
}

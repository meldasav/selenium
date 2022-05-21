package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice_3 {
    public static void main(String[] args) throws InterruptedException {
        /**
         Go to https://www.techglobalschool.com/apply-now
         Validate the APPLY NOW button is displayed
         Validate the APPLY NOW button is enabled
         */
        System.setProperty("WebDriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.techglobalschool.com/apply-now/");
        WebElement applyNow = driver.findElement(By.id("comp-kuiqjiul2label"));

        System.out.println(applyNow.isDisplayed() && applyNow.isEnabled() ? "Passed" : "Failed");
        driver.navigate().to("https://www.google.com/");
        WebElement googleSearch=driver.findElement(By.cssSelector("input[value='Google Search']"));
        System.out.println(googleSearch.isDisplayed() && googleSearch.isEnabled()?"Google Search passed" :"Google Search failed");
        Thread.sleep(3000);
        driver.quit();
    }
}

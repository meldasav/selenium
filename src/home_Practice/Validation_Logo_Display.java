package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Validation_Logo_Display {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Go to https://www.techglobalschool.com
         * Validate the company signature
         * Logo must be displayed in the header section
         * Company name must be displayed in the header section
         * Company quote must be displayed in the header section
         */

        System.setProperty("WebDriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.techglobalschool.com/");
        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));
        System.out.println(logo.isDisplayed() && logo.isEnabled() ? "PASSED" : "FAILED");

        WebElement companyName = driver.findElement(By.className("font_0"));
        System.out.println(companyName.isDisplayed() && companyName.isEnabled() ? "PASSED" : "FAILED");

        WebElement companyQuote = driver.findElement(By.id("comp-kuiqjidf"));
        System.out.println(companyQuote.isDisplayed() && companyQuote.isEnabled() ? "PASSED" : "FAILED");

        driver.navigate().to("https://www.google.com/");
        WebElement searchBox= driver.findElement(By.name("q"));
        System.out.println(searchBox.isDisplayed() && searchBox.isEnabled() ?"searchBox PASSED" :"searchBox FAILED");

        Thread.sleep(3000);
        driver.quit();
    }
}

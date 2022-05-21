package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice07 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
        for (int i = 0; i < 3; i++) {
            System.out.println(elements.get(i).isDisplayed() && elements.get(i).isEnabled()? "Validation PASSED" : "Validation FAILED");
            System.out.println(elements.get(i).getText());
        }
        Thread.sleep(3000);
        driver.quit();
    }
}

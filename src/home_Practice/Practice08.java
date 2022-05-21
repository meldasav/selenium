package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Practice08 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.sendKeys("Tesla");
        searchBox.click();
        WebElement clickIcon= driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']"));
        clickIcon.click();
        WebElement validateTesla=driver.findElement(By.tagName("h1"));
        System.out.println(validateTesla.isDisplayed() && validateTesla.isEnabled()? "validationTesla PASSED" : "validationTesla FAILED");

        Thread.sleep(3000);
        driver.quit();
    }
}

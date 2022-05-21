package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice05 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
        //  WebElement head1=driver.findElement(By.xpath("//h1[@class='central-textlogo-wrapper']"));
        WebElement head1 = driver.findElement(By.tagName("h1"));
        System.out.println(head1.isDisplayed() && head1.isEnabled() ? "PASSED" : "FAILED");

        WebElement logo = driver.findElement(By.cssSelector("div[class='central-featured']"));
        System.out.println(logo.isDisplayed() && logo.isEnabled() ? "Logo Passed" : "Logo Failed");

        WebElement inputBox = driver.findElement(By.id("searchInput"));
        System.out.println(inputBox.isDisplayed() && inputBox.isEnabled()?"InputBox Validation PASSED" : "InputBox Validation FAILED");

        WebElement searchIcon=driver.findElement(By.cssSelector("i[class='sprite svg-search-icon']"));
        System.out.println(searchIcon.isDisplayed() && searchIcon.isEnabled()? "SearchIcon validation PASSED" :"SearchIcon validation FAILED");

        Thread.sleep(3000);
        driver.quit();
    }
}

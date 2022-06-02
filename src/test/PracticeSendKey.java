package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeSendKey {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://en.wikipedia.org/");
        WebElement searchBox=driver.findElement(By.cssSelector("input[name='search']"));
        searchBox.click();

        searchBox.sendKeys("Kerem Gulsever");
        System.out.println(searchBox.getAttribute("placeholder").equals("Kerem Gulsever"));


        driver.quit();
    }
}

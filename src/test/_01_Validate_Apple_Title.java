package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver ", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.apple.com /");
        String expectedTitle="Apple";
        String actualTitle=driver.getTitle();
        System.out.println("The title of the page is = " + driver.getTitle());
        if (actualTitle.equals(expectedTitle)) System.out.println("Apple title validation PASSED");
        else System.out.println("Apple title validation FAILED!!!");

        Thread.sleep(3000);
        driver.quit();


    }
}

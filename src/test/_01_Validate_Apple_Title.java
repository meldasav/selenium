package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=Driver.getDriver();

        driver.get("https://www.apple.com/");
        String expectedTitle="Apple";
        String actualTitle=driver.getTitle();
        System.out.println("The title of the page is = " + driver.getTitle());
        if (actualTitle.equals(expectedTitle)) System.out.println("Apple title validation PASSED");
        else System.out.println("Apple title validation FAILED!!!");

        Driver.quitDriver();


    }
}

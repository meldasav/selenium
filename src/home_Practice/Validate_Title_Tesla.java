package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.ValidationUtils;
import utilities.Driver;

public class Validate_Title_Tesla {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("Tesla");

        //driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'pure-button')]")).click();

        String expectedTitle = "Tesla - Wikipedia";
        ValidationUtils.validateTitle1(driver, expectedTitle);
        Driver.quitDriver();
    }
}


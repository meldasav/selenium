package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _Locators_Class_Name {
    public static void main(String[] args) {
         /*
    TEST CASE:
    1. Go to https://www.google.com/
    2. Validate the Google Image is displayed on the top of the search input box
     */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement googleImage = driver.findElement(By.className("lnXdpd"));
        if (googleImage.isDisplayed()) System.out.println("Google image validation passed");
        else System.out.println("Google image validation failed");

        driver.get("https://www.amazon.com/");
        WebElement amazonImage=driver.findElement(By.id("nav-logo-sprites"));
        if(amazonImage.isDisplayed()) System.out.println("Amazon image validation passed");
        else System.out.println("Amazon image validation failed");
        Driver.quitDriver();
    }
}

package home_Practice;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class Validate_Tech_Global {
    public static void main(String[] args) {
       /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"
     */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.apple.com/");
        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) System.out.println("Title validation passed");
        else System.out.println("Title validation failed");

        WebDriver driver1 = Driver.getDriver();
        driver1.get("https://www.techglobalschool.com/");
        String expectedResult = "SDET Bootcamp | TechGlobal";
        String actualResult = driver1.getTitle();
        if (actualResult.equals(expectedResult)) System.out.println("Title validation passed");
        else System.out.println("Title validation failed");
        Driver.quitDriver();
    }
}

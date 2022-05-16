package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _Locator_Id {
    public static void main(String[] args) {
    /*
    Go to https://www.techglobalschool.com
    Validate the company signature
        Logo must be displayed in the header section
        Company name must be displayed in the header section
        Company quote must be displayed in the header section
     */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com");

        WebElement logo=driver.findElement(By.id("img_comp-kuiqjide2"));
        if(logo.isDisplayed()) System.out.println("Logo validation passed");
        else System.out.println("Logo validation failed");

        WebElement companyName=driver.findElement(By.id("comp-kuiqjidf"));
        if(companyName.isDisplayed() && companyName.getText().equals("TechGlobal")) System.out.println("Company name validation passed");
        else System.out.println("Company name validation failed");

        WebElement companyQuote=driver.findElement(By.id("comp-kuiqjidf1"));
        if(companyQuote.isDisplayed() && companyQuote.getText().equals("OUR GOAL IS YOUR SUCCESS")) System.out.println("Company quote validation passed");
        else System.out.println("Company quote validation failed");

        Driver.quitDriver();
    }
}
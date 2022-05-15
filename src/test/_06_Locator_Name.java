package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _06_Locator_Name {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");
        WebElement inputBox = driver.findElement(By.name("q"));
        if(inputBox.isDisplayed()) System.out.println("The search input box validation PASSED");
        else System.out.println("The search input box validation FAILED");
        Driver.quitDriver();
    }
}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _Locator_className {
    public static void main(String[] args) {

        WebDriver driver= Driver.getDriver();
        driver.get("https://www.google.com/");
        WebElement googleImage=driver.findElement(By.className("lnXdpd"));
        if(googleImage.isDisplayed()) System.out.println("Google image validation Passed");
        else System.out.println("Google image validation failed");
        Driver.quitDriver();
    }


}

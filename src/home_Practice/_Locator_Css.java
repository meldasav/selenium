package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _Locator_Css {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.cssSelector("input[value='Google Search']"));
        if (searchBox.isDisplayed()) System.out.println("inbox validation passed");
        else System.out.println("inbox validation failed");
        System.out.println(searchBox.getAttribute("name"));
        Driver.quitDriver();
    }
}
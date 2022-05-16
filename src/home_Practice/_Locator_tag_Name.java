package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.Date;

public class _Locator_tag_Name {
    public static void main(String[] args) {
         /*
    Go to https://www.wikipedia.org/
    Validate the WIKIPEDIA heading1 is displayed
    Validate the WIKIPEDIA LOGO is displayed
    Validate the search input box is displayed
    Validate the search button is displayed
    Validate the search button is enabled
     */

        WebDriver driver= Driver.getDriver();
        driver.get(" https://www.wikipedia.org/");
        WebElement heading1= driver.findElement(By.xpath("//h1"));
        if(heading1.isDisplayed()) System.out.println("heading1 validation passed");
        else System.out.println("heading1 validation failed");

        WebElement logo=driver.findElement(By.cssSelector(".central-featured-logo"));
        if(logo.isDisplayed()) System.out.println("logo validation passed");
        else System.out.println("logo validation failed");

        WebElement searchBox=driver.findElement(By.id("searchInput"));
        if(searchBox.isDisplayed()) System.out.println("Search box validation passed");
        else System.out.println("Search box validation failed");
        Driver.quitDriver();
    }
}

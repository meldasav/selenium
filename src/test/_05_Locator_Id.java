package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_Id {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");
        WebElement logo=driver.findElement(By.id("img comp-kuiqjide2"));
        if(logo.isDisplayed()) System.out.println("passed");
        else System.out.println("failed");

        driver.get("https://www.techglobalschool.com/");
        WebElement name=driver.findElement(By.id("comp-kuiqjidf"));
        WebElement quote=driver.findElement(By.id("comp-kuiqjidf1"));

        if(name.isDisplayed() && quote.getText().equals("TechGlobal")) System.out.println("passed");
        else System.out.println("failed");

        if(quote.isDisplayed() && quote.getText().equals("Our Goal is your success")) System.out.println("passed");
        else System.out.println("failed");


        Driver.quitDriver();

    }
}

package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class DropDownPractice {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement month=driver.findElement(By.id("month"));
        

    }
}

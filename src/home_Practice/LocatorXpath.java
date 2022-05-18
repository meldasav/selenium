package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.ValidationUtils;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class LocatorXpath {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.google.com/");
        List<WebElement> allLink=driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
        String[] expectedTexts={"Advertising", "Business", "How Search works"};
        System.out.println(Arrays.toString(expectedTexts));
        for (int i = 0; i <3 ; i++) {
            ValidationUtils.validateElementIsDisplayedAndEnabled(allLink.get(i));
            if(allLink.get(i).getText().equals(expectedTexts[i])) System.out.println("TEXT validation passed");
            else System.out.println("TEXT validation failed");
        }
        Driver.quitDriver();
    }
}

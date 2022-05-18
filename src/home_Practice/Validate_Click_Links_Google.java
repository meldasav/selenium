package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.ValidationUtils;
import utilities.Driver;

import java.util.List;

public class Validate_Click_Links_Google {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");
        List<WebElement> googleLinks = driver.findElements(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']//a"));
        for (int i = 0; i <=3 ; i++) {
            System.out.println(googleLinks.get(i).getText());
          //  System.out.println(googleLinks.get(i).isDisplayed() && googleLinks.get(i).isEnabled()?"Passed" :"failed");
            ValidationUtils.validateElementIsDisplayedAndEnabled(googleLinks.get(i));
        }
        Driver.quitDriver();
    }
}

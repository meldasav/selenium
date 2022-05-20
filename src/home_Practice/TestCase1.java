package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.ValidationUtils;
import utilities.Driver;

public class TestCase1 {
    public static void main(String[] args) {
        /**
         * Test Case 1: Validate ComfyElite Contact Us Page heading section
         * Given user navigates to “https://comfyelite.com/”
         * When user clicks on “CONTACT US” link in the header
         * Then user should be navigated to “CONTACT US” page
         * And user should be able to see ComfyElite logo
         * And user should be able to see heading2 as “High quality comfy pillows and accessories for travel, office and home.”
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");
        WebElement contactUs = driver.findElement(By.xpath("//*[@id=\"n-3734237352-navId\"]/li[3]/a"));
        ValidationUtils.validateElementIsDisplayedAndEnabled(contactUs);
        contactUs.sendKeys("CONTACT US" + Keys.RETURN);
        WebElement comfyEliteLogo= driver.findElement(By.cssSelector("#n-37342"));
        ValidationUtils.validateElementIsDisplayedAndEnabled(comfyEliteLogo);
        Driver.quitDriver();
    }

}

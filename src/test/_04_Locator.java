package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _04_Locator {
    public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver ", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver") ;
        WebDriver driver= Driver.getDriver();
        driver.get("https://www.google.com/");
        WebElement googleImage=driver.findElement(By.className("lnXdpd"));
        if(googleImage.isDisplayed()) System.out.println("Google image validation Passed");
        else System.out.println("failed");
        Driver.quitDriver();
    }


}

package home_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice09 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Go to https://www.techglobalschool.com/
         * Scroll down to the bottom of the page
         * Validate the Subscribe form
         * Validate “Subscribe” heading2 with its text
         * Validate ”Stay up to date!” paragraph with its text
         * Validate “Enter your first name” input box with its placeholder
         * Validate “Enter your last name” input box with its placeholder
         * Validate “Add your email” input box with its placeholder
         * Validate “SUBSCRIBE” button with its text
         */
        System.setProperty("WebDriver.chrome.driver", "/Users/meldasav/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.TechGlobalSchool.com/");

        WebElement subscribe = driver.findElement(By.xpath("//div[@id='comp-keehv7pd1']//span/span"));
        System.out.println(subscribe.getText().equals("Subscribe") ? "Subscribe PASSED" : "Subscribe FAILED");

        WebElement paragraph = driver.findElement(By.xpath("//span[text()='Stay up to date!']"));
        System.out.println(paragraph.getText().equals("Stay up to date!") ? "Paragraph Passed" : "failed");

        WebElement firstName = driver.findElement(By.id("input_comp-khwayxk9"));
        System.out.println(firstName.getAttribute("placeholder").equals("Enter your first name") ? "First name PASSED" : "First name Failed");

        WebElement lastName = driver.findElement(By.id("input_comp-khwaz4h2"));
        System.out.println(lastName.getAttribute("placeholder").equals("Enter your last name")? "LastName PASSED" : "LastName failed");

     //   WebElement button=driver.findElement(By.xpath("//div[@id='comp-khwayqh22']/button/span"));
        WebElement button=driver.findElement(By.xpath("//span[text()='SUBSCRIBE']"));
        System.out.println(button.getText().equals("SUBSCRIBE")?"subscribe passed":"subscribe failed");


        Thread.sleep(3000);
        driver.quit();
    }
}
